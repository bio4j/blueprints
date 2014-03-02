
package com.bio4j.blueprints.model.relationships.go;

import com.bio4j.model.relationships.go.RegulatesGo;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * GO term 'regulates' relationship
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class RegulatesGoRel extends Edge implements RegulatesGo{

    public static final String NAME = "REGULATES_GO";

    public static final String OBOXML_RELATIONSHIP_NAME = "regulates";

    public RegulatesGoRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
