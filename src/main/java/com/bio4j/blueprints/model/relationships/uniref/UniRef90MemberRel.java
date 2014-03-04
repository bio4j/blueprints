

package com.bio4j.blueprints.model.relationships.uniref;

import com.bio4j.model.relationships.uniref.UniRef90Member;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class UniRef90MemberRel extends Edge implements UniRef90Member{

    public static final String NAME = "UNIREF_90_MEMBER";

    public UniRef90MemberRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}
