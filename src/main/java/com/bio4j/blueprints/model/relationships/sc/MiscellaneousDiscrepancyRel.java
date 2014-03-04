

package com.bio4j.blueprints.model.relationships.sc;

import com.bio4j.model.relationships.sc.MiscellaneousDiscrepancy;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class MiscellaneousDiscrepancyRel extends Edge implements MiscellaneousDiscrepancy{

    public static final String NAME = "MISCELLANEOUS_DISCREPANCY";

    public MiscellaneousDiscrepancyRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}