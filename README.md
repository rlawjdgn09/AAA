## <사용 환경>
- Java JDK 1.8
- Mybatis 3.5 mybatis-spring
- HTML5/CSS3/JavaScript
- BootStrap 3
- J-Query(ajax), Spring Rest API
- Servlet/JSP Servlet 4.0
- Spring- framework(AOP, MVC)  v5.2.13
- Spring task/ Spring tx/ Spring WebSocket/ Spring security
- Oracle DatatBase 11g 기준(SQL/저장공간 구성)

Java 언어를 사용하여 MVC구조인 Spring으로 웹 사이트를 구현하였습니다. 필요한 데이터를 사용하기 위해서는 OracleDB로  MyBatis로 매핑을 하여 사용하였습니다.

## <스크린 샷 및 설명>

- 회원가입
<일치 시>
![image](https://user-images.githubusercontent.com/66732896/112922019-b9731f80-9146-11eb-872f-5a310d715ae2.png)

<불일치 시>
![image](https://user-images.githubusercontent.com/66732896/112922086-d4de2a80-9146-11eb-8378-de263423c316.png)

-id 입력시 rest방식으로 ajax를 사용하여 db의 데이터와 데이터의 존재여부를 확인하여 중복시 회원가입 버튼 비활성화, 없을 시 버튼 활성화를 하였으며, 비밀번호 및 비밀번호 확인은 서로 입력값을 비교하여 동일시 버튼 활성/동일 하지 않을 시 비활성화 하였습니다. 우편번호는 카카오 다음 API를 사용하였고 메일은 스프링의 메일 라이브러리를 이용하여 해당 메일로 인증 코드를 보내며, 보내진 인증코드와 입력 코드가 같을시 회원가입이 됩니다.


- 관리자 페이지()
<메인 차트 및 일별 상황표>
![mainChart](https://user-images.githubusercontent.com/66732896/112921058-11a92200-9145-11eb-9a70-7602fde512a9.png)

<년/월 차트>
![chart](https://user-images.githubusercontent.com/66732896/112921632-16baa100-9146-11eb-84e7-929b9c3a5fdb.PNG)


-부트 스트랩의 차트의 관련된 스크립트를 이용하였으며, Date 객체 생성을 통해 오늘 날짜 기준으로 6일 전에 데이터를 확인 할수 있으며 원하는 월 또는 년의 결과 값을 ajax로 하여 db를 통해 데이터를 객체화하여 받아와 차트를 구현하였습니다.

- 로그인

<권한이 없을 시>

![image](https://user-images.githubusercontent.com/66732896/112922240-18d12f80-9147-11eb-992d-d7f93d0b63c2.png)

<사용자 권한이 있을시>


![image](https://user-images.githubusercontent.com/66732896/112922438-72d1f500-9147-11eb-852d-e1662c52d95c.png)


-스프링 시큐리티를 이용 하였으며 사용자에 대해 권한이 인증이 된다면 로그인이 됩니다. 회원 가입과 동시에 사용자로써 권한이 주어지고 로그인시 db에 저장된 권한(사용자/관리자)에 따라 사용 기능을 구분합니다. 그리고 사용자 권한으로 인증이 될 시 마이페이지, 게시물/댓글 쓰기, 자신이 쓴 게시물/댓글 삭제 및 수정 등이 가능하며 관리자 권한일 시 관리자 페이지로 이동합니다. 


회원 가입, 로그인 기능 구현은 사용자의 입장에서 제작을 했기에 편리하며, 시큐리티를 통한 로그인으로 보안을 신경쓰며 안정성을  높였습니다. 
관리자 페이지 차트 기능 구현은 한 눈에 해당 웹 페이지의 매출, 방문자 등 실적 등을 쉽게 확인 할 수 있어 원할한 서비스 관리가 가능합니다.


