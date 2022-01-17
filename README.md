# SUPERHERO-API 

## ¿Que es este repositorio? ##
API de gestión de Superheroes (CRUD)

## Tecnologías  
Java 11  
H2


## ¿Como levantar la api?

1) ``sudo docker build -t superhero .``
2) ``sudo docker run --rm -it  -p 8080:8080 --name superHero superhero``

## Endpoints

**GET**
``{url}/superheros``  

Se obtienen todos los superheroes.

Ejemplo de respuesta:

```json
[
  {
    "id": 1,
    "name": "A-Bomb",
    "powerStats": {
      "id": 1,
      "intelligence": "17",
      "strength": "64",
      "speed": "24",
      "durability": "100",
      "power": "80",
      "combat": "38"
    },
    "biography": {
      "id": 1,
      "fullName": "Hulk Vol 2 #2 (April, 2008) (as A-Bomb)",
      "placeOfBirth": "Marvel Comics",
      "firstAppearance": "Scarsdale, Arizona",
      "publisher": "good",
      "alignment": "Richard Milhouse Jones"
    },
    "appearance": {
      "id": 1,
      "gender": "Human",
      "race": "Yellow",
      "height": "441 kg",
      "weight": "No Hair",
      "eyeColor": "Male",
      "hairColor": "203 cm"
    },
    "image": {
      "id": 1,
      "url": "https://www.superherodb.com/pictures2/portraits/10/100/10060.jpg"
    }
  }
]
```

Tambien es posible filtrar por name:  

**GET**
``
{url}/superheros?name=thor
``  
Ejemplo de respuesta:  
```json
[
  {
    "id": 659,
    "name": "Thor",
    "powerStats": {
      "id": 659,
      "intelligence": "83",
      "strength": "100",
      "speed": "100",
      "durability": "100",
      "power": "100",
      "combat": "69"
    },
    "biography": {
      "id": 659,
      "fullName": "Journey into Mystery #83 (August, 1962)",
      "placeOfBirth": "Rune King Thor",
      "firstAppearance": "Asgard",
      "publisher": "good",
      "alignment": "Thor Odinson"
    },
    "appearance": {
      "id": 659,
      "gender": "Asgardian",
      "race": "Blue",
      "height": "288 kg",
      "weight": "Blond",
      "eyeColor": "Male",
      "hairColor": "198 cm"
    },
    "image": {
      "id": 659,
      "url": "https://www.superherodb.com/pictures2/portraits/10/100/140.jpg"
    }
  }
]
```  

**GET**
``{url}/superheros/{id}``  

Se obtiene un superheroe dado su id.  

Ejemplo de respuesta:  

```json
{
  "id": 659,
  "name": "Thor",
  "powerStats": {
    "id": 659,
    "intelligence": "83",
    "strength": "100",
    "speed": "100",
    "durability": "100",
    "power": "100",
    "combat": "69"
  },
  "biography": {
    "id": 659,
    "fullName": "UPDATED- Journey into Mystery #83 (August, 1962)",
    "placeOfBirth": "Rune King Thor",
    "firstAppearance": "Asgard",
    "publisher": "good",
    "alignment": "Thor Odinson"
  },
  "appearance": {
    "id": 659,
    "gender": "Asgardian",
    "race": "Blue",
    "height": "288 kg",
    "weight": "Blond",
    "eyeColor": "Male",
    "hairColor": "198 cm"
  },
  "image": {
    "id": 659,
    "url": "https://www.superherodb.com/pictures2/portraits/10/100/140.jpg"
  }
}
```  

**POST**
``{url}/superheros``

Se utiliza para crear un superheroe  

Body ejemplo:

```json
{
    "name": "jesus",
    "powerStats": {
        "intelligence": "38",
        "strength": "100",
        "speed": "17",
        "durability": "80",
        "power": "24",
        "combat": "64"
    },
    "biography": {
        "fullName": "Richard Milhouse Jones",
        "placeOfBirth": "Scarsdale, Arizona",
        "firstAppearance": "Hulk Vol 2 #2 (April, 2008) (as A-Bomb)",
        "publisher": "Marvel Comics",
        "alignment": "good"
    },
    "appearance": {
        "gender": "Male",
        "race": "Human",
        "height": "203 cm",
        "weight": "441 kg",
        "eyeColor": "Yellow",
        "hairColor": "No Hair"
    },
    "image": {
        "url": "https://www.superherodb.com/pictures2/portraits/10/100/10060.jpg"
    }
}
```

Ejemplo de respuesta:  

```json
{
    "id": 733,
    "name": "jesus",
    "powerStats": {
        "id": 733,
        "intelligence": "38",
        "strength": "100",
        "speed": "17",
        "durability": "80",
        "power": "24",
        "combat": "64"
    },
    "biography": {
        "id": 733,
        "fullName": "Richard Milhouse Jones",
        "placeOfBirth": "Scarsdale, Arizona",
        "firstAppearance": "Hulk Vol 2 #2 (April, 2008) (as A-Bomb)",
        "publisher": "Marvel Comics",
        "alignment": "good"
    },
    "appearance": {
        "id": 733,
        "gender": "Male",
        "race": "Human",
        "height": "203 cm",
        "weight": "441 kg",
        "eyeColor": "Yellow",
        "hairColor": "No Hair"
    },
    "image": {
        "id": 733,
        "url": "https://www.superherodb.com/pictures2/portraits/10/100/10060.jpg"
    }
}
```


**UPDATE**
``{url}/superheros``

Se utiliza para actualizar un superheroe

Body ejemplo:

```json
{
    "id": 732,
    "name": "jesus2-modificado",
    "powerStats": {
        "intelligence": "38",
        "strength": "100",
        "speed": "17",
        "durability": "80",
        "power": "24",
        "combat": "64"
    },
    "biography": {
        "fullName": "Richard Milhouse Jones",
        "placeOfBirth": "Scarsdale, Arizona",
        "firstAppearance": "Hulk Vol 2 #2 (April, 2008) (as A-Bomb)",
        "publisher": "Marvel Comics",
        "alignment": "good"
    },
    "appearance": {
        "gender": "Male",
        "race": "Human",
        "height": "203 cm",
        "weight": "441 kg",
        "eyeColor": "Yellow",
        "hairColor": "No Hair"
    },
    "image": {
        "url": "https://www.superherodb.com/pictures2/portraits/10/100/10060.jpg"
    }
}
```

**DELETE**
``{url}/superheros``

Se utiliza para eliminar un superheroe dado su id

Ejemplo de respuesta:

```json
{
    "message": "Superhero is removed"
}
```

Colección de postman:

https://www.getpostman.com/collections/c6aab0578fddb0ae426c  

Elaborado por: Jesús Kahwati
~~~~