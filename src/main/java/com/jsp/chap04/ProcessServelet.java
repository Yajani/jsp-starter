package com.jsp.chap04;

import com.jsp.entity.Dancer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/dancer/process")
public class ProcessServelet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //form에서 넘어온 데이터 읽기( 클라이언트 데이터 처리 : controller)

        //Dancer객체를 생성, 입력값 세팅(business logic : model(자바객체))

        //데이터베이스에 저장(business logic : model(자바객체)) -> 위임

        //댄서 목록을 브라우저에 출력(jsp : view) - 뷰 포워딩
        //저장소에 있는 댄서 목록을 jsp파일로 전달할 수 있는  방법이 필요
        List<Dancer> dancerList = repository.findAll();

        //request객체는 하나의 요청간에 데이터 수송을 할 수 있음.
        request.setAttribute( "dl",dancerList);

        RequestDisp

        //dancerList에 저장
        dancerMap.put(name, dancer);
    }

    // 댄서 맵을 리스트로 변환해서 리턴하는 메서드
    public List<Dancer> findAll() {


        return new ArrayList<>(dancerMap.values());

        /*return dancerMap.values().stream()
                .collect(Collectors.toList());*/

        /*List<Dancer> dancerList = new ArrayList<>();
        for (Dancer dancer : dancerMap.values()) {
            dancerList.add(dancer);
        }
        return dancerList;*/
    }
}
