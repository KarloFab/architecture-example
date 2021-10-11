Aggregation layer servers as a point where domain entities are being mapped to DTOs.
This layer consists of aggregators which match domain entities, DTOs specific foreach domain 
entity and mappers specific for each entity.

This layer was created to decouple mappings part from use cases. Which leads to
having pure business logic in use cases in application layer which can be tested without
mocking mappers and having to transfer entities to DTOs.

We can say that this layer is like a bridge between web/presentation layer and application layer.
Web layer should not directly communicate with application layer.
