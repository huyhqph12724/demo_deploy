package com.inviv.test.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "app_log")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AppLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "application_code")
    private String applicationCode;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "thread_id")
    private String threadID;

    @Column(name = "request_id")
    private String requestID;

    @Column(name = "session_id")
    private String sessionID;

    @Column(name = "requestContent")
    private String requestContent;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "start_time")
    private LocalDateTime startTime;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "error_code")
    private String errorCode;

    @Column(name = "error_description")
    private String errorDescription;

    @Column(name = "transaction_status")
    private String transactionStatus;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "account")
    private String account;

    @Column(name = "response_content")
    private String responseContent;

    @Column(name = "method")
    private String method;

    @Column(name = "http_status")
    private Integer httpStatus;

    @Column(name = "uri")
    private String uri;

    @Column(name = "parent_node")
    private String parentNode;
}
