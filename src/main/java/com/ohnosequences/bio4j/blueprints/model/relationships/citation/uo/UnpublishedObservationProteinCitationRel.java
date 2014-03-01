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

package com.ohnosequences.bio4j.blueprints.model.relationships.citation.uo;

import com.ohnosequences.bio4j.blueprints.model.Edge;
import com.ohnosequences.bio4j.blueprints.model.nodes.ProteinNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.citation.UnpublishedObservationNode;
import com.ohnosequences.bio4j.model.relationships.citation.uo.UnpublishedObservationProteinCitation;
import com.tinkerpop.blueprints.Direction;


/**
 * Proteins referenced by unpublished observations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UnpublishedObservationProteinCitationRel extends Edge implements UnpublishedObservationProteinCitation{

    public static final String NAME = "UNPUBLISHED_OBSERVATION_PROTEIN_CITATION";

    public UnpublishedObservationProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public UnpublishedObservationNode getUnpublishedObservation(){
        return new UnpublishedObservationNode(getVertex(Direction.IN));
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
