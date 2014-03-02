

package com.bio4j.blueprints.model.relationships.citation.patent;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.PatentNode;
import com.bio4j.model.relationships.citation.patent.PatentProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Proteins referenced by a patent
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PatentProteinCitationRel extends Edge implements PatentProteinCitation{

    public static final String NAME = "PATENT_PROTEIN_CITATION";

    public PatentProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public PatentNode getPatent(){
        return new PatentNode(getVertex(Direction.IN));
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
