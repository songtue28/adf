package com.loop.ftp;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
public class ListFileOnServerFTP {
	public static void main(String[] args) {
		FTPClient client = new FTPClient();
		try {
			client.connect("127.0.0.1", 21);
			if (!client.login("ducquy", "123456")) {
				throw new Exception("Login fail!");
			}
			client.enterRemotePassiveMode();
			client.setFileType(FTP.BINARY_FILE_TYPE);
			System.out.println("Login is OK:");
			FTPFile[] ftpFiles = client.listFiles();
			for (FTPFile ftpFile : ftpFiles) {
// Check if FTPFile is a regular file
				if (ftpFile.getType() == FTPFile.FILE_TYPE) {
					System.out.println("FTPFile: " + ftpFile.getName());
				}
			}
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