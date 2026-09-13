# 🤖 Discord Life Assistant Bot

> A lightweight, feature-rich Discord bot designed to streamline your daily routines with real-time weather forecasting and Google Calendar integration.

---

## 🌟 Overview

Simplifying personal workflow management directly from Discord. Rather than switching between browser tabs or applications, users can interact with real-time weather updates and schedule personal Google Calendar events seamlessly using interactive commands.

---

## ✨ Key Features

* **🌦️ Real-Time Weather Forecasts**
  * Fetches real-time weather conditions and forecast metrics via external Weather API integration.
  * Formats temperature, weather condition summaries, and alerts directly into Discord embed messages.

* **📅 Google Calendar Synchronization**
  * Integrates Google Calendar API with secure OAuth 2.0 authentication.
  * Allows users to query upcoming schedules, create new events, and modify agendas straight from the chat interface.

* **💾 Persistent Storage & Query Logging**
  * Backed by a relational SQL database via JDBC.
  * Safely stores user preferences, session tokens, query histories, and scheduling logs.

---

## 🛠️ Tech Stack & Architecture

* **Core Runtime:** Java
* **Framework:** Java Discord API (JDA)
* **APIs & Protocols:** Google Calendar API (OAuth 2.0), Weather API
* **Database & Persistence:** SQL Database (MySQL) via JDBC
* **Build System:** Apache Maven

---

## 🚀 Getting Started

### Prerequisites

* **JDK 17** or higher
* **Apache Maven 3.8+**
* **MySQL / MariaDB** database instance
* **Discord Bot Token** (from [Discord Developer Portal](https://discord.com/developers/applications))
* **Google Cloud Project** credentials (`credentials.json`) with Calendar API enabled

### Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/yanpingl9304/2025_Fall_Java_Software_Development_Final_Project.git](https://github.com/yanpingl9304/2025_Fall_Java_Software_Development_Final_Project.git)
   cd 2025_Fall_Java_Software_Development_Final_Project
