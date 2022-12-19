package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w2.dao.TodoDAO;
import org.zerock.w2.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {
    private TodoDAO todoDAO;

    @BeforeEach
    public void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .title("sample data")
                .dueDate(LocalDate.of(2022, 12, 11))
                .build();
        todoDAO.insert(todoVO);
    }

    @Test
    public void testSelectAll() throws Exception {
        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(System.out::println);
    }

    @Test
    public void testSelectOne() throws Exception {
        TodoVO vo = todoDAO.selectOne(1L);

        System.out.println(vo);
    }

    @Test
    public void testUpdateOne() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("sample of 8")
                .dueDate(LocalDate.of(2022,12,15))
                .finished(true)
                .build();

        todoDAO.updateOne(todoVO);
    }
}
