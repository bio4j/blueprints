package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.SubcellularLocation;

/**
 * Protein subcellular locations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SubcellularLocationNode extends Vertex implements SubcellularLocation {

    public static final String NODE_TYPE = SubcellularLocationNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "subcellular_location_name";

    public SubcellularLocationNode(com.tinkerpop.blueprints.Vertex v) { super(v, NODE_TYPE); }

    @Override
    public String getName(){ return String.valueOf(vertex.getProperty(NAME_PROPERTY)); }

    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

    @Override
    public String toString(){
        return "name = " + getName();
    }

}
