/**
* Copyright (c) 2014, Fabio Corubolo - University of Liverpool and Anna Eggers - Göttingen State and University Library
* The work has been developed in the PERICLES Project by Members of the PERICLES Consortium.
* This work was supported by the European Commission Seventh Framework Programme under Grant Agreement Number FP7- 601138 PERICLES.
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at:   http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
* an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied, including without
* limitation, any warranties or conditions of TITLE, NON-INFRINGEMENT, MERCHANTIBITLY, or FITNESS FOR A PARTICULAR
* PURPOSE. In no event and under no legal theory, whether in tort (including negligence), contract, or otherwise,
* unless required by applicable law or agreed to in writing, shall any Contributor be liable for damages, including
* any direct, indirect, special, incidental, or consequential damages of any character arising as a result of this
* License or out of the use or inability to use the Work.
* See the License for the specific language governing permissions and limitation under the License.
*/
package main;

import static utility.FileUtils.createFile;
import static utility.FileUtils.deleteFile;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

public class MainTest {

	String file1 = "testFile1";
	String file2 = "testFile2";
	List<String> digitalObjects = new ArrayList<String>();

	// HashSet<DigitalObject> digitalObjectSet;

	@Before
	public void setUp() {
		createFile(file1);
		createFile(file2);
		digitalObjects.add(file1);
		digitalObjects.add(file2);
	}

	@After
	public void tearDown() {
		deleteFile(file1);
		deleteFile(file2);
	}

	// @Test
	// public void applicationTest() {
	// String[] args = {};
	// ExtractionMain.main(args);
	// }

	// @Test
	// public void buildExtractorTest() {
	// Properties properties = new Properties();
	// ExtractionController extractionController;
	// extractionController = ExtractionMain.buildExtractor(properties,
	// digitalObjects);
	// assertNotNull(extractionController);
	// }
}
