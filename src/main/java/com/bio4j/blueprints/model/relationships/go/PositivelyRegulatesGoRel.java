
package com.bio4j.blueprints.model.relationships.go;

import com.bio4j.model.relationships.go.PositivelyRegulatesGo;
import com.bio4j.blueprints.model.Edge;


/**
 *
 * GO term 'positively_regulates' relationship
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PositivelyRegulatesGoRel extends Edge implements PositivelyRegulatesGo{

    public static final String NAME = "POSITIVELY_REGULATES_GO";
    public static final String OBOXML_RELATIONSHIP_NAME = "positively_regulates";

    public PositivelyRegulatesGoRel(Edge e) {
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }
}
