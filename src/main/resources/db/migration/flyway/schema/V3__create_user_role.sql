DROP TABLE IF EXISTS user_roles;
CREATE TABLE user_roles
(
    user_id INT8 NOT NULL REFERENCES users(id) ON UPDATE CASCADE ON DELETE CASCADE,
    role_id INT8 NOT NULL REFERENCES roles(id) ON UPDATE CASCADE,
    CONSTRAINT user_roles_pkey PRIMARY KEY (user_id, role_id),
    version INT8 NOT NULL DEFAULT 0
);