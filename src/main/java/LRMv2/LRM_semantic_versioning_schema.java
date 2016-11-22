/*
 * Copyright 2016 Anna Eggers - Göttingen State and University Library
 * The work has been developed in the PERICLES Project by Members of the PERICLES Consortium.
 * This project has received funding from the European Union’s Seventh Framework Programme for research, technological
 * development and demonstration under grant agreement no FP7- 601138 PERICLES.
 * <p>
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
package LRMv2;

import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

/**
 * Vocabulary definitions from LRM-semantic-versioning-schema.ttl
 *
 * @author Auto-generated by schemagen on 24 Jun 2015 10:54
 */
public class LRM_semantic_versioning_schema {
    /**
     * <p>
     * The ontology CORE_MODEL that holds the vocabulary terms
     * </p>
     */
    private static OntModel m_model = ModelFactory.createOntologyModel(
            OntModelSpec.RDFS_MEM, null);

    /**
     * <p>
     * The namespace of the vocabulary as a string
     * </p>
     */
    public static final String NS = "http://xrce.xerox.com/LRM#";

    /**
     * <p>
     * The namespace of the vocabulary as a string
     * </p>
     *
     * @see #NS
     */
    public static String getURI() {
        return NS;
    }

    /**
     * <p>
     * The namespace of the vocabulary as a resource
     * </p>
     */
    public static final Resource NAMESPACE = m_model.createResource(NS);

    public static final OntProperty byAgent = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#byAgent");

    public static final OntProperty certificate = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#certificate");

    /**
     * <p>
     * The versioning event is due to a process of the resource description
     * </p>
     */
    public static final OntProperty changed_description = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#changed-description");

    /**
     * <p>
     * The versioning event is due to a process of the resource
     * </p>
     */
    public static final OntProperty changed_resource = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#changed-resource");

    /**
     * <p>
     * The versioning event is due to a process of specification
     * </p>
     */
    public static final OntProperty changed_specification = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#changed-specification");

    public static final OntProperty describedBy = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#describedBy");

    public static final OntProperty ofResource = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#ofResource");

    public static final OntProperty parameter = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#parameter");

    public static final OntProperty result = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#result");

    public static final OntProperty version = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#version");

    /**
     * <p>
     * defines the invariant associated with the version, according to our
     * certified semantic versioning CORE_MODEL (optional)
     * </p>
     */
    public static final OntProperty version_invariant = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#version-invariant");

    /**
     * <p>
     * defines the specification associated with the version, according to our
     * certified semantic versioning CORE_MODEL (optional)
     * </p>
     */
    public static final OntProperty version_specification = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#version-specification");

    /**
     * <p>
     * defines the agent responsible for verifying the compliance of the
     * resource with its invariant and specification (optional)
     * </p>
     */
    public static final OntProperty version_verifier = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#version-verifier");

    public static final OntProperty versionKind = m_model
            .createOntProperty("http://xrce.xerox.com/LRM#versionKind");

    public static final OntClass Action = m_model
            .createClass("http://xrce.xerox.com/LRM#Action");

    public static final OntClass Agent = m_model
            .createClass("http://xrce.xerox.com/LRM#Agent");

    /**
     * <p>
     * certificates describe (and certifies) the compliance of a given resource
     * version with its specification (could be a formal proof)
     * </p>
     */
    public static final OntClass Certificate = m_model
            .createClass("http://xrce.xerox.com/LRM#Certificate");

    public static final OntClass CertificationRequest = m_model
            .createClass("http://xrce.xerox.com/LRM#CertificationRequest");

    public static final OntClass CertificationService = m_model
            .createClass("http://xrce.xerox.com/LRM#CertificationService");

    public static final OntClass CertifiedVersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#CertifiedVersionEvent");

    public static final OntClass CertifiedVersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#CertifiedVersionTransformation");

    public static final OntClass CreateVersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#CreateVersionEvent");

    public static final OntClass CreateVersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#CreateVersionTransformation");

    public static final OntClass Delta = m_model
            .createClass("http://xrce.xerox.com/LRM#Delta");

    public static final OntClass Description = m_model
            .createClass("http://xrce.xerox.com/LRM#Description");

    public static final OntClass DigitalResource = m_model
            .createClass("http://xrce.xerox.com/LRM#DigitalResource");

    public static final OntClass DisjunctiveDependency = m_model
            .createClass("http://xrce.xerox.com/LRM#DisjunctiveDependency");

    public static final OntClass Event = m_model
            .createClass("http://xrce.xerox.com/LRM#Event");

    public static final OntClass EventHandler = m_model
            .createClass("http://xrce.xerox.com/LRM#EventHandler");

    public static final OntClass MajorVersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#MajorVersionEvent");

    public static final OntClass MajorVersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#MajorVersionTransformation");

    public static final OntClass MicroVersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#MicroVersionEvent");

    public static final OntClass MicroVersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#MicroVersionTransformation");

    public static final OntClass MinorVersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#MinorVersionEvent");

    public static final OntClass MinorVersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#MinorVersionTransformation");

    public static final OntClass Plan = m_model
            .createClass("http://xrce.xerox.com/LRM#Plan");

    public static final OntClass Resource = m_model
            .createClass("http://xrce.xerox.com/LRM#Resource");

    public static final OntClass Service = m_model
            .createClass("http://xrce.xerox.com/LRM#Service");

    public static final OntClass ServiceInvocation = m_model
            .createClass("http://xrce.xerox.com/LRM#ServiceInvocation");

    public static final OntClass Specification = m_model
            .createClass("http://xrce.xerox.com/LRM#Specification");

    public static final OntClass UpdateEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#UpdateEvent");

    public static final OntClass UpdateVersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#UpdateVersionEvent");

    public static final OntClass UpdateVersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#UpdateVersionTransformation");

    public static final OntClass Version = m_model
            .createClass("http://xrce.xerox.com/LRM#Version");

    /**
     * <p>
     * All events related to the versioning management mechanisms.
     * </p>
     */
    public static final OntClass VersionEvent = m_model
            .createClass("http://xrce.xerox.com/LRM#VersionEvent");

    public static final OntClass VersionKind = m_model
            .createClass("http://xrce.xerox.com/LRM#VersionKind");

    public static final OntClass VersionTransformation = m_model
            .createClass("http://xrce.xerox.com/LRM#VersionTransformation");

    /**
     * <p>
     * The regular expression defines terms like [1.2.0:3]/35 (in order of
     * number appearance: major, minor, micro, variant, stamp
     * </p>
     */
    public static final OntClass VersionVector = m_model
            .createClass("http://xrce.xerox.com/LRM#VersionVector");

    public static final OntClass VersionedDR = m_model
            .createClass("http://xrce.xerox.com/LRM#VersionedDR");

    /**
     * <p>
     * The lrm:invariant and lrm:specification predicates (if defined) will be
     * used to assess the nature of the version transformation. micro versions :
     * semantically equivalent (according to lrm:specification) minor version:
     * backward compatible (according to lrm:specification); major version:
     * guaranties only the lrm:invariant relations.
     * </p>
     */
    public static final OntClass VersionedResource = m_model
            .createClass("http://xrce.xerox.com/LRM#VersionedResource");

    public static final Individual askCertification = m_model.createIndividual(
            "http://xrce.xerox.com/LRM#askCertification", Action);

    /**
     * <p>
     * registers a process either of the resource or its specification and
     * generates a new version accordingly ; does not attempt to qualify the
     * process
     * </p>
     */
    public static final Individual createDependency = m_model.createIndividual(
            "http://xrce.xerox.com/LRM#createDependency", EventHandler);

    public static final Individual createVersionedResource = m_model
            .createIndividual(
                    "http://xrce.xerox.com/LRM#createVersionedResource",
                    EventHandler);

    public static final Individual updateDescription = m_model
            .createIndividual("http://xrce.xerox.com/LRM#updateDescription",
                    EventHandler);

    public static final Individual updateImpact = m_model.createIndividual(
            "http://xrce.xerox.com/LRM#updateImpact",
            m_model.createClass("http://xrce.xerox.com/ReAL#Template"));

    public static final Individual updatePrecondition = m_model
            .createIndividual("http://xrce.xerox.com/LRM#updatePrecondition",
                    m_model.createClass("http://xrce.xerox.com/ReAL#Template"));

    public static final Individual vVersionDescription = m_model
            .createIndividual("http://xrce.xerox.com/LRM#vVersionDescription",
                    EventHandler);

    public static final Individual vVersionImpact = m_model.createIndividual(
            "http://xrce.xerox.com/LRM#vVersionImpact",
            m_model.createClass("http://xrce.xerox.com/ReAL#Template"));

    public static final Individual vVersionPrecondition = m_model
            .createIndividual("http://xrce.xerox.com/LRM#vVersionPrecondition",
                    Plan);

    public static final Individual versionCreate = m_model.createIndividual(
            "http://xrce.xerox.com/LRM#versionCreate", Action);

    public static final Individual Inc = m_model.createIndividual(
            "http://xrce.xerox.com/VERSION#Inc", Action);

    public static final Individual IncMajor = m_model.createIndividual(
            "http://xrce.xerox.com/VERSION#IncMajor", Action);

    public static final Individual IncMicro = m_model.createIndividual(
            "http://xrce.xerox.com/VERSION#IncMicro", Action);

    public static final Individual IncMinor = m_model.createIndividual(
            "http://xrce.xerox.com/VERSION#IncMinor", Action);

}
