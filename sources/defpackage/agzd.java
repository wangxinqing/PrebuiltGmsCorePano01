package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: agzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzd {
    private Object a;
    private WeakReference b;
    private boolean c = false;
    private boolean d = true;

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.c     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == 0) goto L_0x0007
            goto L_0x000c
        L_0x0007:
            r4.c = r1     // Catch:{ all -> 0x004a }
            defpackage.agzf.a(r4)     // Catch:{ all -> 0x004a }
        L_0x000c:
            java.lang.Object r0 = r4.a     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0048
            java.lang.ref.WeakReference r0 = r4.b     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x004a }
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 != 0) goto L_0x0047
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            r0.setAntiAlias(r1)     // Catch:{ all -> 0x004a }
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER     // Catch:{ all -> 0x004a }
            r0.setTextAlign(r1)     // Catch:{ all -> 0x004a }
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF     // Catch:{ all -> 0x004a }
            r3 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)     // Catch:{ all -> 0x004a }
            r0.setTypeface(r1)     // Catch:{ all -> 0x004a }
            defpackage.amrl.a((java.lang.Object) r0)     // Catch:{ all -> 0x004a }
            boolean r1 = r4.d     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0043
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            r4.b = r1     // Catch:{ all -> 0x004a }
            goto L_0x0047
        L_0x0043:
            r4.a = r0     // Catch:{ all -> 0x004a }
            r4.b = r2     // Catch:{ all -> 0x004a }
        L_0x0047:
        L_0x0048:
            monitor-exit(r4)
            return r0
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzd.a():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (!this.d) {
            this.d = true;
            if (this.a == null) {
                WeakReference weakReference = this.b;
                Object obj = weakReference != null ? weakReference.get() : null;
                if (obj == null) {
                    this.b = null;
                } else {
                    this.a = obj;
                }
            }
        }
    }
}
