import pymongo
conn = pymongo.MongoClient('mongodb://localhost:27017/')
db = conn['thenga']
col = db['student']
result = col.find({'course':'MCA'}).sort('mark',-1).limit(1)
for i in result:
    print(i)


