CREATE TABLE users (
                       id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                       cognito_id VARCHAR(255) NOT NULL UNIQUE,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       document VARCHAR(20) NOT NULL UNIQUE,
                       full_name VARCHAR(255) NOT NULL,
                       type VARCHAR(20) NOT NULL,
                       created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE addresses (
                           id SERIAL PRIMARY KEY,
                           user_id UUID NOT NULL UNIQUE REFERENCES users(id) ON DELETE CASCADE,
                           street VARCHAR(255) NOT NULL,
                           city VARCHAR(100) NOT NULL,
                           state VARCHAR(50) NOT NULL,
                           zip_code VARCHAR(20) NOT NULL,
                           country VARCHAR(100) NOT NULL
);

CREATE TABLE user_preferences (
                                  id SERIAL PRIMARY KEY,
                                  user_id UUID NOT NULL UNIQUE REFERENCES users(id) ON DELETE CASCADE,
                                  language VARCHAR(20) NOT NULL,
                                  theme VARCHAR(20) NOT NULL,
                                  font_size VARCHAR(20) NOT NULL
);
