# coding: utf8
import tweepy
import os


#API key
consumer_key = "TE8HBIrMATd4rkGsNQITDxY4T"
consumer_secret = "o5GDMh9VlYtt1S2js0UHbtiX6913nzx48GpOX8PBTmeo9VjBjn"
access_token = "2678843480rSFl9I4qldJ6cmEyCs861CUu0puovDWJbBZf3Lm"
access_token_secret = "gQu7WEnhkmfFGnyLm5SSqrAsHQIU3hWwl2aB5GvVW44UM"


auth = tweepy.OAuthHandler(consumer_key, consumer_secret)
auth.set_access_token(access_token, access_token_secret)
api = tweepy.API(auth)


keyword = "Rob Halford"
wfile = open(os.getcwd() + "/test.txt", mode='w', encoding='utf8')

cursor = tweepy.Cursor(api.search,
                       q=keyword,
                       since='20150101',
                       count=100,
                       include_entities=True
                       )

for i, tweet in enumerate(cursor.items()):
    print("[{}] {}(@{}): {}".format(i, tweet.user.name, tweet.user.screen_name, tweet.text))
    wfile.write("[{}] {}(@{}): {}\n".format(i, tweet.user.name, tweet.user.screen_name, tweet.text))

wfile.close()
