package com.bio4j.blueprints.model.relationships;

import com.bio4j.model.relationships.SubcellularLocationParent;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SubcellularLocationParentRel extends Edge implements SubcellularLocationParent{

    public static final String NAME = "SUBCELLULAR_LOCATION_PARENT";

    public SubcellularLocationParentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
