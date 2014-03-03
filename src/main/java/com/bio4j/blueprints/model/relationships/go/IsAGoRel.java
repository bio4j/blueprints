

package com.bio4j.blueprints.model.relationships.go;

import com.bio4j.model.relationships.go.IsAGo;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * GO term 'is_a' relationship
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class IsAGoRel extends Edge implements IsAGo{

    public static final String NAME = "IS_A_GO";

    public static final String OBOXML_RELATIONSHIP_NAME = "is_a";

    public IsAGoRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
