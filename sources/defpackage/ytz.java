package defpackage;

import android.net.Uri;

/* renamed from: ytz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytz {
    public static Uri a(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.plus").appendPath("images").appendQueryParameter("url", str).build();
    }
}
