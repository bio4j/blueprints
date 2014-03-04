

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.CommentType;

/**
 * This class models comments that provide any useful information about the protein,
 * mostly biological knowledge. <br>
 * The information is filed in different comment types. <br>
 * The current comment types and their content modelled by this class are listed below: <br>
 * - Function: General function(s) of a protein
 * - Catalytic activity: Reaction(s) catalyzed by an enzyme
 * - Cofactor: Non-protein substance required for enzyme activity
 * - Enzyme regulation: Enzyme regulatory mechanism
 * - Biophysicochemical properties: Biophysical an physicochemical properties
 * - Subunit structure: Interaction with other protein(s)
 * - Pathway: Associated metabolic pathways
 * - Tissue specificity: Expression of the gene product in different tissues
 * - Developmental stage: Expression of the gene product according to the cell stage and/or tissue or organism development
 * - Induction: Effects of environmental factors on gene expression
 * - Domain: Relevant information on protein domain(s)
 * - Post-translational modification: Post-translational modifications
 * - RNA editing: Amino acid variation(s) due to RNA editing
 * - Mass spectrometry: Information derived from mass spectrometry experiments
 * - Polymorphism: Description of polymorphism(s)
 * - Involvement in disease: Disease(s) associated with protein defect(s)
 * - Disruption phenotype: Description of the effects caused by the disruption of a protein-encoding gene
 * - Allergenic properties: Information relevant to allergenic proteins.
 * - Toxic dose: Lethal, paralytic, effect dose or lethal concentration of a toxin
 * - Biotechnological use: Use in a biotechnological process
 * - Pharmaceutical use: Use of as a pharmaceutical drug
 * - Miscellaneous: Any relevant information that doesn't fit in any other defined sections
 * - Sequence similarities: Description of the sequence similaritie(s) with other proteins and family attribution
 * - Caution: Warning about possible errors and/or grounds of confusion
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CommentTypeNode extends Vertex implements CommentType{

    public static final String NODE_TYPE = CommentTypeNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "comment_type_name"; 

    public CommentTypeNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}


    @Override
    public String toString(){
        return "Comment type --> " + this.getName();
    }

}

