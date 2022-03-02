package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: afsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsz implements ahcq {
    public final Context a;
    public amri b = ampu.a;
    public final HashMap c = new HashMap();
    private final aekn d = new aekp();
    private final HashMap e = new HashMap();

    public afsz(Context context) {
        this.a = context;
    }

    public static String a(String str, String str2) {
        return str + "|" + str2;
    }

    public final ahcp a() {
        return null;
    }

    public final ahcc b(Uri uri) {
        return a(uri);
    }

    public static String a(String str, String str2, int i) {
        return str + "|" + str2 + "|" + i;
    }

    public final ahcc a(Uri uri) {
        synchronized (afsz.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return null;
            }
            if (this.e.get(str) == null) {
                this.e.put(str, new ahcc(new afsy(this, str), 10000, TimeUnit.MILLISECONDS));
            }
            ahcc ahcc = (ahcc) this.e.get(str);
            return ahcc;
        }
    }
}
