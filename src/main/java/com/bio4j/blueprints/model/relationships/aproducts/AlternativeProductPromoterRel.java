

package com.bio4j.blueprints.model.relationships.aproducts;

import com.bio4j.model.relationships.aproducts.AlternativeProductPromoter;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class AlternativeProductPromoterRel extends Edge implements AlternativeProductPromoter{

    public static final String NAME = "ALTERNATIVE_PRODUCT_PROMOTER";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "alternative promoter";

    public AlternativeProductPromoterRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
