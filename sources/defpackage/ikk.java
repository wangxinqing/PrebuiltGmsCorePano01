package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.logging.Level;

/* renamed from: ikk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ikk implements Runnable {
    private final ikl a;
    private final anir b;

    public ikk(ikl ikl, anir anir) {
        this.a = ikl;
        this.b = anir;
    }

    public final void run() {
        aoiq aoiq;
        aucd aucd;
        ikl ikl = this.a;
        anir anir = this.b;
        if (ikl.b == null) {
            ikl.b = new ikm(ikl.c, new aqcs("com.google.android.gms", "20.12.16 (080306-{{cl}})"), new ikn(ikl.a));
        }
        ikm ikm = ikl.b;
        ikn ikn = ikm.c;
        if (awya.a.a().a() && anir.k().b(jjg.a) != null && ((Integer) anir.k().b(jjg.a)).intValue() != 0 && ikn.a()) {
            aqcs aqcs = ikm.b;
            String a2 = aqcs.a(anir);
            Throwable th = (Throwable) anir.k().b(anhs.a);
            if ((a2 == null || a2.isEmpty()) && th == null) {
                aoiq = null;
            } else {
                anhy f = anir.f();
                Level c = anir.c();
                String a3 = f.a();
                String b2 = f.b();
                aucd o = aoiq.i.o();
                aogc aogc = aqcs.a;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoiq aoiq2 = (aoiq) o.b;
                aogc.getClass();
                aoiq2.b = aogc;
                aoiq2.a |= 1;
                String name = Thread.currentThread().getName();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoiq aoiq3 = (aoiq) o.b;
                name.getClass();
                aoiq3.a |= 2;
                aoiq3.c = name;
                int intValue = c.intValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoiq aoiq4 = (aoiq) o.b;
                int i = aoiq4.a | 4;
                aoiq4.a = i;
                aoiq4.d = intValue;
                a3.getClass();
                int i2 = i | 8;
                aoiq4.a = i2;
                aoiq4.e = a3;
                b2.getClass();
                int i3 = i2 | 16;
                aoiq4.a = i3;
                aoiq4.f = b2;
                if (a2 != null) {
                    a2.getClass();
                    aoiq4.a = i3 | 64;
                    aoiq4.g = a2;
                }
                if (th != null) {
                    aucd o2 = aoit.d.o();
                    aucd a4 = aonq.a(th);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aoit aoit = (aoit) o2.b;
                    aois aois = (aois) a4.i();
                    aois.getClass();
                    aoit.b = aois;
                    aoit.a |= 1;
                    while (true) {
                        Throwable cause = th.getCause();
                        if (!(cause == null || cause == th)) {
                            aucd a5 = aonq.a(th.getCause());
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aoit aoit2 = (aoit) o2.b;
                            aois aois2 = (aois) a5.i();
                            aois2.getClass();
                            if (!aoit2.c.a()) {
                                aoit2.c = aucj.a(aoit2.c);
                            }
                            aoit2.c.add(aois2);
                            th = th.getCause();
                        }
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aoiq aoiq5 = (aoiq) o.b;
                    aoit aoit3 = (aoit) o2.i();
                    aoit3.getClass();
                    aoiq5.h = aoit3;
                    aoiq5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                aoiq = (aoiq) o.i();
            }
            if (aoiq != null) {
                aucd = anir.g() != null ? aqcs.a(aoiq, anir.h()) : aqcs.a(aoiq, new Object[0]);
            } else {
                aucd = null;
            }
            if (aucd != null) {
                String d = anir.f().d();
                if (d != null) {
                    aucd o3 = aqda.c.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aqda aqda = (aqda) o3.b;
                    d.getClass();
                    aqda.a |= 1;
                    aqda.b = d;
                    auay au = ((aqda) o3.i()).au();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aqcx aqcx = (aqcx) aucd.b;
                    aqcx aqcx2 = aqcx.f;
                    au.getClass();
                    aqcx.a |= 8;
                    aqcx.d = au;
                }
                iyc a6 = iyc.a(((Integer) anir.k().b(jjg.a)).intValue());
                hol hol = (hol) ikm.a.get(a6);
                if (hol == null) {
                    iki iki = ikm.d;
                    String valueOf = String.valueOf(a6.name());
                    hol hol2 = new hol(iki.a, valueOf.length() == 0 ? new String("CLIENT_LOGGING_GMSCORE_") : "CLIENT_LOGGING_GMSCORE_".concat(valueOf), (String) null);
                    ikm.a.put(a6, hol2);
                    hol = hol2;
                }
                hoi a7 = hol.a(((aqcx) aucd.i()).k());
                a7.b(aqcs.b(anir));
                a7.b();
            }
        }
    }
}
