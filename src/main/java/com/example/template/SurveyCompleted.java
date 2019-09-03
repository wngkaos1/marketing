package com.example.template;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SurveyCompleted  extends AbstractEvent{

    private String stateMessage = "설문이 완료됨";
    private String customerName;
    private String surveyMessage;


    public SurveyCompleted(){
        this.setEventType(this.getClass().getSimpleName());
        SimpleDateFormat defaultSimpleDateFormat = new SimpleDateFormat("YYYYMMddHHmmss");
        this.timestamp = defaultSimpleDateFormat.format(new Date());
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSurveyMessage() {
        return surveyMessage;
    }

    public void setSurveyMessage(String surveyMessage) {
        this.surveyMessage = surveyMessage;
    }
}
