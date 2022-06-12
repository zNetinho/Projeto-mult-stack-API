package br.com.treinaweb.adoteumpet.api.common.dtos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ErrorResponse {
    private int status;
    private String error;
    private String cause;
    private String message;
    private LocalDateTime timestamp;
    private Map<String, List<String>> errors;

    // public ErrorResponse() {
    // }

    // public ErrorResponse(int status, String error, String cause, String message,
    // LocalDate timestamp) {
    // this.status = status;
    // this.error = error;
    // this.cause = cause;
    // this.message = message;
    // this.timestamp = timestamp;
    // }

    // public int getStatus() {
    // return status;
    // }

    // public void setStatus(int status) {
    // this.status = status;
    // }

    // public String getError() {
    // return error;
    // }

    // public void setError(String error) {
    // this.error = error;
    // }

    // public String getCause() {
    // return cause;
    // }

    // public void setCause(String cause) {
    // this.cause = cause;
    // }

    // public String getMessage() {
    // return message;
    // }

    // public void setMessage(String message) {
    // this.message = message;
    // }

    // public LocalDate getTimestamp() {
    // return timestamp;
    // }

    // public void setTimestamp(LocalDate timestamp) {
    // this.timestamp = timestamp;
    // }

}
