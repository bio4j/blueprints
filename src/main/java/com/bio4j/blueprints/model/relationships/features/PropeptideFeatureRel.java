

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.PropeptideFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Part of a protein that is cleaved during maturation or activation
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PropeptideFeatureRel extends BasicFeatureRel implements PropeptideFeature{

    public static final String NAME = "FEATURE_PROPEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "propeptide";

    public PropeptideFeatureRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }


    @Override
    public String toString(){
        return super.toString();
    }

}
