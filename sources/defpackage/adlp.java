package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: adlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adlp {
    public static final iwd a = adnt.e("ExecutionManager");
    public static final adqz b = new adlo();
    public final Context c;
    public final adrn d = ((adrn) adrn.a.b());
    public final adns e;
    public final Object f;
    public final Object g;
    public adlm h;
    public boolean i;

    public adlp(Context context) {
        iva.a((Object) context);
        this.c = context;
        this.e = adns.a(context);
        this.g = new Object();
        this.f = new Object();
    }

    public final void a() {
        synchronized (this.f) {
            this.h = null;
            if (this.i) {
                Context context = this.c;
                context.startService(adlk.a(context));
            }
        }
    }

    public final void b() {
        adnn a2;
        synchronized (this.f) {
            a.c("Finishing the current execution.", new Object[0]);
            ((adkm) adkm.c.b()).d();
            ((adkt) adkt.e.b()).b();
            ((adle) adle.c.b()).d();
            if (jkr.c()) {
                try {
                    adne.a(this.c);
                } catch (IOException e2) {
                    a.e("Failed to cancel the scheduled update.", e2, new Object[0]);
                } catch (Throwable th) {
                    a2.c();
                    throw th;
                }
                if (adjw.a()) {
                    a2 = adnn.a();
                    a2.b();
                    try {
                        a2.e();
                    } catch (InterruptedException e3) {
                        a.e("Failed to reset update engine.", e3, new Object[0]);
                    }
                    a2.c();
                }
            }
            admy.b(this.c);
            this.d.a(adls.h, adls.m, adls.a, adls.b, adls.c, adls.e, adls.d, adls.f, adls.g);
            a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.adlm c() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            monitor-enter(r0)
            adrn r1 = r9.d     // Catch:{ all -> 0x01a6 }
            adro r2 = defpackage.adls.b     // Catch:{ all -> 0x01a6 }
            java.lang.Object r1 = r1.b(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01a6 }
            adrn r2 = r9.d     // Catch:{ all -> 0x01a6 }
            adrf r3 = defpackage.adls.c     // Catch:{ all -> 0x01a6 }
            java.lang.Object r2 = r2.b(r3)     // Catch:{ all -> 0x01a6 }
            adre r2 = (defpackage.adre) r2     // Catch:{ all -> 0x01a6 }
            boolean r3 = defpackage.amrk.a((java.lang.String) r1)     // Catch:{ all -> 0x01a6 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.String r1 = "pending"
            adrn r3 = r9.d     // Catch:{ all -> 0x01a6 }
            adrc[] r6 = new defpackage.adrc[r4]     // Catch:{ all -> 0x01a6 }
            adrc r7 = new adrc     // Catch:{ all -> 0x01a6 }
            adro r8 = defpackage.adls.b     // Catch:{ all -> 0x01a6 }
            r7.<init>(r8, r1)     // Catch:{ all -> 0x01a6 }
            r6[r5] = r7     // Catch:{ all -> 0x01a6 }
            r3.a((defpackage.adrc[]) r6)     // Catch:{ all -> 0x01a6 }
        L_0x0031:
            r3 = 2
            android.content.Context r6 = r9.c     // Catch:{ IllegalStateException -> 0x0187 }
            int r7 = r1.hashCode()
            switch(r7) {
                case -1839227779: goto L_0x0104;
                case -1494191981: goto L_0x00f9;
                case -1263894125: goto L_0x00ee;
                case -1000288303: goto L_0x00e4;
                case -934938715: goto L_0x00d9;
                case -682587753: goto L_0x00ce;
                case -474775007: goto L_0x00c4;
                case -192651531: goto L_0x00ba;
                case -68267281: goto L_0x00b0;
                case 95755281: goto L_0x00a5;
                case 115318481: goto L_0x009a;
                case 211344235: goto L_0x008f;
                case 410752261: goto L_0x0083;
                case 489761078: goto L_0x0077;
                case 1084223181: goto L_0x006b;
                case 1839351677: goto L_0x0060;
                case 1871854292: goto L_0x0055;
                case 1899388483: goto L_0x0049;
                case 1935698813: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x010f
        L_0x003d:
            java.lang.String r7 = "streaming-process-package"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 17
            goto L_0x0110
        L_0x0049:
            java.lang.String r7 = "streaming-apply"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 15
            goto L_0x0110
        L_0x0055:
            java.lang.String r7 = "non-ab-install-action"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 5
            goto L_0x0110
        L_0x0060:
            java.lang.String r7 = "finished-execution"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 3
            goto L_0x0110
        L_0x006b:
            java.lang.String r7 = "non-streaming-ab-apply"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 9
            goto L_0x0110
        L_0x0077:
            java.lang.String r7 = "non-streaming-ab-apply-action"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 8
            goto L_0x0110
        L_0x0083:
            java.lang.String r7 = "ab-update-prep"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 18
            goto L_0x0110
        L_0x008f:
            java.lang.String r7 = "permanent-failure"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 2
            goto L_0x0110
        L_0x009a:
            java.lang.String r7 = "ab-reboot"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 0
            goto L_0x0110
        L_0x00a5:
            java.lang.String r7 = "pre-download-validate"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 13
            goto L_0x0110
        L_0x00b0:
            java.lang.String r7 = "non-ab-install"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 6
            goto L_0x0110
        L_0x00ba:
            java.lang.String r7 = "fixed-delay-execution"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 4
            goto L_0x0110
        L_0x00c4:
            java.lang.String r7 = "exponential-backoff-delay-execution"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 1
            goto L_0x0110
        L_0x00ce:
            java.lang.String r7 = "pending"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 12
            goto L_0x0110
        L_0x00d9:
            java.lang.String r7 = "reboot"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 14
            goto L_0x0110
        L_0x00e4:
            java.lang.String r7 = "non-ab-reboot"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 7
            goto L_0x0110
        L_0x00ee:
            java.lang.String r7 = "streaming-download"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 16
            goto L_0x0110
        L_0x00f9:
            java.lang.String r7 = "non-streaming-download"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 10
            goto L_0x0110
        L_0x0104:
            java.lang.String r7 = "non-streaming-process-package"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x010f
            r7 = 11
            goto L_0x0110
        L_0x010f:
            r7 = -1
        L_0x0110:
            switch(r7) {
                case 0: goto L_0x0170;
                case 1: goto L_0x016a;
                case 2: goto L_0x0164;
                case 3: goto L_0x0164;
                case 4: goto L_0x015e;
                case 5: goto L_0x0158;
                case 6: goto L_0x0158;
                case 7: goto L_0x0152;
                case 8: goto L_0x014a;
                case 9: goto L_0x014a;
                case 10: goto L_0x0144;
                case 11: goto L_0x013e;
                case 12: goto L_0x0138;
                case 13: goto L_0x0132;
                case 14: goto L_0x012c;
                case 15: goto L_0x0127;
                case 16: goto L_0x0122;
                case 17: goto L_0x011d;
                case 18: goto L_0x0117;
                default: goto L_0x0113;
            }
        L_0x0113:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0179
        L_0x0117:
            adlx r1 = new adlx     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x011d:
            admu r1 = defpackage.admu.a(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0122:
            adms r1 = defpackage.adms.a(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0127:
            admr r1 = defpackage.admr.a(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x012c:
            admp r1 = new admp     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0132:
            admo r1 = new admo     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0138:
            admn r1 = new admn     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x013e:
            admm r1 = new admm     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0144:
            adml r1 = new adml     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x014a:
            admk r1 = new admk     // Catch:{ IllegalStateException -> 0x0187 }
            java.lang.String r7 = "non-streaming-ab-apply"
            r1.<init>(r7, r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0152:
            admj r1 = new admj     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0158:
            admg r1 = new admg     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x015e:
            adme r1 = new adme     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0164:
            admc r1 = new admc     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x016a:
            admb r1 = new admb     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
            goto L_0x0175
        L_0x0170:
            adlw r1 = new adlw     // Catch:{ IllegalStateException -> 0x0187 }
            r1.<init>(r6, r2)     // Catch:{ IllegalStateException -> 0x0187 }
        L_0x0175:
            r9.h = r1     // Catch:{ all -> 0x01a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a6 }
            return r1
        L_0x0179:
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IllegalStateException -> 0x0187 }
            r6[r5] = r1     // Catch:{ IllegalStateException -> 0x0187 }
            java.lang.String r1 = "Unknown action name: %s."
            java.lang.String r1 = java.lang.String.format(r1, r6)     // Catch:{ IllegalStateException -> 0x0187 }
            r2.<init>(r1)     // Catch:{ IllegalStateException -> 0x0187 }
            throw r2     // Catch:{ IllegalStateException -> 0x0187 }
        L_0x0187:
            r1 = move-exception
            iwd r2 = a     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = "Unable to create the action. Restart the execution from the scratch."
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a6 }
            r2.d(r6, r1, r7)     // Catch:{ all -> 0x01a6 }
            adrn r1 = r9.d     // Catch:{ all -> 0x01a6 }
            adri[] r2 = new defpackage.adri[r3]     // Catch:{ all -> 0x01a6 }
            adro r3 = defpackage.adls.b     // Catch:{ all -> 0x01a6 }
            r2[r5] = r3     // Catch:{ all -> 0x01a6 }
            adrf r3 = defpackage.adls.c     // Catch:{ all -> 0x01a6 }
            r2[r4] = r3     // Catch:{ all -> 0x01a6 }
            r1.a((defpackage.adri[]) r2)     // Catch:{ all -> 0x01a6 }
            adlm r1 = r9.c()     // Catch:{ all -> 0x01a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a6 }
            return r1
        L_0x01a6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01a6 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlp.c():adlm");
    }
}
