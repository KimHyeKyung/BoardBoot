package com.kosta.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.kosta.board.bean.Board;

@Mapper
@Repository
public interface BoardDAO {

	//게시글 insert
	void insertBoard(Board board) throws Exception;
	
	//maxNum가져오기
	Integer selectMaxBoardNum() throws Exception;
	
	//page목록가져오기
	List<Board> selectBoardList(Integer row) throws Exception;
	
	Integer selectBoardCount() throws Exception;
	
	Board selectBoard(Integer board_num) throws Exception;
	
	void updateBoard(Board board) throws Exception;
	
	void updateBoardReSeq(Board board) throws Exception;

	void deleteBoard(Integer boardNum) throws Exception;
}
