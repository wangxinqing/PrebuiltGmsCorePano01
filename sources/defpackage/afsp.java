package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: afsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsp {
    public static Uri a(Context context, int i, amri amri) {
        int i2 = i - 1;
        return a(context, amri).buildUpon().appendPath(i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public").build();
    }

    public static Uri a(Context context, int i, String str, afmh afmh, amri amri) {
        try {
            return a(context, i, amri).buildUpon().appendPath(str).build();
        } catch (Exception e) {
            afsh.a((Throwable) e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            afmh.a("Unable to create mobstore uri for file", e);
            return null;
        }
    }

    public static Uri a(Context context, amri amri) {
        String str;
        agzz a = ahaa.a(context);
        if (amri != null && amri.a()) {
            str = (String) amri.b();
        } else {
            str = "datadownload";
        }
        a.a(str);
        if (amri != null && amri.a()) {
            a.b("datadownload");
        }
        return a.a();
    }
}
