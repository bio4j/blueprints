

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.IntramembraneRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Extent of a region located in a membrane without crossing it
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class IntramembraneRegionFeatureRel extends BasicFeatureRel implements IntramembraneRegionFeature{

    public static final String NAME = "FEATURE_INTRAMEMBRANE_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "intramembrane region";

    public IntramembraneRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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
