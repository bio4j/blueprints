

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.ChainFeature;
import com.bio4j.blueprints.model.Edge;


/**
 * Extent of a polypeptide chain in the mature protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ChainFeatureRel extends BasicFeatureRel implements ChainFeature{

    public static final String NAME = "FEATURE_CHAIN";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "chain";


    public ChainFeatureRel(com.tinkerpop.blueprints.Edge e){
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
