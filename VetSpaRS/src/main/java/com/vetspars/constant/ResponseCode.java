package com.vetspars.constant;

import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum ResponseCode {
	@XmlEnumValue(value = "1")
	SUCCESS,
	@XmlEnumValue(value = "-1")
	ERROR
}
