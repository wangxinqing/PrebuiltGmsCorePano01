package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: balk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class balk {
    private static final balk c = new balk();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(balj balj) {
        return c.b(balj);
    }

    public static void b(balj balj, Object obj) {
        c.a(balj, obj);
    }

    /* access modifiers changed from: package-private */
    public final synchronized Object b(balj balj) {
        bali bali;
        bali = (bali) this.a.get(balj);
        if (bali == null) {
            bali = new bali(balj.a());
            this.a.put(balj, bali);
        }
        ScheduledFuture scheduledFuture = bali.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bali.c = null;
        }
        bali.b++;
        return bali.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(balj balj, Object obj) {
        boolean z;
        boolean z2;
        bali bali = (bali) this.a.get(balj);
        if (bali != null) {
            boolean z3 = true;
            if (obj == bali.a) {
                z = true;
            } else {
                z = false;
            }
            amrl.a(z, (Object) "Releasing the wrong instance");
            if (bali.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            amrl.b(z2, (Object) "Refcount has already reached zero");
            int i = bali.b - 1;
            bali.b = i;
            if (i == 0) {
                if (bali.c != null) {
                    z3 = false;
                }
                amrl.b(z3, (Object) "Destroy task already scheduled");
                if (this.b == null) {
                    this.b = Executors.newSingleThreadScheduledExecutor(bagt.c("grpc-shared-destroyer-%d"));
                }
                bali.c = this.b.schedule(new baid(new balh(this, bali, balj, obj)), 1, TimeUnit.SECONDS);
            }
        } else {
            String valueOf = String.valueOf(balj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("No cached instance found for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
