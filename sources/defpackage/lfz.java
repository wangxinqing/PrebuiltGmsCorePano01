package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Iterator;
import java.util.Set;

/* renamed from: lfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lfz implements lfm {
    private static final ith a = new ith("ImpressionConnectionAtt", "");
    private final lgc b;
    private aucd c = amap.l.o();

    public lfz(lgc lgc) {
        this.b = lgc;
    }

    private final void b() {
        iva.a((Object) this.c, (Object) "Builder can only be used once.");
    }

    public final void a() {
        boolean z;
        b();
        lgc lgc = this.b;
        amap amap = (amap) this.c.i();
        lgc.k();
        if ((((ambk) lgc.e.b).a & 16777216) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't set connectionAttemptDetails more than once");
        aucd aucd = lgc.e;
        iva.a((Object) amap);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        amap.getClass();
        ambk.A = amap;
        ambk.a |= 16777216;
        this.c = null;
    }

    public final void c(int i) {
        boolean z;
        b();
        if ((((amap) this.c.b).a & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setConnectionTimeMs() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = (amap) aucd.b;
        amap amap2 = amap.l;
        amap.a |= 128;
        amap.j = i;
    }

    public final void d(int i) {
        boolean z;
        b();
        if ((((amap) this.c.b).a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setInitTimeMs() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = (amap) aucd.b;
        amap amap2 = amap.l;
        amap.a |= 32;
        amap.h = i;
    }

    public final void e(int i) {
        boolean z;
        b();
        if ((((amap) this.c.b).a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setOperationSchedulingTimeMs() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = (amap) aucd.b;
        amap amap2 = amap.l;
        amap.a |= 16;
        amap.g = i;
    }

    public final void b(int i) {
        b();
        iva.a(((((amap) this.c.b).a & 1) ^ 1) != 0, (Object) "Can't call setConnectionResultCode() twice");
        if (i == 1) {
            aucd aucd = this.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            amap amap = (amap) aucd.b;
            amap amap2 = amap.l;
            amap.b = 6;
            amap.a |= 1;
        } else if (i == 2) {
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            amap amap3 = (amap) aucd2.b;
            amap amap4 = amap.l;
            amap3.b = 4;
            amap3.a |= 1;
        } else if (i == 3) {
            aucd aucd3 = this.c;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            amap amap5 = (amap) aucd3.b;
            amap amap6 = amap.l;
            amap5.b = 3;
            amap5.a |= 1;
        } else if (i == 4) {
            aucd aucd4 = this.c;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            amap amap7 = (amap) aucd4.b;
            amap amap8 = amap.l;
            amap7.b = 2;
            amap7.a |= 1;
        } else if (i != 5) {
            aucd aucd5 = this.c;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            amap amap9 = (amap) aucd5.b;
            amap amap10 = amap.l;
            amap9.b = 0;
            amap9.a |= 1;
            a.b("ImpressionConnectionAtt", "Unknown connection result code: %d", Integer.valueOf(i));
        } else {
            aucd aucd6 = this.c;
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            amap amap11 = (amap) aucd6.b;
            amap amap12 = amap.l;
            amap11.b = 1;
            amap11.a |= 1;
        }
    }

    public final void a(int i) {
        boolean z;
        b();
        if ((((amap) this.c.b).a & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setAccountResolutionTimeMs() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = (amap) aucd.b;
        amap amap2 = amap.l;
        amap.a |= 64;
        amap.i = i;
    }

    public final void a(Set set) {
        boolean z;
        amcz amcz;
        b();
        if (((amap) this.c.b).f.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Can't call setRequestedScopes() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = amap.l;
        ((amap) aucd.b).f = aucj.q();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jzl jzl = (jzl) it.next();
            aucd aucd2 = this.c;
            jzl jzl2 = jzl.FILE;
            int ordinal = jzl.ordinal();
            if (ordinal == 0) {
                amcz = amcz.DRIVE_SCOPE_FILE;
            } else if (ordinal == 1) {
                amcz = amcz.DRIVE_SCOPE_APPFOLDER;
            } else if (ordinal == 2) {
                amcz = amcz.DRIVE_SCOPE_FULL;
            } else if (ordinal != 3) {
                a.b("ImpressionConnectionAtt", "Unknown drive scope: %s", jzl);
                amcz = amcz.UNKNOWN_DRIVE_SCOPE;
            } else {
                amcz = amcz.DRIVE_SCOPE_APPS;
            }
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            amap amap2 = (amap) aucd2.b;
            amcz.getClass();
            if (!amap2.f.a()) {
                amap2.f = aucj.a(amap2.f);
            }
            amap2.f.d(amcz.h);
        }
    }

    public final void a(khl khl) {
        boolean z;
        b();
        boolean z2 = true;
        if ((((amap) this.c.b).a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setAuthRequestDetails() twice");
        Integer num = khl.b;
        aucd aucd = this.c;
        if (num == null) {
            z2 = false;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = (amap) aucd.b;
        amap amap2 = amap.l;
        amap.a |= 4;
        amap.d = z2;
        if (num == null) {
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            amap amap3 = (amap) aucd2.b;
            amap3.a &= -257;
            amap3.k = 0;
        } else {
            aucd aucd3 = this.c;
            int intValue = num.intValue();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            amap amap4 = (amap) aucd3.b;
            amap4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            amap4.k = intValue;
        }
        aucd aucd4 = this.c;
        boolean z3 = khl.a;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        amap amap5 = (amap) aucd4.b;
        amap5.a |= 8;
        amap5.e = z3;
    }

    public final void a(boolean z) {
        boolean z2;
        b();
        if ((((amap) this.c.b).a & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(!z2, (Object) "Can't call setInitRequired() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amap amap = (amap) aucd.b;
        amap amap2 = amap.l;
        amap.a |= 2;
        amap.c = z;
    }
}
