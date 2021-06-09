from google.cloud import firestore

def dbchatbot(event, context):
  pathInput = event["value"]["name"]
  userId = pathInput.split("/")[len(pathInput.split("/")) -1]
  db = firestore.Client()
  data1 = {
    u'text' : ''
  }
  # Tambah dokumen databse notepad & todo baru untuk user baru
  db.collection(u'users').document(f'{userId}').collection(u'notepad').document(u'untitled').set(data1)
  db.collection(u'users').document(f'{userId}').collection(u'todo').document(u'untitled').set(data1)
