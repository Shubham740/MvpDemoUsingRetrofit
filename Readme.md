# MvpLibraryUsingRetrofit
This library can be used to set  up the MVP in your project . it provides the base structure to set up the MVP Using retrofit library . 
First you need to create the contract between Presenter and  View . it helps to coordinate  between view and API calling 
![screenshot from 2018-07-16 16-04-08](https://user-images.githubusercontent.com/23557343/42754522-69ca85a2-8912-11e8-9241-fded61fd14f4.png)


Then we need to create the presenter which implement  our  Contract and NetworkRequest.OnUpdateListener 


![screenshot from 2018-07-16 16-04-04](https://user-images.githubusercontent.com/23557343/42754666-ed531308-8912-11e8-8ca6-e762d95d09fa.png)


Add the Url in AppConstants  class to   call the API .



![screenshot from 2018-07-16 16-03-44](https://user-images.githubusercontent.com/23557343/42754756-4f531fc6-8913-11e8-8cc6-49baf3f55c54.png)


Create Call on ApiClient Class 




![screenshot from 2018-07-16 16-03-51](https://user-images.githubusercontent.com/23557343/42754795-7e6a3f42-8913-11e8-89e2-9614b392424f.png)



If we want to add any other data like Headers then we can add in Utils class  




![screenshot from 2018-07-16 16-03-48](https://user-images.githubusercontent.com/23557343/42754907-e6728bb2-8913-11e8-83fd-1be8ce709407.png)


Finally we need to implement the Contract.View to  get the callback on View . I have created one activity for the sample . 




![screenshot from 2018-07-16 16-16-39](https://user-images.githubusercontent.com/23557343/42754955-235d562e-8914-11e8-9466-d8e9f023067c.png)




