package defpackage;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.List;

/* renamed from: allh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class allh implements akhu {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final akup f;
    private final String[] g = {"android:monitor_location"};
    private final akin h;

    public allh(akup akup, int i, String str, String str2, int i2, long j, akin akin) {
        this.f = akup;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.h = akin;
        this.e = j;
        this.d = i2;
    }

    public final void a(akip akip) {
        this.h.a(akip);
    }

    public final void b() {
        akup akup = this.f;
        akup.e.add(this);
        ClientIdentity clientIdentity = new ClientIdentity(this.a, this.b);
        akup.c.a(this.d, this.e, clientIdentity);
    }

    public final void c() {
        akup akup = this.f;
        akup.e.remove(this);
        ClientIdentity clientIdentity = new ClientIdentity(this.a, this.b);
        int i = this.d;
        long j = this.e;
        akyn akyn = akup.c;
        iva.b(true);
        if (j < 0) {
            j = akyn.a(i);
        }
        if (akyn.n.remove(new akym(i, j, clientIdentity))) {
            if (i == akyn.s) {
                List list = akyn.n;
                int size = list.size();
                int i2 = -1;
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = ((akym) list.get(i3)).a;
                    if (i2 < i4) {
                        i2 = i4;
                    }
                }
                akyn.s = i2;
            }
            akyn.b();
        }
    }

    public final int j() {
        return this.a;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return this.g;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("clientPackage", this.b);
        a2.a("accountName", this.c);
        a2.a("signalPriority", Integer.valueOf(this.d));
        a2.a("updateIntervalMillis", Long.valueOf(this.e));
        return a2.toString();
    }
}
