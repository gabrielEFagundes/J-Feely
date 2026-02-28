# J-Feely

A Feelytics data collection API for Java that interfaces with Reddit data analysis services.

## Overview

J-Feely is a Java-based API client for collecting and processing Feelytics sentiment and engagement analysis data. The project integrates with external data analysis services to gather comprehensive metrics about Reddit discussions and topics.

## Features

- **Data Collection**: HTTP-based API client for retrieving analyzed sentiment data
- **JSON Processing**: Uses GSON library for seamless JSON serialization/deserialization
- **Comprehensive Analytics**: Collects detailed metrics including:
  - Most and second-most scored posts with full metadata
  - Topic engagement level assessment
  - Similar topic suggestions
  - Popular opinions and emoji reactions
  - Engagement analysis and summaries
- **Error Handling**: Built-in exception handling and logging

## Project Structure

```bash
src/main/java/com/feelytics/
├── Main.java # Application entry point
└── data/
    ├── collection/ 
        └── APICaller.java # HTTP API client for data retrieval
    └── model/
        └── Basis.java # Data model for analysis results
```


## Data Model

The `Basis` class represents the complete analysis structure with the following information:

- **Top Posts**: Title, body, author, and score of the top 2 posts
- **Post Count**: Number of relevant posts analyzed
- **Engagement**: Topic engagement level and popular opinion emoji
- **Topics**: Related topics and main subreddit information
- **Summary**: Comprehensive analysis and opinion summary

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven (for dependency management)

### Building

```bash
mvn clean build
```

### Running

```bash
java -cp target/classes com.feelytics.Main
```
