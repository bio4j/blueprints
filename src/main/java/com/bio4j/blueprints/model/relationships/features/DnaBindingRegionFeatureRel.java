

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.DnaBindingFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Position and type of a DNA-binding domain
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DnaBindingRegionFeatureRel extends BasicFeatureRel implements DnaBindingFeature{

    public static final String NAME = "FEATURE_DNA_BINDING_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "DNA-binding region";

    public DnaBindingRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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

