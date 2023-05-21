package org.reymar;

import java.math.BigInteger;

public enum ALLOWED_OPTIONS_SELECTION {
	VALUE1(BigInteger.valueOf(1)),
	VALUE2(BigInteger.valueOf(2)),
	VALUE3(BigInteger.valueOf(3)),
	VALUE4(BigInteger.valueOf(4));

	private final BigInteger value;

	ALLOWED_OPTIONS_SELECTION(BigInteger value) {
		this.value = value;
	}

	public BigInteger getValue() {
		return value;
	}
}
