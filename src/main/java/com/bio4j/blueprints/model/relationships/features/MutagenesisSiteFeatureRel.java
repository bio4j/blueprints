

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.MutagenesisSiteFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Site which has been experimentally altered by mutagenesis
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class MutagenesisSiteFeatureRel extends BasicFeatureRel implements MutagenesisSiteFeature{

    public static final String NAME = "FEATURE_MUTAGENESIS_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "mutagenesis site";


    public MutagenesisSiteFeatureRel(com.tinkerpop.blueprints.Edge e){
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

