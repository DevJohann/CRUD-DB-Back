
<h1>CRUD backend (API REST)</h1>
<p>This is a simple implementation of a CRUD developed with Spring Boot and Spring JPA</p>
<p>It is an API REST that is meant to be consumed by a frontend (Tested with Angular) and responds with data in JSON format</p>
<p>Also tested in Postman</p>
<p>Uses MySQL as Database</p>
<table>
  <thead>
    <tr>
      <th>Route</th>
      <th>Data</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>/vuelo/listar</td>
      <td>Retrieves all the entities from database</td>
    </tr>
    <tr>
      <td>/vuelo/guardar</td>
      <td>Receives an object of the entity in the response header and saves it in the database</td>
    </tr>
    <tr>
      <td>/vuelo/{id}</td>
      <td>Search an entity by id</td>
    </tr>
    <tr>
      <td>/vuelo/actualizar/{id}</td>
      <td>Retrieves the actual entity, and uploads again the modified entity to the database (Frontend required, or postman)</td>
    </tr>
    <tr>
      <td>/vuelo/eliminar/{id}</td>
      <td>Deletes the entity with the given id</td>
    </tr>
  </tbody>
</table>
