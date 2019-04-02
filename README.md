## Method-Trace-Analyser

Java based GUI application to parse and compare multiple trace files, to help debugging the code.
Method trace is used for post-mortem debugging. It consists of timestamp of entry and exit points for each method invocation. They may also contain stack-trace for each invocation.
In case of functionality issues, comparing of the data is used for debugging.

#Functionalities included:
1. Compare two trace files: one from failing and passing case each and find out the anomaly.
2. Calculate the execution time of each method and compare the extra time taken. This will be helpful in addressing hang and performance related problems.
3. Parse one or more trace files and create a tabular view for the number of times each method is invoked.
4. Compare code-flow and stack trace for failing and passing case and find anomalies.

#Technology Stack:
Java,
IBM Java Method trace,
Eclipse Photon,
WindowBuilder,
Open JDK with OpenJ9

#Description of files uploaded:
1. IbmGuiWindow.java - Includes java code for GUI
2. LogAnalysis.java - Includes java code for implementation of Method-Trace Analyser
3. SyncPipe.java -  Supporting doc for running Xtrace commands in Command Prompt through Java
4. ideation document - Documentation consisting of idea
5. ppt.pdf - Presentation based on idea
6. undertaking.pdf - Documentation of Undertaking
7. video.mp4 - Video showing implementation of functionalities

#Team Name: Code Breakers

#Team Details:
Anupriya Singh 
Jyoti Pandey   
Ronika Das     
Nidhi Wadhwa   
