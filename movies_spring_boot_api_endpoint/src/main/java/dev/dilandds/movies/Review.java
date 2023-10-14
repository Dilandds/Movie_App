package dev.dilandds.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//No review collection in the db. App will create this
@Document(collection = "reviews")
//Getters and setters
@Data
//constructors
@NoArgsConstructor
@AllArgsConstructor

public class Review {
    @Id
    private ObjectId id;

    private String body;


    public Review(String body) {
        this.body = body;
    }
}
