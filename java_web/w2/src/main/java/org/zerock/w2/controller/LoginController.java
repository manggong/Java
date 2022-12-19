package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.w2.dto.MemberDTO;
import org.zerock.w2.service.MemberService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.UUID;

@WebServlet(value = "/login")
@Log4j2
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("login get!!!!");

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("Login POST");

        String mid = request.getParameter("mid");
        String mpw = request.getParameter("mpw");

        String auto = request.getParameter("auto");

        boolean rememberMe = auto != null && auto.equals("on");

        try {
            MemberDTO memberDTO = MemberService.INSTANCE.login(mid, mpw);

            if (rememberMe) {
                String uuid = UUID.randomUUID().toString();

                MemberService.INSTANCE.updateUuid(mid, uuid);
                memberDTO.setUuid(uuid);

                Cookie rememberCookie = new Cookie("remember-me", uuid);
                rememberCookie.setMaxAge(60*60*24);
                rememberCookie.setPath("/");

                response.addCookie(rememberCookie);
            }

            HttpSession session = request.getSession();
            session.setAttribute("loginInfo", memberDTO);
            response.sendRedirect("/todo/list");
        } catch (Exception e) {
            log.error(e.getMessage());
            response.sendRedirect("/login?result=error");
        }
    }
}
