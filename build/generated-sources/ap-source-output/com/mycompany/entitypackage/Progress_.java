package com.mycompany.entitypackage;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-05T17:56:39")
@StaticMetamodel(Progress.class)
public class Progress_ { 

    public static volatile SingularAttribute<Progress, Integer> caloriesOut;
    public static volatile SingularAttribute<Progress, Integer> weight;
    public static volatile SingularAttribute<Progress, Integer> id;
    public static volatile SingularAttribute<Progress, Integer> caloriesIn;
    public static volatile SingularAttribute<Progress, Date> day;
    public static volatile SingularAttribute<Progress, Integer> steps;
    public static volatile SingularAttribute<Progress, Integer> miles;

}