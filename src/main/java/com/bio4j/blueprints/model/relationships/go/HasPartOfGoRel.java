

package com.bio4j.blueprints.model.relationships.go;

import com.bio4j.model.relationships.go.HasPartOfGo;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * GO term 'has_part' relationship
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class HasPartOfGoRel extends Edge implements HasPartOfGo{

    public static final String NAME = "HAS_PART_GO";

    public static final String OBOXML_RELATIONSHIP_NAME = "has_part";

    public HasPartOfGoRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}