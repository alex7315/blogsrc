package com.mnkartik.aws.s3;

import java.io.ByteArrayInputStream;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.mnkartik.aws.s3.util.AWSResourceUtil;

public class PutObjectIntoS3 {

	public static void main(String[] args) {
		new PutObjectIntoS3();
	}

	public PutObjectIntoS3() {
		try {
			// [1]
			AmazonS3Client s3Client = AWSResourceUtil.getS3Client();

			// [2]
			String bucketName = "mnkartik";
			String keyName = "sample.txt";
			byte[] fileData = "This string is going to be the file content"
					.getBytes();

			// [3]
			PutObjectRequest putRequest = new PutObjectRequest(bucketName,
					keyName, new ByteArrayInputStream(fileData),
					new ObjectMetadata());

			// [4]
			PutObjectResult result = s3Client.putObject(putRequest);

			System.out.println("file stored in s3 store");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
