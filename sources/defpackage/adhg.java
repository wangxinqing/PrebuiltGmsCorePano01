package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: adhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhg {
    private static adhg b;
    public final Map a = new HashMap();

    private adhg() {
    }

    public static adhg a() {
        if (b == null) {
            b = new adhg();
        }
        return b;
    }

    public final void a(String str) {
        this.a.remove(str);
    }
}
