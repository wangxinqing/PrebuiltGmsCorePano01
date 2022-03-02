package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: lzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lzt implements Runnable, iea, igg {
    private static lzt d;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public int b = 0;
    public final Handler c;
    private final isy e;

    private lzt(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        this.c = new qvr(handlerThread.getLooper());
        this.e = new lzn(context, this.c.getLooper(), this, this);
    }

    static synchronized lzt a(Context context) {
        lzt lzt;
        synchronized (lzt.class) {
            if (d == null) {
                d = new lzt(context);
            }
            lzt = d;
        }
        return lzt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0139 A[SYNTHETIC, Splitter:B:69:0x0139] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
            r22 = this;
            r7 = r22
        L_0x0002:
            java.util.concurrent.LinkedBlockingQueue r0 = r7.a
            java.lang.Object r0 = r0.poll()
            r8 = r0
            lzo r8 = (defpackage.lzo) r8
            if (r8 == 0) goto L_0x01dc
            boolean r0 = r8.f
            if (r0 != 0) goto L_0x0002
            mad r9 = r8.e
            r0 = 3
            maf r1 = defpackage.maf.FINE
            r9.a(r0, r1)
            isy r0 = r7.e     // Catch:{ Exception -> 0x01ad }
            android.os.IInterface r0 = r0.x()     // Catch:{ Exception -> 0x01ad }
            mac r0 = (defpackage.mac) r0     // Catch:{ Exception -> 0x01ad }
            lzz r10 = r0.b()     // Catch:{ Exception -> 0x01ad }
            r0 = 4
            maf r1 = defpackage.maf.FINE     // Catch:{ Exception -> 0x01ad }
            r9.a(r0, r1)     // Catch:{ Exception -> 0x01ad }
            com.google.android.gms.droidguard.DroidGuardResultsRequest r0 = r8.d     // Catch:{ Exception -> 0x01ad }
            int r1 = r7.b     // Catch:{ Exception -> 0x01ad }
            android.os.Bundle r0 = r0.a     // Catch:{ Exception -> 0x01ad }
            java.lang.String r2 = "openHandles"
            r0.putInt(r2, r1)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = r8.c     // Catch:{ Exception -> 0x01ad }
            com.google.android.gms.droidguard.DroidGuardResultsRequest r1 = r8.d     // Catch:{ Exception -> 0x01ad }
            com.google.android.gms.droidguard.internal.DroidGuardInitReply r0 = r10.a(r0, r1)     // Catch:{ Exception -> 0x01ad }
            if (r0 == 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            java.lang.String r1 = r8.c     // Catch:{ Exception -> 0x01ad }
            r10.a((java.lang.String) r1)     // Catch:{ Exception -> 0x01ad }
        L_0x0046:
            r1 = 5
            maf r2 = defpackage.maf.FINE     // Catch:{ Exception -> 0x01ad }
            r9.a(r1, r2)     // Catch:{ Exception -> 0x01ad }
            if (r0 != 0) goto L_0x0050
            goto L_0x019b
        L_0x0050:
            isy r1 = r7.e     // Catch:{ Exception -> 0x01ad }
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x01ad }
            mbe r3 = new mbe     // Catch:{ Exception -> 0x01ad }
            r3.<init>(r2)     // Catch:{ Exception -> 0x01ad }
            boolean r1 = defpackage.axfc.b()     // Catch:{ Exception -> 0x01ad }
            if (r1 != 0) goto L_0x0066
            map r1 = new map     // Catch:{ Exception -> 0x01ad }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01ad }
            r4 = r1
            goto L_0x006c
        L_0x0066:
            mbd r1 = new mbd     // Catch:{ Exception -> 0x01ad }
            r1.<init>()     // Catch:{ Exception -> 0x01ad }
            r4 = r1
        L_0x006c:
            mbi r11 = new mbi     // Catch:{ Exception -> 0x01ad }
            r5 = 0
            r1 = r11
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01ad }
            mao r1 = new mao     // Catch:{ Exception -> 0x01ad }
            r1.<init>(r11, r9)     // Catch:{ Exception -> 0x01ad }
            android.os.ParcelFileDescriptor r2 = r0.a     // Catch:{ Exception -> 0x01ad }
            if (r2 == 0) goto L_0x019b
            android.os.Parcelable r2 = r0.b     // Catch:{ Exception -> 0x01ad }
            if (r2 == 0) goto L_0x019b
            r3 = r2
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ Exception -> 0x01ad }
            java.lang.String r4 = "h"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x01ad }
            r4 = 0
            if (r3 == 0) goto L_0x0191
            mbh r5 = new mbh     // Catch:{ Exception -> 0x01ad }
            r5.<init>(r3)     // Catch:{ Exception -> 0x01ad }
            android.os.ParcelFileDescriptor r3 = r0.a     // Catch:{ Exception -> 0x01ad }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r6 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ all -> 0x0183 }
            r6.<init>(r3)     // Catch:{ all -> 0x0183 }
            mbi r11 = r1.a     // Catch:{ all -> 0x0177 }
            maq r12 = defpackage.mbi.a     // Catch:{ all -> 0x0177 }
            monitor-enter(r12)     // Catch:{ all -> 0x0177 }
            maq r0 = defpackage.mbi.a     // Catch:{ mah -> 0x00b9 }
            java.lang.Object r0 = r0.a(r5)     // Catch:{ mah -> 0x00b9 }
            r13 = 1
            if (r0 != 0) goto L_0x00b1
            mbe r0 = r11.c     // Catch:{ mah -> 0x00b9 }
            mbg r0 = r0.a((defpackage.mbh) r5)     // Catch:{ mah -> 0x00b9 }
            if (r0 != 0) goto L_0x00b1
            r13 = 0
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            monitor-exit(r12)     // Catch:{ all -> 0x00b6 }
            if (r13 == 0) goto L_0x00bb
            goto L_0x00fc
        L_0x00b6:
            r0 = move-exception
            goto L_0x0175
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00b6 }
        L_0x00bb:
            android.content.Context r0 = r11.b     // Catch:{ all -> 0x0177 }
            java.io.File r12 = defpackage.mbe.a((android.content.Context) r0)     // Catch:{ all -> 0x0177 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0168 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0168 }
            java.nio.channels.FileChannel r20 = r6.getChannel()     // Catch:{ all -> 0x015a }
            java.nio.channels.FileChannel r21 = r13.getChannel()     // Catch:{ all -> 0x014c }
            r16 = 0
            long r18 = r20.size()     // Catch:{ all -> 0x013e }
            r14 = r21
            r15 = r20
            r14.transferFrom(r15, r16, r18)     // Catch:{ all -> 0x013e }
            mbe r0 = r11.c     // Catch:{ all -> 0x013e }
            mbg r14 = defpackage.mbg.a(r12)     // Catch:{ all -> 0x013e }
            r0.a((defpackage.mbh) r5, (defpackage.mbg) r14)     // Catch:{ all -> 0x013e }
            if (r21 == 0) goto L_0x00e9
            r21.close()     // Catch:{ all -> 0x014c }
        L_0x00e9:
            if (r20 == 0) goto L_0x00ee
            r20.close()     // Catch:{ all -> 0x015a }
        L_0x00ee:
            r13.close()     // Catch:{ Exception -> 0x0168 }
            r12.delete()     // Catch:{ all -> 0x0177 }
            mad r0 = r11.d     // Catch:{ all -> 0x0177 }
            r12 = 6
            maf r13 = defpackage.maf.FINE     // Catch:{ all -> 0x0177 }
            r0.a(r12, r13)     // Catch:{ all -> 0x0177 }
        L_0x00fc:
            byte[] r0 = new byte[r4]     // Catch:{ all -> 0x0177 }
            java.lang.Class r0 = r11.a(r5, r0)     // Catch:{ all -> 0x0177 }
            mad r4 = r11.d     // Catch:{ all -> 0x0177 }
            r5 = 9
            maf r12 = defpackage.maf.FINE     // Catch:{ all -> 0x0177 }
            r4.a(r5, r12)     // Catch:{ all -> 0x0177 }
            mbj r4 = new mbj     // Catch:{ all -> 0x0177 }
            android.content.Context r5 = r11.b     // Catch:{ all -> 0x0177 }
            r4.<init>(r0, r5, r2)     // Catch:{ all -> 0x0177 }
            mad r0 = r1.b     // Catch:{ all -> 0x0177 }
            r2 = 10
            maf r5 = defpackage.maf.FINE     // Catch:{ all -> 0x0177 }
            r0.a(r2, r5)     // Catch:{ all -> 0x0177 }
            r4.a()     // Catch:{ all -> 0x0177 }
            mad r0 = r1.b     // Catch:{ all -> 0x0177 }
            r2 = 11
            maf r5 = defpackage.maf.FINE     // Catch:{ all -> 0x0177 }
            r0.a(r2, r5)     // Catch:{ all -> 0x0177 }
            r4.b()     // Catch:{ all -> 0x0177 }
            mad r0 = r1.b     // Catch:{ all -> 0x0177 }
            r1 = 12
            maf r2 = defpackage.maf.FINE     // Catch:{ all -> 0x0177 }
            r0.a(r1, r2)     // Catch:{ all -> 0x0177 }
            r6.close()     // Catch:{ all -> 0x0183 }
            if (r3 == 0) goto L_0x019b
            r3.close()     // Catch:{ Exception -> 0x01ad }
            goto L_0x019b
        L_0x013e:
            r0 = move-exception
            r1 = r0
            if (r21 == 0) goto L_0x014b
            r21.close()     // Catch:{ all -> 0x0146 }
            goto L_0x014b
        L_0x0146:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x014c }
        L_0x014b:
            throw r1     // Catch:{ all -> 0x014c }
        L_0x014c:
            r0 = move-exception
            r1 = r0
            if (r20 == 0) goto L_0x0159
            r20.close()     // Catch:{ all -> 0x0154 }
            goto L_0x0159
        L_0x0154:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x015a }
        L_0x0159:
            throw r1     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            r1 = r0
            r13.close()     // Catch:{ all -> 0x0160 }
            goto L_0x0165
        L_0x0160:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ Exception -> 0x0168 }
        L_0x0165:
            throw r1     // Catch:{ Exception -> 0x0168 }
        L_0x0166:
            r0 = move-exception
            goto L_0x0171
        L_0x0168:
            r0 = move-exception
            mbk r1 = new mbk     // Catch:{ all -> 0x0166 }
            java.lang.String r2 = "VM couldn't be stored"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0166 }
            throw r1     // Catch:{ all -> 0x0166 }
        L_0x0171:
            r12.delete()     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0175:
            monitor-exit(r12)     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            r1 = r0
            r6.close()     // Catch:{ all -> 0x017d }
            goto L_0x0182
        L_0x017d:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0183 }
        L_0x0182:
            throw r1     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L_0x0190
            r3.close()     // Catch:{ all -> 0x018b }
            goto L_0x0190
        L_0x018b:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ Exception -> 0x01ad }
        L_0x0190:
            throw r1     // Catch:{ Exception -> 0x01ad }
        L_0x0191:
            mbf r0 = new mbf     // Catch:{ Exception -> 0x01ad }
            byte[] r1 = new byte[r4]     // Catch:{ Exception -> 0x01ad }
            java.lang.String r2 = "Missing key"
            r0.<init>((byte[]) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x01ad }
            throw r0     // Catch:{ Exception -> 0x01ad }
        L_0x019b:
            lzs r0 = new lzs     // Catch:{ Exception -> 0x01ad }
            com.google.android.gms.droidguard.DroidGuardResultsRequest r1 = r8.d     // Catch:{ Exception -> 0x01ad }
            int r1 = r1.a()     // Catch:{ Exception -> 0x01ad }
            long r4 = (long) r1     // Catch:{ Exception -> 0x01ad }
            r1 = r0
            r2 = r22
            r3 = r10
            r6 = r9
            r1.<init>(r2, r3, r4, r6)     // Catch:{ Exception -> 0x01ad }
            goto L_0x01ce
        L_0x01ad:
            r0 = move-exception
            lzs r1 = new lzs
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Initialization failed: "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x01c6
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x01ca
        L_0x01c6:
            java.lang.String r0 = r2.concat(r0)
        L_0x01ca:
            r1.<init>(r7, r0, r9)
            r0 = r1
        L_0x01ce:
            mad r1 = r8.e
            r2 = 13
            maf r3 = defpackage.maf.COARSE
            r1.a(r2, r3)
            r8.c(r0)
            goto L_0x0002
        L_0x01dc:
            r22.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzt.b():void");
    }

    public final void g(Bundle bundle) {
        iva.a(this.c);
        b();
    }

    public final void run() {
        iva.a(this.c);
        if (this.e.l()) {
            b();
        } else if (!this.e.m() && this.a.size() > 0) {
            this.e.t();
        }
    }

    private final void a(String str) {
        while (true) {
            lzo lzo = (lzo) this.a.poll();
            if (lzo != null) {
                lzo.c(new lzs(this, str, lzo.e));
            } else {
                return;
            }
        }
    }

    public final void a() {
        if (this.a.isEmpty() && this.b == 0 && this.e.l()) {
            this.e.j();
        }
    }

    public final void a(int i) {
        iva.a(this.c);
        StringBuilder sb = new StringBuilder(25);
        sb.append("Disconnected: ");
        sb.append(i);
        a(sb.toString());
    }

    public final void a(ConnectionResult connectionResult) {
        iva.a(this.c);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Connection failed: ");
        sb.append(valueOf);
        a(sb.toString());
    }

    public final void a(Runnable runnable) {
        if (Looper.myLooper() == this.c.getLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }
}
