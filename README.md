# Mullen Library Webservice

Serving up Mullen Tiny Library books, reviews, and genres since 2018.

### Build

Ensure your JDK is properly set up and Maven is properly installed, then run

    mvn clean install
    
This will build `target/library-0.1.0.jar`

To run the jar with default settings, run

    java -jar target/library-0.1.0.jar server config.yml
    
Then, in another terminal, try

    curl localhost:8080/books
    
The output should look something like this:

    [{"author":"Sonia Nazario","title":"Enrique's Journey","bookID":1,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/enrique.jpg"},{"author":"James T. Wooten","title":"Soldier","bookID":2,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/Soldier.jpg"},{"author":"Andrew Morton","title":"Diana","bookID":3,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/Diana.jpg"},{"author":"Brad Meltzer","title":"The Book of Lies","bookID":4,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/book-of-lies.jpg"},{"author":"Jeffery Deaver","title":"Garden of Beasts","bookID":5,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/garden-beasts.jpg"},{"author":"Tina St.John","title":"Lord of Vengance","bookID":6,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/lord-of-vengeance.jpg"},{"author":"Norman Schwarzkoph","title":"It Does Not Take a Hero","bookID":7,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/does-not-take-hero.jpg"},{"author":"Stephen Chbosky","title":"The Perks of Being a Wallflower","bookID":8,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/perks-wallflower.jpg"},{"author":"William Shakesphere","title":"Macbeth","bookID":9,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/macbeth.jpg"},{"author":"Mark Haddon","title":"The Curious Incident of the Dog in the Night-time","bookID":10,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/curious-dog.jpg"},{"author":"August Wilson","title":"Fences","bookID":11,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/fences.jpg"},{"author":"Henrik Ibsen","title":"A Doll's House","bookID":12,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/dollhouse.jpg"},{"author":"Jerry Seinfeld","title":"Sein Language","bookID":13,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/seinfeld.jpg"},{"author":"Jay Asher","title":"Thirteen Reasons Why","bookID":14,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/13-reasons.jpg"},{"author":"Tom Clancy","title":"The Bear and the Dragon","bookID":15,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/bear-dragon.jpg"},{"author":"Dan Brown","title":"Angels and Demons","bookID":16,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/angels-demons.jpg"},{"author":"Michael Crichton","title":"Micro","bookID":17,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/micro.jpg"},{"author":"Frank Walters","title":"The Book of the Hopi","bookID":18,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/book-of-hopi.jpg"},{"author":"Nicholas Sparks","title":"The Best of Me","bookID":19,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/best-of-me.jpg"},{"author":"Peter Tremane","title":"Dancing with Daemons","bookID":20,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/dancing-daemons.jpg"},{"author":"Bill oreilly","title":"Killing Kennedy","bookID":21,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/kennedy.jpg"},{"author":"Virginia Scully","title":"A Treasury of American Indian Herbs","bookID":22,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/treasury-herbs.jpg"},{"author":"Unknown","title":"Atlas of Anatomy","bookID":23,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/atlas-anatomy.jpg"},{"author":"David Williamson","title":"Kings and Queens of England","bookID":24,"imageLink":"https://s3-us-west-2.amazonaws.com/sanear-mullen-gwc-images/kings-queens-england.jpg"}]
