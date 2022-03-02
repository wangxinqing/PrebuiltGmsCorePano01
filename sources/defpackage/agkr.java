package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: agkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agkr implements Runnable {
    private final agks a;
    private final String b;
    private final boolean c;
    private final basu d;
    private final barb e;
    private final String f;

    public agkr(agks agks, String str, boolean z, basu basu, barb barb, String str2) {
        this.a = agks;
        this.b = str;
        this.c = z;
        this.d = basu;
        this.e = barb;
        this.f = str2;
    }

    public final void run() {
        String str;
        agks agks = this.a;
        String str2 = this.b;
        boolean z = this.c;
        basu basu = this.d;
        barb barb = this.e;
        String str3 = this.f;
        if (agks.b.b) {
            return;
        }
        if (basu != null) {
            ageu ageu = (ageu) agks.e.a();
            aucd aucd = (aucd) basu.c(5);
            aucd.a((aucj) basu);
            aucd o = basg.g.o();
            int i = ageu.i;
            if (o.c) {
                o.c();
                o.c = false;
            }
            basg basg = (basg) o.b;
            int i2 = i - 1;
            if (i != 0) {
                basg.d = i2;
                int i3 = basg.a | 4;
                basg.a = i3;
                String str4 = ageu.b;
                if (str4 != null) {
                    str4.getClass();
                    basg.a = i3 | 1;
                    basg.b = str4;
                }
                Long l = ageu.g;
                if (l != null) {
                    long longValue = l.longValue();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basg basg2 = (basg) o.b;
                    basg2.a |= 8;
                    basg2.e = longValue;
                }
                String str5 = ageu.d;
                if (str5 != null) {
                    basg basg3 = (basg) o.b;
                    str5.getClass();
                    basg3.a |= 2;
                    basg3.c = str5;
                }
                String str6 = ageu.c;
                if (str6 != null) {
                    basg basg4 = (basg) o.b;
                    str6.getClass();
                    basg4.a |= 16;
                    basg4.f = str6;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu2 = (basu) aucd.b;
                basg basg5 = (basg) o.i();
                basg5.getClass();
                basu2.f = basg5;
                basu2.a |= 16;
                aucd o2 = basi.d.o();
                long freeSpace = ageu.e.a().getFreeSpace() / 1024;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                basi basi = (basi) o2.b;
                int i4 = basi.a | 1;
                basi.a = i4;
                basi.b = freeSpace;
                long j = ageu.f;
                basi.a = i4 | 2;
                basi.c = j;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu3 = (basu) aucd.b;
                basi basi2 = (basi) o2.i();
                basi2.getClass();
                basu3.q = basi2;
                basu3.a |= 4194304;
                amsv amsv = ageu.h;
                if (amsv != null) {
                    str = ((agfe) amsv.a()).a;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    base base = basu.p;
                    if (base == null) {
                        base = base.c;
                    }
                    aucd aucd2 = (aucd) base.c(5);
                    aucd2.a((aucj) base);
                    if (!((base) aucd2.b).b.isEmpty()) {
                        String str7 = str + "::" + ((base) aucd2.b).b;
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        base base2 = (base) aucd2.b;
                        str7.getClass();
                        base2.a |= 1;
                        base2.b = str7;
                    } else {
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        base base3 = (base) aucd2.b;
                        str.getClass();
                        base3.a |= 1;
                        base3.b = str;
                    }
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    basu basu4 = (basu) aucd.b;
                    base base4 = (base) aucd2.i();
                    base4.getClass();
                    basu4.p = base4;
                    basu4.a |= 1048576;
                }
                basu basu5 = (basu) aucd.i();
                aucd aucd3 = (aucd) basu5.c(5);
                aucd3.a((aucj) basu5);
                if (!z) {
                    if (str2 == null) {
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        basu basu6 = (basu) aucd3.b;
                        basu6.a &= -5;
                        basu6.d = basu.s.d;
                    } else {
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        basu basu7 = (basu) aucd3.b;
                        str2.getClass();
                        basu7.a |= 4;
                        basu7.d = str2;
                    }
                } else if (str2 == null) {
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu8 = (basu) aucd3.b;
                    basu8.a &= -65537;
                    basu8.n = basu.s.n;
                } else {
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu9 = (basu) aucd3.b;
                    str2.getClass();
                    basu9.a |= 65536;
                    basu9.n = str2;
                }
                if (barb != null) {
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu10 = (basu) aucd3.b;
                    barb.getClass();
                    basu10.l = barb;
                    basu10.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                }
                if (str3 != null) {
                    aucd o3 = base.c.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    base base5 = (base) o3.b;
                    str3.getClass();
                    base5.a |= 1;
                    base5.b = str3;
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu11 = (basu) aucd3.b;
                    base base6 = (base) o3.i();
                    base6.getClass();
                    basu11.p = base6;
                    basu11.a |= 1048576;
                }
                ((agno) agks.d.a()).a((basu) aucd3.i());
                agnf agnf = agks.c;
                if (agnf.b != Integer.MAX_VALUE) {
                    synchronized (agnf.a) {
                        agnf.c++;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - agnf.d > 1000) {
                            agnf.c = 0;
                            agnf.d = elapsedRealtime;
                        }
                    }
                    return;
                }
                return;
            }
            throw null;
        }
        ((anhn) ((anhn) agks.a.c()).a("agks", "b", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("metric is null, skipping recorded metric for event: %s", (Object) str2);
    }
}
