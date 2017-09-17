package com.besant.java.intro;

import java.io.FileInputStream;
import java.io.IOException;

public class MyUtilities {

	public double[] getDataSet(FileInputStream in2) throws BadDateSetException {
		String file = in2 + ".dset";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return getDataSet(in);
		} catch (IOException e) {
			throw new BadDateSetException();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				; // ignore: we either read the data OK
					// or we're throwing BadDataSetException
			}
		}
	}
}
