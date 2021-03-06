package edu.tamu.scholars.middleware.graphql.model.collection;

import edu.tamu.scholars.middleware.graphql.model.collection.AuthorOrganization;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;
import java.util.List;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "CollectionAuthor"
)
@JsonInclude(NON_EMPTY)
public class Author extends AbstractNestedDocument {
  private static final long serialVersionUID = -733722891L;

  private String label;

  private String type;

  private String rank;

  private List<AuthorOrganization> organizations;

  public Author() {
    super();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public List<AuthorOrganization> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<AuthorOrganization> organizations) {
    this.organizations = organizations;
  }
}
