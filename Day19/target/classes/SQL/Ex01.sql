-- 계정 생성
create user c##itbank identified by it;

-- 생성한 계정에 권한 부여
grant dba,resource,connect to c##itbank;