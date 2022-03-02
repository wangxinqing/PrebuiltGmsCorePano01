package defpackage;

/* renamed from: fko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fko {
    public static final anax a = anax.a("credentials_enable_sync", "credentials_enable_service", "credentials_enable_autosignin", "credentials_need_first_time_welcome");

    public static hmk a(String str, boolean z) {
        String str2;
        aucd o = hmk.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmk hmk = (hmk) o.b;
        str.getClass();
        int i = hmk.a | 1;
        hmk.a = i;
        hmk.b = str;
        if (!z) {
            str2 = "false";
        } else {
            str2 = "true";
        }
        str2.getClass();
        hmk.a = i | 2;
        hmk.c = str2;
        return (hmk) o.i();
    }

    public static boolean a(hmk hmk, boolean z) {
        String str = hmk.c;
        if ("true".equalsIgnoreCase(str)) {
            return true;
        }
        if (!"false".equalsIgnoreCase(str)) {
            return z;
        }
        return false;
    }
}
