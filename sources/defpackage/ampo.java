package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ampo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampo extends amoe implements amoq {
    public int f = 0;
    private final amoh g = new ampn(this);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.amoj r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r8.b()     // Catch:{ all -> 0x00e3 }
            r1 = 2
            if (r0 == r1) goto L_0x00de
            int r0 = r7.f     // Catch:{ all -> 0x00e3 }
            r2 = 1
            if (r0 != r1) goto L_0x000e
            goto L_0x0039
        L_0x000e:
            if (r0 == r2) goto L_0x0039
            amop r0 = r7.b     // Catch:{ all -> 0x00e3 }
            amom r3 = new amom     // Catch:{ all -> 0x00e3 }
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00e3 }
            int r5 = r5.length()     // Catch:{ all -> 0x00e3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            int r5 = r5 + 26
            r6.<init>(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = "unexpected control packet "
            r6.append(r5)     // Catch:{ all -> 0x00e3 }
            r6.append(r4)     // Catch:{ all -> 0x00e3 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00e3 }
            r3.<init>(r4)     // Catch:{ all -> 0x00e3 }
            r0.a((java.io.IOException) r3)     // Catch:{ all -> 0x00e3 }
        L_0x0039:
            int r0 = r8.b()     // Catch:{ amom -> 0x00d8 }
            if (r0 != r2) goto L_0x00b3
            java.nio.ByteBuffer r0 = r8.b     // Catch:{ amom -> 0x00d8 }
            short r0 = r0.getShort()     // Catch:{ amom -> 0x00d8 }
            char r0 = (char) r0     // Catch:{ amom -> 0x00d8 }
            if (r0 != r2) goto L_0x009a
            java.nio.ByteBuffer r0 = r8.b     // Catch:{ amom -> 0x00d8 }
            short r0 = r0.getShort()     // Catch:{ amom -> 0x00d8 }
            char r0 = (char) r0     // Catch:{ amom -> 0x00d8 }
            amog r3 = r7.a     // Catch:{ amom -> 0x00d8 }
            int r3 = r3.a()     // Catch:{ amom -> 0x00d8 }
            if (r0 > r3) goto L_0x0079
            r1 = 3
            r7.f = r1     // Catch:{ amom -> 0x00d8 }
            r7.a((int) r0)     // Catch:{ amom -> 0x00d8 }
            java.nio.ByteBuffer r0 = r8.b     // Catch:{ amom -> 0x00d8 }
            boolean r0 = r0.hasRemaining()     // Catch:{ amom -> 0x00d8 }
            if (r0 == 0) goto L_0x0077
            java.nio.ByteBuffer r0 = r8.b     // Catch:{ amom -> 0x00d8 }
            int r0 = r0.remaining()     // Catch:{ amom -> 0x00d8 }
            byte[] r0 = new byte[r0]     // Catch:{ amom -> 0x00d8 }
            java.nio.ByteBuffer r8 = r8.b     // Catch:{ amom -> 0x00d8 }
            r8.get(r0)     // Catch:{ amom -> 0x00d8 }
            amop r8 = r7.b     // Catch:{ amom -> 0x00d8 }
            r8.a((byte[]) r0)     // Catch:{ amom -> 0x00d8 }
        L_0x0077:
            monitor-exit(r7)
            return
        L_0x0079:
            amom r8 = new amom     // Catch:{ amom -> 0x00d8 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ amom -> 0x00d8 }
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ amom -> 0x00d8 }
            r1[r3] = r0     // Catch:{ amom -> 0x00d8 }
            amog r0 = r7.a     // Catch:{ amom -> 0x00d8 }
            int r0 = r0.a()     // Catch:{ amom -> 0x00d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ amom -> 0x00d8 }
            r1[r2] = r0     // Catch:{ amom -> 0x00d8 }
            java.lang.String r0 = "server confirmed max packet size %s higher than connection's max packet size %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ amom -> 0x00d8 }
            r8.<init>(r0)     // Catch:{ amom -> 0x00d8 }
            throw r8     // Catch:{ amom -> 0x00d8 }
        L_0x009a:
            amom r8 = new amom     // Catch:{ amom -> 0x00d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ amom -> 0x00d8 }
            r2 = 40
            r1.<init>(r2)     // Catch:{ amom -> 0x00d8 }
            java.lang.String r2 = "unsupported protocol version "
            r1.append(r2)     // Catch:{ amom -> 0x00d8 }
            r1.append(r0)     // Catch:{ amom -> 0x00d8 }
            java.lang.String r0 = r1.toString()     // Catch:{ amom -> 0x00d8 }
            r8.<init>(r0)     // Catch:{ amom -> 0x00d8 }
            throw r8     // Catch:{ amom -> 0x00d8 }
        L_0x00b3:
            amom r0 = new amom     // Catch:{ amom -> 0x00d8 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ amom -> 0x00d8 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ amom -> 0x00d8 }
            int r1 = r1.length()     // Catch:{ amom -> 0x00d8 }
            int r1 = r1 + 48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ amom -> 0x00d8 }
            r2.<init>(r1)     // Catch:{ amom -> 0x00d8 }
            java.lang.String r1 = "expected connection confirm packet but recevied "
            r2.append(r1)     // Catch:{ amom -> 0x00d8 }
            r2.append(r8)     // Catch:{ amom -> 0x00d8 }
            java.lang.String r8 = r2.toString()     // Catch:{ amom -> 0x00d8 }
            r0.<init>(r8)     // Catch:{ amom -> 0x00d8 }
            throw r0     // Catch:{ amom -> 0x00d8 }
        L_0x00d8:
            r8 = move-exception
            r7.a((java.io.IOException) r8)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r7)
            return
        L_0x00de:
            r7.b()     // Catch:{ all -> 0x00e3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampo.a(amoj):void");
    }

    /* access modifiers changed from: protected */
    public final synchronized void b() {
        super.b();
        this.f = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return this.f != 0;
    }

    public final synchronized void f() {
        if (this.f == 0) {
            this.f = 1;
            int a = this.a.a();
            ByteBuffer a2 = amoi.a();
            if (a2.remaining() <= 13) {
                amoj a3 = amoj.a(0, a2.remaining() + 6);
                a3.b.putShort(1);
                a3.b.putShort(1);
                a3.b.putShort((short) a);
                a3.b.put(a2);
                a3.b.rewind();
                c(a3).a(this.g);
            } else {
                throw new IllegalArgumentException("Connection request control packet may contain at most 13 bytes of extra data.");
            }
        }
    }

    public ampo(amog amog, amop amop) {
        super(amog, amop);
    }
}
