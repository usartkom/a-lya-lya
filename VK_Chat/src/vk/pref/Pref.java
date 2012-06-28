package vk.pref;

import vk.constants.Constants;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class Pref {
    public static String HAS_LOGGED_IN = "hasLoggedIn";   
    public static String HAS_SIGNUP = "hasSignUp";
    
    // DB
    public static String DB_FRIENDS = "dbFriendsLoaded";
    public static String DB_CONVERSATIONS = "dbFriendsConversations";
    public static String DB_CHAT = "dbChatLoaded";
    
    private static String PREFS_NAME = "my_prefs";
    
    /* DB */
    // FRIENDS DB
	public static void setLoadedFriendsDB(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(DB_FRIENDS, true);
        editor.commit();
	}
	
    public static void cancelLoadedFriendsDB(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(DB_FRIENDS, false);
        editor.commit();
	}
    
	public static Boolean loadedFriendsDB(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
		final Editor editor=prefs.edit();
		return prefs.getBoolean(DB_FRIENDS, false);
	}    

    // DB_CONVERSATIONS
	public static void setLoadedConversationsDB(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(DB_CONVERSATIONS, true);
        editor.commit();
	}
	
    public static void cancelLoadedConversationsDB(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(DB_CONVERSATIONS, false);
        editor.commit();
	}
    
	public static Boolean loadedConversationsDB(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
		final Editor editor=prefs.edit();
		return prefs.getBoolean(DB_CONVERSATIONS, false);
	}    
	
	// DB_CHAT
		public static void setLoadedChatDB(Context c){
			SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
	        Editor editor=prefs.edit();
	        editor.putBoolean(DB_CHAT, true);
	        editor.commit();
		}
		
	    public static void cancelLoadedChatDB(Context c){
			SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
	        Editor editor=prefs.edit();
	        editor.putBoolean(DB_CHAT, false);
	        editor.commit();
		}
	    
		public static Boolean loadedChatDB(Context c){
			SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
			final Editor editor=prefs.edit();
			return prefs.getBoolean(DB_CHAT, false);
		}   
    
    /* END WORK WITH DB */
    
	public static void logIn(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(HAS_LOGGED_IN, true);
        editor.commit();
	}
	
    public static void logOut(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(HAS_LOGGED_IN, false);
        editor.commit();
	}
    
	public static Boolean loggedIn(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
		final Editor editor=prefs.edit();
		return prefs.getBoolean(HAS_LOGGED_IN, false);
	}
	
	public static void signUp(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(HAS_SIGNUP, true);
        editor.commit();
	}
	
    public static void cancelSignUp(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putBoolean(HAS_SIGNUP, false);
        editor.commit();
	}
    
	public static Boolean signedUp(Context c){
		SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
		final Editor editor=prefs.edit();
		return prefs.getBoolean(HAS_SIGNUP, false);
	}
	
    public static void saveHTTPSAuth(Context c, String access_token, String user_id){
    	SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        Editor editor=prefs.edit();
        editor.putString(Constants.ACCESS_TOKEN, access_token);
        editor.putString(Constants.USER_ID, user_id);
        editor.commit();
    }
    
    public static String getAccessTokenHTTPS(Context c){
    	SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        return prefs.getString(Constants.ACCESS_TOKEN, null);      
    }
    
    public static String getUserID(Context c){
    	SharedPreferences prefs = c.getSharedPreferences(PREFS_NAME, c.MODE_WORLD_READABLE|c.MODE_WORLD_WRITEABLE);
        return prefs.getString(Constants.USER_ID, null);       
    }
}
