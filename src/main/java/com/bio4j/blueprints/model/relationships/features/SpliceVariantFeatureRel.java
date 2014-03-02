

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.SpliceVariantFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Amino acid change(s) producing alternate protein isoforms
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SpliceVariantFeatureRel extends BasicFeatureRel implements SpliceVariantFeature{

    public static final String NAME = "FEATURE_SPLICE_VARIANT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "splice variant";

    public SpliceVariantFeatureRel(com.tinkerpop.blueprints.Edge e){
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

