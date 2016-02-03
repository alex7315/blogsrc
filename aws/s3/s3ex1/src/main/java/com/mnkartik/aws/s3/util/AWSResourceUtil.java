package com.mnkartik.aws.s3.util;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;

public class AWSResourceUtil {

	public static AmazonS3Client getS3Client() {

		// [1]
		/*
		 * NOTE: Make sure the aws secret key and access key are provided for
		 * the example to work.
		 */
		String accessKey = null;
		String secretKey = null;

		if (accessKey == null || secretKey == null) {
			throw new IllegalArgumentException(
					"Please provide the aws access key and secret key");
		}

		BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey,
				secretKey);

		// [2]
		AmazonS3Client s3Client = new AmazonS3Client(awsCreds);
		Region region = Region.getRegion(Regions.AP_SOUTHEAST_1);
		s3Client.setRegion(region);

		return s3Client;
	}

}
