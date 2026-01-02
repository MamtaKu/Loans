package com.eazybytes.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "loans")
public record LoansContactInfoDto(String message,
                                  java.util.Map<String, String> contactDetails,
                                  java.util.List<String> onCallSupport) {
}
