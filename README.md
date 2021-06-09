**SABA**
**- Sahabat Belajar**
---


**Introduction**
Sahabat Belajar (SABA) or study companion is our capstone project for Bangkit 2021. We build a seq2seq NLP as a chatbot to help students in their study by giving a simple explanation about questions around the lesson in the school. For our current development right now, the chatbot can only answer about itself and physics. We build the model with a simple LSTM encoder-decoder with an embedding layer. We deploy the Bot Model on Cloud Function and connect to Android

For the physics material, we made the data set arrange from [physics](https://www.studiobelajar.com/materi-fisika-sma-kelas-10-11-12/)
The dataset for a daily conversation about the bot takes from 5 categories in English, which we translated into Indonesian. [chit-chat-dataset](https://github.com/microsoft/botframework-cli/blob/main/packages/qnamaker/docs/chit-chat-dataset.md)

For the code, we referred to [A ten-minute introduction to sequence-to-sequence learning in Keras](https://blog.keras.io/a-ten-minute-introduction-to-sequence-to-sequence-learning-in-keras.html), [Tutorial Video from ProgrammingHut](https://github.com/Pawandeep-prog/chatbot), and [Chatbot Tutorial from from Udemy](https://www.udemy.com/share/101X0WAEIZcFpRQ3UF/)


**Python Environtment**
- Python 3.7
- Tensorflow 2.5.0
- Numpy
- Train using Google Colab


**Model Over View**
---
For Encode the input text
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Machine%20Learning/Picture/Encode.png)

For Decode the input text
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Machine%20Learning/Picture/Decode.png)


**Cloud Architecture**
---
For cloud architecture we use cloud functions as an API between android via firestore database to ML model.

The first cloud function we use firestore trigger oncreate. So everytime user send a messages it will be automatically create new document that stored their messages and cloud function will read that messages to process it into ML model and save the result into new document that will be read by android to display the reply for user messages.

The second cloud function we use firestore trigger oncreate again. This cloud function will work everytime user create and account and cloud function will be run our code to make new collection and new document that will be stored notepad, todo and chatbot data.

For Cloud Architecture
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Cloud/Picture/cloud-architecture.jpg)

For Database Architecture
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Cloud/Picture/dbfirestore-architecture.jpg)

**Result On Android**
---
For building this chat app, we used Kotlin for base Language to building Android App. This is the example of SABA UI, Main Home and Chat Asissten

![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Android%20Apps/Picture/11.%20chat%20assisten.jpeg)

![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Android%20Apps/Picture/10.%20Home.jpeg)

![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Android%20Apps/Picture/11.%20chat%20assisten.jpeg)
