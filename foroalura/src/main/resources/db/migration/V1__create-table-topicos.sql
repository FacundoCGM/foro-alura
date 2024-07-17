create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(300) not null,
    fecha date not null,
    status varchar(100) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    respuestas varchar(100),

    primary key(id)

);