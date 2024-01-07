CREATE TABLE users (
  user_id 	varchar,
  user_password varchar NOT NULL,
  user_name	varchar	NOT NULL,
  PRIMARY KEY (user_id)
);

comment on table users is '사용자';
comment on column users.user_id is '아이디';
comment on column users.user_password  is '비밀번호';
comment on column users.user_name is '이름';