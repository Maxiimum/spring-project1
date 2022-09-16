스프링 프로젝트 
=============
프로젝트내용
-------------
  - 방탈출카페 예약플랫폼 및 커뮤니티

역할
-------------
- 팀명 : Team138
- 팀장
- 메인페이지
- 예약페이지
- 마이페이지(리뷰내역, 예약내역)
- 관리자페이지(회원, 예약, 테마)

사용기술 및 언어
-------------
- HTML5
- CSS3
- JavaScript
- JQuery
- JAVA
- Spring 프레임워크
- Oracle
- MyBatis
- SVN
  
DB ERD
--------------
   ![final (3)](https://user-images.githubusercontent.com/80867166/190571134-6a1bb95b-1838-4d6e-b222-82d31b8eff0e.png)
  
주요기능
--------------
  1. 메인페이지
  
    - owlcarousel 플러그인을 적용하여 슬라이드를 구현했습니다.
    - tiles를 적용하여 header영역, content영역, footer영역 구분했습니다.
  
    ![메인](https://user-images.githubusercontent.com/80867166/190584414-58a940b1-c2b6-4d94-886d-50c99cd922e0.png)
  

  2. REST API
  
    - 서버와 클라이언트간에 REST API 통신을 하기위해 노력했습니다.
  

  3. 방탈출 테마 예약 구현

    - 오늘 날짜 이전의 날짜는 예약할 수 없게 했습니다.
    - 예약에 필요한 모든 데이터를 입력받아야 예약가능하게 했습니다.


     ![image](https://user-images.githubusercontent.com/80867166/190594854-a91ab08d-2255-4c72-9034-5c1598cafc0c.png)
  
4. 예약페이지 Ajax 이용
  - 지역 -> 카페 -> 테마 -> 시간 순으로 클릭시 해당하는 데이터들을 Ajax를 통해 화면에 보여줄 수 있게 구현했습니다.
  
5. 예약 CRD 구현
  - 예약 추가, 조회, 삭제 기능을 구현했습니다.
  
6. 중복 예약 방지
  - 해당 날짜의 테마에 등록된 예약 시간을 비교하여 예약이 가능한 시간과 불가능한 시간을 구분했습니다.
  
7. 마이페이지
  - 로그인 회원에 한하여 마이페이지 나의 탈출일지(리뷰내역), 예약 정보를 출력했습니다.
  - 회원은 자신의 예약내역을 삭제할 수 있게 구현했습니다.
  

### 마이페이지
   ![image](https://user-images.githubusercontent.com/80867166/190613248-e393fe83-6e16-47ef-bb63-ae33870bae34.png)


   ![image](https://user-images.githubusercontent.com/80867166/190613138-b21383f2-98fa-466e-b271-6e603d0ce400.png)

  
8. 관리자페이지
  - 회원목록 페이지에서 해당 회원의 정보를 보여주고 상태(일반회원, 관리자)를 변경 할 수 있습니다.
  - 다중 선택 or 전체 선택을 통해 관리자 유저를 제외한 일괄 삭제기능을 구현했습니다.
  - 전체 예약목록 조회  일괄삭제 기능을 구현했습니다.
  - 방탈출 테마는 CRUD를 통해 관리할 수 있게 구현했습니다.
  - 테마 이미지는 commons-fileupload 라이브러리를 적용하여 업로드 기능을 구현했습니다.

  
### 관리자페이지
   ![image](https://user-images.githubusercontent.com/80867166/190613821-241b18de-03ad-4091-8af1-05791bb7f79f.png)


   ![image](https://user-images.githubusercontent.com/80867166/190615472-1317fea7-4ddf-46d8-af20-b258663e253d.png)


   ![image](https://user-images.githubusercontent.com/80867166/190616555-fc5255c7-1ea5-49a4-916c-005d258f2d48.png)

  
주요 소스 코드 폴더 및 파일 설명
-------------

- webapp

  - WEB-INF
    - views : 페이지 이동시 실행되는 소스 코드 파일 모음 폴더
      - index.jsp : tiles를 통해 모듈 분리를 위한 jsp 파일
      - header.jsp : 상단 메뉴 구성 소스 코드
      - footer.jsp : 제작자 정보 관련 소스 코드
      - main/main.jsp : 메인 화면 소스 코드
      - reserve/reserve.jsp : 예약 화면 소스 코드
      - mypage/myReview.jsp : 마이페이지 나의탈출일지 소스 코드
      - mypage/myReservaion.jsp : 마이페이지 예약내역 소스 코드
        
      - admin : 관리자 페이지 프론트 소스 코드 파일
        - admin_member.jsp : 관리자페이지 회원목록 소스 코드
        - admin_reserve.jsp : 관리자페이지 예약목록 소스 코드
        - admin_theme.jsp : 관리자페이지 테마목록 소스 코드
        - admin_theme_write.jsp : 관리자페이지 테마 등록 폼 소스 코드
        - admin_theme_modify.jsp : 관리자페이지 테마 수정 폼 소스 코드
  
    - spring : 스프링 환경설정 파일 모음 폴더
      - root-context.xml : DB 및 ORM 관련설정
      - appServlet/servlet-context.xml : DispatcherServlet 관련 설정
      - appServlet/ tiles.xml : tiles 설정 파일
  
    - web.xml : 웹 설정 파일
      
  - resources : css, js, image 파일 모음

  
- java/open/sesame : 백엔드 소스 모음 폴더
  
  - controller : 컨트롤러 파일 모음 폴더
    - MainController.java : 메인화면 요청시 처리 컨트롤러
    - ReserveController.java : 예약화면 요청시 처리 컨트롤러
    - MypageController.java : 마이페이지 요청시 처리 컨트롤러
  
  - admin/controller : 관리자페이지 컨트롤러 파일 모음 폴더
    - AdminController.java : 관리자페이지 메인화면 요청시 처리 컨트롤러
    - AdminMemberController.java : 관리자페이지 회원목록화면 요청시 처리 컨트롤러
    - AdminReserveController.java : 관리자페이지 예약목록화면 요청시 처리 컨트롤러
    - AdminThemeController.java : 관리자페이지 테마목록화면 요청시 처리 컨트롤러
      
  - dto : dto 클래스 파일 모음 폴더 
  - mapper : 마이바티스 매핑설정 파일 모음 폴더
  - dao : dao 클래스 파일 모음 폴더
  - service : service 파일 모음 폴더
  - util : 기능 구현에 필요한 기타 클래스 파일 모음 폴더
    - Pager.java : 페이징 처리 관련 클래스 파일
     
- resources : 로그 및 mybatis 설정 파일

