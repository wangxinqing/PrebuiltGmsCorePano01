package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: nsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsl {
    private final List a = new ArrayList();

    private static final boolean a(amnc amnc, ntx ntx) {
        return ntx.a(amnc).equals(ntx);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.List r0 = r7.a     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0070 }
            monitor-exit(r7)
            return r0
        L_0x000f:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0070 }
            axlc r2 = defpackage.axlc.a     // Catch:{ all -> 0x0070 }
            axld r2 = r2.a()     // Catch:{ all -> 0x0070 }
            long r2 = r2.ai()     // Catch:{ all -> 0x0070 }
            long r0 = r0 - r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0070 }
            r2.<init>()     // Catch:{ all -> 0x0070 }
        L_0x0023:
            java.util.List r3 = r7.a     // Catch:{ all -> 0x0070 }
            int r3 = r3.size()     // Catch:{ all -> 0x0070 }
            if (r3 <= 0) goto L_0x006e
            java.util.List r3 = r7.a     // Catch:{ all -> 0x0070 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0070 }
            nsk r3 = (defpackage.nsk) r3     // Catch:{ all -> 0x0070 }
            long r5 = r3.a     // Catch:{ all -> 0x0070 }
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x006e
            java.util.List r3 = r7.a     // Catch:{ all -> 0x0070 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0070 }
            nsk r3 = (defpackage.nsk) r3     // Catch:{ all -> 0x0070 }
            amnc r3 = r3.b     // Catch:{ all -> 0x0070 }
            ntx r5 = defpackage.ntx.a((defpackage.amnc) r3)     // Catch:{ all -> 0x0070 }
            r2.add(r3)     // Catch:{ all -> 0x0070 }
            java.util.List r3 = r7.a     // Catch:{ all -> 0x0070 }
            r3.remove(r4)     // Catch:{ all -> 0x0070 }
            java.util.List r3 = r7.a     // Catch:{ all -> 0x0070 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0070 }
        L_0x0056:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0023
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0070 }
            nsk r4 = (defpackage.nsk) r4     // Catch:{ all -> 0x0070 }
            amnc r4 = r4.b     // Catch:{ all -> 0x0070 }
            boolean r4 = a(r4, r5)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0056
            r3.remove()     // Catch:{ all -> 0x0070 }
            goto L_0x0056
        L_0x006e:
            monitor-exit(r7)
            return r2
        L_0x0070:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x0074
        L_0x0073:
            throw r0
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsl.a():java.util.List");
    }

    public final synchronized List a(ntx ntx) {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            amnc amnc = ((nsk) it.next()).b;
            if (a(amnc, ntx)) {
                arrayList.add(amnc);
                it.remove();
            }
        }
        return arrayList;
    }

    public final synchronized void a(amnc amnc) {
        int aa = (int) axlc.a.a().aa();
        while (this.a.size() >= aa) {
            nsk nsk = (nsk) this.a.remove(0);
        }
        this.a.add(new nsk(amnc));
    }
}
