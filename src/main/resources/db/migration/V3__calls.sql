create TABLE calls_descriptions (
  id UUID NOT NULL,
   api_id BIGINT,
   created_by VARCHAR(255),
   created_on TIMESTAMP WITHOUT TIME ZONE,
   response_time INTEGER,
   session_id BIGINT,
   status INTEGER,
   response VARCHAR(255),
   CONSTRAINT pk_calls_descriptions PRIMARY KEY (id)
);