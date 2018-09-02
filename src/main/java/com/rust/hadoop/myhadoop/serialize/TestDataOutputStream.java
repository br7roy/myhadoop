package com.rust.hadoop.myhadoop.serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.junit.Test;

public class TestDataOutputStream {

	/**
	 * @throws Throwable
	 */
	@Test
	public void testString() throws Throwable {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		// dos.writeUTF("h中ello");
		dos.writeBytes("h中ello");
		// dos.writeChars("xxx");
		dos.close();
		DataInputStream dis = new DataInputStream(
				new ByteArrayInputStream(baos.toByteArray()));
		
		dis.readChar();
	}


}
