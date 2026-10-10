# AttendanceGPT
A simple Attendance Tracker app (for now) which will refine my UI/UX skills along with Kotlin.

The app will be a blend of ui.theme (Jetpack Compose) components and layout xml. Java maybe used throughout the app.

Also, since I admire AnkiDroid (also a part-time contributor there) and fond of their AI Policy, I will be not using any form of LLMs to code generically throughout the entire app (and if anyone wishes to contribute they must strictly follow this too). However, AI/LLMs may be used for research/debugging and whenever used will be explicitly mentioned.

External  Libraries/Dependencies used:

Paper: I have decided to use a NoSQL database, similar to Firebase RTDB (as I have quite a bit experience in handling adapters and viewholders related to it). Here since the user-data must be kept on-device, I've used a local NoSQL Database using the Paper library. The exact structure I'm yet to figure out, but the app will have many features like showing average attendance of all subjects, adding multiple attendance for a single day (multiple lectures in one day) etc. So the structure may be complex I'll update the structure here later when its finalized.
