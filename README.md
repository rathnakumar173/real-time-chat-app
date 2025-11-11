# Real-Time Chat Application 💬

A real-time chat application built using **Spring Boot**, **WebSockets (STOMP)**, and **SockJS**.  
Multiple users can chat instantly without reloading the page. Includes WhatsApp-style UI and timestamps.

---

## 🚀 Features
- Real-time messaging using STOMP over WebSocket
- WhatsApp-like message bubble UI
- Timestamp on every message
- Works across multiple browser windows
- Lightweight (no database needed)

---

## 🛠 Tech Stack
| Layer | Technology |
|------|------------|
| Backend | Spring Boot, WebSocket, STOMP, SockJS |
| Frontend | HTML, CSS, JavaScript, Bootstrap |
| Build Tool | Maven |

---

## ▶️ Run the Project Locally

```bash
mvn spring-boot:run

Then open in your browser: http://localhost:8080/chat

## 📡 WebSocket Routes

| Purpose | Endpoint |
|--------|----------|
| WebSocket Handshake (Client Connects) | `/ws` |
| Send Message (Client → Server) | `/app/sendMessage` |
| Broadcast Messages (Server → All Clients) | `/topic/messages` |

Project Structure
src/main/java/com/chat/app
 ├─ config
 │   ├─ WebSocketConfig.java
 │   └─ SecurityConfig.java
 ├─ Controller
 │   └─ ChatController.java
 └─ model
     └─ ChatMessage.java

src/main/resources/templates/chat.html
