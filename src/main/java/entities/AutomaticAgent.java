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
package entities;

import models.CoreModel;
import models.InfrastructureModel;
import models.ScenarioModel;

/**
 * An automatic agent is a non-human agent in the infrastructure of a technical system.
 */
public class AutomaticAgent extends EcosystemAgent {

    public AutomaticAgent(ScenarioModel scenario, String identifier, Template template) {
        super(scenario, identifier, template);
    }

    public AutomaticAgent(ScenarioModel scenario, String identifier) {
        super(scenario, identifier, InfrastructureModel.automaticAgent);
    }

    public void partOf(TechnicalService service) {
        service.hasPart(this);
    }

    public void runsOn(TechnicalService server) {
        addProperty(InfrastructureModel.runsOn, server);
    }

    public static class AutomaticAgentTemplate extends AgentTemplate {
        public AutomaticAgentTemplate(InfrastructureModel model) {
            super(model, "Automatic Agent",
                    "An automatic agent is a non-human agent in the infrastructure of a technical system.", CoreModel.ecosystemAgent);
            addSuperClass(InfrastructureModel.infrastructureComponent);
        }

        @Override
        public AutomaticAgent createEntity(ScenarioModel model, String ID) {
            return new AutomaticAgent(model, ID);
        }
    }
}
