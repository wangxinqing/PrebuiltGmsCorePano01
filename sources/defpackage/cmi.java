package defpackage;

import java.util.Map;

/* renamed from: cmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cmi {
    public final int a(String str) {
        String str2 = (String) f().get(str);
        if (str2 != null) {
            return Integer.valueOf(str2).intValue();
        }
        return 0;
    }

    public abstract String a();

    public abstract Integer b();

    public final String b(String str) {
        String str2 = (String) f().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract cmg c();

    public abstract long d();

    public abstract long e();

    public abstract Map f();
}
