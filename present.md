<!-- $theme: default -->
<center>
<h1>What your infrastructure shouldn't look like</h1>


<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Cable_salad.jpg/800px-Cable_salad.jpg" />
</center>

---
<center>
<h1>Developing Awesome Apps on Google Cloud</h1>

<h2>Presented by</h2>

<img src="https://avatars3.githubusercontent.com/u/5687681?v=4&s=460" 
      style="width: 15%; border-radius: 100%"/>
## Eric Jiang (lorderikir)

##### This presentation's code/slides can be found on [https://github.com/lorderikir/googlecloud-techtalk](https://github.com/lorderikir/googlecloud-techtalk)
<div>
    <img class="custom-footer-1" src="https://www.chef.io/wp-content/uploads/2017/03/google-cloud-platform-1024x246.png" style="bottom: 0; width: 40%"/>
</div>
</center>

---

# Talk Summary

1. Introduction to Google Cloud
2. Deep-Dive
  a. Setting up SDK tools
3. Google App Engine
4. Other Tools

[NOTE]: You can play with Google Cloud Platform off your student accounts

---

# Introduction

## What is Google Cloud Platform?
> Google Cloud Platform lets you build and host applications and websites, store data, and analyze data on Google's scalable infrastructure.

Composes of many applications, such as:
- Google App Engine (GAE)
- Google Container Engine (GCE)
- Google DataStore
- Cloud ML (built off TF tech)
- and much more

---

<center>
<img src="https://camo.githubusercontent.com/bf0bd61a77ff3efaf4246720e93f624fc8be217a/68747470733a2f2f63646e2d696d616765732d312e6d656469756d2e636f6d2f6d61782f3631322f312a6a4538776c62716b35476c4b695f4559436d4a7031412e706e67" />
</center>

---

# Google App Engine
- designed around the fact that _Google just can't send everyone into their datacentre(s) and update applications across their many datacenters_
- Built off Remote Deployments

| Language   | Environment     |
|------------|-----------------|
| Java 7  (Kotlin)   | Standard        |
| Java 8     | Standard (Beta)/Flexible        |
| Node.js    | Flexible        |
| Python 2.7 | Standard        |
| Python 3.5 | Flexible        |

---


**Standard Environments** run in a specialised environment. Though building the application is more constrained then other environments, it means scaling up is faster.

**Flexible Environment** applications run off a Docker container, it is designed for applications that receive constant traffic.

---

# Horizontal vs Veritcal Scaling

<div style="text-align: center">
<img src="https://i.stack.imgur.com/On3tO.png" style="float: center"/>
</div>

---

<center>
<h1>Me when I look at Scaling:</h1>
<img src="https://i.imgflip.com/1wqhrk.jpg" style="min-height: 100%"/>
</center>

---

# Installing the SDK

1. Install the SDK over https://cloud.google.com/sdk/downloads
2. Authenticate Using `gcloud init` (login using your Monash Student Account)
4. You may need Java (JDK 1.8) and Maven (MVN) Installed if you are using the package provided. 

> If you are interested in developing on the framework provided I strongly suggest for you to read the docs.

**Framework**: https://github.com/MonashUnitPlanner/springboot-base-gae-java8

---

<div style="text-align: center">
<h1>Demo Section</h1>
<img src="https://i.imgflip.com/1w3nb6.jpg" />
</div>

---

# Other Available Tools

- Cloud ML (Google Cloud Machine Learning): built off TensorFlow
- Compute Engine
- Kubernetes
- Container Engine
- Cloud Storage
- Network Balancer
- APIs such as NLP, Sentiment Analysis, DLP, etc.
- and Much more

---

# Questions