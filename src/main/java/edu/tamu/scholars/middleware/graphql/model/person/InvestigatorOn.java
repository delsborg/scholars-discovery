package edu.tamu.scholars.middleware.graphql.model.person;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "PersonInvestigatorOn"
)
@JsonInclude(NON_EMPTY)
public class InvestigatorOn extends AbstractNestedDocument {
  private static final long serialVersionUID = 2028197435L;

  private String label;

  private String awardedBy;

  private String startDate;

  private String endDate;

  public InvestigatorOn() {
    super();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getAwardedBy() {
    return awardedBy;
  }

  public void setAwardedBy(String awardedBy) {
    this.awardedBy = awardedBy;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
}
