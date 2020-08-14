package com.arjun.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.arjun.model.ArtemisMQInfo;
import com.arjun.model.FileDirectoryInfo;

public class ArtemisConfigReader {

	public ArtemisMQInfo getArtemisMQInfo() {

		String sapE_Queue = null;
		String sapH_Queue = null;
		String sapU_Queue = null;
		String sapR_Queue = null;
		String cmup_Queue = null;

		ArtemisMQInfo artemisMQInfo = new ArtemisMQInfo();

		try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

			Properties prop = new Properties();
			prop.load(input);

			sapE_Queue = prop.getProperty("mq.sap_e_queue");
			sapH_Queue = prop.getProperty("mq.sap_h_queue");
			sapU_Queue = prop.getProperty("mq.sap_u_queue");
			sapR_Queue = prop.getProperty("mq.sap_r_queue");
			cmup_Queue = prop.getProperty("mq.cmup_queue");

			if (sapE_Queue != null && !sapE_Queue.isBlank()) {
				artemisMQInfo.setSAPE_Queue(sapE_Queue);
			} else {
				throw new RuntimeException("Error occured while setting the sapE Queue");
			}
			if (sapH_Queue != null && !sapH_Queue.isBlank()) {
				artemisMQInfo.setSAPH_Queue(sapH_Queue);
			} else {
				throw new RuntimeException("Error occured while setting the sapH Queue");
			}
			if (sapR_Queue != null && !sapR_Queue.isBlank()) {
				artemisMQInfo.setSAPR_Queue(sapR_Queue);
			} else {
				throw new RuntimeException("Error occured while setting the sapR Queue");
			}
			if (sapU_Queue != null && !sapU_Queue.isBlank()) {
				artemisMQInfo.setSAPR_Queue(sapU_Queue);
			} else {
				throw new RuntimeException("Error occured while setting the sapR Queue");
			}
			if (cmup_Queue != null && !cmup_Queue.isBlank()) {
				artemisMQInfo.setCMUP_Queue(cmup_Queue);
			} else {
				throw new RuntimeException("Error occured while setting the cmup Queue");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return artemisMQInfo;
	}

	public FileDirectoryInfo getFileDirectoryInstance() {

		String sapE_FileName = null;
		String sapH_FileName = null;
		String sapU_FileName = null;
		String sapR_FileName = null;
		String cmup_FileName = null;

		String sdFileDir = null;
		String sdLoggerFileDir = null;
		String sdAuditLogFileDir = null;

		FileDirectoryInfo fileDirectoryInfo = new FileDirectoryInfo();

		try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

			Properties prop = new Properties();
			prop.load(input);

			sapE_FileName = prop.getProperty("mq.sap_e_queue");
			sapH_FileName = prop.getProperty("mq.sap_h_queue");
			sapU_FileName = prop.getProperty("mq.sap_u_queue");
			sapR_FileName = prop.getProperty("mq.sap_r_queue");
			cmup_FileName = prop.getProperty("mq.cmup_queue");

			sdFileDir = prop.getProperty("mq.sdFileDir");
			sdAuditLogFileDir = prop.getProperty("mq.sdAuditLogFileDir");
			sdLoggerFileDir = prop.getProperty("mq.sdLoggerFileDir");

			if (sapE_FileName != null && !sapE_FileName.isBlank()) {
				fileDirectoryInfo.setSAPE_FileName(sapE_FileName);
			} else {
				throw new RuntimeException("Error occured while setting the SAPE filename");
			}
			if (sapR_FileName != null && !sapR_FileName.isBlank()) {
				fileDirectoryInfo.setSAPR_FileName(sapR_FileName);
			} else {
				throw new RuntimeException("Error occured while setting the SAPR filename");
			}
			if (sapH_FileName != null && !sapH_FileName.isBlank()) {
				fileDirectoryInfo.setSAPH_FileName(sapH_FileName);
			} else {
				throw new RuntimeException("Error occured while setting the SAPH filename");
			}
			if (sapU_FileName != null && !sapU_FileName.isBlank()) {
				fileDirectoryInfo.setSAPU_FileName(sapU_FileName);
			} else {
				throw new RuntimeException("Error occured while setting the SAPE filename");
			}
			if (cmup_FileName != null && !cmup_FileName.isBlank()) {
				fileDirectoryInfo.setCMUP_FileName(cmup_FileName);
			} else {
				throw new RuntimeException("Error occured while setting the CMUP filename");
			}

			if (sdFileDir != null && !sdFileDir.isBlank()) {
				fileDirectoryInfo.setSdFileDir(sdFileDir);
			} else {
				throw new RuntimeException("Error occured while setting the sdFileDir directory");
			}

			if (sdAuditLogFileDir != null && !sdAuditLogFileDir.isBlank()) {
				fileDirectoryInfo.setSdAuditLogFileDir(sdAuditLogFileDir);
			} else {
				throw new RuntimeException("Error occured while setting the sdAuditLogFileDir directory");
			}

			if (sdLoggerFileDir != null && !sdLoggerFileDir.isBlank()) {
				fileDirectoryInfo.setSdLoggerFileDir(sdLoggerFileDir);
			} else {
				throw new RuntimeException("Error occured while setting the sdLoggerFileDir directory");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileDirectoryInfo;
	}

}
