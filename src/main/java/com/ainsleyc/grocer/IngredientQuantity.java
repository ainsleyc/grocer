package com.ainsleyc.grocer;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

// import java.lang.String;

// import com.googlecode.objectify.Key;
// import com.googlecode.objectify.annotation.Index;
// import com.googlecode.objectify.annotation.Parent;

// import java.util.Date;
// import java.util.List;

/**
 * The @Entity tells Objectify about our entity.  
 * Our primary key @Id is set automatically by the Google Datastore for us.
 *
 * We add a @Parent to tell the object about its ancestor. We are doing this to support many
 * guestbooks.  Objectify, unlike the AppEngine library requires that you specify the fields you
 * want to index using @Index.  Only indexing the fields you need can lead to substantial gains in
 * performance -- though if not indexing your data from the start will require indexing it later.
 *
 * NOTE - all the properties are PUBLIC so that we can keep the code simple.
 **/
@Entity
public class IngredientQuantity {
  @Id public Long id;

  public Ingredient ingredient;
  public Unit unit;
  public float quantity;

  public IngredientQuantity() {
  }
}
