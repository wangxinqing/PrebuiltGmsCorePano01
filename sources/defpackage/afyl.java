package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: afyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyl implements afxv {
    public final Object a = new Object();
    public final amqy b;
    public final afys c;
    private final aekn d;
    private boolean e = false;
    private final long f;
    private long g;
    private final afzb h;

    public afyl(amqy amqy, afzb afzb, aekn aekn, afys afys) {
        this.b = amqy;
        this.h = afzb;
        this.d = aekn;
        this.c = afys;
        this.f = aekn.a();
    }

    private final void f() {
        amrl.b(this.e, (Object) "Sync didn't complete yet!");
    }

    public final aorr a() {
        afys afys = this.c;
        long a2 = this.d.a();
        boolean z = true;
        if ((afys.a & 1) != 0 && a2 - afys.c < Long.MAX_VALUE && afyt.a(afys).isEmpty()) {
            z = false;
        }
        return aorl.a((Object) Boolean.valueOf(z));
    }

    public final aorr b() {
        aorr a2;
        synchronized (this.a) {
            e();
            a2 = this.h.a(new afye(this, this.g));
        }
        return a2;
    }

    public final aorr c() {
        aorr a2;
        synchronized (this.a) {
            e();
            a2 = this.h.a(new afyf(this.g));
        }
        return a2;
    }

    public final afyp d() {
        long j;
        long j2;
        afyp a2;
        synchronized (this.a) {
            afyo e2 = afyp.e();
            f();
            long j3 = this.g;
            anab h2 = anaf.h();
            Iterator it = afyt.b(this.c).entrySet().iterator();
            while (true) {
                j = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Enum enumR = (Enum) this.b.a((Integer) entry.getKey());
                Long l = (Long) entry.getValue();
                if (l != null) {
                    j = j3 - l.longValue();
                }
                h2.a(enumR, Long.valueOf(j));
            }
            e2.a(anet.a((Map) h2.a()));
            f();
            e2.c(this.g - this.f);
            f();
            afys afys = this.c;
            if ((afys.a & 1) != 0) {
                j2 = this.g - afys.c;
            } else {
                j2 = 0;
            }
            e2.b(j2);
            f();
            afys afys2 = this.c;
            if ((afys2.a & 2) != 0) {
                j = this.g - afys2.d;
            }
            e2.a(j);
            a2 = e2.a();
        }
        return a2;
    }

    public final void e() {
        amrl.b(!this.e, (Object) "Sync already completed!");
        this.g = this.d.a();
        this.e = true;
    }
}
