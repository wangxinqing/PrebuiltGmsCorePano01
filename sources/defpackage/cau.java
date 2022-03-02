package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: cau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cau extends bwp {
    public final Set c = new HashSet();

    public cau() {
        super("InterestRecordExpirationOperation");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long j;
        Iterator it = this.c.iterator();
        long a = cbi.i().a();
        new Object[1][0] = Long.valueOf(a);
        HashSet hashSet = null;
        while (it.hasNext()) {
            cas cas = (cas) it.next();
            if (cas.a(cas, a)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                new Object[1][0] = cas;
                hashSet.add(cas);
                it.remove();
            }
        }
        if (hashSet != null && hashSet.size() > 0) {
            cbi.r().b((Collection) hashSet);
        }
        if (!this.c.isEmpty()) {
            j = Long.MAX_VALUE;
            for (cas cas2 : this.c) {
                j = Math.min(j, cas2.a() + cas2.e().e());
            }
        } else {
            j = -1;
        }
        new Object[1][0] = Long.valueOf(j);
        cbi.k().a((Runnable) this);
        if (j != -1) {
            long j2 = j - a;
            new Object[1][0] = Long.valueOf(j2);
            a(j2, bvq.a("InterestRecordExpirationOperation"));
        }
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        if (this.c.remove(cas)) {
            new Object[1][0] = cas;
            a(bvq.a("InterestRecordExpirationOperation"));
        }
    }
}
