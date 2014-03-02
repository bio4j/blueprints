

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.model.relationships.protein.ProteinErroneousTranslation;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinErroneousTranslationRel extends BasicProteinSequenceCautionRel implements ProteinErroneousTranslation{

    public static final String NAME = "PROTEIN_ERRONEOUS_TRANSLATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "erroneous translation";

    public ProteinErroneousTranslationRel(com.tinkerpop.blueprints.Edge e){
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
