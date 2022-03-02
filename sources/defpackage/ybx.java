package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: ybx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ybx implements ybw {
    ;
    
    private anax b;
    private anax c;
    private anaf d;

    private ybx(String str) {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    private static void b() {
        if (aywv.c() && ycm.f.nextDouble() < aywv.d()) {
            aucd o = xod.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xod xod = (xod) o.b;
            xod.b = 1;
            xod.a = 1 | xod.a;
            xod xod2 = (xod) o.i();
            aucd o2 = xol.w.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xol xol = (xol) o2.b;
            xod2.getClass();
            xol.p = xod2;
            xol.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            wmm.a();
            wmm.a((String) null, o2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.anax a(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = defpackage.aywv.b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003b
            anax r0 = r2.c     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0035
            anax r3 = r2.b(r3)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0032
            anav r0 = defpackage.anax.j()     // Catch:{ all -> 0x0041 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0019:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0041 }
            android.accounts.Account r1 = (android.accounts.Account) r1     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x0041 }
            r0.b(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0019
        L_0x002b:
            anax r3 = r0.a()     // Catch:{ all -> 0x0041 }
            r2.c = r3     // Catch:{ all -> 0x0041 }
            goto L_0x0038
        L_0x0032:
            r3 = 0
        L_0x0033:
            monitor-exit(r2)
            return r3
        L_0x0035:
            b()     // Catch:{ all -> 0x0041 }
        L_0x0038:
            anax r3 = r2.c     // Catch:{ all -> 0x0041 }
            goto L_0x0033
        L_0x003b:
            anax r3 = defpackage.ycx.c(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return r3
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0045
        L_0x0044:
            throw r3
        L_0x0045:
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybx.a(android.content.Context):anax");
    }

    public final anax c(Context context) {
        if (aywv.b()) {
            return ycx.a(context);
        }
        anax a2 = a(context);
        return a2 == null ? anfv.a : a2;
    }

    public final anax d(Context context) {
        if (aywv.b()) {
            return ycx.b(context);
        }
        anax b2 = b(context);
        return b2 == null ? anfv.a : b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.accounts.Account a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = defpackage.aywv.b()     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0041
            anaf r0 = r3.d     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0035
            anax r4 = r3.b(r4)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0032
            anab r0 = defpackage.anaf.h()     // Catch:{ all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0047 }
        L_0x0019:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0047 }
            android.accounts.Account r1 = (android.accounts.Account) r1     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r1.name     // Catch:{ all -> 0x0047 }
            r0.a(r2, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0019
        L_0x002b:
            anaf r4 = r0.a()     // Catch:{ all -> 0x0047 }
            r3.d = r4     // Catch:{ all -> 0x0047 }
            goto L_0x0038
        L_0x0032:
            r4 = 0
        L_0x0033:
            monitor-exit(r3)
            return r4
        L_0x0035:
            b()     // Catch:{ all -> 0x0047 }
        L_0x0038:
            anaf r4 = r3.d     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0047 }
            android.accounts.Account r4 = (android.accounts.Account) r4     // Catch:{ all -> 0x0047 }
            goto L_0x0033
        L_0x0041:
            android.accounts.Account r4 = defpackage.ycx.a(r4, r5)     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x004b
        L_0x004a:
            throw r4
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybx.a(android.content.Context, java.lang.String):android.accounts.Account");
    }

    public final synchronized anax b(Context context) {
        if (aywv.b()) {
            return ycx.d(context);
        }
        b();
        if (this.b == null) {
            anav j = anax.j();
            for (Account account : qub.a(context).a("com.google")) {
                if (!TextUtils.isEmpty(account.name)) {
                    j.b(account);
                }
            }
            this.b = j.a();
        }
        return this.b;
    }

    public final synchronized void a() {
        if (!aywv.b()) {
            b();
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }
}
