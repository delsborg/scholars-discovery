package edu.tamu.scholars.middleware.discovery.model.repo.impl;

import edu.tamu.scholars.middleware.discovery.model.Person;

public class PersonRepoImpl extends AbstractSolrDocumentRepoImpl<Person> {

    @Override
    public Class<Person> type() {
        return Person.class;
    }

}
