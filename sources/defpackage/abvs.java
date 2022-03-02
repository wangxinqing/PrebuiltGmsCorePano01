package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: abvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvs {
    static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final iwd b = acqa.a("D2D", "EnrollmentChecker");
    private static volatile abvs d;
    CountDownLatch c;
    private boolean e;
    private long f;
    private final gaj g;
    private final qub h;

    private abvs(Context context) {
        gaj a2 = gac.a(context.getApplicationContext());
        qub a3 = qub.a(context.getApplicationContext());
        iva.a((Object) context);
        this.g = a2;
        this.h = a3;
    }

    public static abvs a(Context context) {
        if (d == null) {
            synchronized (abvs.class) {
                if (d == null) {
                    d = new abvs(context);
                }
            }
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long b() {
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        long j = (long) ((int) azlf.a.a().j());
        if (currentTimeMillis >= j) {
            return 0;
        }
        return j - currentTimeMillis;
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(r2);
        for (Account account : this.h.a("com.google")) {
            arrayList.add(new BootstrapAccount(account.name, account.type));
        }
        a((List) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            java.lang.String r0 = "Should not await on main thread!"
            defpackage.iva.b((java.lang.String) r0)
            boolean r0 = r5.e
            r1 = 0
            if (r0 == 0) goto L_0x0033
            java.util.concurrent.CountDownLatch r0 = r5.c
            if (r0 == 0) goto L_0x0033
            long r2 = r5.b()     // Catch:{ InterruptedException -> 0x0027 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0027 }
            boolean r0 = r0.await(r2, r4)     // Catch:{ InterruptedException -> 0x0027 }
            if (r0 != 0) goto L_0x0026
            iwd r2 = b     // Catch:{ InterruptedException -> 0x0024 }
            java.lang.String r3 = "Timed out waiting Cryptauth"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x0024 }
            r2.e(r3, r4)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r2 = move-exception
            goto L_0x002a
        L_0x0026:
            goto L_0x002f
        L_0x0027:
            r0 = move-exception
            r2 = r0
            r0 = 0
        L_0x002a:
            iwd r3 = b
            r3.a((java.lang.Throwable) r2)
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            r5.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvs.a():void");
    }

    public final synchronized boolean a(List list) {
        azkq.c();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f <= a) {
            return false;
        }
        b.a("Enrolling accounts", new Object[0]);
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BootstrapAccount bootstrapAccount = (BootstrapAccount) list.get(i);
            if ("com.google".equals(bootstrapAccount.c)) {
                Account account = new Account(bootstrapAccount.b, bootstrapAccount.c);
                this.g.a(4, (List) anda.a((Object[]) new String[]{"PublicKey", "authzen"}), "ForceRegistration", account).a((acvp) new abvr(account, countDownLatch));
            } else {
                countDownLatch.countDown();
            }
        }
        this.c = countDownLatch;
        this.e = true;
        this.f = currentTimeMillis;
        return true;
    }
}
