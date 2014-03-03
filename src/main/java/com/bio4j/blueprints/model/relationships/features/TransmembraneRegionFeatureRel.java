

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.TransmembraneRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Extent of a membrane-spanning region
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class TransmembraneRegionFeatureRel extends BasicFeatureRel implements TransmembraneRegionFeature{

    public static final String NAME = "FEATURE_TRANSMEMBRANE_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "transmembrane region";


    public TransmembraneRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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
