

package com.bio4j.blueprints.model.relationships.go;

import com.bio4j.model.relationships.go.PartOfGo;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * GO term 'part_of' relationship
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PartOfGoRel extends Edge implements PartOfGo{

    public static final String NAME = "PART_OF_GO";

    public static final String OBOXML_RELATIONSHIP_NAME = "part_of";

    public PartOfGoRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
