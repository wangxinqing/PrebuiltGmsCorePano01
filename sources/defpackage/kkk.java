package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kkk {
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public final void a(kmp kmp) {
        boolean z;
        boolean z2 = true;
        if (kmp != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        String i = kmp.i();
        iva.a((Object) i);
        iva.a(this.a.get(i) == null);
        if (this.b.get(kmp.b()) != null) {
            z2 = false;
        }
        iva.a(z2);
        this.a.put(i, kmp);
        this.b.put(kmp.b(), kmp);
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }
}
