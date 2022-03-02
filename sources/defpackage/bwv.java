package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwv extends bwp {
    public final Set c = new HashSet();

    public bwv() {
        super("ExpirationOperation");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Iterator it = this.c.iterator();
        long a = cbi.i().a();
        new Object[1][0] = Long.valueOf(a);
        HashSet hashSet = null;
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            Object next = it.next();
            long b = cas.a((cas) next);
            if (cas.a((cas) next) > a) {
                j = Math.min(j, b);
            } else {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                new Object[1][0] = next;
                hashSet.add(next);
                it.remove();
            }
        }
        if (hashSet != null && !hashSet.isEmpty()) {
            cbi.r().b((Collection) hashSet);
        }
        if (j != Long.MAX_VALUE) {
            new Object[1][0] = Long.valueOf(j);
            cbi.k().a((Runnable) this);
            long j2 = j - a;
            new Object[1][0] = Long.valueOf(j2);
            a(j2, bvq.a("ExpirationOperation"));
        }
    }

    public final void a(Object obj) {
        new Object[1][0] = obj;
        if (this.c.remove(obj)) {
            a(bvq.a("ExpirationOperation"));
        }
    }
}
