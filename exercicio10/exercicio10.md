# Exercício 10: Modelagem REST

## Objetivo
Modelar uma API REST contendo dois recursos do domínio de um **Aplicativo de Música** (ex.: Spotify). O objetivo é identificar dois casos de uso e especificar operações CRUD para cada recurso com detalhes sobre URI, método HTTP, corpo da requisição, resposta esperada, erros e status codes.

---

## Serviço: Aplicativo de Música
### Casos de Uso:
1. **Gerenciar informações do usuário**
2. **Manipular playlists do usuário**

---

## Recursos
1. **Usuários**
2. **Playlists**

---

## Endpoints

### 1. Usuários

| Descrição                    | URI                          | Método HTTP | Corpo                                    | Resposta Esperada       | Erros esperados                             |
|------------------------------|------------------------------|-------------|------------------------------------------|--------------------------|---------------------------------------------|
| Retornar informações do usuário | `/usuarios/{usuario-id}`      | GET         | Vazio                                    | 200 OK                   | 404 Not Found - usuário não encontrado      |
| Criar novo usuário           | `/usuarios`                  | POST        | `{ "nome": "João", "email": "joao@email.com" }` | 201 Created              | 400 Bad Request - dados inválidos           |
| Atualizar informações do usuário | `/usuarios/{usuario-id}`      | PUT         | `{ "nome": "João Silva" }`               | 200 OK                   | 404 Not Found - usuário não encontrado      |
| Deletar usuário              | `/usuarios/{usuario-id}`      | DELETE      | Vazio                                    | 200 OK                   | 404 Not Found - usuário não encontrado      |

### 2. Playlists

| Descrição                        | URI                                          | Método HTTP | Corpo                                    | Resposta Esperada       | Erros esperados                             |
|----------------------------------|----------------------------------------------|-------------|------------------------------------------|--------------------------|---------------------------------------------|
| Retornar todas as playlists do usuário | `/usuarios/{usuario-id}/playlists`           | GET         | Vazio                                    | 200 OK                   | 404 Not Found - usuário não encontrado      |
| Retornar uma playlist específica | `/usuarios/{usuario-id}/playlists/{playlist-id}` | GET         | Vazio                                    | 200 OK                   | 404 Not Found - playlist não encontrada     |
| Criar nova playlist              | `/usuarios/{usuario-id}/playlists`           | POST        | `{ "nome": "Minha Playlist" }`           | 201 Created              | 404 Not Found - usuário não encontrado      |
| Atualizar uma playlist           | `/usuarios/{usuario-id}/playlists/{playlist-id}` | PUT         | `{ "nome": "Playlist Atualizada" }`      | 200 OK                   | 404 Not Found - playlist não encontrada     |
| Deletar uma playlist             | `/usuarios/{usuario-id}/playlists/{playlist-id}` | DELETE      | Vazio                                    | 200 OK                   | 404 Not Found - playlist não encontrada     |

---

## Detalhes dos Endpoints

### Retornar informações do usuário
- **URI:** `/usuarios/{usuario-id}`
- **Método:** GET
- **Corpo:** Vazio
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - usuário não encontrado

### Criar novo usuário
- **URI:** `/usuarios`
- **Método:** POST
- **Corpo:** `{ "nome": "João", "email": "joao@email.com" }`
- **Resposta Esperada:** 201 Created
- **Erros Esperados:** 400 Bad Request - dados inválidos

### Atualizar informações do usuário
- **URI:** `/usuarios/{usuario-id}`
- **Método:** PUT
- **Corpo:** `{ "nome": "João Silva" }`
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - usuário não encontrado

### Deletar usuário
- **URI:** `/usuarios/{usuario-id}`
- **Método:** DELETE
- **Corpo:** Vazio
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - usuário não encontrado

---

### Retornar todas as playlists do usuário
- **URI:** `/usuarios/{usuario-id}/playlists`
- **Método:** GET
- **Corpo:** Vazio
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - usuário não encontrado

### Retornar uma playlist específica
- **URI:** `/usuarios/{usuario-id}/playlists/{playlist-id}`
- **Método:** GET
- **Corpo:** Vazio
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - playlist não encontrada

### Criar nova playlist
- **URI:** `/usuarios/{usuario-id}/playlists`
- **Método:** POST
- **Corpo:** `{ "nome": "Minha Playlist" }`
- **Resposta Esperada:** 201 Created
- **Erros Esperados:** 404 Not Found - usuário não encontrado

### Atualizar uma playlist
- **URI:** `/usuarios/{usuario-id}/playlists/{playlist-id}`
- **Método:** PUT
- **Corpo:** `{ "nome": "Playlist Atualizada" }`
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - playlist não encontrada

### Deletar uma playlist
- **URI:** `/usuarios/{usuario-id}/playlists/{playlist-id}`
- **Método:** DELETE
- **Corpo:** Vazio
- **Resposta Esperada:** 200 OK
- **Erros Esperados:** 404 Not Found - playlist não encontrada
