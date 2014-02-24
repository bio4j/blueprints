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

package com.ohnosequences.bio4j.blueprints.model.nodes;

import com.ohnosequences.bio4j.blueprints.model.Vertex;
import com.ohnosequences.bio4j.blueprints.model.relationships.TaxonParentRel;
import com.ohnosequences.bio4j.model.nodes.Taxon;
import com.tinkerpop.blueprints.Direction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Uniprot taxonomy taxon
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TaxonNode extends Vertex implements Taxon{

    public static final String NODE_TYPE = TaxonNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "taxon_name";


    public TaxonNode(com.tinkerpop.blueprints.Vertex v){
        super(v);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}

    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

    /**
     * 
     * @return 
     */
    public TaxonNode getParent(){
        TaxonNode parent = null;
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, TaxonParentRel.NAME).iterator();
        if(iterator.hasNext()){
            parent = new TaxonNode(iterator.next());
        }
        
        return parent;
    }
    
    /**
     * 
     * @return 
     */
    public List<TaxonNode> getChildren(){
        List<TaxonNode> list = new ArrayList<TaxonNode>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, TaxonParentRel.NAME).iterator();
        
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex tempNode = iterator.next();
            if(tempNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(TaxonNode.NODE_TYPE)){
                list.add(new TaxonNode(tempNode));
            }           
        }
        
        return list;
    }
    
    /**
     * 
     * @return 
     */
    public List<OrganismNode> getOrganisms(){
        List<OrganismNode> list = new ArrayList<OrganismNode>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, TaxonParentRel.NAME).iterator();
        
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex tempNode = iterator.next();            
            if(tempNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(OrganismNode.NODE_TYPE)){
                list.add(new OrganismNode(tempNode));
            }           
        }
        
        return list;
    }
    
    @Override
    public String toString(){
        return "name = " + getName();
    }

}
