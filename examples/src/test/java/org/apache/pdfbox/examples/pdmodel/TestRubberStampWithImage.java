/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pdfbox.examples.pdmodel;

import junit.framework.TestCase;
import org.apache.pdfbox.exceptions.CryptographyException;
import org.apache.pdfbox.exceptions.SignatureException;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Test for RubberStampWithImage
 */
public class TestRubberStampWithImage extends TestCase
{
    public void test()
            throws IOException, CryptographyException, SignatureException, NoSuchAlgorithmException
    {
        String documentFile = "src/test/resources/org.apache.pdfbox.examples.pdmodel/document.pdf";
        String stampFile = "src/test/resources/org.apache.pdfbox.examples.pdmodel/stamp.jpg";
        String outFile = "target/test-output/TestRubberStampWithImage.pdf";

        new File("target/test-output").mkdirs();

        String[] args = new String[] { documentFile, outFile, stampFile };
        RubberStampWithImage rubberStamp = new RubberStampWithImage();
        rubberStamp.doIt(args);
    }
}