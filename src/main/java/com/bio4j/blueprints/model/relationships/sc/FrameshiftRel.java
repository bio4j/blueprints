

package com.bio4j.blueprints.model.relationships.sc;

import com.bio4j.model.relationships.sc.Frameshift;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class FrameshiftRel extends Edge implements Frameshift{

    public static final String NAME = "FRAMESHIFT";

    public FrameshiftRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
