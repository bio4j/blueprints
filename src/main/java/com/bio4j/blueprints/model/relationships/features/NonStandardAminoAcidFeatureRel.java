

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.NonStandardAminoAcidFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Occurence of non-standard amino acids (selenocysteine and pyrrolysine) in the protein sequence
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class NonStandardAminoAcidFeatureRel extends BasicFeatureRel implements NonStandardAminoAcidFeature{

    public static final String NAME = "FEATURE_NON_STANDARD_AMINO_ACID";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "non-standard amino acid";

    public NonStandardAminoAcidFeatureRel(com.tinkerpop.blueprints.Edge e){
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
