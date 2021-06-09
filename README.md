**SABA**
**- Sahabat Asisten Belajar**
---


**Introduction**
Sahabat Asisten Belajar (SABA) or study companion is our capstone project for Bangkit 2021. We build a seq2seq NLP as a chatbot to help students in their study by giving a simple explanation about questions around the lesson in the school. For our current development right now, the chatbot can only answer about itself and physics. We build the model with a simple LSTM encoder-decoder with an embedding layer. 

#######We deploy the Bot Model on Fire store

For the physics material, we made the data set arrange from [physics](https://www.studiobelajar.com/materi-fisika-sma-kelas-10-11-12/)
The dataset for a daily conversation about the bot takes from 5 categories in English, which we translated into Indonesian. [chit-chat-dataset](https://github.com/microsoft/botframework-cli/blob/main/packages/qnamaker/docs/chit-chat-dataset.md)

For the code, we referred to [A ten-minute introduction to sequence-to-sequence learning in Keras](https://blog.keras.io/a-ten-minute-introduction-to-sequence-to-sequence-learning-in-keras.html), [Tutorial Video from ProgrammingHut](https://github.com/Pawandeep-prog/chatbot), and [Chatbot Tutorial from from Udemy](https://www.udemy.com/share/101X0WAEIZcFpRQ3UF/)


**Python Environtment**
- Python 3.7
- Tensorflow 2.5.0
- Numpy
- Train using Google Colab


**Model Over View**
For Encode the input text
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Machine%20Learning/Picture/Encode.png)

For Decode the input text
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Machine%20Learning/Picture/Decode.png)


**Cloud Architecture**

For cloud architecture we use cloud functions as an API between android via firestore database to ML model

For Cloud Architecture
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Cloud/Picture/cloud-architecture.jpg)

For Database Architecture
![image text](https://github.com/Bagoes-Heikhal/SABA/blob/Master/Cloud/Picture/dbfirestore-architecture.jpg)

**Result On Android**
