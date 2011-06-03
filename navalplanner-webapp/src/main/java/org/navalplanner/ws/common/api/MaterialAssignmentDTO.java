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

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.XMLGregorianCalendar;

import org.navalplanner.business.materials.entities.MaterialAssignment;

/**
 * DTO for {@link MaterialAssignment} entity.
 *
 * @author Manuel Rego Casasnovas <mrego@igalia.com>
 */
public class MaterialAssignmentDTO {

    @XmlAttribute(name = "material-code")
    public String materialCode;

    @XmlAttribute
    public BigDecimal units;

    @XmlAttribute(name = "unit-price")
    public BigDecimal unitPrice;

    @XmlAttribute(name = "estimated-availability")
    public XMLGregorianCalendar estimatedAvailability;

    public MaterialAssignmentDTO() {
    }

    public MaterialAssignmentDTO(String materialCode, BigDecimal units,
            BigDecimal unitPrice, XMLGregorianCalendar estimatedAvailability) {
        this.materialCode = materialCode;
        this.units = units;
        this.unitPrice = unitPrice;
        this.estimatedAvailability = estimatedAvailability;
    }

}
