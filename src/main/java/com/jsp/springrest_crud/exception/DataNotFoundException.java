package com.jsp.springrest_crud.exception;

// import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
// import lombok.NoArgsConstructor;

@Getter
// @AllArgsConstructor
// @NoArgsConstructor
@Data
public class DataNotFoundException extends RuntimeException{


	public String msg="data not found";

	public String getMsg() {
		return msg;
	}

	public DataNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public DataNotFoundException() {
		super();
	}


	

}
