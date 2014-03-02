

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.ShortSequenceMotifFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Short (up to 20 amino acids) sequence motif of biological interest
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ShortSequenceMotifFeatureRel extends BasicFeatureRel implements ShortSequenceMotifFeature{

    public static final String NAME = "FEATURE_SHORT_SEQUENCE_MOTIF";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "short sequence motif";

    public ShortSequenceMotifFeatureRel(com.tinkerpop.blueprints.Edge e){
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
