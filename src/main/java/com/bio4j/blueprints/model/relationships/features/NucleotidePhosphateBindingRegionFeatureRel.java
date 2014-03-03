

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.NucleotidePhosphateBindingRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Nucleotide phosphate binding region
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class NucleotidePhosphateBindingRegionFeatureRel extends BasicFeatureRel implements NucleotidePhosphateBindingRegionFeature{

    public static final String NAME = "FEATURE_NUCLEOTIDE_PHOSPHATE_BINDING_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "nucleotide phosphate-binding region";

    public NucleotidePhosphateBindingRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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

