package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.HashMap;

/* renamed from: btd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btd {
    public final bsz a;
    public HashMap b;
    protected atnh c;
    private HashMap d;
    private long e = 0;

    public btd(bsz bsz) {
        this.a = bsz;
        b();
    }

    private final void b() {
        this.d = new HashMap();
        this.b = new HashMap();
    }

    public final int a(int i, int i2, ContextManagerClientInfo contextManagerClientInfo) {
        boolean z;
        boolean z2;
        atnd atnd;
        if (i2 > 99999) {
            return 1;
        }
        int i3 = 3;
        if (awuz.a.a().ad() && !contextManagerClientInfo.e() && (i == 0 || i == 3)) {
            return 1;
        }
        btc btc = (btc) this.d.get(btb.a(jtj.b(i2)));
        if (!"com.google.android.gms".equals(contextManagerClientInfo.b)) {
            z = false;
        } else {
            z = i == 0 || i == 1;
        }
        if (btc == null && z) {
            btc = new btc(jtj.b(i2));
        }
        if (awup.a.a().d() && z) {
            return btc.a(i, contextManagerClientInfo);
        }
        if (i == 2) {
            z2 = false;
        } else if (i != 1) {
            if (cbi.i().a() - this.e > awuz.a.a().c()) {
                a();
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                btc = (btc) this.d.get(btb.a(jtj.b(i2)));
            }
        } else {
            z2 = false;
        }
        if (btc == null) {
            ((anih) ((anih) bxk.a.c()).a("btd", "a", 502, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AclManager] null policy map (%s) %s, clientInfo=%s", (Object) Integer.toString(i), (Object) Integer.toString(i2), (Object) contextManagerClientInfo);
            if (!z2) {
                new Object[1][0] = this.a;
                a();
            }
            return 3;
        }
        if (z) {
            i3 = btc.a(i, contextManagerClientInfo);
        } else {
            int a2 = btc.a(i, contextManagerClientInfo);
            if (!(a2 == 1 || a2 == 6) || btc.a[i] || ((atnd = (atnd) btc.b.get(contextManagerClientInfo.b)) != null && btf.a(i, atnd))) {
                i3 = a2;
            }
        }
        if (!(i == 2 || i3 == 1 || i3 == 6)) {
            ((anih) ((anih) bxk.a.c()).a("btd", "a", 523, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AclManager] No %s for %s. Was: %s for %s, %s", Integer.toString(i), contextManagerClientInfo, Integer.toString(i3), Integer.toString(i2), this.a);
        }
        return i3;
    }

    public final void a() {
        atnh atnh;
        int i;
        bsz bsz = this.a;
        if (!bsz.b() && !cbi.y().b(bsz)) {
            new Object[1][0] = bsz;
            long a2 = cbi.i().a();
            atng atng = (atng) atnh.d.o();
            if (atng.c) {
                atng.c();
                atng.c = false;
            }
            atnh atnh2 = (atnh) atng.b;
            atnh2.a |= 1;
            atnh2.c = a2;
            atnh = (atnh) atng.i();
        } else if (bsz.b()) {
            if (!awup.b().b.isEmpty()) {
                atnh b2 = awup.b();
                aucd aucd = (aucd) b2.c(5);
                aucd.a((aucj) b2);
                atng atng2 = (atng) aucd;
                long a3 = cbi.i().a();
                if (atng2.c) {
                    atng2.c();
                    atng2.c = false;
                }
                atnh atnh3 = (atnh) atng2.b;
                atnh atnh4 = atnh.d;
                atnh3.a |= 1;
                atnh3.c = a3;
                atnh = (atnh) atng2.i();
            } else {
                atnh = btr.b();
            }
        } else if (!awup.c().b.isEmpty()) {
            atnh c2 = awup.c();
            aucd aucd2 = (aucd) c2.c(5);
            aucd2.a((aucj) c2);
            atng atng3 = (atng) aucd2;
            long a4 = cbi.i().a();
            if (atng3.c) {
                atng3.c();
                atng3.c = false;
            }
            atnh atnh5 = (atnh) atng3.b;
            atnh atnh6 = atnh.d;
            atnh5.a |= 1;
            atnh5.c = a4;
            atnh = (atnh) atng3.i();
        } else {
            atnh = btr.a();
        }
        atnh atnh7 = this.c;
        if (atnh7 == null || !atnh.b.equals(atnh7.b)) {
            this.c = atnh;
            b();
            atnh atnh8 = this.c;
            aucx aucx = atnh8.b;
            int size = aucx.size();
            int i2 = 0;
            while (i2 < size) {
                atow atow = (atow) aucx.get(i2);
                atoy atoy = atow.b;
                if (atoy == null) {
                    atoy = atoy.d;
                }
                atjv a5 = atjv.a(atoy.c);
                if (a5 == null) {
                    a5 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                atoy atoy2 = atow.b;
                if (atoy2 == null) {
                    atoy2 = atoy.d;
                }
                int a6 = atjo.a(atoy2.b);
                if (a6 == 0) {
                    a6 = 1;
                }
                btb btb = new btb(a5, a6);
                btc btc = (btc) this.d.get(btb);
                HashMap hashMap = this.b;
                atqv atqv = atow.d;
                if (atqv == null) {
                    atqv = atqv.c;
                }
                atqx a7 = atqx.a(atqv.b);
                if (a7 == null) {
                    a7 = atqx.UNKNOWN_SYNC_TYPE;
                }
                hashMap.put(btb, a7);
                if (btc == null) {
                    atoy atoy3 = atow.b;
                    if (atoy3 == null) {
                        atoy3 = atoy.d;
                    }
                    atjv a8 = atjv.a(atoy3.c);
                    if (a8 == null) {
                        a8 = atjv.UNKNOWN_CONTEXT_NAME;
                    }
                    btc = new btc(a8);
                    this.d.put(btb, btc);
                }
                btc.a();
                aucx aucx2 = atow.c;
                int size2 = aucx2.size();
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 >= size2) {
                        break;
                    }
                    atnf atnf = (atnf) aucx2.get(i3);
                    atpd atpd = atnf.b;
                    if (atpd == null) {
                        atpd = atpd.d;
                    }
                    int a9 = atpc.a(atpd.b);
                    if (a9 == 0) {
                        a9 = 1;
                    }
                    atnb atnb = atnf.c;
                    if (atnb == null) {
                        atnb = atnb.c;
                    }
                    atnd a10 = atnd.a(atnb.b);
                    if (a10 == null) {
                        a10 = atnd.UNKNOWN_ACCESS_TYPE;
                    }
                    if (a9 != 3) {
                        HashMap hashMap2 = btc.b;
                        atpd atpd2 = atnf.b;
                        if (atpd2 == null) {
                            atpd2 = atpd.d;
                        }
                        hashMap2.put(atpd2.c, a10);
                    } else {
                        for (int i4 = 0; i4 < 5; i4++) {
                            if (btf.a(i4, a10)) {
                                btc.a[i4] = true;
                            }
                        }
                    }
                    i3++;
                }
                i2 = i;
            }
            this.e = atnh8.c;
        }
    }

    public final boolean a(atjv atjv) {
        int ordinal;
        atqx atqx = (atqx) this.b.get(btb.a(atjv));
        if (atqx == null || (ordinal = atqx.ordinal()) == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return this.a.b();
        }
        if (ordinal != 4) {
            ((anih) ((anih) bxk.a.b()).a("btd", "a", 450, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AclManager] Unknown SyncType %s", (Object) atqx);
            return false;
        } else if (!this.a.b()) {
            return true;
        } else {
            return false;
        }
    }
}
