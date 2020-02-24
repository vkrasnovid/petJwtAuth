INSERT INTO roles (name) VALUES 'ROLE_USER';
INSERT INTO roles (name) VALUES 'ROLE_ADMIN';
INSERT INTO users (username, first_name, last_name, email, password, status)
VALUES ('user','ivan','ivanov','test@mail.com','$2a$04$0wLFFIadR0GwWBCPxMZDHO3gpoUgCc.vMvnydNvTCC70oBCtighSO', 'ACTIVE');
INSERT INTO user_roles (user_id, role_id) VALUES (1,1);