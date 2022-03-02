package defpackage;

import android.app.PendingIntent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: byl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byl {
    public final PendingIntent a;
    public final String b;
    public final HashMap c = new HashMap();
    public jyh d = null;

    public byl(PendingIntent pendingIntent, String str) {
        iva.a((Object) pendingIntent);
        this.a = pendingIntent;
        iva.c(str);
        this.b = str;
    }

    public final Collection a() {
        return this.c.values();
    }

    public final Set b() {
        return this.c.keySet();
    }

    public final boolean c() {
        return this.c.isEmpty() && this.d == null;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("p.Int", this.a);
        a2.a("key", this.b);
        a2.a("fenceRec", this.c);
        a2.a("listenerRec", this.d);
        return a2.toString();
    }

    public final void a(String str, jyg jyg) {
        this.c.put(str, jyg);
    }
}
