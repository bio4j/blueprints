

package com.bio4j.blueprints.model.relationships;

import com.bio4j.blueprints.model.Edge;
import com.bio4j.blueprints.model.nodes.CountryNode;
import com.bio4j.blueprints.model.nodes.InstituteNode;
import com.bio4j.model.relationships.InstituteCountry;
import com.tinkerpop.blueprints.Direction;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class InstituteCountryRel extends Edge implements InstituteCountry{

    public static final String NAME = "INSTITUTE_COUNTRY";
    public InstituteCountryRel(com.tinkerpop.blueprints.Edge e){ super(e); }

    @Override
    public String getType() {
        return NAME;
    }
    
    @Override
    public InstituteNode getInstitute(){
        return new InstituteNode(getVertex(Direction.IN));
    }
    
    @Override
    public CountryNode getCountry(){
        return new CountryNode(getVertex(Direction.OUT));
    }
}
