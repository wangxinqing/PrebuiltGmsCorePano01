package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: psn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class psn implements agoy {
    private final int a;
    private boolean b = false;
    private ArrayList c = new ArrayList();

    public psn(int i) {
        boolean z = false;
        iva.b(i >= 0 ? true : z);
        this.a = i;
    }

    private final void b() {
        this.b = true;
        this.c.clear();
    }

    public final synchronized aorr a() {
        b();
        return aorl.a((Object) null);
    }

    public final synchronized aorr a(Collection collection) {
        if (!this.b) {
            if (collection.size() > this.a - this.c.size()) {
                b();
            } else {
                this.c.addAll(collection);
            }
        }
        return aorl.a((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.psq r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0019
            java.util.ArrayList r0 = r1.c     // Catch:{ all -> 0x0021 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0017
            r2.c()     // Catch:{ all -> 0x0021 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0021 }
            r2.<init>()     // Catch:{ all -> 0x0021 }
            r1.c = r2     // Catch:{ all -> 0x0021 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2.b()     // Catch:{ all -> 0x0021 }
            r2 = 0
            r1.b = r2     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psn.a(psq):void");
    }
}
