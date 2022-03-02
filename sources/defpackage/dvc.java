package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: dvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvc {
    public static final String a = dvc.class.getSimpleName();

    public static Uri a(Intent intent) {
        Uri uri;
        if (intent.getData() == null || intent.getComponent() != null || intent.getExtras() != null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = Uri.parse(intent.toUri(1));
        } else {
            uri = intent.getData();
        }
        Uri.Builder appendPath = new Uri.Builder().scheme("android-app").authority(intent.getPackage()).appendPath(uri.getScheme());
        if (uri.getAuthority() != null) {
            appendPath.appendPath(uri.getAuthority());
        }
        for (String appendPath2 : uri.getPathSegments()) {
            appendPath.appendPath(appendPath2);
        }
        appendPath.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        return appendPath.build();
    }

    public static boolean b(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }
}
