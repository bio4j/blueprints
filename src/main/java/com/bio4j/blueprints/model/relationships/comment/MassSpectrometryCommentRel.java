

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.MassSpectometryComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Information derived from mass spectrometry experiments
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MassSpectrometryCommentRel extends BasicCommentRel implements MassSpectometryComment{

    public static final String NAME = "COMMENT_MASS_SPECTROMETRY";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "mass spectrometry";

    public static final String BEGIN_PROPERTY = "mass_spectrometry_comment_begin";
    public static final String END_PROPERTY = "mass_spectrometry_comment_end";
    public static final String MASS_PROPERTY = "mass_spectrometry_comment_mass";
    public static final String METHOD_PROPERTY = "mass_spectrometry_comment_method";

    public MassSpectrometryCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getBegin(){
        return String.valueOf(edge.getProperty(BEGIN_PROPERTY));
    }
    @Override
    public String getEnd(){
        return String.valueOf(edge.getProperty(END_PROPERTY));
    }
    @Override
    public String getMass(){
        return String.valueOf(edge.getProperty(MASS_PROPERTY));
    }
    @Override
    public String getMethod(){
        return String.valueOf(edge.getProperty(METHOD_PROPERTY));
    }

    @Override
    public void setBegin(String value){
        edge.setProperty(BEGIN_PROPERTY, value);
    }
    @Override
    public void setEnd(String value){
        edge.setProperty(END_PROPERTY, value);
    }
    @Override
    public void setMass(String value){
        edge.setProperty(MASS_PROPERTY, value);
    }
    @Override
    public void setMethod(String value){
        edge.setProperty(METHOD_PROPERTY, value);
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
