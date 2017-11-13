package com.kravchenko;

import com.kravchenko.service.convert.Job;
import com.kravchenko.service.convert.JobConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterviewExamplesApplicationTests {

	String json = "{\n" +
			"  \"name\": \"service-core\",\n" +
			"  \"deployments\": [\n" +
			"    {\n" +
			"      \"type\": \"deploy\",\n" +
			"      \"name\": \"dev\",\n" +
			"      \"userName\": \"devuser\",\n" +
			"      \"sshCredentials\": \"jenkins-ssh\",\n" +
			"      \"host\": \"12.34.56.78\",\n" +
			"      \"deploymentType\": \"DEV\",\n" +
			"      \"targetDir\": \"/some/my/app/path\"\n" +
			"    }\n" +
			"  ],\n" +
			"  \"params\": []\n" +
			"}";

	@Autowired
	JobConverter jobConverter;

	@Test
	public void contextLoads() throws IOException {
		Job job = jobConverter.convertMe(json);

		System.out.println(job);


	}

}
