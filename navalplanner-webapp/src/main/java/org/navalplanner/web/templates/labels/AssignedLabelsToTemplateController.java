/*
 * This file is part of ###PROJECT_NAME###
 *
 * Copyright (C) 2009 Fundación para o Fomento da Calidade Industrial e
 *                    Desenvolvemento Tecnolóxico de Galicia
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
package org.navalplanner.web.templates.labels;

import org.navalplanner.business.templates.entities.OrderElementTemplate;
import org.navalplanner.web.orders.labels.AssignedLabelsController;
import org.navalplanner.web.templates.IOrderTemplatesModel;

/**
 * @author Óscar González Fernández <ogonzalez@igalia.com>
 *
 */
public class AssignedLabelsToTemplateController extends
        AssignedLabelsController<OrderElementTemplate, IOrderTemplatesModel> {

    private IAssignedLabelsToTemplateModel assignedLabelsToTemplateModel;

    private IOrderTemplatesModel templatesModel;

    private OrderElementTemplate template;

    @Override
    protected OrderElementTemplate getElement() {
        if (template != null) {
            return template;
        }
        return templatesModel.getTemplate();
    }

    @Override
    protected IAssignedLabelsToTemplateModel getModel() {
        return assignedLabelsToTemplateModel;
    }

    @Override
    protected void setOuterModel(IOrderTemplatesModel templatesModel) {
        this.templatesModel = templatesModel;
        this.assignedLabelsToTemplateModel.setTemplatesModel(templatesModel);
    }

    public void setTemplate(OrderElementTemplate template) {
        this.template = template;
    }


}
