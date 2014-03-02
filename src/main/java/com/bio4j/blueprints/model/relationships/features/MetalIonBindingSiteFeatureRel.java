

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.MetalIonBindingSiteFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Binding site for a metal ion
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MetalIonBindingSiteFeatureRel extends BasicFeatureRel implements MetalIonBindingSiteFeature{

    public static final String NAME = "FEATURE_METAL_ION_BINDING_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "metal ion-binding site";


    public MetalIonBindingSiteFeatureRel(com.tinkerpop.blueprints.Edge e){
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

