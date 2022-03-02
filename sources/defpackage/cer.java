package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: cer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cer {
    public final Set a;
    public int b;
    public long c;
    public int d;
    public long e;
    private final agvx f;
    private final agvx g;
    private final agvx h;
    private final boolean i;

    public cer(agvx agvx, agvx agvx2, agvx agvx3) {
        this(agvx, agvx2, agvx3, true);
    }

    private final boolean b(cas cas) {
        new Object[1][0] = cas;
        boolean remove = this.a.remove(cas);
        new Object[1][0] = Boolean.valueOf(remove);
        return remove;
    }

    private final boolean c() {
        long j;
        int i2 = this.b;
        long j2 = this.c;
        this.b = a();
        this.c = b();
        for (cas cas : this.a) {
            cbc g2 = cas.g();
            if (g2 == null) {
                ((anih) ((anih) bxk.a.b()).a("cer", "d", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProductionPriorityIntervalResolver] Unexpected null production policy in interest record %s", (Object) cas);
            } else {
                a(g2);
                int i3 = this.d;
                int i4 = this.b;
                if (i4 == -1 ? i3 == 100 || i3 == 102 || i3 == 104 || i3 == 105 : i4 == 102 ? i3 == 100 : i4 == 104 ? i3 == 100 || i3 == 102 : i4 == 105 && (i3 == 100 || i3 == 102 || i3 == 104)) {
                    this.b = i3;
                    j = this.e;
                } else if (i3 == i4) {
                    j = Math.min(this.e, this.c);
                }
                this.c = j;
            }
        }
        return (this.b == i2 && this.c == j2) ? false : true;
    }

    private final void d() {
        long j;
        this.b = a();
        this.c = b();
        for (cas cas : this.a) {
            cbc g2 = cas.g();
            if (g2 == null) {
                ((anih) ((anih) bxk.a.b()).a("cer", "d", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProductionPriorityIntervalResolver] Unexpected null production policy in interest record %s", (Object) cas);
            } else {
                a(g2);
                int i2 = this.d;
                int i3 = this.b;
                if (i3 == -1 ? i2 == 100 || i2 == 102 || i2 == 104 || i2 == 105 : i3 == 102 ? i2 == 100 : i3 == 104 ? i2 == 100 || i2 == 102 : i3 == 105 && (i2 == 100 || i2 == 102 || i2 == 104)) {
                    this.b = i2;
                    j = this.e;
                } else if (i2 == i3) {
                    j = Math.min(this.e, this.c);
                }
                this.c = j;
            }
        }
    }

    public final int a() {
        agvx agvx = this.g;
        if (agvx != null) {
            return ((Long) agvx.c()).intValue();
        }
        return -1;
    }

    public cer(agvx agvx, agvx agvx2, agvx agvx3, boolean z) {
        this.a = new HashSet();
        this.f = agvx;
        this.g = agvx2;
        iva.a((Object) agvx3);
        this.h = agvx3;
        this.b = a();
        long b2 = b();
        this.c = b2;
        this.d = this.b;
        this.e = b2;
        this.i = z;
    }

    /* access modifiers changed from: protected */
    public final void a(cbc cbc) {
        int i2;
        if (cbc == null) {
            this.d = a();
            this.e = b();
            return;
        }
        int a2 = cbc.a();
        if (a2 == 2) {
            this.d = a();
            this.e = cbc.b();
        } else if (a2 == 3) {
            this.d = cbc.c();
            this.e = cbc.b();
        } else if (a2 != 6) {
            ((anih) ((anih) bxk.a.b()).a("cer", "a", 197, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProductionPriorityIntervalResolver] Unknown production policy type = %s", cbc.a());
            this.d = this.b;
            this.e = this.c;
        } else {
            agvx agvx = this.f;
            if (agvx != null) {
                i2 = ((Long) agvx.c()).intValue();
            } else {
                i2 = -1;
            }
            this.d = i2;
            this.e = cbc.d();
        }
    }

    public final long b() {
        return ((Long) this.h.c()).longValue();
    }

    public final boolean a(cas cas) {
        if (cas == null) {
            return false;
        }
        boolean b2 = b(cas);
        return (!this.i || !b2) ? b2 : c();
    }

    public final boolean a(cas cas, cas cas2) {
        boolean z;
        if (cas2 != null) {
            z = b(cas2);
        } else {
            z = false;
        }
        if (cas.a(cas, 6) || cas.a(cas, 3) || cas.a(cas, 2)) {
            new Object[1][0] = cas;
            this.a.remove(cas);
            this.a.add(cas);
            z = true;
        }
        return (!this.i || !z) ? z : c();
    }
}
