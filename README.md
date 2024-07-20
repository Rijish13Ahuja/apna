# Apna Project

Welcome to the `apna` project! This project is a web application with a frontend built in React and a backend built with Java and Spring Boot. The project also includes a data extraction script in Python.

## Project Structure

The project is organized into the following folders:

apna/
├── backend/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/
│ │ │ │ └── com/
│ │ │ │ └── backend/
│ │ │ │ └── backend/
│ │ │ │ ├── BackendApplication.java
│ │ │ │ ├── controller/
│ │ │ │ │ └── DataController.java
│ │ │ │ ├── service/
│ │ │ │ └── repository/
│ │ │ └── resources/
│ │ │ ├── static
│ │ │ ├── templates
│ │ └── test/
│ └── build.gradle
├── frontend/
│ ├── src/
│ │ ├── App.js
│ │ ├── index.js
│ │ └── index.css
│ └── public/
├── env/
│ ├── scripts/
│ │ ├── data_extraction.py
│ │ └── globe_data.json
│ ├── include/
│ └── lib/
└── README.md


## Backend

### Overview

The backend is built with Java and Spring Boot. It handles data retrieval and serves it to the frontend.

### Dependencies

- `Spring Boot`: Core framework
- `Spring Data JPA`: For database interactions
- `Spring Web`: For creating RESTful APIs
- `MySQL Connector`: For MySQL database connectivity

### Configuration

- `application.properties`: Configuration file for Spring Boot.

### Key Components

- **BackendApplication.java**: Entry point of the Spring Boot application.
- **DataController.java**: REST controller for handling API requests related to globe data.
- **DataService.java**: Service class for processing the globe data.

## Frontend

### Overview

The frontend is built with React. It provides the user interface and interacts with the backend APIs.

### Dependencies

- `React`: Core library for building the user interface.
- `Material-UI`: For styling and components.

### Key Files

- **App.js**: Main React component.
- **index.js**: Entry point for the React application.
- **index.css**: Global styles for the React application.

## Environment

### Overview

Contains Python scripts and data files used for data extraction.

### Key Components

- **data_extraction.py**: Python script for extracting data.
- **globe_data.json**: JSON file containing the data to be used by the backend.

## Getting Started

### Prerequisites

- Java 21 (for backend)
- React.js (for frontend)
- Python 3.x (for environment scripts)

### Setting Up the Backend

1. Navigate to the `backend` directory.
2. Run `./gradlew build` to build the backend.
3. Configure `application.properties` with your database details and other settings.
4. Run the backend using `./gradlew bootRun`.

### Setting Up the Frontend

1. Navigate to the `frontend` directory.
2. Install dependencies using `npm install`.
3. Start the development server using `npm start`.

### Running the Python Scripts

1. Navigate to the `env/scripts` directory.
2. Run the Python script with `python data_extraction.py`.

## Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.
