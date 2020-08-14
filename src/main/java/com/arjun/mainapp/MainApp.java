package com.arjun.mainapp;

import com.arjun.model.ArtemisMQInfo;
import com.arjun.model.FileDirectoryInfo;
import com.arjun.reader.ArtemisConfigReader;
import com.arjun.reader.SDWReader;

public class MainApp {

	public static void main(String[] args) {

		ArtemisConfigReader artemisConfigReader = new ArtemisConfigReader();

		FileDirectoryInfo fdInfo = artemisConfigReader.getFileDirectoryInstance();
		ArtemisMQInfo mqInfo =   artemisConfigReader.getArtemisMQInfo();
		SDWReader reader = new SDWReader(fdInfo,mqInfo);
		reader.start();
		
		System.out.println(fdInfo);

	}

}
