create keyspace qcbatchreport with Replication = {'class':'SimpleStrategy', 'replication_factor':1};

use qcbatchreport;

create table Associate(associate_id int PRIMARY KEY, batch_id int, overall_color text, name text, portfolio_status text);
create table Associate_Ratings(report_id int PRIMARY KEY, associate_id int, week_id int, color text);
create table Batches(batch_id int PRIMARY KEY, trainer_id int, end_date date, portfolio_submission_date date);
create table Batch_Ratings(report_id int PRIMARY KEY, batch_id int, week_id int, color text);
create table QC_Report(report_id int PRIMARY KEY, trainer_id int, batch_id int, color text, comment text);
create table Survey_Reports(survey_id int PRIMARY KEY, trainer_id int, batch_id int, color text, comment text);
create table Trainer(trainer_id int PRIMARY KEY, trainer_name text);