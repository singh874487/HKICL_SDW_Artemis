package com.arjun.model;

public class FileDirectoryInfo {

	private String SAPE_FileName;
	private String SAPH_FileName;
	private String SAPU_FileName;
	private String SAPR_FileName;
	private String CMUP_FileName;

	private String sdFileDir;
	private String sdLoggerFileDir;
	private String sdAuditLogFileDir;

	public String getSAPE_FileName() {
		return SAPE_FileName;
	}

	public void setSAPE_FileName(String sAPE_FileName) {
		SAPE_FileName = sAPE_FileName;
	}

	public String getSAPH_FileName() {
		return SAPH_FileName;
	}

	public void setSAPH_FileName(String sAPH_FileName) {
		SAPH_FileName = sAPH_FileName;
	}

	public String getSAPU_FileName() {
		return SAPU_FileName;
	}

	public void setSAPU_FileName(String sAPU_FileName) {
		SAPU_FileName = sAPU_FileName;
	}

	public String getSAPR_FileName() {
		return SAPR_FileName;
	}

	public void setSAPR_FileName(String sAPR_FileName) {
		SAPR_FileName = sAPR_FileName;
	}

	public String getCMUP_FileName() {
		return CMUP_FileName;
	}

	public void setCMUP_FileName(String cMUP_FileName) {
		CMUP_FileName = cMUP_FileName;
	}

	public String getSdFileDir() {
		return sdFileDir;
	}

	public void setSdFileDir(String sdFileDir) {
		this.sdFileDir = sdFileDir;
	}

	public String getSdLoggerFileDir() {
		return sdLoggerFileDir;
	}

	public void setSdLoggerFileDir(String sdLoggerFileDir) {
		this.sdLoggerFileDir = sdLoggerFileDir;
	}

	public String getSdAuditLogFileDir() {
		return sdAuditLogFileDir;
	}

	public void setSdAuditLogFileDir(String sdAuditLogFileDir) {
		this.sdAuditLogFileDir = sdAuditLogFileDir;
	}

}
