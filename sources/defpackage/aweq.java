package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: aweq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aweq implements awen {
    private boolean a = false;
    public final Set b;

    public aweq() {
        andb andb = new andb();
        andb.a(andr.WEAK);
        this.b = Collections.newSetFromMap(andb.e());
    }

    /* access modifiers changed from: protected */
    public abstract aorr a();

    public final awef a(aweo aweo) {
        throw null;
    }

    public final awef aZ() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr b() {
        /*
            r4 = this;
            java.util.Set r0 = r4.b
            monitor-enter(r0)
            boolean r1 = r4.a     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0025
            aorr r1 = r4.a()     // Catch:{ all -> 0x002b }
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0023
            java.util.Set r2 = r4.b     // Catch:{ all -> 0x002b }
            boolean r2 = r2.add(r1)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0023
            awep r2 = new awep     // Catch:{ all -> 0x002b }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x002b }
            aoqm r3 = defpackage.aoqm.a     // Catch:{ all -> 0x002b }
            r1.a(r2, r3)     // Catch:{ all -> 0x002b }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r1
        L_0x0025:
            aorr r1 = defpackage.aorl.a()     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r1
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aweq.b():aorr");
    }

    public final void a(boolean z) {
        synchronized (this.b) {
            this.a = true;
            for (aorr cancel : this.b) {
                cancel.cancel(z);
            }
        }
    }
}
