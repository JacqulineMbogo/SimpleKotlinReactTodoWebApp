alter table calls_descriptions drop COLUMN api_id;

alter table calls_descriptions add api_id VARCHAR(255);