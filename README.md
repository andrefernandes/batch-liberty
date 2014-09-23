JSR 352 on WebSphere Liberty Profile
==============================================================================================
Author: André Fernandes

## Intro

This project demonstrates that we must not wait for JEE 7 in order to use JSR 352 batches
on our projects running on JEE 6 servers. Some of us are still tied to old-school IT
management/infrastructure who believes (despite all abundant evidence, in times of clouds,
lightweight containers and Docker) that big-fat application servers are easier to manage.
Go figure.

## What do we have here?

This project is a merge of:

* JSR-352 batchlets (Spring-Batch 3 implementation, but could be any other)
* Spring-Batch-Admin 1.3.0 as a convenient management console (check the "web" project)
* WebSphere Liberty Profile as a test local server.

PLease note that WebSphere Liberty 8.5.x is a lightweight JEE 6 server that can be
downloaded from IBM developerWorks. This project assumes that you have a zipped
assembly of Liberty somewhere ("assemblyArchive" tag on project pom). Such a zipped
distro is quite easy to do by yourself (install Liberty, zip "wlp" path, that's all).

There is a sample for building your own Liberty assembly on:

    git clone git@github.com:andrefernandes/liberty-server.git
    
## What is the big deal?

Not much, but I had to tweak Spring-Batch-Admin a little to make it work 
with the latest Spring-Batch. There were some issues with pom dependencies and
I also took the time to move everything I could from "web.xml" into annotations.
I also had to update descriptors into EE 6 stack.

## Where are the test artifacts?

Sue me.

## Why WebSphere Liberty Profile? Isn't Spring-Boot a lot easier?

Yes, maybe it is. But if you are expected to deploy EARs on WebSphere full profile later
on then Liberty is a **very** smart choice. 

Liberty is also quite a decent product on its own. Lightweight JEE containers like
Liberty, Wildfly and a few others are the main game nowadays (yes, your salesmen have been
lying to you). If big fat app servers make you feel safe and cozy, well, make your
sales rep even happier and buy a mainframe.
