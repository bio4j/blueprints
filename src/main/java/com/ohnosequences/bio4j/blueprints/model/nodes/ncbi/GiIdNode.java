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
package com.ohnosequences.bio4j.blueprints.model.nodes.ncbi;

import com.ohnosequences.bio4j.blueprints.model.nodes.BasicVertex;
import com.ohnosequences.bio4j.blueprints.model.nodes.TaxonNode;
import com.ohnosequences.bio4j.blueprints.model.relationships.ncbi.GiIdToNCBITaxonRel;
import com.ohnosequences.bio4j.model.nodes.ncbi.NCBITaxon;
import com.ohnosequences.bio4j.model.nodes.ncbi.GiId;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Vertex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GiIdNode extends BasicVertex implements GiId{

    public static final String NODE_TYPE = GiIdNode.class.getCanonicalName();

    public static final String GI_ID_PROPERTY = "taxon_gi_id";

    public GiIdNode(Vertex v){ super(v); }

    //----------------GETTERS---------------------
    @Override
    public String getGiId(){ return String.valueOf(vertex.getProperty(GI_ID_PROPERTY)); }
    
    @Override
    public NCBITaxon getNCBITaxon(){
        Iterator<Vertex> iterator = vertex.getVertices(Direction.OUT, GiIdToNCBITaxonRel.NAME).iterator();
        if(iterator.hasNext()) return new NCBITaxonNode(iterator.next());
        else return null;
    }
    
    //----------------SETTERS-------------------
    @Override
    public void setGiId(String value){ vertex.setProperty(GI_ID_PROPERTY, value); }



    @Override
    public String toString(){
        return "GI id = " + getGiId();
    }

}
