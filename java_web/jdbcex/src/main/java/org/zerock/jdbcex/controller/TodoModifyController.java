package org.zerock.jdbcex.controller;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "todoModifyController", value = "/todo/modify")
@Log4j2
public class TodoModifyController extends HttpServlet {
    private TodoService todoService = TodoService.INSTANCE;
    private final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Long tno = Long.parseLong(request.getParameter("tno"));
            TodoDTO todoDTO = todoService.get(tno);

            request.setAttribute("dto", todoDTO);
            request.getRequestDispatcher("/WEB-INF/todo/modify.jsp").forward(request, response);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServletException("modify get error!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String finishedStr = request.getParameter("finished");

        TodoDTO todoDTO = TodoDTO.builder()
                .tno(Long.parseLong(request.getParameter("tno")))
                .title(request.getParameter("title"))
                .dueDate(LocalDate.parse(request.getParameter("dueDate"),DATEFORMATTER ))
                .finished(finishedStr != null && finishedStr.equals("on"))
                .build();

        log.info("/todo/modify POST!");
        log.info(todoDTO);

        try {
            todoService.modify(todoDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("/todo/list");
    }
}
