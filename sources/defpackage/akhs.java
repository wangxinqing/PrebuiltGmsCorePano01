package defpackage;

import android.util.Log;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.concurrent.TimeUnit;

/* renamed from: akhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhs implements akhq {
    private iso a = null;

    public final synchronized PlaceEntity a(String str, long j) {
        iso iso = this.a;
        if (iso == null) {
            if (Log.isLoggable("Places", 5)) {
                alfy.c("Places", "lookup() invoked on closed place cache");
            }
            return null;
        }
        return (PlaceEntity) iso.a(str);
    }

    public final synchronized void a() {
        this.a = null;
    }

    public final synchronized void b(long j) {
        if (this.a == null) {
            this.a = new iso((int) azci.c(), azci.b(), azci.b(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            iso r1 = r0.a     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "Places"
            r2 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "Places"
            java.lang.String r2 = "clear() invoked on closed place cache"
            defpackage.alfy.c(r1, r2)     // Catch:{ all -> 0x001c }
        L_0x0015:
            monitor-exit(r0)
            return
        L_0x0017:
            r1.a()     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhs.a(long):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.Collection r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            iso r5 = r3.a     // Catch:{ all -> 0x0030 }
            if (r5 != 0) goto L_0x0017
            java.lang.String r4 = "Places"
            r5 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "Places"
            java.lang.String r5 = "insert() invoked on closed place cache"
            defpackage.alfy.c(r4, r5)     // Catch:{ all -> 0x0030 }
        L_0x0015:
            monitor-exit(r3)
            return
        L_0x0017:
            int r5 = r4.size()     // Catch:{ all -> 0x0030 }
            r6 = 0
        L_0x001c:
            if (r6 >= r5) goto L_0x002e
            java.lang.Object r0 = r4.get(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.location.places.internal.PlaceEntity r0 = (com.google.android.gms.location.places.internal.PlaceEntity) r0     // Catch:{ all -> 0x0030 }
            iso r1 = r3.a     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = r0.a     // Catch:{ all -> 0x0030 }
            r1.a(r2, r0)     // Catch:{ all -> 0x0030 }
            int r6 = r6 + 1
            goto L_0x001c
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0034
        L_0x0033:
            throw r4
        L_0x0034:
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhs.a(java.util.Collection, long):void");
    }
}
