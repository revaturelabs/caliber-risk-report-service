import DS from 'ember-data';

export default DS.Model.extend({
    batch_id: DS.attr('number'),
    batch_name: DS.attr('string'),
    qc_count_green: DS.attr('number'),
    qc_count_yellow: DS.attr('number'),
    qc_count_red: DS.attr('number'),
    qc_score: DS.attr('number'),
    survey_count_green: DS.attr('number'),
    survey_count_yellow: DS.attr('number'),
    survey_count_red: DS.attr('number'),
    survey_score: DS.attr('number'),
    trainer: DS.attr('string'),
    associate_ids: DS.attr(),//
    location: DS.attr('string'),
    skilltype: DS.attr('string'),
    end_date: DS.attr('date'),
    weeks: DS.attr('number'),
    current_week: DS.attr('number'),
    category_name: DS.attr('string'),
    report_time: DS.attr('date')
});