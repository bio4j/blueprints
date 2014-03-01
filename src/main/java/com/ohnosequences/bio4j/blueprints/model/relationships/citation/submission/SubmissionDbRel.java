/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.ohnosequences.bio4j.blueprints.model.relationships.citation.submission;

import com.ohnosequences.bio4j.blueprints.model.Edge;
import com.ohnosequences.bio4j.blueprints.model.nodes.citation.DBNode;
import com.ohnosequences.bio4j.blueprints.model.nodes.citation.SubmissionNode;
import com.ohnosequences.bio4j.model.relationships.citation.submission.SubmissionDb;
import com.tinkerpop.blueprints.Direction;

/**
 * Submission database
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubmissionDbRel extends Edge implements SubmissionDb{

    public static final String NAME = "SUBMISSION_DB";

    public static final String DATE_PROPERTY = "submission_db_date";

    public SubmissionDbRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getDate(){    return String.valueOf(edge.getProperty(DATE_PROPERTY));}

    @Override
    public void setDate(String value){  edge.setProperty(DATE_PROPERTY, value);}
    
    @Override
    public DBNode getDB(){
        return new DBNode(getVertex(Direction.OUT));
    }
    
    @Override
    public SubmissionNode getSubmission(){
        return new SubmissionNode(getVertex(Direction.IN));
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "date = " + getDate();
    }

}
