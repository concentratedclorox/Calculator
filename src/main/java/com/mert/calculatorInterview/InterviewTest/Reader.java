package com.mert.calculatorInterview.InterviewTest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reader {

	public static LinkedList<String> read(Path resourcePath) throws IOException {
		return new LinkedList<>(Files.lines(resourcePath).collect(Collectors.toList()));
	}
}
