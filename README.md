# Kubernates_Learning

## Basic Commands

```sh
# Start Minikube
minikube start

# Get all namespaces
kubectl get namespaces

# Get all pods
kubectl get pods

# Get all deployments
kubectl get deployments

# Get all services
kubectl get services

# create new deployment
kubectl create deployment nginx --image=nginx

#check deployments
kubectl get all
kubectl get all -o wide       #with ouput flag

# check descritpion
kubectl describe deployment nginx

# check logs what is going on inside pod:
kubectl logs <pod name>

kubectl exec -it <pod name>  --/bin/bash


#open a Yaml file for the deployment
kubectl edit deployment 

# 🚨🚨🚨 Delete all services  🚨🚨   -> Do not use this command in Production
kubectl delete all --all

  