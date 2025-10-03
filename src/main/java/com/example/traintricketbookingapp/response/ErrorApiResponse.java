package com.example.traintricketbookingapp.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * This object is used to sent the exception details to REST client, if
 * something went wrong inside REST Api.
 *
 */
@AllArgsConstructor
@Getter
@Setter
public class ErrorApiResponse {

	private LocalDateTime dateTime;
	private String message;
	private String status;
	private String path;
}