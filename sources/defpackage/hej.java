package defpackage;

import android.util.Log;
import java.util.List;

/* renamed from: hej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hej {
    public final boj a;
    public final List b;
    private String c;

    public hej(boj boj, String str, List list) {
        this.a = boj;
        this.b = list;
        this.c = str;
        if (str != null) {
            hem a2 = hem.a();
            synchronized (a2.a) {
                a2.a.add(str);
            }
        }
    }

    public final void a() {
        String str = this.c;
        if (str != null) {
            hem a2 = hem.a();
            synchronized (a2.a) {
                if (!a2.a.remove(str)) {
                    Log.w("ChmraDebugLogger", str.length() == 0 ? new String("Failed removal of client ID ") : "Failed removal of client ID ".concat(str));
                }
            }
            this.c = null;
        }
    }
}
