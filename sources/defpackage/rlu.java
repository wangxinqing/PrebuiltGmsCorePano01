package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: rlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlu {
    public static final Uri a = Uri.parse("content://com.google.android.gms.location.preferences");

    public static long a(ContentResolver contentResolver, String str, long j) {
        return Long.parseLong(a(contentResolver, str, 3, Long.toString(j)));
    }

    public static void b(ContentResolver contentResolver, String str) {
        a(contentResolver, str, Boolean.toString(false));
    }

    public static void c(ContentResolver contentResolver, String str) {
        a(contentResolver, str, Long.toString(0));
    }

    public static Uri a(String str) {
        return a.buildUpon().appendPath(str).build();
    }

    public static String a(ContentResolver contentResolver, String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("valueType", i);
        if (str2 != null) {
            bundle.putString("defaultValue", str2);
        }
        return contentResolver.call(a, "read", str, bundle).getString("value", str2);
    }

    public static void a(ContentResolver contentResolver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("value", str2);
        contentResolver.call(a, "write", str, bundle);
    }

    public static boolean a(ContentResolver contentResolver, String str) {
        return Boolean.parseBoolean(a(contentResolver, str, 1, Boolean.toString(true)));
    }
}
