<!-- $theme: default -->
<center>
<h1>'Bad' Infrastructure</h1>


<img src="https://mandarin-uploads.s3.amazonaws.com/uploads/2016/08/census-fail.png" width="49%" style="display: inline-block"/>
<img src="https://i.imgflip.com/zuxwm.jpg" width="49%" style="display: inline-block"/>
</center>

---

<center>
<h1>Building and Maintaining Awesome Applications on Google's Infrastructure</h1>

<h3>Presentation Maintained by</h3>

<img src="https://avatars3.githubusercontent.com/u/5687681?v=4&s=460" 
      style="width: 10%; border-radius: 100%"/>
### Eric Jiang

###### _This presentation's code/slides can be found on [https://github.com/lorderikir/googlecloud-techtalk](https://github.com/lorderikir/googlecloud-techtalk)_

<div>
    <img class="custom-footer-1" src="data:image/png;base64,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" style="bottom: 0; width: 60%"/>
</div>

<span style="font-size: 15px">Slide Deck Version: v3.0.0-monash-esol</span>
</center>

---

# Talk Summary

1. Introduction to Google Cloud Platform
2. What is Google App Engine
  a. GAE Environments
  b. Databases
3. Deep-Dive
  a. Improving Turnaround Times
4. Other Tools

---

# Introduction

## What is Google Cloud Platform?
> Google Cloud Platform lets you build and host applications and websites, store data, and analyze data on Google's scalable infrastructure.

Composes of many applications, such as:
- Google App Engine (GAE)
- Google Kubernetes Engine (GKE) <span style="font-size: 15px">Previously known as Google Container Engine</span>
- Google DataStore
- Cloud ML (built off _TensorFlow_)
- and much more

<quote> <span style="font-size: 15px">Did you know that Firebase and DialogFlow (API.AI) are both built on Google Cloud Platform</span></quote>

---
<center>
<img src="https://www.glintech.com/img/30704315/Google%20Cloud%20Platform%20Products%20%281%29.png" />
</center>

---

# Google App Engine
- designed around the fact that _Google just can't send everyone into their datacentre(s) and update applications across their many datacenters_
- Built off Remote Deployments

| Language   | Environment     |
|------------|-----------------|
| Java 7  (and Kotlin<sup>1</sup>)   | Standard        |
| Java 8     | Standard (Beta)/Flexible        |
| Node.js    | Flexible        |
| Python 2.7 | Standard        |
| Python 3.5 | Flexible        |

<sup>1</sup> This for you Kotlin fans out there

---


<span style="font-size: 20px">**Standard Environments** run in a specialised envrionment. Though building the application is more constrained then other environments, it means scaling up is faster.</span>

<span style="font-size: 20px">**Flexible Environment** applications run off a Docker container, it is designed for applications that recieve constant traffic. When deployed they are Google Compute Engine as Virtual Machines<sup>*</sup></span>

<div style="text-align: center">
<img src="https://zdnet2.cbsistatic.com/hub/i/r/2017/05/08/af178c5a-64dd-4900-8447-3abd739757e3/resize/770xauto/78abd09a8d41c182a28118ac0465c914/docker-vm-container.png" width=700 align="center" /> 
</div>

<div style="margin-top: 75px">
<span style="font-size: 12px"><sup>*</sup> Because they run off Docker, you can write your own Dockerfile Configuration to deploy, and deploy it anywhere, you can even move it to AWS
</div></span>


---

<center>
<img src="https://image.slidesharecdn.com/googleappengineatdockercon2014-140613154831-phpapp02-140801195253-phpapp01/95/docker-on-google-app-engine-7-638.jpg?cb=1407094857" width="100%"/>
</center>

---

<center>
<img src="https://cloud.google.com/docs/images/overview/ops-continuum.png" width="100%" />
</center>

---

<center>
<h1>Scaling Modern Web Applications</h1>
<h3>Me when I look at Scaling:</h3>
<img src="https://i.imgflip.com/1wqhrk.jpg" style="min-height: 100%"/>
</center>

---

### What is the difference between Vertical and Horizontally Scaling
<center>
<img src="https://i.stack.imgur.com/On3tO.png" height=400 />
</center>

<div style="font-size: 20px">

**Horizontal Scaling**: scale by adding more machines into your pool of resources machine.


**Vertical Scaling**: scale by adding more power (CPU, RAM) to an existing machine.

> An easy way to remember this is to think of a machine on a server rack, we add more machines across the horizontal direction and add more resources to a machine in the vertical direction.
</div>

---

## Benefits of Horizontal Scaling
- Dynamic scaling allows spinning up more instances and nodes faster, i.e. if you suddenly get a influx of traffic
- Vertical Scaling is limited to capacity of resources, simply adding more resources

- Just simplying load testing isn't good enough, examples of this include Niantic (PokemonGo) and Australian Census 2016

---


# Scaling in Action: The monPlan Stack

- The frontend and backend has been seperated into 2 projects. The backend stores the information for the frontend, 
- So when an increase in load happens, the frontend scales up, but not necessarily the backend, as the frontend requests information <u>when necessary</u>

---

<div style="text-align: center">
<h1>Demo Section</h1>
<img src="https://i.imgflip.com/1w3nb6.jpg" height="450px"/>
</div>

---

# Deploying to Google App Engine (GAE)

- Due to time constraints, I'm going to skip this section.
You can read more about it here: https://d.pr/BDZnDr

---

# Improving Turnaround with StackDriver Monitoring

---

<img src="https://upload.wikimedia.org/wikipedia/en/thumb/1/1e/Google_Stackdriver_logo.svg/1024px-Google_Stackdriver_logo.svg.png" width="40%"/>

> Google Stackdriver is a freemium cloud computing systems management service offered by Google. It provides performance and diagnostics data to public cloud users.

- Allows monitoring of not only GCP Services, but also AWS, Azure and Your Own Infrastructure
- Monitoring Traffic, Performance of GAE Instances and Stacktrace allows faster turnaround time

---

# Deep Dive

StackDriver Console: https://d.pr/y9DN9f

---

# Improving Analytics using BigQuery and StackDriver Logging

---

# Other Tools Available  on GCP that you play with

- Cloud ML (Google Cloud Machine Learning) which is built off TensorFlow 
- Compute Engine - Google VMs
- Container Engine - built off Kubernetes and allows deployment of custom applications
- Cloud Storage - CDN provider of files (like _Amazon S3_)
- Network Balancer - for Load Balancing of traffic for your applications
- Cloud ML APIs such as Natural Language Processing, Data Loss Prevention, etc.

---

# Questions