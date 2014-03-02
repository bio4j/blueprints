

package com.bio4j.blueprints.model.relationships.sc;

import com.bio4j.model.relationships.sc.ErroneousInitiation;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ErroneousInitiationRel extends Edge implements ErroneousInitiation{

    public static final String NAME = "ERRONEOUS_INITIATION";

    public ErroneousInitiationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}