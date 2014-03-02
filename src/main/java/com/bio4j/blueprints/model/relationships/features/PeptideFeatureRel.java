

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.PeptideFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Extent of an active peptide in the mature protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PeptideFeatureRel extends BasicFeatureRel implements PeptideFeature{

    public static final String NAME = "FEATURE_PEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "peptide";

    public PeptideFeatureRel(com.tinkerpop.blueprints.Edge e){
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
