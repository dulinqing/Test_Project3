package com.foxconn.maintest;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {

	//私有域扩展名
	private String extent;
		//接收指定的扩展名
	public FileFilter(String extent) {
		this.extent = extent;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		
		return name.endsWith(extent);
	}

}
