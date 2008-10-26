package org.apache.maven.it;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.it.util.ResourceExtractor;
import org.apache.maven.it.Verifier;

import java.io.File;

public class MavenITmng2562Timestamp extends AbstractMavenIntegrationTestCase {
    
    public MavenITmng2562Timestamp()
    {
        super( "[2.1.0-M1,)"); // 2.1.0+ only
    }

    public void testitMNG2562() throws Exception {
        File testDir = ResourceExtractor.simpleExtractResources(getClass(),
                "/mng-2562-timestamp");
        Verifier verifier = new Verifier(testDir.getAbsolutePath());
        verifier.executeGoal("verify");

        verifier.verifyErrorFreeLog();
        verifier.resetStreams();
    }
}
