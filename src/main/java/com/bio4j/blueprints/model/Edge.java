package com.bio4j.blueprints.model;

import com.tinkerpop.blueprints.Direction;
import java.util.Set;

import com.bio4j.model.Relationship;

/**
 *
 * @author ppareja
 */
public abstract class Edge implements com.tinkerpop.blueprints.Edge, Relationship {
    
    protected com.tinkerpop.blueprints.Edge edge = null;

    public Edge(com.tinkerpop.blueprints.Edge e){
        edge = e;
    }
    
    public com.tinkerpop.blueprints.Edge getEdge(){
        return edge;
    }
    
    @Override
    public Vertex getVertex(Direction drctn) throws IllegalArgumentException {
        return new Vertex(edge.getVertex(drctn));
    }

    @Override
    public <T> T getProperty(String string) {
        return edge.getProperty(string);
    }

    @Override
    public Set<String> getPropertyKeys() {
        return edge.getPropertyKeys();
    }

    @Override
    public void setProperty(String string, Object o) {
        edge.setProperty(string, o);
    }

    @Override
    public <T> T removeProperty(String string) {
        return edge.removeProperty(string);
    }

    @Override
    public Object getId() {
        return edge.getId();
    }
    
    @Override
    public String getLabel(){
        return getType();
    }

    @Override
    public void remove(){
        edge.remove();
    }

}
