
INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO roles (name) VALUES ('USER');

SELECT * FROM roles;

SELECT * FROM user_roles;

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);