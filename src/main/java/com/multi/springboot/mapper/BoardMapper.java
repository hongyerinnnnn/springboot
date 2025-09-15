package com.multi.springboot.mapper;

import com.multi.springboot.model.Board;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> getAllBoards();
    Board getBoardById(int id);
    void insertBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(int id);
    void incrementViews(int id);
}
