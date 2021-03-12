# Spring_Boot_REST_API_DEMO
SHORT DESCRIPTION:<br>
Small app to demonstrate how to create REST API with Spring Boot.

SOURCE link: <br>
https://www.youtube.com/watch?v=LOmcsf5IylI&list=PLU2ftbIeotGpAYRP9Iv2KLIwK36-o_qYk&index=19

<b>Technologies</b>:
* Spring Boot
* Gradle


COMMANDS TO TEST REST API IN CHROME DEVELOPMENT MODE CONSOLE:<br>

<b>* GET all</b><br>
fetch('/list/').then(response => response.json().then(console.log))

<b>* GET one</b><br>
fetch('/1').then(response => response.json().then(console.log)) <br>

<b>* POST add new one</b><br>
fetch('/', {method: 'POST',
headers: { 'Content-Type': 'application/json' },
body: JSON.stringify({ text: 'First message', id: 1 })}) <br>

<b>* DELETE existing</b><br>
fetch('/1', { method: 'DELETE' }).then(result => console.log(result)) <br>

<b>* DELETE ALL</b><br>
fetch('/', { method: 'DELETE' }).then(result => console.log(result)) <br>