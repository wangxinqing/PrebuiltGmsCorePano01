package defpackage;

import android.net.Uri;

/* renamed from: ahfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahfz {
    public static Uri a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        String valueOf = String.valueOf(uri.getPath());
        return buildUpon.path(str.length() == 0 ? new String(valueOf) : valueOf.concat(str)).build();
    }
}
