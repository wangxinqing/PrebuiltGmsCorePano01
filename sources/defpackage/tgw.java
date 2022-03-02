package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: tgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgw {
    public static Cursor a(Context context, Uri uri) {
        return a(context, uri, (String[]) null);
    }

    public static Long b(Cursor cursor, int i) {
        return (Long) a("getLong", (Callable) new tgu(cursor, i));
    }

    public static Boolean c(Cursor cursor, int i) {
        return (Boolean) a("getBoolean", (Callable) new tgv(cursor, i));
    }

    public static Cursor a(Context context, Uri uri, String[] strArr) {
        return a(context, uri, strArr, (String) null, (String[]) null, (String) null);
    }

    public static Long b(Cursor cursor, String str) {
        try {
            return b(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            anih anih = (anih) tgb.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to get the %s column value", (Object) str);
            return null;
        }
    }

    public static Cursor a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) a("query", (Callable) new tgr(context, uri, strArr, str, strArr2, str2));
    }

    public static Object a(String str, Callable callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            anih anih = (anih) tgb.a.c();
            anih.a((Throwable) e);
            anih.a("Operation %s failed", (Object) str);
            return null;
        }
    }

    public static void b(Context context, Uri uri) {
        Integer num = (Integer) a("delete", (Callable) new tgq(context, uri));
        if (num == null || num.intValue() != 0) {
        }
    }

    public static String a(Cursor cursor, int i) {
        return (String) a("getString", (Callable) new tgt(cursor, i));
    }

    public static String a(Cursor cursor, String str) {
        try {
            return a(cursor, cursor.getColumnIndexOrThrow(str));
        } catch (IllegalArgumentException e) {
            anih anih = (anih) tgb.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to get the %s column value", (Object) str);
            return null;
        }
    }
}
