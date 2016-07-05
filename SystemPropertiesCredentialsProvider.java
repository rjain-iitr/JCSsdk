/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * {@link JCSCredentialsProvider} implementation that provides credentials by
 * looking at the <code>jcs.accessKeyId</code> and <code>jcs.secretKey</code>
 * Java system properties.
 */
public class SystemPropertiesCredentialsProvider implements JCSCredentialsProvider {

    @Override
    public JCSCredentials getCredentials() {
        String accessKey = System.getProperty("ACCESS_KEY").trim();

        String secretKey = System.getProperty("SECRET_KEY").trim();

        if (Utils.isNullOrEmpty(accessKey) || Utils.isNullOrEmpty(secretKey)) {

            throw new RuntimeException(
                    "Unable to load AWS credentials from Java system properties ("
            + accessKey + " and "+ secretKey + ")");
        }

        return new BasicJCSCredentials(accessKey, secretKey);
    }

    @Override
    public void refresh() {}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}