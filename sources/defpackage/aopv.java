package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aopv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aopv extends aopz {
    private static final Logger c = Logger.getLogger(aopv.class.getName());
    public amzn a;
    private final boolean d;
    private final boolean e;

    public aopv(amzn amzn, boolean z, boolean z2) {
        super(amzn.size());
        amrl.a((Object) amzn);
        this.a = amzn;
        this.d = z;
        this.e = z2;
    }

    private static boolean a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void b(Throwable th) {
        amrl.a((Object) th);
        if (this.d && !a(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set b = angm.b();
                a(b);
                aopz.b.a(this, b);
                set = this.seenExceptions;
            }
            if (a(set, th)) {
                c(th);
                return;
            }
        }
        if (th instanceof Error) {
            c(th);
        }
    }

    private static void c(Throwable th) {
        String str;
        if (!(th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    public abstract void a(int i, Object obj);

    /* access modifiers changed from: protected */
    public final String aK() {
        amzn amzn = this.a;
        if (amzn == null) {
            return super.aK();
        }
        String valueOf = String.valueOf(amzn);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List, amzn] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.List, amzn] */
    /* access modifiers changed from: package-private */
    public final void f() {
        amzn amzn;
        if (!this.a.isEmpty()) {
            int i = 0;
            if (this.d) {
                ? r0 = this.a;
                int size = r0.size();
                int i2 = 0;
                while (i < size) {
                    aorr aorr = (aorr) r0.get(i);
                    aorr.a(new aops(this, aorr, i2), aoqm.a);
                    i++;
                    i2++;
                }
                return;
            }
            if (this.e) {
                amzn = this.a;
            } else {
                amzn = null;
            }
            aopt aopt = new aopt(this, amzn);
            ? r02 = this.a;
            int size2 = r02.size();
            while (i < size2) {
                ((aorr) r02.get(i)).a(aopt, aoqm.a);
                i++;
            }
            return;
        }
        g();
    }

    public abstract void g();

    public final void a(int i, Future future) {
        try {
            a(i, aorl.a(future));
        } catch (ExecutionException e2) {
            b(e2.getCause());
        } catch (Throwable th) {
            b(th);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, amzn] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.amzn r6) {
        /*
            r5 = this;
            aopw r0 = defpackage.aopz.b
            int r0 = r0.a(r5)
            r1 = 0
            if (r0 < 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            java.lang.String r3 = "Less than 0 remaining futures"
            defpackage.amrl.b((boolean) r2, (java.lang.Object) r3)
            if (r0 != 0) goto L_0x003d
            if (r6 == 0) goto L_0x0032
            int r0 = r6.size()
            r2 = 0
        L_0x001b:
            if (r1 >= r0) goto L_0x0032
            java.lang.Object r3 = r6.get(r1)
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            boolean r4 = r3.isCancelled()
            if (r4 == 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r5.a((int) r2, (java.util.concurrent.Future) r3)
        L_0x002d:
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L_0x001b
        L_0x0032:
            r6 = 0
            r5.seenExceptions = r6
            r5.g()
            aopu r6 = defpackage.aopu.ALL_INPUT_FUTURES_PROCESSED
            r5.a((defpackage.aopu) r6)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopv.a(amzn):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, amzn] */
    /* access modifiers changed from: protected */
    public final void b() {
        ? r0 = this.a;
        a(aopu.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (r0 != 0)) {
            boolean d2 = d();
            int size = r0.size();
            for (int i = 0; i < size; i++) {
                ((Future) r0.get(i)).cancel(d2);
            }
        }
    }

    public void a(aopu aopu) {
        amrl.a((Object) aopu);
        this.a = null;
    }

    public final void a(Set set) {
        amrl.a((Object) set);
        if (!isCancelled()) {
            a(set, e());
        }
    }
}
