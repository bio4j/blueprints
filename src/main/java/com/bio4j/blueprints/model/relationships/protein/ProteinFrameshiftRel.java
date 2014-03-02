

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.model.relationships.protein.ProteinFrameshift;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinFrameshiftRel extends BasicProteinSequenceCautionRel implements ProteinFrameshift{

    public static final String NAME = "PROTEIN_FRAMESHIFT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "frameshift";

    public ProteinFrameshiftRel(com.tinkerpop.blueprints.Edge e){
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
