package com.example.traintricketbookingapp.exception.mvc.train;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@NoArgsConstructor
public class TrainException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StackTraceElement[] stackTrace;
	private String userFriendlyMessage;

	public TrainException(
			StackTraceElement[] stackTrace,
			String userFriendlyMessage) {
		
		super(Arrays.toString(stackTrace));
		this.stackTrace = stackTrace;
		this.userFriendlyMessage = userFriendlyMessage;
	}
}
