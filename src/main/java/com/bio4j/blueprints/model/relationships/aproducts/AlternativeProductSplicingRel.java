

package com.bio4j.blueprints.model.relationships.aproducts;

import com.bio4j.model.relationships.aproducts.AlternativeProductSplicing;
import com.bio4j.blueprints.model.Edge;


/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class AlternativeProductSplicingRel extends Edge implements AlternativeProductSplicing{

    public static final String NAME = "ALTERNATIVE_PRODUCT_SPLICING";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "alternative splicing";

    public AlternativeProductSplicingRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
