/*
 * This file is part of NavalPlan
 *
 * Copyright (C) 2009-2010 Fundación para o Fomento da Calidade Industrial e
 *                         Desenvolvemento Tecnolóxico de Galicia
 * Copyright (C) 2010-2011 Igalia, S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.navalplanner.ws.common.api;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.navalplanner.business.requirements.entities.IndirectCriterionRequirement;

/**
 * DTO for {@link IndirectCriterionRequirement} entity.
 *
 * @author Manuel Rego Casasnovas <mrego@igalia.com>
 */
@XmlRootElement(name = "indirect-criterion-requirement")
public class IndirectCriterionRequirementDTO extends CriterionRequirementDTO {

    @XmlAttribute(name = "valid")
    public boolean valid = true;

    public IndirectCriterionRequirementDTO() {
    }

    public IndirectCriterionRequirementDTO(String name, String type,
            boolean valid) {
        super(name, type);
        this.valid = valid;
    }

}
