package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.TaxonParentRel;

import com.tinkerpop.blueprints.Direction;

import com.bio4j.model.nodes.Taxon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Uniprot taxonomy taxon
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class TaxonNode extends Vertex implements Taxon {

  private static final String NODE_TYPE = TaxonNode.class.getCanonicalName();

  public static final String NAME_PROPERTY = "taxon_name";

  public TaxonNode(com.tinkerpop.blueprints.Vertex v) { super(v, NODE_TYPE); }

  @Override
  public String getName(){ return String.valueOf(vertex.getProperty(NAME_PROPERTY)); }

  @Override
  public void setName(String value){ vertex.setProperty(NAME_PROPERTY, value); }

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
