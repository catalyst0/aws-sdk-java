/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.xray.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InsightImpactGraphService JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightImpactGraphServiceJsonUnmarshaller implements Unmarshaller<InsightImpactGraphService, JsonUnmarshallerContext> {

    public InsightImpactGraphService unmarshall(JsonUnmarshallerContext context) throws Exception {
        InsightImpactGraphService insightImpactGraphService = new InsightImpactGraphService();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ReferenceId", targetDepth)) {
                    context.nextToken();
                    insightImpactGraphService.setReferenceId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    insightImpactGraphService.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    insightImpactGraphService.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Names", targetDepth)) {
                    context.nextToken();
                    insightImpactGraphService.setNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    insightImpactGraphService.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Edges", targetDepth)) {
                    context.nextToken();
                    insightImpactGraphService.setEdges(new ListUnmarshaller<InsightImpactGraphEdge>(InsightImpactGraphEdgeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return insightImpactGraphService;
    }

    private static InsightImpactGraphServiceJsonUnmarshaller instance;

    public static InsightImpactGraphServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightImpactGraphServiceJsonUnmarshaller();
        return instance;
    }
}
