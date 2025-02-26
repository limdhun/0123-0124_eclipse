MenuController - doGet

사용자가 /menu URL로 GET 요청을 보냄
MenuController의 doGet()이 실행됨
menuService.getMenus() 호출 → 메뉴 리스트(List)를 가져옴
request.setAttribute("menus", menus); → 데이터를 JSP로 전달할 준비
request.getRequestDispatcher("WEB-INF/views/menuList.jsp").forward(request, response); → menuList.jsp로 포워딩
menuList.jsp에서 menus 리스트를 이용해 화면을 렌더링
=================================================== Controller에서 jsp 페이지를 브라우저에 띄우도록 하는건 모두 아래와 같은 방식. request.getRequestDispatcher("/WEB-INF/views/sample2025.jsp").forward(request,response);

DTO는 변수(필드)와 getter/setter 정도만 포함
