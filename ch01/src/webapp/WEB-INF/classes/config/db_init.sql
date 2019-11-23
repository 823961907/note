use dbtest;
-- 创建 cn.bean.BaseUser 对应的base_user 表
CREATE TABLE IF NOT EXISTS base_user(
    userName VARCHAR(10) NOT NULL,
    password VARCHAR(10) NOT NULL,
    rePassword VARCHAR(10) NOT NULL,
    passwordTip VARCHAR(10) NOT NULL,
    PRIMARY KEY ( userName )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- DROP TABLE base_user;


