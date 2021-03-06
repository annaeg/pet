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
package controller;

import static configuration.Log.EXCEPTION_LOGGER;

import java.util.Set;
import java.util.logging.Level;

import org.reflections.Reflections;

import storage.FileStorageInterface;
import storage.GeneralStorage;

/**
 * Controller class to manage the storage backend classes.
 * 
 * @see GeneralStorage
 */
public class StorageController {
	public Class<? extends GeneralStorage> storageClass = FileStorageInterface.class;
	public static final Set<Class<? extends GeneralStorage>> storageSystems = getStorage();
	public static GeneralStorage storage;

	/**
	 * Looks for all sub-classes of GeneralStorage and creates a set of
	 * available storage backends. Furthermore the configured backend is
	 * initialized.
	 * 
	 * @param storageName
	 */
	public StorageController(String storageName) {
		for (Class<? extends GeneralStorage> c : storageSystems) {
			if (c.getSimpleName().equals(storageName)) {
				storageClass = c;
			}
		}
		try {
			storage = storageClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			EXCEPTION_LOGGER.log(Level.SEVERE,
					"Exception at StorageController constructor", e);
		}
	}

	/**
	 * Initializes the set of available storage techniques.
	 * 
	 * @return set of available storage classes
	 */
	private static Set<Class<? extends GeneralStorage>> getStorage() {
		Reflections reflections = new Reflections(GeneralStorage.class
				.getPackage().getName());
		return reflections.getSubTypesOf(GeneralStorage.class);
	}

	/**
	 * Deletes all extracted data from the storage.
	 */
	public void deleteAllMetadata() {
		storage.deleteAllMetadata();
	}
}
