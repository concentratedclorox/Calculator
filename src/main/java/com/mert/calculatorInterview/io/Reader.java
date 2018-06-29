package com.mert.calculatorInterview.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class Reader {
	static Logger LOG = Logger.getLogger(Reader.class.getName());

	{
		// SimpleFormatter fmt = new SimpleFormatter();
		// StreamHandler sh = new StreamHandler(System.out, fmt);
		// LOG.addHandler(sh);
	}

	public static LinkedList<String> read(String path) throws IOException {
		LOG.info("Reading from" + path);
		try (InputStream resourceAsStream = Reader.class.getClassLoader().getResourceAsStream(path);
				InputStreamReader reader = new InputStreamReader(resourceAsStream);
				BufferedReader bReader = new BufferedReader(reader)) {
			LinkedList<String> list = new LinkedList<>();
			while (bReader.ready()) {
				String a = bReader.readLine();
				if (!a.isEmpty())
					list.add(a);
			}
			return list;
		}

	}

}
