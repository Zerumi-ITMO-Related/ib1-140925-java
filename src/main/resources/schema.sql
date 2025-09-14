CREATE TABLE IF NOT EXISTS airports (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    iata_code TEXT,
    icao_code TEXT,
    icao_classification TEXT,
    altitude TEXT,
    latitude TEXT,
    uprising_meters TEXT,
    magnetic_declination TEXT
);
