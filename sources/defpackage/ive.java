package defpackage;

import android.net.Uri;

/* renamed from: ive  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ive {
    private static final Uri a = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();

    public static Uri a(String str) {
        iva.a((Object) str, (Object) "Resource name must not be null.");
        return a.buildUpon().appendPath(str).build();
    }
}
