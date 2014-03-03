

package com.bio4j.blueprints.model.relationships.uniref;

import com.bio4j.model.relationships.uniref.UniRef100Member;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class UniRef100MemberRel extends Edge implements UniRef100Member{

    public static final String NAME = "UNIREF_100_MEMBER";

    public UniRef100MemberRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
