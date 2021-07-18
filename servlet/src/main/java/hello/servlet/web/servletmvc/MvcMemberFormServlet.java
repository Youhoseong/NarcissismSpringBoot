package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="mvcMemberFormServlet",  urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        // CONTROLLER => VIEW
        // WEB-INF 안에 있는 폴더들은 직접 접근할 수 없음, controller를 통해 포워드 될때만 접근가능

        //redirect vs forward redirect는 응답이 한번 나가고, 다시 클라이언트가 요청, 응답하는 거임 => 클라이언트가 인지가능
        //forward는 그냥 응답 받는거임 => 클라이언트 인지 불가
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewPath);
        // real call
        requestDispatcher.forward(request, response);


    }
}
