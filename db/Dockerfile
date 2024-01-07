# 공식 PostgreSQL 이미지를 기반으로 함
FROM postgres:latest

# 환경 변수 설정 (필요에 따라 변경 가능)
ENV POSTGRES_DB=cleanarch
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres

COPY create_table_user.sql /docker-entrypoint-initdb.d/

EXPOSE 5432