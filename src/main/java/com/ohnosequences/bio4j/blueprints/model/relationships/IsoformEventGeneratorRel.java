/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.ohnosequences.bio4j.blueprints.model.relationships;

import com.ohnosequences.bio4j.blueprints.model.nodes.AlternativeProductNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.IsoformNode;
import com.ohnosequences.bio4j.model.nodes.AlternativeProduct;
import com.ohnosequences.bio4j.model.nodes.Isoform;
import com.ohnosequences.bio4j.model.relationships.IsoformEventGenerator;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class IsoformEventGeneratorRel extends BasicRelationshipBlueprints implements IsoformEventGenerator{

    public static final String NAME = "ISOFORM_EVENT_GENERATOR";

    public IsoformEventGeneratorRel(Edge e){
        super(e);
    }
    

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public Isoform getIsoform() {
        return new IsoformNode(getVertex(Direction.IN));
    }

    @Override
    public AlternativeProduct getAlternativeProduct() {
        return new AlternativeProductNode(getVertex(Direction.OUT));
    }

}
