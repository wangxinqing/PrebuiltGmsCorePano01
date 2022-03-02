package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.List;

/* renamed from: xvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvm {
    private static final amzy e = amzy.a((Object) 1, (Object) 3);
    private static final amzy f = amzy.a((Object) 4);
    private static xvm g;
    public final xvl a;
    private final xvn b;
    private final qub c;
    private final xvo d;

    private xvm(Context context, qub qub) {
        xvn a2 = xvn.a(context);
        xvo xvo = new xvo(context);
        this.b = a2;
        this.c = qub;
        this.a = new xvl(qub);
        this.d = xvo;
    }

    public static synchronized xvm a(Context context) {
        xvm a2;
        synchronized (xvm.class) {
            a2 = a(context, qub.a(context));
        }
        return a2;
    }

    private final boolean b(String str) {
        for (Account account : this.c.a("com.google")) {
            if (str.equals(account.name)) {
                return true;
            }
        }
        return false;
    }

    public static BackupAndSyncOptInState d() {
        return new BackupAndSyncOptInState((String) null, new int[0], 1, new String[0]);
    }

    public final xsg c() {
        return this.b.a();
    }

    public final synchronized void e() {
        xsg c2 = c();
        if (c2.b && !b(c2.c)) {
            b();
        }
    }

    public static synchronized xvm a(Context context, qub qub) {
        xvm xvm;
        synchronized (xvm.class) {
            if (g == null) {
                g = new xvm(context, qub);
            }
            xvm = g;
        }
        return xvm;
    }

    public final synchronized void b() {
        this.b.a(xsg.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(int[] r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            xvn r0 = r7.b     // Catch:{ all -> 0x00a0 }
            xsg r0 = r0.a()     // Catch:{ all -> 0x00a0 }
            boolean r1 = r0.b     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x009e
            if (r8 == 0) goto L_0x009e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a0 }
            r1.<init>()     // Catch:{ all -> 0x00a0 }
            int r2 = r8.length     // Catch:{ all -> 0x00a0 }
            r3 = 0
            r4 = 0
        L_0x0015:
            if (r4 >= r2) goto L_0x002c
            r5 = r8[r4]     // Catch:{ all -> 0x00a0 }
            amzy r6 = f     // Catch:{ all -> 0x00a0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a0 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x00a0 }
            if (r6 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r1.add(r5)     // Catch:{ all -> 0x00a0 }
        L_0x0029:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x002c:
            boolean r8 = r1.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r8 != 0) goto L_0x009e
            java.util.TreeSet r8 = new java.util.TreeSet     // Catch:{ all -> 0x00a0 }
            r8.<init>()     // Catch:{ all -> 0x00a0 }
            aucs r2 = r0.d     // Catch:{ all -> 0x00a0 }
            r8.addAll(r2)     // Catch:{ all -> 0x00a0 }
            r2 = 1
            if (r9 != r2) goto L_0x0043
            r8.addAll(r1)     // Catch:{ all -> 0x00a0 }
            goto L_0x0046
        L_0x0043:
            r8.removeAll(r1)     // Catch:{ all -> 0x00a0 }
        L_0x0046:
            r9 = 5
            java.lang.Object r9 = r0.c(r9)     // Catch:{ all -> 0x00a0 }
            aucd r9 = (defpackage.aucd) r9     // Catch:{ all -> 0x00a0 }
            r9.a((defpackage.aucj) r0)     // Catch:{ all -> 0x00a0 }
            boolean r0 = r9.c     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r9.c()     // Catch:{ all -> 0x00a0 }
            r9.c = r3     // Catch:{ all -> 0x00a0 }
        L_0x005a:
            aucj r0 = r9.b     // Catch:{ all -> 0x00a0 }
            xsg r0 = (defpackage.xsg) r0     // Catch:{ all -> 0x00a0 }
            xsg r1 = defpackage.xsg.f     // Catch:{ all -> 0x00a0 }
            aucs r1 = defpackage.aucj.q()     // Catch:{ all -> 0x00a0 }
            r0.d = r1     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x006a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00a0 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00a0 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00a0 }
            boolean r1 = r9.c     // Catch:{ all -> 0x00a0 }
            if (r1 != 0) goto L_0x007f
            goto L_0x0084
        L_0x007f:
            r9.c()     // Catch:{ all -> 0x00a0 }
            r9.c = r3     // Catch:{ all -> 0x00a0 }
        L_0x0084:
            aucj r1 = r9.b     // Catch:{ all -> 0x00a0 }
            xsg r1 = (defpackage.xsg) r1     // Catch:{ all -> 0x00a0 }
            r1.a()     // Catch:{ all -> 0x00a0 }
            aucs r1 = r1.d     // Catch:{ all -> 0x00a0 }
            r1.d(r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x006a
        L_0x0091:
            xvn r8 = r7.b     // Catch:{ all -> 0x00a0 }
            aucj r9 = r9.i()     // Catch:{ all -> 0x00a0 }
            xsg r9 = (defpackage.xsg) r9     // Catch:{ all -> 0x00a0 }
            r8.a((defpackage.xsg) r9)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r7)
            return
        L_0x009e:
            monitor-exit(r7)
            return
        L_0x00a0:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00a4
        L_0x00a3:
            throw r8
        L_0x00a4:
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvm.a(int[], int):void");
    }

    public final synchronized void b(int[] iArr) {
        a(iArr, 2);
    }

    public final synchronized void a(String str) {
        aucd aucd;
        if (str != null) {
            try {
                if (!b(str)) {
                    throw new nja(4, "Account attempting to opt in backup and sync is not signed in.");
                } else if (!ayxm.c() || ((!aytd.i() && this.a.a(str)) || (!aytd.j() && this.a.b(str)))) {
                    throw new nja(5, String.format("Account %s is not eligible for backup and sync.", new Object[]{str}));
                } else {
                    if (aytd.e()) {
                        if (a()) {
                            throw new nja(13, "Contacts count exceeds the system limit.");
                        }
                    }
                    aucd o = xsf.c.o();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xsf xsf = (xsf) o.b;
                    xsf.a |= 1;
                    xsf.b = currentTimeMillis;
                    xsf xsf2 = (xsf) o.i();
                    xsg a2 = this.b.a();
                    if (!a2.b) {
                        aucd = xsg.f.o();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        xsg xsg = (xsg) aucd.b;
                        int i = xsg.a | 1;
                        xsg.a = i;
                        xsg.b = true;
                        str.getClass();
                        xsg.a = i | 2;
                        xsg.c = str;
                        amzy amzy = e;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        xsg xsg2 = (xsg) aucd.b;
                        xsg2.a();
                        auab.a((Iterable) amzy, (List) xsg2.d);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        xsg xsg3 = (xsg) aucd.b;
                        xsf2.getClass();
                        xsg3.e = xsf2;
                        xsg3.a |= 4;
                    } else {
                        aucd = (aucd) a2.c(5);
                        aucd.a((aucj) a2);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        xsg xsg4 = (xsg) aucd.b;
                        xsg xsg5 = xsg.f;
                        str.getClass();
                        int i2 = xsg4.a | 2;
                        xsg4.a = i2;
                        xsg4.c = str;
                        xsf2.getClass();
                        xsg4.e = xsf2;
                        xsg4.a = i2 | 4;
                    }
                    this.b.a((xsg) aucd.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new nja(5, "Account name is null.");
        }
    }

    public final synchronized void a(int[] iArr) {
        a(iArr, 1);
    }

    public final boolean a() {
        return ((long) (this.d.b() + this.d.a("account_type = \"com.google\""))) > aytd.a.a().O();
    }
}
