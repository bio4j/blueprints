package com.bio4j.blueprints.model;

import com.bio4j.model.Node;

import com.tinkerpop.blueprints.Direction;
import java.util.Set;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public abstract class Vertex implements com.tinkerpop.blueprints.Vertex, Node {
    
    public static String NODE_TYPE_PROPERTY = "node_type";
    
    protected com.tinkerpop.blueprints.Vertex vertex;
    public Vertex(com.tinkerpop.blueprints.Vertex v){ vertex = v; }
    
    public com.tinkerpop.blueprints.Vertex getVertex(){ return vertex; }
    
    @Override
    public String getType(){
      return String.valueOf(vertex.getProperty(NODE_TYPE_PROPERTY));
    }    
    
    protected void setType(String type) { vertex.setProperty(NODE_TYPE_PROPERTY, type); }
    protected Vertex(com.tinkerpop.blueprints.Vertex v, String type) { vertex = v; setType(type); }

    // Vertex-specific

    @Override
    public Iterable<com.tinkerpop.blueprints.Vertex> getVertices(com.tinkerpop.blueprints.Direction direction, String... labels) {
        return vertex.getVertices(direction, labels);
    }

    @Override
    public Iterable<com.tinkerpop.blueprints.Edge> getEdges(com.tinkerpop.blueprints.Direction direction, String... labels) {
        return vertex.getEdges(direction, labels);
    }
    
    @Override
    public com.tinkerpop.blueprints.Edge addEdge(String label, com.tinkerpop.blueprints.Vertex inVertex) {
        return vertex.addEdge(label, inVertex);
    }

    @Override
    public com.tinkerpop.blueprints.VertexQuery query() {
        return vertex.query();
    }

    // Element

    @Override
    public <T> T getProperty(String string) {
        return vertex.getProperty(string);
    }

    @Override
    public Set<String> getPropertyKeys() {
        return vertex.getPropertyKeys();
    }

    @Override
    public void setProperty(String string, Object o) {
        vertex.setProperty(string, o);
    }

    @Override
    public <T> T removeProperty(String string) {
        return vertex.removeProperty(string);
    }

    @Override
    public Object getId() {
        return vertex.getId();
    }
    
    @Override
    public void remove(){
        vertex.remove();
    }
    
}
