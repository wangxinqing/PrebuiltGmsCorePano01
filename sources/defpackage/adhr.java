package defpackage;

import android.net.Uri;

/* renamed from: adhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhr {
    public static Uri a(String str, String str2) {
        return Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("Email", str).appendQueryParameter("continue", str2).build();
    }
}
