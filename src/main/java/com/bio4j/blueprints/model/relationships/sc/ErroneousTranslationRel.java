

package com.bio4j.blueprints.model.relationships.sc;

import com.bio4j.model.relationships.sc.ErroneousTranslation;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ErroneousTranslationRel extends Edge implements ErroneousTranslation{

    public static final String NAME = "ERRONEOUS_TRANSLATION";

    public ErroneousTranslationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
