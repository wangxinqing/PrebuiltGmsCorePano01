package defpackage;

import android.net.Uri;

/* renamed from: akeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akeh {
    public static boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    public static boolean b(Uri uri) {
        if (uri != null) {
            return "image.account".equals(uri.getScheme());
        }
        return false;
    }

    public static String c(Uri uri) {
        if (b(uri)) {
            String valueOf = String.valueOf(uri.getAuthority());
            String valueOf2 = String.valueOf(uri.getPath());
            return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 27);
        sb.append("Invalid account image URI. ");
        sb.append(valueOf3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean d(Uri uri) {
        return "shortcut.icon.resource".equals(uri.getScheme());
    }
}
