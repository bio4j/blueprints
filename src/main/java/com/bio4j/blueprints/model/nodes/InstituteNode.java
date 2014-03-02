
package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.Institute;

/**
 * This class just models a Research Institute.
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class InstituteNode extends Vertex implements Institute{

    public static final String NODE_TYPE = InstituteNode.class.getCanonicalName();
    /**
     * Institute name *
     */
    public static final String NAME_PROPERTY = "institute_name";

    public InstituteNode(com.tinkerpop.blueprints.Vertex v) {
        super(v, NODE_TYPE);
    }

    @Override
    public String getName() {
        return String.valueOf(vertex.getProperty(NAME_PROPERTY));
    }

    @Override
    public void setName(String value) {
        vertex.setProperty(NAME_PROPERTY, value);
    }

    @Override
    public String toString() {
        return "name = " + getName();
    }
}
