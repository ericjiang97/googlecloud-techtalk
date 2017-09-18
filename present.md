<!-- $theme: default -->
# Before we start, lets install the SDK

1. Install the SDK over https://cloud.google.com/sdk/downloads
2. Authenticate Using `gcloud init`
3. You are ready to go

---

<center>
<h1>What your infrastructure shouldnt look like</h1>


<img src="https://i.imgflip.com/zuxwm.jpg" />
</center>

---
<center>
<h1>Developing on Google Cloud</h1>

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

[NOTE]: I'm presuming that most of you would have access to Google Cloud Platform via your Monash Student Account.
<div>
    <img class="custom-footer-1" src="https://www.chef.io/wp-content/uploads/2017/03/google-cloud-platform-1024x246.png" style="bottom: 0; width: 40%"/>
</div>

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

<div>
    <img class="custom-footer-1" src="https://www.chef.io/wp-content/uploads/2017/03/google-cloud-platform-1024x246.png" style="bottom: 0; width: 40%" />
</div>

---

<center>
<img src="https://camo.githubusercontent.com/bf0bd61a77ff3efaf4246720e93f624fc8be217a/68747470733a2f2f63646e2d696d616765732d312e6d656469756d2e636f6d2f6d61782f3631322f312a6a4538776c62716b35476c4b695f4559436d4a7031412e706e67" />
</center>

<div>
    <img class="custom-footer-1" src="https://www.chef.io/wp-content/uploads/2017/03/google-cloud-platform-1024x246.png" style="bottom: 0; width: 40%" />
</div>

---

# Google App Engine
- designed around the fact that _Google just can't send everyone into their datacentre(s) and update applications across their many datacenters_
- Built off Remote Deployments

| Language   | Environment     |
|------------|-----------------|
| Java 7  (Kotlin)   | Standard        |
| Java 8     | Standard (Beta)/Flexible        |
| Node.js    | Flexible        |
| Python 2,7 | Standard        |
| Python 3.5 | Flexible        |
<div>
    <img class="custom-footer-1" src="https://www.chef.io/wp-content/uploads/2017/03/google-cloud-platform-1024x246.png" style="bottom: 0; width: 40%"/>
</div>

---


**Standard Environments** run in a specialised envrionment. Though building the application is more constrained then other environments, it means scaling up is faster.

**Flexible Environment** applications run off a Docker container, it is designed for applications that recieve constant traffic.
<div>
    <img class="custom-footer-1" src="https://www.chef.io/wp-content/uploads/2017/03/google-cloud-platform-1024x246.png" style="bottom: 0; width: 40%" />
</div>

---

# Horizontal vs Veritcal Scaling

<div style="text-align: center">
<img src="https://i.stack.imgur.com/On3tO.png" style="float: center"/>
</div>

---

<div>
<img src="https://i.imgur.com/i74inNB.png" style="min-height: 100%"/>
</div>

---

# Here's the Instructions on Installing the SDK again

1. Install the SDK over https://cloud.google.com/sdk/downloads
2. Authenticate Using `gcloud init` (login using your Monash Student Account)
3. You are ready to go

---

# Deep Dive Section

---

# Other Available Tools

- Cloud ML (Google Cloud Machine Learning): built off tensorflow
- Compute Engine
- Container Engine
- Cloud Storage
- Network Balancer
- APIs such as NLP, Sentiment Analysis, DLP, etc.
- and Much more

---

# Questions