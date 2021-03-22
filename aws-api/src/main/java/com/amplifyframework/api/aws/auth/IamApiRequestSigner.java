/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.api.aws.auth;

import com.amplifyframework.api.aws.sigv4.AppSyncV4Signer;

import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

/**
 * Request signer implementatioon that uses AWS SigV4 signing.
 */
public class IamApiRequestSigner extends ApiRequestSigner {
    private final String awsRegion;
    private final AWSCredentialsProvider credentialsProvider;

    /**
     * Constructor that takes in the necessary dependencies used to sign the requests.
     * @param awsRegion The region to be used for signing.
     * @param credentialsProvider The AWS credentials provider to use when retrieving AWS credentials.
     */
    public IamApiRequestSigner(String awsRegion, AWSCredentialsProvider credentialsProvider) {
        this.awsRegion = awsRegion;
        this.credentialsProvider = credentialsProvider;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    void addAuthHeader(Request<?> request) {
        //Get credentials - This will refresh the credentials if necessary
        AWSCredentials credentials = this.credentialsProvider.getCredentials();
        //sign the request
        new AppSyncV4Signer(this.awsRegion).sign(request, credentials);
    }
}