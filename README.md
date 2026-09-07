# DementiaCare

An Android application designed to assist Alzheimer's and dementia patients and their caregivers with daily tasks, emergency features, health reminders, and cognitive activities.

## Features

- **Patient Profile Management** -- Store and manage patient information including name, phone, address, and emergency contacts
- **Emergency SMS with Location** -- Send current GPS location via SMS to emergency contacts with one tap
- **Emergency Call** -- Quick dial primary emergency contact
- **People/Face Album** -- Save and view people the patient knows with photos, names, and relationships
- **Health Reminders** -- Water and food reminders with alarm notifications and TTS voice prompts
- **Custom Reminders** -- User-defined reminders with custom alarms and text-to-speech
- **Reading Hub** -- Curated links to novels, news, health tips, and more
- **Brain Games** -- External links to brain-training games for memory and reflexes
- **Return-to-Home Navigation** -- Open patient's home address in Google Maps for navigation

## Tech Stack

- **Language:** Java
- **Min SDK:** 22 (Android 5.1)
- **Target SDK:** 34 (Android 14)
- **UI:** AndroidX, Material Components, Navigation Drawer
- **Database:** Room (SQLite)
- **Location:** Google Play Services FusedLocationProvider
- **Image Loading:** Glide 4.16
- **ML:** TensorFlow Android (face/image features)

## Setup

### Prerequisites

- JDK 17
- Android SDK (API 34)
- Android Build Tools 34.0.0

### Build

```bash
# Set JAVA_HOME to JDK 17
export JAVA_HOME="/path/to/jdk-17"

# Set ANDROID_HOME to Android SDK
export ANDROID_HOME="/path/to/android-sdk"

# Build debug APK
./gradlew assembleDebug
```

The debug APK will be generated at:
```
app/build/outputs/apk/debug/app-debug.apk
```

## Project Structure

```
app/src/main/java/com/example/expo2019/alzheimerapp/
├── HomeActivity.java              # Main entry with navigation drawer
├── SettingsActivity.java          # App settings
├── ReturnHome.java                # Google Maps navigation
├── ReadingActivity.java           # Reading links
├── Games.java                     # Brain games links
├── DataBase.java                  # Room database singleton
├── AppPeople/                     # People album module
├── PatientData/                   # Patient profile module
└── HealthReminders/               # Reminders and notifications
```

## Permissions

| Permission | Purpose |
|------------|---------|
| `INTERNET` | Load web content |
| `SEND_SMS` | Emergency SMS |
| `ACCESS_FINE_LOCATION` | GPS for emergency |
| `ACCESS_COARSE_LOCATION` | Location services |
| `FOREGROUND_SERVICE` | Reminder notifications |
| `RECEIVE_BOOT_COMPLETED` | Restart alarms after reboot |
| `WAKE_LOCK` | Keep device awake for alarms |
| `CAMERA` | Capture people photos |

## License

See [LICENSE.md](LICENSE.md)
