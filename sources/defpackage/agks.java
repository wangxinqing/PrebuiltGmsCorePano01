package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import java.util.concurrent.Executor;

/* renamed from: agks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agks {
    public static final anhq a = anhq.a("agks");
    public final agic b;
    public final agnf c;
    public final bapu d;
    public final bapu e;
    private final Executor f;

    public agks(bapu bapu, bapu bapu2, agic agic, Executor executor, agnf agnf) {
        this.b = agic;
        this.c = agnf;
        amrl.a((Object) bapu);
        this.d = bapu;
        amrl.a((Object) bapu2);
        this.e = bapu2;
        this.f = executor;
    }

    public final void a(basu basu) {
        a((String) null, true, basu, (barb) null, (String) null);
    }

    public final void b(String str, boolean z, basu basu, barb barb, String str2) {
        String str3 = str;
        basu basu2 = basu;
        barb barb2 = barb;
        String str4 = str2;
        if (this.b.b) {
            return;
        }
        if (basu2 != null) {
            ageu ageu = (ageu) this.e.a();
            aucd aucd = (aucd) basu2.c(5);
            aucd.a((aucj) basu2);
            aucd o = basg.g.o();
            int i = ageu.i;
            if (o.c) {
                o.c();
                o.c = false;
            }
            basg basg = (basg) o.b;
            int i2 = i - 1;
            String str5 = null;
            if (i != 0) {
                basg.d = i2;
                int i3 = basg.a | 4;
                basg.a = i3;
                String str6 = ageu.b;
                if (str6 != null) {
                    str6.getClass();
                    basg.a = i3 | 1;
                    basg.b = str6;
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
                String str7 = ageu.d;
                if (str7 != null) {
                    basg basg3 = (basg) o.b;
                    str7.getClass();
                    basg3.a |= 2;
                    basg3.c = str7;
                }
                String str8 = ageu.c;
                if (str8 != null) {
                    basg basg4 = (basg) o.b;
                    str8.getClass();
                    basg4.a |= 16;
                    basg4.f = str8;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu3 = (basu) aucd.b;
                basg basg5 = (basg) o.i();
                basg5.getClass();
                basu3.f = basg5;
                basu3.a |= 16;
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
                basu basu4 = (basu) aucd.b;
                basi basi2 = (basi) o2.i();
                basi2.getClass();
                basu4.q = basi2;
                basu4.a |= 4194304;
                amsv amsv = ageu.h;
                if (amsv != null) {
                    str5 = ((agfe) amsv.a()).a;
                }
                if (!TextUtils.isEmpty(str5)) {
                    base base = basu2.p;
                    if (base == null) {
                        base = base.c;
                    }
                    aucd aucd2 = (aucd) base.c(5);
                    aucd2.a((aucj) base);
                    if (!((base) aucd2.b).b.isEmpty()) {
                        String str9 = str5 + "::" + ((base) aucd2.b).b;
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        base base2 = (base) aucd2.b;
                        str9.getClass();
                        base2.a |= 1;
                        base2.b = str9;
                    } else {
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        base base3 = (base) aucd2.b;
                        str5.getClass();
                        base3.a |= 1;
                        base3.b = str5;
                    }
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    basu basu5 = (basu) aucd.b;
                    base base4 = (base) aucd2.i();
                    base4.getClass();
                    basu5.p = base4;
                    basu5.a |= 1048576;
                }
                basu basu6 = (basu) aucd.i();
                aucd aucd3 = (aucd) basu6.c(5);
                aucd3.a((aucj) basu6);
                if (!z) {
                    if (str3 == null) {
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        basu basu7 = (basu) aucd3.b;
                        basu7.a &= -5;
                        basu7.d = basu.s.d;
                    } else {
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        basu basu8 = (basu) aucd3.b;
                        str.getClass();
                        basu8.a |= 4;
                        basu8.d = str3;
                    }
                } else if (str3 == null) {
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu9 = (basu) aucd3.b;
                    basu9.a &= -65537;
                    basu9.n = basu.s.n;
                } else {
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu10 = (basu) aucd3.b;
                    str.getClass();
                    basu10.a |= 65536;
                    basu10.n = str3;
                }
                if (barb2 != null) {
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu11 = (basu) aucd3.b;
                    barb.getClass();
                    basu11.l = barb2;
                    basu11.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                }
                if (str4 != null) {
                    aucd o3 = base.c.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    base base5 = (base) o3.b;
                    str2.getClass();
                    base5.a |= 1;
                    base5.b = str4;
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    basu basu12 = (basu) aucd3.b;
                    base base6 = (base) o3.i();
                    base6.getClass();
                    basu12.p = base6;
                    basu12.a |= 1048576;
                }
                ((agno) this.d.a()).a((basu) aucd3.i());
                agnf agnf = this.c;
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
        ((anhn) ((anhn) a.c()).a("agks", "b", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("metric is null, skipping recorded metric for event: %s", (Object) str3);
    }

    public final void a(String str, boolean z, basu basu, barb barb) {
        a(str, z, basu, barb, (String) null);
    }

    public final void a(String str, boolean z, basu basu, barb barb, String str2) {
        if (!this.b.b) {
            aorl.a((Runnable) new agkr(this, str, z, basu, barb, str2), this.f);
        }
    }
}
