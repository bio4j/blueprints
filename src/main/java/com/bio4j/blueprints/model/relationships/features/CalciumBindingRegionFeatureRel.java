

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.CalciumBindingRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Position(s) of calcium binding region(s) within the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CalciumBindingRegionFeatureRel extends BasicFeatureRel implements CalciumBindingRegionFeature{

    public static final String NAME = "FEATURE_CALCIUM_BINDING_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "calcium-binding region";

    public CalciumBindingRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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
