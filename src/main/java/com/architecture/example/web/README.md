Web layer is top layer in this architecture example.
It contains REST controllers and REST exception handlers.
Each domain entity has its own REST controller.
Web layer should communicate with aggregation layer and should be only 
be aware of DTOs.
