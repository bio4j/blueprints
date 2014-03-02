

package com.bio4j.blueprints.model.relationships.go;

import com.bio4j.model.relationships.go.NegativelyRegulatesGo;
import com.bio4j.blueprints.model.Edge;


/**
 *
 * GO term negatively regulates relationship
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class NegativelyRegulatesGoRel extends Edge implements NegativelyRegulatesGo{

    public static final String NAME = "NEGATIVELY_REGULATES_GO";

    public static final String OBOXML_RELATIONSHIP_NAME = "negatively_regulates";

    public NegativelyRegulatesGoRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
