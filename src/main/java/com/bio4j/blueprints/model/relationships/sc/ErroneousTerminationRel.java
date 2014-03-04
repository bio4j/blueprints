

package com.bio4j.blueprints.model.relationships.sc;

import com.bio4j.model.relationships.sc.ErroneousTermination;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ErroneousTerminationRel extends Edge implements ErroneousTermination{

    public static final String NAME = "ERRONEOUS_TERMINATION";

    public ErroneousTerminationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}

