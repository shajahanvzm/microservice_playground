package com.codemx.jibdemo.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "jibinfo")
public record ContactDto(String message, Map<String, String> contactDetails, List<String> onCallSupport){}