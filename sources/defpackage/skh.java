package defpackage;

import android.accounts.Account;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: skh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skh {
    public static final anij a = sjk.b();
    public final Map b;
    public final amqy c;
    public final amsv d;
    private final qyp e;
    private final Executor f;
    private final sjl g;

    public skh(Map map, amqy amqy, qyp qyp, Executor executor, amsv amsv, sjl sjl) {
        this.b = map;
        this.c = amqy;
        this.e = qyp;
        this.f = executor;
        this.d = amsv;
        this.g = sjl;
    }

    public static int a(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return 0;
        }
        return (i == 2 || i2 == 2) ? 2 : 1;
    }

    /* access modifiers changed from: package-private */
    public final int a(qxz qxz) {
        slq slq;
        boolean z;
        slr slr;
        String str = qxz.a;
        a.d().a("skh", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Dispatching task '%s'...", (Object) str);
        int lastIndexOf = str.lastIndexOf(95);
        int i = 0;
        if (lastIndexOf == -1) {
            slq = slq.UNKNOWN;
        } else {
            try {
                slq = slq.a(Integer.parseInt(str.substring(0, lastIndexOf)));
                if (slq == null) {
                    slq = slq.UNKNOWN;
                }
            } catch (NumberFormatException e2) {
                slq = slq.UNKNOWN;
            }
        }
        sls sls = null;
        if (slq != slq.UNKNOWN) {
            slr[] values = slr.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    slr = null;
                    break;
                }
                slr = values[i2];
                if (str.endsWith(slr.c)) {
                    break;
                }
                i2++;
            }
            if (slr != null) {
                sls = sls.a(slq, slr);
            }
        }
        if (sls == null) {
            anie c2 = sjk.a().c();
            c2.a((int) aygr.b());
            c2.a("skh", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Invalid task tag '%s'!", (Object) str);
            return 2;
        }
        slk slk = (slk) sls;
        slm slm = (slm) this.b.get(slk.a);
        if (slm != null) {
            a.d().a("skh", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Running singleton-scoped task '%s'...", (Object) sls);
            i = a(0, a(sls, slm));
            a.d().a("skh", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Singleton-scoped task '%s' finished with result '%d'!", (Object) sls, i);
            z = true;
        } else {
            z = false;
        }
        for (Account a2 : (List) this.d.a()) {
            slm slm2 = (slm) ((Map) this.c.a(a2)).get(slk.a);
            if (slm2 != null) {
                a.d().a("skh", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Running account-scoped task '%s'...", (Object) sls);
                i = a(i, a(sls, slm2));
                z = true;
            }
        }
        if (!z) {
            anie c3 = sjk.a().c();
            c3.a((int) aygr.b());
            c3.a("skh", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' has no registered task handlers!", (Object) sls);
            return 2;
        }
        a.d().a("skh", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' finished with result '%d'!", (Object) sls, i);
        return i;
    }

    public final int a(sls sls, slm slm) {
        aorr aorr;
        slq a2 = sls.a();
        try {
            int i = 3;
            if (aygr.g()) {
                qyq a3 = this.e.a(sls.a());
                skf skf = new skf(slm, sls);
                if (sls.b() != slr.PERIODIC) {
                    i = 2;
                }
                aorr = a3.a(skf, i, this.f);
            } else {
                qyq a4 = this.e.a(sls.a());
                skg skg = new skg(slm, sls);
                if (sls.b() != slr.PERIODIC) {
                    i = 2;
                }
                aorr = a4.a(skg, i, this.f);
            }
            aorr.get();
            this.g.a(2, a2);
            return 0;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            amrl.a((Object) cause, (Object) "Failed task must have a cause!");
            amtb.a(cause, InterruptedException.class);
            amtb.a(cause, slo.class);
            amtb.a(cause, sln.class);
            amtb.a(cause, afuj.class);
            amtb.a(cause, afug.class);
            amtb.a(cause);
            throw new IllegalStateException("Task failed with an unknown checked exception!", cause);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            this.g.a(6, a2);
            return 1;
        } catch (afuj e4) {
            this.g.a(11, a2);
            sjk.b().c().a("skh", "a", 154, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' failed with disabled!", (Object) sls);
            return 2;
        } catch (afug e5) {
            this.g.a(10, a2);
            sjk.b().c().a("skh", "a", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' failed with sync constraints not met!", (Object) sls);
            return 1;
        } catch (slo e6) {
            this.g.a(9, a2);
            anie c2 = sjk.a().c();
            c2.a((int) aygr.c());
            c2.a((Throwable) e6);
            c2.a("skh", "a", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' failed with a recoverable error!", (Object) sls);
            return 1;
        } catch (sln e7) {
            this.g.a(5, a2);
            anie c3 = sjk.a().c();
            c3.a((int) aygr.c());
            c3.a((Throwable) e7);
            c3.a("skh", "a", 176, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' failed with an internal error!", (Object) sls);
            return 2;
        } catch (RuntimeException e8) {
            this.g.a(12, a2);
            anie c4 = sjk.a().c();
            c4.a((int) aygr.b());
            c4.a((Throwable) e8);
            c4.a("skh", "a", 184, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' failed with an unexpected error!", (Object) sls);
            return 2;
        }
    }
}
