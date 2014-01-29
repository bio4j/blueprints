/*
 * Copyright (C) 2010-2014  "Bio4j"
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

package com.ohnosequences.bio4j.blueprints.model.relationships.ncbi;

import com.ohnosequences.bio4j.blueprints.model.relationships.BasicRelationshipBlueprints;
import com.ohnosequences.bio4j.blueprints.model.nodes.ncbi.GiIdNode;
import com.ohnosequences.bio4j.model.relationships.ncbi.GiIdToNCBITaxon;
import com.tinkerpop.blueprints.Edge;


/**
 * Rel. leading to the taxon unit corresponding to this GI id
 */
public class GiIdToNCBITaxonRel extends BasicRelationshipBlueprints implements GiIdToNCBITaxon{

    public static final String NAME = "GI_ID_TO_NCBI_TAXON";

    public GiIdToNCBITaxonRel(Edge e){ super(e); }

    @Override
    public String getGiId(){ return edge.getProperty(GiIdNode.GI_ID_PROPERTY); }

    @Override
    public String getType() { return NAME; }

    @Override
    public void setGiId(String value){ edge.setProperty(GiIdNode.GI_ID_PROPERTY, value); }
}
