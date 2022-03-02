package com.google.android.gms.leveldb.environment;

import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LevelDbPlatform {
    public static boolean isDebug() {
        return false;
    }

    public static boolean loadLibrary(String str) {
        return jke.b(ihs.b(), str);
    }

    public static void logError(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void logWarning(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static boolean restrictCorruptionMitigation() {
        return awzz.a.a().a();
    }

    public static void logError(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }
}
