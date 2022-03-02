package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrd {
    private long a;
    private long b = 0;
    private int c = -1;
    private final List d;
    private final int e;
    private int f = 2;

    public qrd(int i) {
        this.e = i;
        this.d = new ArrayList();
    }

    public final synchronized antc a() {
        aucd o;
        o = antc.f.o();
        int i = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((antc) o.b).a = i - 2;
        ((antc) o.b).e = this.b;
        if (this.c >= 0) {
            aucd o2 = antb.b.o();
            int i2 = this.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((antb) o2.b).a = i2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            antb antb = (antb) o2.i();
            antb.getClass();
            ((antc) o.b).c = antb;
        }
        int i3 = this.f;
        if (o.c) {
            o.c();
            o.c = false;
        }
        antc antc = (antc) o.b;
        if (i3 != 1) {
            antc.b = i3 - 2;
            ArrayList arrayList = new ArrayList();
            List list = this.d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((qri) list.get(i4)).a());
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            antc antc2 = (antc) o.b;
            if (!antc2.d.a()) {
                antc2.d = aucj.a(antc2.d);
            }
            auab.a((Iterable) arrayList, (List) antc2.d);
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return (antc) o.i();
    }

    public final synchronized void a(int i) {
        this.c = i;
    }

    public final synchronized void b() {
        if (this.a > 0) {
            this.b = SystemClock.elapsedRealtime() - this.a;
        }
    }

    public final synchronized void b(int i) {
        this.f = i;
    }

    public final void c() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final synchronized void a(qri qri) {
        this.d.add(qri);
    }
}
