

package com.bio4j.blueprints.model.relationships.aproducts;

import com.bio4j.model.relationships.aproducts.AlternativeProductRibosomalFrameshifting;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class AlternativeProductRibosomalFrameshiftingRel extends Edge implements AlternativeProductRibosomalFrameshifting{

    public static final String NAME = "ALTERNATIVE_PRODUCT_RIBOSOMAL_FRAMESHIFTING";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "ribosomal frameshifting";

    public AlternativeProductRibosomalFrameshiftingRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
