Application layer encapsulates all of business logic and rules that are specific for domain of application.
Application layer communicates with providers layer, which mostly consists of communication
with repositories and some third party apps.
Subdirectories of application layer are common and useCases.

Common subdirectory contains parts which are used multiple times through useCases.
These could be utils or exceptions(?).

UseCases subdirectory contains business rules, which are organized by domain entites.
For example, Meter entity has its own directory with its own business rules.

