package com.foxconn.maintest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author 。。。。
 *
 */
public class LogsRecord {
	/**
	 * 
	 * @param filePathString 文件路径
	 * @param msgString 写入文件的内容
	 */
	public void logInfo(String filePathString, String msgString) {

		Date nowDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = dateFormat.format(nowDate);

		dateString = dateString + ".txt";

		File destFile;
		File txtFile;
		BufferedWriter bufferedWriter = null;
		try {
			destFile = new File(filePathString);
			if (!destFile.exists()) {
				destFile.mkdir();

			}
			txtFile = new File(destFile, dateString);
			if (!txtFile.exists()) {
				txtFile.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(txtFile, true);
			bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(msgString);

			bufferedWriter.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 
	 * @param file
	 */
	public void deleteLog_OutOfDate(File file) {

		Date nowDate = new Date();
		FileFilter fileFilter = new FileFilter(".txt");
		if (file.isDirectory()) {
			for (File fileTxt : file.listFiles(fileFilter)) {
				if (fileTxt.isFile()) {
					String filename = fileTxt.getName();
					filename = filename.split("\\.")[0];
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

					try {
						ParsePosition parsePosition = new ParsePosition(0);
						Date oldlDate = dateFormat.parse(filename, parsePosition);
						if (differentDaysByMillisecond(oldlDate, nowDate) > 30) {
							fileTxt.delete();
						}
					} catch (Exception e) {

						e.printStackTrace();
					}
				}
			}
		}

	}

	private int differentDaysByMillisecond(Date date1, Date date2) {
		int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
		return days;
	}

	private int getCurrentMonthDay() {
		Calendar a = Calendar.getInstance();
		a.set(Calendar.DATE, 1);
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		return maxDate;
	}

}
