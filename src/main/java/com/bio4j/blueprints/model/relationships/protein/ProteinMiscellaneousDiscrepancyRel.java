

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.model.relationships.protein.ProteinMiscellaneousDiscrepancy;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinMiscellaneousDiscrepancyRel extends BasicProteinSequenceCautionRel implements ProteinMiscellaneousDiscrepancy{

    public static final String NAME = "PROTEIN_MISCELLANEOUS_DISCREPANCY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "miscellaneous discrepancy";

    public ProteinMiscellaneousDiscrepancyRel(com.tinkerpop.blueprints.Edge e){
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
