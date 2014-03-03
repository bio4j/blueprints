

package com.bio4j.blueprints.model.relationships.aproducts;

import com.bio4j.model.relationships.aproducts.AlternativeProductInitiation;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class AlternativeProductInitiationRel extends Edge implements AlternativeProductInitiation{

    public static final String NAME = "ALTERNATIVE_PRODUCT_INITIATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "alternative initiation";

    public AlternativeProductInitiationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}

