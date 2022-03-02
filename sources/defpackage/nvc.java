package defpackage;

import java.io.IOException;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;

/* renamed from: nvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvc {
    public final ByteBuffer a = ByteBuffer.allocate(4);
    public final nuj b;
    private nut c;
    private DatagramSocket d;
    private long e;

    public nvc(nuj nuj) {
        this.b = nuj;
    }

    public final synchronized void a() {
        DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
    }

    public final synchronized void a(nut nut) {
        this.c = nut;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0087 }
            long r2 = r8.e     // Catch:{ all -> 0x0087 }
            long r0 = r0 - r2
            axlc r2 = defpackage.axlc.a     // Catch:{ all -> 0x0087 }
            axld r2 = r2.a()     // Catch:{ all -> 0x0087 }
            long r2 = r2.ae()     // Catch:{ all -> 0x0087 }
            r4 = 4
            r5 = 0
            r6 = 1
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x005f
            nut r0 = r8.c     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0038
            nut r0 = r8.c     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x002a
            goto L_0x0038
        L_0x002a:
            nut r0 = r8.c     // Catch:{ all -> 0x0087 }
            r1 = 29
            r0.a((int) r1)     // Catch:{ all -> 0x0087 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0087 }
            r8.e = r0     // Catch:{ all -> 0x0087 }
            goto L_0x005d
        L_0x0038:
            nuj r0 = r8.b     // Catch:{ all -> 0x0087 }
            ammy r1 = defpackage.ammy.k     // Catch:{ all -> 0x0087 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0087 }
            boolean r2 = r1.c     // Catch:{ all -> 0x0087 }
            if (r2 == 0) goto L_0x0049
            r1.c()     // Catch:{ all -> 0x0087 }
            r1.c = r5     // Catch:{ all -> 0x0087 }
        L_0x0049:
            aucj r2 = r1.b     // Catch:{ all -> 0x0087 }
            ammy r2 = (defpackage.ammy) r2     // Catch:{ all -> 0x0087 }
            r2.b = r4     // Catch:{ all -> 0x0087 }
            int r3 = r2.a     // Catch:{ all -> 0x0087 }
            r3 = r3 | r6
            r2.a = r3     // Catch:{ all -> 0x0087 }
            r2.j = r6     // Catch:{ all -> 0x0087 }
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.a = r3     // Catch:{ all -> 0x0087 }
            r0.a((defpackage.aucd) r1)     // Catch:{ all -> 0x0087 }
        L_0x005d:
            monitor-exit(r8)
            return r6
        L_0x005f:
            nuj r0 = r8.b     // Catch:{ all -> 0x0087 }
            ammy r1 = defpackage.ammy.k     // Catch:{ all -> 0x0087 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0087 }
            boolean r2 = r1.c     // Catch:{ all -> 0x0087 }
            if (r2 == 0) goto L_0x0070
            r1.c()     // Catch:{ all -> 0x0087 }
            r1.c = r5     // Catch:{ all -> 0x0087 }
        L_0x0070:
            aucj r2 = r1.b     // Catch:{ all -> 0x0087 }
            ammy r2 = (defpackage.ammy) r2     // Catch:{ all -> 0x0087 }
            r2.b = r4     // Catch:{ all -> 0x0087 }
            int r3 = r2.a     // Catch:{ all -> 0x0087 }
            r3 = r3 | r6
            r2.a = r3     // Catch:{ all -> 0x0087 }
            r4 = 2
            r2.j = r4     // Catch:{ all -> 0x0087 }
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.a = r3     // Catch:{ all -> 0x0087 }
            r0.a((defpackage.aucd) r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r8)
            return r5
        L_0x0087:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvc.b():boolean");
    }

    public final synchronized void a(int i) {
        a();
        boolean b2 = awyg.b();
        if (b2) {
            try {
                izj.b(1031);
            } catch (IOException | IllegalArgumentException | SecurityException e2) {
                try {
                    nuj nuj = this.b;
                    aucd o = ammy.k.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ammy ammy = (ammy) o.b;
                    ammy.b = 5;
                    ammy.a |= 1;
                    nuj.a(o);
                    if (!b2) {
                        return;
                    }
                    return;
                } finally {
                    if (b2) {
                        izj.a();
                    }
                }
            }
        }
        DatagramSocket datagramSocket = new DatagramSocket((int) axlc.a.a().ah());
        if (b2) {
            izj.a();
        }
        this.d = datagramSocket;
        new jfx(10, new nvb(this, datagramSocket, i)).start();
    }
}
