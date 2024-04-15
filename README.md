# :calendar: 팝업 스토어 정보제공 서비스
![image](https://github.com/HongHyeYoung/team3-project/assets/103356641/8b3a96eb-7a84-45eb-89d2-0afbd4b55489)

## 팝업 스토어란 ❓
- 특정 브랜드가 일정 기간 동안 운영하는 임시 매장으로, 대체로 일주일에서 한 달까지 운영되다가 철수하는 것이 특징

## :computer: 프로젝트 기획 배경 
- 팝업 스토어 진행 일정이 너무 짧아서 한눈에 보기 어렵다.
- 공식 채널을 팔로우 하지 않으면 해당 팝업스토어에 대한 정보를 놓치기 쉽다.
  🛠 이로 인한 문제점을 보완하기위해 팝업스토어를 주최하는 공식 사이트를 직접 조회하지 않더라도

    방문의지가 있는 고객에게 팝업 스토어 정보 제공을 쉽게 만들기 위해 서비스를 제작함.

## :watch: 개발 기간
- 23.06.17 ~ 23.07.24일

### :couple: 멤버구성

- 팀장 이형채 - 메인 페이지 팝업 스토어 댓글, 팝업 스토어 캘린더 페이지 모달
- 팀원1 홍혜영 - 마이페이지 수정 및 탈퇴, 카드페이지, 좋아요 목록 페이지
- 팀원2 김세현 - 총괄 CSS, PPT 제작, 팝업 스토어 문의하기, 켈린더 페이지
- 팀원3 최형석 - 통합 및 형상관리, 팝업스토어 등록, 팝업스토어 수정, 관리자페이지, 로그인, 회원가입
- 팀원4 김가영 - 공지사항(CRUD), 발표
- 팀원5 김민규 - 맵 페이지(카카오 API), 메인 페이지 내 좋아요 기능, 맵 페이지 모달

### ⚙️ 개발 환경

- Java 8
- JDK 1.8.0
- IDE:STS
- Framework : Springboot
- Database : Oracle DB

## :pushpin: 주요 기능

#### 로그인 - 
- DB값 검증

- ### 회원가입 - 
- ID 중복 체크
- PW 8자리 이상 체크

- ### 마이 페이지 -
- 회원정보 수정 및 탈퇴
- 좋아요 리스트 확인

- ### 팝업스토어 등록 페이지 -
- 

- ### 메인 페이지 -

- ### 문의하기 및 공지사항 -
- 글 작성, 읽기, 수정, 삭제(CRUD)
   
#### 관리자 페이지
- 팝업 스토어 비즈니스 유저 회원가입 신청 관리 (승인, 거부)
- 문의사항 관리 (승인, 거부)
- 팝업 스토어 신청 페이지 (승인, 거부)
