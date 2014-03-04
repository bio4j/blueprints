

package com.bio4j.blueprints.model.relationships.uniref;

import com.bio4j.model.relationships.uniref.Uniref50Member;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class UniRef50MemberRel extends Edge implements Uniref50Member{

    public static final String NAME = "UNIREF_50_MEMBER";

    public UniRef50MemberRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
