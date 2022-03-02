package defpackage;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: afep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afep implements afft {
    private static final auay a = auay.a("bc", amqn.c);
    private static final auay b = auay.a("rdc", amqn.c);
    private static final auay c = auay.a("dc", amqn.c);
    private static final auay d = auay.a("scdrc", amqn.c);
    private static final auay e = auay.a("scdc", amqn.c);
    private static final auay f = auay.a("scts", amqn.c);
    private static final auay g = auay.a("cpnts");
    private static final auay h = auay.a("npnts");
    private static final anaf i;
    private static final anaf j;
    private final afch k;

    static {
        anab h2 = anaf.h();
        h2.a(aomv.SYNC_TRIGGER_UNKNOWN, auay.a("ustdc"));
        h2.a(aomv.SYNC_TRIGGER_MANUAL, auay.a("mstdc"));
        h2.a(aomv.SYNC_TRIGGER_TIMER, auay.a("tstdc"));
        h2.a(aomv.SYNC_TRIGGER_SUBSCRIPTION, auay.a("sstdc"));
        h2.a(aomv.SYNC_TRIGGER_PUSH_NOTIFICATION, auay.a("pnstdc"));
        h2.a(aomv.SYNC_TRIGGER_READ, auay.a("rstdc"));
        h2.a(aomv.SYNC_TRIGGER_WRITE, auay.a("wstdc"));
        i = anet.a((Map) h2.a());
        anab anab = new anab();
        anhj a2 = i.entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            aomv aomv = (aomv) entry.getKey();
            String valueOf = String.valueOf(((auay) entry.getValue()).l());
            anab.a(aomv, auay.a(valueOf.length() == 0 ? new String("sc") : "sc".concat(valueOf)));
        }
        j = anab.a();
    }

    public afep(afch afch) {
        this.k = afch;
    }

    private final affr a(auay auay, auay auay2, Map map) {
        afdo a2;
        try {
            a2 = this.k.a().a();
            long a3 = afgi.a(this.k.a(a2, auay), 0);
            long a4 = afgi.a(this.k.a(a2, auay2), 0);
            Class<aomv> cls = aomv.class;
            amrl.a((Object) cls);
            EnumMap enumMap = new EnumMap(cls);
            for (Map.Entry entry : map.entrySet()) {
                enumMap.put((aomv) entry.getKey(), Long.valueOf(afgi.a(this.k.a(a2, (auay) entry.getValue()), 0)));
            }
            affq e2 = affr.e();
            e2.a(a3);
            e2.b(a4);
            e2.a(anet.a((Map) enumMap));
            affr a5 = e2.a();
            a2.close();
            return a5;
        } catch (IOException e3) {
            throw afdm.a(e3);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final affr b() {
        return a(b, c, i);
    }

    public final affr c() {
        return a(d, e, j);
    }

    public final void close() {
        this.k.close();
    }

    public final Long d() {
        return a(f);
    }

    public final Long e() {
        afdp b2;
        try {
            b2 = this.k.a().b();
            Long b3 = afgi.b(this.k.a((afdo) b2, g));
            this.k.a(b2, h);
            b2.b();
            b2.close();
            return b3;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void f() {
        afdp b2;
        try {
            b2 = this.k.a().b();
            this.k.b(b2, auay.b, (auay) null);
            b2.b();
            b2.close();
            return;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private final Long a(auay auay) {
        afdo a2;
        try {
            a2 = this.k.a().a();
            Long b2 = afgi.b(this.k.a(a2, auay));
            a2.close();
            return b2;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Long a() {
        return a(a);
    }

    public final void a(long j2) {
        afdp b2;
        try {
            b2 = this.k.a().b();
            if (this.k.a((afdo) b2, g) == null) {
                this.k.a(b2, g, afgi.a(j2));
            }
            if (this.k.a((afdo) b2, h) == null) {
                this.k.a(b2, h, afgi.a(j2));
            }
            b2.b();
            b2.close();
            return;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(long j2, long j3) {
        afdp b2;
        try {
            b2 = this.k.a().b();
            this.k.a(b2, a, afgi.a(j2));
            this.k.a(b2, b, afgi.a(0));
            this.k.a(b2, c, afgi.a(0));
            anhj a2 = i.values().iterator();
            while (a2.hasNext()) {
                this.k.a(b2, (auay) a2.next(), afgi.a(0));
            }
            this.k.a(b2, d, afgi.a(0));
            this.k.a(b2, e, afgi.a(0));
            anhj a3 = j.values().iterator();
            while (a3.hasNext()) {
                this.k.a(b2, (auay) a3.next(), afgi.a(0));
            }
            this.k.a(b2, f, afgi.a(j3));
            this.k.a(b2, g);
            this.k.a(b2, h);
            b2.b();
            b2.close();
            return;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(long j2, affr affr) {
        afdp b2;
        try {
            b2 = this.k.a().b();
            this.k.a(b2, f, afgi.a(j2));
            this.k.a(b2, d, afgi.a(affr.a()));
            this.k.a(b2, e, afgi.a(affr.b()));
            anhj a2 = affr.c().entrySet().iterator();
            while (a2.hasNext()) {
                Map.Entry entry = (Map.Entry) a2.next();
                aomv aomv = (aomv) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                auay auay = (auay) j.get(aomv);
                amrl.a((Object) auay, "Unsupported sync trigger %s!", (Object) aomv);
                this.k.a(b2, auay, afgi.a(longValue));
            }
            Long b3 = afgi.b(this.k.a((afdo) b2, h));
            if (b3 != null) {
                this.k.a(b2, g, afgi.a(b3.longValue()));
            } else {
                this.k.a(b2, g);
            }
            b2.b();
            b2.close();
            return;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(affr affr) {
        afdp b2;
        try {
            b2 = this.k.a().b();
            this.k.a(b2, b, afgi.a(affr.a()));
            this.k.a(b2, c, afgi.a(affr.b()));
            anhj a2 = affr.c().entrySet().iterator();
            while (a2.hasNext()) {
                Map.Entry entry = (Map.Entry) a2.next();
                aomv aomv = (aomv) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                auay auay = (auay) i.get(aomv);
                amrl.a((Object) auay, "Unsupported sync trigger %s!", (Object) aomv);
                this.k.a(b2, auay, afgi.a(longValue));
            }
            b2.b();
            b2.close();
            return;
        } catch (IOException e2) {
            throw afdm.a(e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
