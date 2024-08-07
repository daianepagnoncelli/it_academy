db.createCollection('client', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'client',
      required: ['id_client', 'name', 'address', 'phone', 'email', 'NIF', 'register_date', 'last_sale'],
      properties: {
        id_client: {
          bsonType: 'objectId'
        },
        name: {
          bsonType: 'string'
        },
        address: {
          bsonType: 'object',
          title: 'object',
          required: ['street', 'number', 'floor', 'door', 'city', 'postal_code', 'country'],
          properties: {
            street: {
              bsonType: 'string'
            },
            number: {
              bsonType: 'string'
            },
            floor: {
              bsonType: 'string'
            },
            door: {
              bsonType: 'string'
            },
            city: {
              bsonType: 'string'
            },
            postal_code: {
              bsonType: 'string'
            },
            country: {
              bsonType: 'string'
            }
          }
        },
        phone: {
          bsonType: 'string'
        },
        email: {
          bsonType: 'string'
        },
        NIF: {
          bsonType: 'string'
        },
        register_date: {
          bsonType: 'string'
        },
        last_sale: {
          bsonType: 'object',
          title: 'object',
          required: ['sale_date', 'glasses'],
          properties: {
            sale_date: {
              bsonType: 'date'
            },
            glasses: {
              bsonType: 'object',
              title: 'object',
              required: ['id_glasses', 'brand', 'graduation', 'frame_type', 'frame_color', 'glass_color', 'price'],
              properties: {
                id_glasses: {
                  bsonType: 'int'
                },
                brand: {
                  bsonType: 'string'
                },
                graduation: {
                  bsonType: 'object',
                  title: 'object',
                  properties: {
                    left_eye: {
                      bsonType: 'string'
                    },
                    right_eye: {
                      bsonType: 'string'
                    }
                  }
                },
                frame_type: {
                  enum:
                },
                frame_color: {
                  bsonType: 'string'
                },
                glass_color: {
                  bsonType: 'object',
                  title: 'object',
                  properties: {
                    left_eye: {
                      bsonType: 'string'
                    },
                    right_eye: {
                      bsonType: 'string'
                    }
                  }
                },
                price: {
                  bsonType: 'int'
                }
              }
            },
            total_price: {
              bsonType: 'int'
            }
          }
        }
      }
    }
  }
});
