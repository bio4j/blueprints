
package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.SequenceVariantFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Description of a natural variant of the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SequenceVariantFeatureRel extends BasicFeatureRel implements SequenceVariantFeature{

    public static final String NAME = "FEATURE_SEQUENCE_VARIANT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "sequence variant";

    public SequenceVariantFeatureRel(com.tinkerpop.blueprints.Edge e){
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

