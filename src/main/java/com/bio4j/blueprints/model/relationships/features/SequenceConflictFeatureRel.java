

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.SequenceConflictFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Description of sequence discrepancies of unknown origin
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SequenceConflictFeatureRel extends BasicFeatureRel implements SequenceConflictFeature{

    public static final String NAME = "FEATURE_SEQUENCE_CONFLICT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "sequence conflict";

    public SequenceConflictFeatureRel(com.tinkerpop.blueprints.Edge e){
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


