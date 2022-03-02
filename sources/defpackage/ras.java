package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: ras  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ras implements qyp {
    public final afji a;
    public final amqy b;
    public final amsv c;
    public final amsv d;
    private final anij e;
    private final anaf f;
    private final Executor g;
    private final aftv h;
    private final afza i;
    private final aftw j;
    private final Object k = new Object();
    private final Map l = new HashMap();
    private final Map m = new HashMap();
    private final Map n = new HashMap();
    private final rbk o;
    private final rbd p;
    private final rbh q;

    public ras(rbk rbk, afji afji, amqy amqy, anaf anaf, amsv amsv, Executor executor, aftv aftv, rbd rbd, amsv amsv2, afza afza, rbh rbh, aftw aftw) {
        this.o = rbk;
        this.a = afji;
        this.e = jjg.a("GmsSyncPolicyEngine", iyc.MDI_SYNC);
        this.b = amqy;
        this.f = anaf;
        this.c = amsv;
        this.g = executor;
        this.h = aftv;
        this.p = rbd;
        this.d = amsv2;
        this.i = afza;
        this.q = rbh;
        this.j = aftw;
        if (afza != null) {
            amrl.a((Object) rbh, (Object) "If syncMetadataManagerFactory is provided, also a syncMetadataUriHelper needs to be provided.");
        }
    }

    public static rau a(rav rav) {
        amsv d2 = rav.d();
        amrl.a((Object) d2);
        return new rau((auop) d2.a());
    }

    private final qyq b(raq raq) {
        qyq qyq;
        amsv amsv;
        rae rae;
        rar rar;
        aftw aftw;
        aftm aftm;
        aftm aftm2;
        afjl afjl;
        afjl afjl2;
        raq raq2 = raq;
        rav b2 = b(((qym) raq2).a);
        synchronized (this.k) {
            qyq = (qyq) this.l.get(raq2);
            if (qyq == null) {
                amqy amqy = this.b;
                if (amqy == null) {
                    amsv d2 = b2.d();
                    amrl.a((Object) d2);
                    amsv = rau.a(d2);
                } else {
                    amsv = rau.a((amsv) new qzt(amqy, raq2));
                }
                auco auco = ((qym) raq2).a;
                rbk rbk = this.o;
                aftv aftv = this.h;
                afym a2 = d() ? a(raq) : null;
                if (ayhd.a.a().e()) {
                    rae = new rae(this, raq2);
                } else {
                    rae = rag.a;
                }
                aftw aftw2 = this.j;
                Account e2 = raq.e();
                if (e2 != null) {
                    aftm aftm3 = (aftm) this.n.get(e2);
                    if (aftm3 != null) {
                        rar = rae;
                        aftw = aftw2;
                        aftm = aftm3;
                    } else {
                        rbd rbd = this.p;
                        Context context = rbd.a;
                        String str = rbd.b;
                        String str2 = rbd.c;
                        aftw = aftw2;
                        aekn aekn = rbd.d;
                        amqy amqy2 = rbd.e;
                        if (!aygo.c()) {
                            rar = rae;
                            aftj a3 = aftj.a(context.getPackageName(), (String) null, str2);
                            if (!aygo.b()) {
                                afjl2 = afjn.a(aekn, e2.toString(), rbk.b());
                            } else {
                                afjl2 = afjn.b(aekn, e2.toString(), rbk.b());
                            }
                            aftm2 = new aftm(a3, afjl2, (amsv) amqy2.a(e2));
                        } else {
                            rar = rae;
                            aftj a4 = aftj.a(context.getPackageName(), str, str2);
                            if (!aygo.b()) {
                                afjl = afjn.a(aekn, e2.toString(), rbk.b());
                            } else {
                                afjl = afjn.b(aekn, e2.toString(), rbk.b());
                            }
                            aftm2 = new aftm(a4, afjl, 3002, (amsv) amqy2.a(e2), true);
                        }
                        this.n.put(e2, aftm2);
                        aftm = aftm2;
                    }
                } else {
                    rar = rae;
                    aftw = aftw2;
                    aftm = null;
                }
                qzs qzs = new qzs(auco, rbk, amsv, b2, aftv, a2, rar, aftw, aftm);
                this.l.put(raq, qzs);
                qyq = qzs;
            }
        }
        return qyq;
    }

    private final boolean d() {
        return (this.i == null || this.q == null) ? false : true;
    }

    private final boolean i(auco auco) {
        rav b2 = b(auco);
        rau a2 = this.b == null ? a(b2) : f(auco);
        if (!a2.a(2)) {
            this.a.a().a("ras", "i", 569, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("One time sync %d disabled", auco.a());
            return false;
        }
        qxf qxf = new qxf();
        qxf.i = b2.a();
        qxf.k = b2.c();
        qxf.a(0, 0);
        auop auop = a2.a;
        if (auop != null) {
            auoi auoi = auop.b;
            if (auoi == null) {
                auoi = auoi.d;
            }
            if ((auoi.a & 1) != 0) {
                auoi auoi2 = a2.a.b;
                if (auoi2 == null) {
                    auoi2 = auoi.d;
                }
                aunn aunn = auoi2.b;
                if (aunn == null) {
                    aunn = aunn.c;
                }
                auno auno = aunn.b;
                if (auno == null) {
                    auno = auno.c;
                }
                aubn aubn = auno.a;
                if (aubn == null) {
                    aubn = aubn.c;
                }
                long a3 = augi.a(aubn);
                auno auno2 = aunn.b;
                if (auno2 == null) {
                    auno2 = auno.c;
                }
                aubn aubn2 = auno2.b;
                if (aubn2 == null) {
                    aubn2 = aubn.c;
                }
                qxf.a(a3, augi.a(aubn2));
                auoh auoh = aunn.a;
                if (auoh == null) {
                    auoh = auoh.l;
                }
                rau.a(auoh, qxf);
                ((qwq) this.c.a()).a((qxx) qxf.b());
                auco.a();
                return true;
            }
        }
        throw new IllegalStateException("One-time sync policy is not enabled");
    }

    public final aorr e(auco auco) {
        return aorl.a((Callable) new qzx(this, auco), this.g);
    }

    public final rau f(auco auco) {
        return new rau((auop) this.b.a(auco));
    }

    public final aorr c(auco auco) {
        return aorl.a((Object) a(raq.a(auco, (Account) null)));
    }

    public final aorr d(auco auco) {
        return aorl.a((Object) a(raq.a(auco)));
    }

    public final int a(afud afud) {
        rau rau;
        if (this.b == null) {
            rav rav = (rav) this.f.get(afud.a());
            rau = rav == null ? new rau((auop) null) : a(rav);
        } else {
            rau = f(afud.a());
        }
        auoa b2 = rau.b(afud.c());
        try {
            amzy amzy = (amzy) afud.b().get();
            rbl a2 = rbl.a();
            anhk i2 = amzy.listIterator();
            int i3 = 0;
            while (i2.hasNext()) {
                int a3 = a2.a(b2, (aorr) i2.next(), (amqy) null);
                i3 = (i3 == 1 || a3 == 1) ? 1 : (i3 == 2 || a3 == 2) ? 2 : 0;
            }
            afud.a().a();
            afud.c();
            return i3;
        } catch (InterruptedException | ExecutionException e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            int a4 = rbl.a().a(b2, afud.b(), (amqy) null);
            afud.a().a();
            afud.c();
            return a4;
        }
    }

    public final void c() {
        anhj a2 = this.f.entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            auco auco = (auco) entry.getKey();
            rav rav = (rav) entry.getValue();
            rau a3 = this.b == null ? a(rav) : f(auco);
            if (!a3.a(3)) {
                this.a.a().a("ras", "c", 532, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Periodic sync %d disabled", auco.a());
            } else {
                try {
                    qxi qxi = new qxi();
                    qxi.i = rav.a();
                    qxi.k = rav.b();
                    auop auop = a3.a;
                    if (auop != null) {
                        auoi auoi = auop.b;
                        if (auoi == null) {
                            auoi = auoi.d;
                        }
                        if ((auoi.a & 2) != 0) {
                            auoi auoi2 = a3.a.b;
                            if (auoi2 == null) {
                                auoi2 = auoi.d;
                            }
                            aunp aunp = auoi2.c;
                            if (aunp == null) {
                                aunp = aunp.c;
                            }
                            aunq aunq = aunp.b;
                            if (aunq == null) {
                                aunq = aunq.d;
                            }
                            aubn aubn = aunq.b;
                            if (aubn == null) {
                                aubn = aubn.c;
                            }
                            qxi.a = augi.a(aubn);
                            aunq aunq2 = aunp.b;
                            if (aunq2 == null) {
                                aunq2 = aunq.d;
                            }
                            if ((aunq2.a & 2) != 0) {
                                aunq aunq3 = aunp.b;
                                if (aunq3 == null) {
                                    aunq3 = aunq.d;
                                }
                                aubn aubn2 = aunq3.c;
                                if (aubn2 == null) {
                                    aubn2 = aubn.c;
                                }
                                qxi.b = augi.a(aubn2);
                            }
                            auoh auoh = aunp.a;
                            if (auoh == null) {
                                auoh = auoh.l;
                            }
                            rau.a(auoh, qxi);
                            ((qwq) this.c.a()).a((qxx) qxi.b());
                            auco.a();
                        }
                    }
                    throw new IllegalStateException("Periodic sync policy is not enabled");
                } catch (IllegalArgumentException e2) {
                    if (rbk.f()) {
                        anie c2 = this.a.c();
                        c2.a((Throwable) e2);
                        ((anih) ((anih) c2).a("ras", "c", 540, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling periodic sync %d failed", auco.a());
                    } else {
                        anie b2 = this.e.b();
                        b2.a((Throwable) e2);
                        b2.a("ras", "c", 543, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling periodic sync %d failed", auco.a());
                    }
                }
            }
        }
    }

    public final afud a(auco auco, adet adet, int i2, Executor executor) {
        if (!rbk.h()) {
            adet.getClass();
            return afud.a(auco, i2, aopr.a(aopr.a(aorl.a((aoqa) new rak(adet), executor), (amqy) new ral(this, auco, i2, adet, executor), executor), (aoqb) new ram(adet, executor), (Executor) aoqm.a));
        }
        rap rap = new rap(adet);
        rap.getClass();
        return afud.a(auco, i2, aopr.a(aopr.a(aorl.a((aoqa) new ran(rap), executor), (amqy) new qzu(this, auco, i2, rap, executor), executor), (aoqb) new qzv(rap, executor), (Executor) aoqm.a));
    }

    public final aorr b(auco auco, Account account) {
        return aorl.a((Object) a(raq.a(auco, account)));
    }

    public final afym a(raq raq) {
        afym afym;
        Uri uri;
        if (d()) {
            synchronized (this.k) {
                afym = (afym) this.m.get(raq);
                if (afym == null) {
                    if (!((qym) raq).b) {
                        rbh rbh = this.q;
                        auco auco = ((qym) raq).a;
                        Account e2 = raq.e();
                        agzz a2 = ahaa.a(rbh.a);
                        a2.b();
                        a2.a(rbh.b);
                        if (e2 != null) {
                            a2.a(e2);
                        }
                        String str = rbh.c;
                        int a3 = auco.a();
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("syncid_");
                        sb.append(a3);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(str.length() + 2 + String.valueOf(sb2).length() + 10);
                        sb3.append(str);
                        sb3.append("/");
                        sb3.append(sb2);
                        sb3.append("/subid_none");
                        a2.b(sb3.toString());
                        uri = a2.a();
                    } else {
                        rbh rbh2 = this.q;
                        auco auco2 = ((qym) raq).a;
                        agzz a4 = ahaa.a(rbh2.a);
                        a4.b();
                        a4.a(rbh2.b);
                        String str2 = rbh2.c;
                        int a5 = auco2.a();
                        StringBuilder sb4 = new StringBuilder(18);
                        sb4.append("syncid_");
                        sb4.append(a5);
                        String sb5 = sb4.toString();
                        StringBuilder sb6 = new StringBuilder(str2.length() + 14 + String.valueOf(sb5).length() + 10);
                        sb6.append(str2);
                        sb6.append("/allAccounts/");
                        sb6.append(sb5);
                        sb6.append("/subid_none");
                        a4.b(sb6.toString());
                        uri = a4.a();
                    }
                    afym = this.i.a(uri);
                    this.m.put(raq, afym);
                }
            }
            return afym;
        }
        throw new IllegalStateException("Cannot get SyncMetadataManager when stats have not been enabeld.");
    }

    public final rav b(auco auco) {
        rav rav = (rav) this.f.get(auco);
        if (rav != null) {
            return rav;
        }
        throw new IllegalArgumentException(String.format("Unknown sync id %d", new Object[]{Integer.valueOf(auco.a())}));
    }

    public final void b() {
        try {
            c();
        } catch (RuntimeException e2) {
            if (rbk.f()) {
                anie c2 = this.a.c();
                c2.a((Throwable) e2);
                ((anih) ((anih) c2).a("ras", "b", 516, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling periodic syncs failed");
                return;
            }
            anie b2 = this.e.b();
            b2.a((Throwable) e2);
            b2.a("ras", "b", 518, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling periodic syncs failed");
        }
    }

    public final aorr a() {
        return aorl.a((Callable) new qzw(this), this.g);
    }

    /* renamed from: a */
    public final qyq h(auco auco) {
        return b(raq.a(auco, (Account) null));
    }

    /* renamed from: a */
    public final qyq c(auco auco, Account account) {
        return b(raq.a(auco, account));
    }
}
