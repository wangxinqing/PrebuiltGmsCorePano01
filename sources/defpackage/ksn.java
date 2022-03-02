package defpackage;

import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ksn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksn {
    private final ksj a;
    private final long b;
    private final ChangesAvailableOptions c;
    private final anax d;
    private final Set e = new HashSet();
    private boolean f = true;

    public ksn(ksj ksj, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        iva.a((Object) set);
        this.a = ksj;
        this.b = j;
        this.c = changesAvailableOptions;
        this.d = anax.a((Collection) set);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        this.a.a(new ChangesAvailableEvent(this.c));
        this.e.clear();
        if (!this.c.b) {
            this.f = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean b() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Set set) {
        this.e.addAll(set);
        if (this.e.size() >= this.c.a) {
            a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.kmp r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            anax r0 = r6.d     // Catch:{ all -> 0x003c }
            java.util.Set r2 = r7.aj()     // Catch:{ all -> 0x003c }
            boolean r0 = java.util.Collections.disjoint(r0, r2)     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x003a
            long r2 = r7.y()     // Catch:{ all -> 0x003c }
            long r4 = r6.b     // Catch:{ all -> 0x003c }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            java.util.Set r0 = r6.e     // Catch:{ all -> 0x003c }
            com.google.android.gms.drive.DriveId r7 = r7.g()     // Catch:{ all -> 0x003c }
            boolean r7 = r0.add(r7)     // Catch:{ all -> 0x003c }
            if (r7 == 0) goto L_0x003a
            java.util.Set r7 = r6.e     // Catch:{ all -> 0x003c }
            int r7 = r7.size()     // Catch:{ all -> 0x003c }
            com.google.android.gms.drive.events.ChangesAvailableOptions r0 = r6.c     // Catch:{ all -> 0x003c }
            int r0 = r0.a     // Catch:{ all -> 0x003c }
            if (r7 < r0) goto L_0x003a
            r6.a()     // Catch:{ all -> 0x003c }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003a:
            monitor-exit(r6)
            return r1
        L_0x003c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksn.a(kmp):boolean");
    }
}
