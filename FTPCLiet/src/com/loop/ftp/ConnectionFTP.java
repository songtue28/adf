package com.loop.ftp;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
public class ConnectionFTP {
	public static void main(String[] args) {
		FTPClient client = new FTPClient();
		try {
			client.connect("127.0.0.1", 21);
			if (!client.login("ducquy", "123456")) {
				throw new Exception("Login fail!");
			}
			client.enterRemotePassiveMode();
			client.setFileType(FTP.BINARY_FILE_TYPE);
			System.out.println("Login is OK");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != client && client.isConnected()) {
				try {
					client.logout();
					client.disconnect();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;
// 
//public class FTPSample {
//    private static final String FTP_SERVER_ADDRESS = "127.0.0.1";
//    private static final int FTP_SERVER_PORT_NUMBER = 21;
//    private static final int FTP_TIMEOUT = 60000;
//    private static final int BUFFER_SIZE = 1024 * 1024 * 1;
//    private static final String FTP_USERNAME = "haophong";
//    private static final String FTP_PASSWORD = "1234567890";
//    private FTPClient ftpClien