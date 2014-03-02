

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.UnsureResidueFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Regions of uncertainty in the sequence
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UnsureResidueFeatureRel extends BasicFeatureRel implements UnsureResidueFeature{

    public static final String NAME = "FEATURE_UNSURE_RESIDUE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "unsure residue";


    public UnsureResidueFeatureRel(com.tinkerpop.blueprints.Edge e){
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

