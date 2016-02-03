package com.mnkartik.aws.s3;

import org.apache.commons.io.IOUtils;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.mnkartik.aws.s3.util.AWSResourceUtil;

public class GetObjectFromS3 {

	public static void main(String[] args) {
		new GetObjectFromS3();
	}

	public GetObjectFromS3() {
		try {
			
			// [1]
			AmazonS3Client s3Client = AWSResourceUtil.getS3Client();

			// [2]
			String bucketName = "mnkartik";
			String keyName = "sample.txt";
			S3Object object = s3Client.getObject(new GetObjectRequest(
					bucketName, keyName));

			// [3]
			S3ObjectInputStream inputStream = object.getObjectContent();

			// [4]
			String outputText = IOUtils.toString(inputStream);
			System.out.println(outputText);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
