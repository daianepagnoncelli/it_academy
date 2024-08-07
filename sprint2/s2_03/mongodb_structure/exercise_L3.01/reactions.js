db.createCollection('reactions', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'reactions',
      required: ['idUser', 'idReactedTo', 'reaction'],
      properties: {
        idUser: {
          bsonType: 'objectId'
        },
        idReactedTo: {
          bsonType: 'objectId'
        },
        reaction: {
          enum:
        }
      }
    }
  }
});
