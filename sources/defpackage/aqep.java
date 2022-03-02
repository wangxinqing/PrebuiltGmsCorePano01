package defpackage;

import java.util.Vector;

/* renamed from: aqep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqep implements Runnable {
    protected final Vector a = new Vector();
    protected final Vector b = new Vector();
    public final Object c = new Object();
    public final Thread[] d;
    public final String e;
    public boolean f = false;

    public aqep(String str) {
        this.e = str;
        this.d = new Thread[1];
    }

    /* access modifiers changed from: package-private */
    public final boolean b(aqeo aqeo) {
        synchronized (this.c) {
            int i = aqeo.c;
            if (i == 1) {
                aqer.a(this.b.contains(aqeo));
                this.b.removeElement(aqeo);
                aqeo.c = 0;
                this.c.notifyAll();
                return true;
            } else if (i == 2) {
                aqer.a(this.a.contains(aqeo));
                this.a.removeElement(aqeo);
                aqeo.c = 0;
                this.c.notifyAll();
                return true;
            } else if (i != 3 && i != 4) {
                return false;
            } else {
                aqeo.c = 0;
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(aqeo aqeo) {
        synchronized (this.c) {
            aqer.b(this.a.contains(aqeo));
            this.a.add(aqeo);
            aqeo.c = 2;
            this.c.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r1 == null) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        defpackage.apev.a(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r11.c
            monitor-enter(r2)
            r3 = 3
            r4 = 0
            if (r1 == 0) goto L_0x0018
            int r5 = r1.c     // Catch:{ all -> 0x00a6 }
            r6 = 4
            if (r5 != r6) goto L_0x0014
            r1.c = r4     // Catch:{ all -> 0x00a6 }
            r1.e()     // Catch:{ all -> 0x00a6 }
            goto L_0x0018
        L_0x0014:
            if (r5 != r3) goto L_0x0018
            r1.c = r4     // Catch:{ all -> 0x00a6 }
        L_0x0018:
            boolean r1 = r11.f     // Catch:{ all -> 0x00a6 }
            r5 = 0
            if (r1 == 0) goto L_0x0053
            java.util.Vector r1 = r11.a     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0053
            java.util.Vector r1 = r11.b     // Catch:{ InterruptedException -> 0x004f }
            boolean r1 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x004f }
            if (r1 != 0) goto L_0x0049
            java.util.Vector r1 = r11.b     // Catch:{ InterruptedException -> 0x004f }
            java.lang.Object r1 = r1.elementAt(r4)     // Catch:{ InterruptedException -> 0x004f }
            aqeq r1 = (defpackage.aqeq) r1     // Catch:{ InterruptedException -> 0x004f }
            long r7 = r1.g()     // Catch:{ InterruptedException -> 0x004f }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x004f }
            long r7 = r7 - r9
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0053
            java.lang.Object r1 = r11.c     // Catch:{ InterruptedException -> 0x004f }
            r1.wait(r7)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x0049:
            java.lang.Object r1 = r11.c     // Catch:{ InterruptedException -> 0x004f }
            r1.wait()     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r1 = move-exception
            defpackage.apev.a(r1)     // Catch:{ all -> 0x00a6 }
        L_0x0053:
            boolean r1 = r11.f     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x00a4
        L_0x0057:
            java.util.Vector r1 = r11.b     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x007d
            java.util.Vector r1 = r11.b     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.elementAt(r4)     // Catch:{ all -> 0x00a6 }
            aqeq r1 = (defpackage.aqeq) r1     // Catch:{ all -> 0x00a6 }
            long r7 = r1.g()     // Catch:{ all -> 0x00a6 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a6 }
            long r7 = r7 - r9
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x007d
            java.util.Vector r7 = r11.b     // Catch:{ all -> 0x00a6 }
            r7.removeElementAt(r4)     // Catch:{ all -> 0x00a6 }
            r11.c(r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x0057
        L_0x007d:
            java.util.Vector r1 = r11.a     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0095
            java.util.Vector r1 = r11.a     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.elementAt(r4)     // Catch:{ all -> 0x00a6 }
            aqeo r1 = (defpackage.aqeo) r1     // Catch:{ all -> 0x00a6 }
            r1.c = r3     // Catch:{ all -> 0x00a6 }
            java.util.Vector r3 = r11.a     // Catch:{ all -> 0x00a6 }
            r3.removeElementAt(r4)     // Catch:{ all -> 0x00a6 }
            goto L_0x0096
        L_0x0095:
            r1 = r0
        L_0x0096:
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0002
            r1.c()     // Catch:{ all -> 0x009e }
            goto L_0x0002
        L_0x009e:
            r2 = move-exception
            defpackage.apev.a(r2)
            goto L_0x0002
        L_0x00a4:
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            return
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a9:
            throw r0
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqep.run():void");
    }

    public final void a(aqeo aqeo) {
        aqer.a((Object) aqeo);
        synchronized (this.c) {
            int i = aqeo.c;
            if (i == 0) {
                aqeo.e();
            } else if (i == 3) {
                aqeo.c = 4;
            }
        }
    }
}
