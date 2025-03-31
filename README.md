
**Overview :**

This project processes and analyzes location-based data from two JSON files:

Location JSON: Contains location identifiers (id), latitude, and longitude.

Metadata JSON: Provides additional details like type (restaurant, hotel, etc.), rating, and reviews.

The program merges these datasets and performs various analytical tasks.


**Features :**

1. Merge JSON data based on matching id.
2. Count valid locations per type (restaurants, hotels, cafes, museums, parks).
3. Calculate the average rating per type, considering only valid entries.
4. Identify the location with the highest number of reviews.
5. Detect locations with incomplete data.

**Project Structure :**

| Class Name | Description |
|----------|----------|
| Analysis  | Performs analysis on processed data |
| DataMerger | Merges the two JSON datasets based on location IDs |
| Locations  | Represents location details |
| MetaData  | Represents additional Data |
| LocationDataAnalysis | Manages data validation and analysis logic |
| ProcessingMapData | Main Program to read the Json file and do analysis on processed Data |
