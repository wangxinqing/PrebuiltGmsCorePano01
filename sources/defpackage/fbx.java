package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: fbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fbx {
    private static final iwd a = ehv.b("AppIdentityUtils");

    public static String a(Context context, String str) {
        iva.a(str, (Object) "app package name cannot be empty");
        try {
            return jni.b(context).b(str).toString();
        } catch (PackageManager.NameNotFoundException e) {
            a.e("Unable to get the application label.", e, new Object[0]);
            return str;
        }
    }

    public static String b(String str) {
        iva.c(str);
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        iva.a((Object) scheme);
        return scheme + "://" + parse.getAuthority();
    }

    public static String a(String str) {
        iva.c(str);
        String host = Uri.parse(str).getHost();
        iva.a((Object) host);
        return host;
    }
}
