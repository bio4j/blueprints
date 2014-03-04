

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.LipidMoietyBindingRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Covalently attached lipid group(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class LipidMoietyBindingRegionFeatureRel extends BasicFeatureRel implements LipidMoietyBindingRegionFeature{

    public static final String NAME = "FEATURE_LIPID_MOIETY_BINDING_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "lipid moiety-binding region";

    public LipidMoietyBindingRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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
