package com.osfg.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Properties {
	
	@Value("${adminName}")
	String adminName;

}
