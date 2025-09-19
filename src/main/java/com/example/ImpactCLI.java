package com.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "impactCLI", description = "Prints the company name.")
public class ImpactCLI implements Runnable {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactCLI()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println("From: Reed Bryan"); // Replace with actual company name if needed
        System.out.println("To: Impact.com"); // Replace with actual company name if needed
    }
}
