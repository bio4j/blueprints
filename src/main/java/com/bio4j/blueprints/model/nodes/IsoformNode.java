

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.Isoform;

/**
 * Protein isoforms. Their information is retrieved from entries' binary interactions.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class IsoformNode extends Vertex implements Isoform{

    public static final String NODE_TYPE = IsoformNode.class.getCanonicalName();

    /** Isoform id **/
    public static final String ID_PROPERTY = "isoform_id";
    /** Isoform name **/
    public static final String NAME_PROPERTY = "isoform_name";
    /** Isoform note **/
    public static final String NOTE_PROPERTY = "isoform_note";
    /** Isoform sequence **/
    public static final String SEQUENCE_PROPERTY = "isoform_sequence";


    public IsoformNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getId(){  return String.valueOf(vertex.getProperty(ID_PROPERTY));}
    @Override
    public String getNote(){    return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}
    @Override
    public String getName() {        return String.valueOf(vertex.getProperty(NAME_PROPERTY)); }
    @Override
    public String getSequence() {        return String.valueOf(vertex.getProperty(SEQUENCE_PROPERTY));    }


    @Override
    public void setId(String value){    vertex.setProperty(ID_PROPERTY, value);}
    @Override
    public void setNote(String value){  vertex.setProperty(NOTE_PROPERTY, value);}
    @Override
    public void setName(String value) {        vertex.setProperty(NAME_PROPERTY, value);    }
    @Override
    public void setSequence(String value) {      vertex.setProperty(SEQUENCE_PROPERTY, value);   }


    @Override
    public String toString(){
        return "id = " + getId() + "\n" +
                "note = " + getNote();
    }

}
