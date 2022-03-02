package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ing  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ing {
    public static final /* synthetic */ int a = 0;
    private static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static final ilw a() {
        return new ilw();
    }

    public final void b(inb inb) {
        new inf(false, imf.a((Runnable) new inc(this, inb)));
    }

    public static void a(ine ine) {
        b.put(ine.getClass().getName(), ine);
    }

    public static boolean a(List list, inb inb) {
        Throwable e;
        int size = list.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2 = true;
            try {
                if (((imx) ((aorr) list.get(i)).get()).b && awyw.i()) {
                    try {
                        inm.a(TimeUnit.SECONDS.toMillis(awyw.a.a().E()), inb);
                        z = true;
                    } catch (InterruptedException | CancellationException | ExecutionException e2) {
                        e = e2;
                        Log.e("FixerFramework", "applyFixes future failed", e);
                        Thread.currentThread().interrupt();
                        z = z2;
                        i++;
                    }
                    i++;
                } else {
                    i++;
                }
            } catch (InterruptedException | CancellationException | ExecutionException e3) {
                z2 = z;
                e = e3;
                Log.e("FixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
                z = z2;
                i++;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0270, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025c A[SYNTHETIC, Splitter:B:138:0x025c] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x027a A[SYNTHETIC, Splitter:B:158:0x027a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.inf a(defpackage.inb r20) {
        /*
            r19 = this;
            awyw r0 = defpackage.awyw.a
            awyx r0 = r0.a()
            boolean r0 = r0.j()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0298
            amzt r0 = new amzt     // Catch:{ all -> 0x0272 }
            r0.<init>()     // Catch:{ all -> 0x0272 }
            java.util.Map r3 = b     // Catch:{ all -> 0x0272 }
            monitor-enter(r3)     // Catch:{ all -> 0x0272 }
            java.util.Map r4 = b     // Catch:{ all -> 0x0269 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0269 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0269 }
        L_0x0020:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0269 }
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0269 }
            ine r5 = (defpackage.ine) r5     // Catch:{ all -> 0x0269 }
            imz r5 = r5.a()     // Catch:{ all -> 0x0269 }
            r0.c(r5)     // Catch:{ all -> 0x0269 }
            goto L_0x0020
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0269 }
            amzy r0 = r0.a()     // Catch:{ all -> 0x0272 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0272 }
            int r4 = r0.size()     // Catch:{ all -> 0x0272 }
            r3.<init>(r4)     // Catch:{ all -> 0x0272 }
            boolean r4 = defpackage.axbk.e()     // Catch:{ RuntimeException -> 0x0242 }
            if (r4 == 0) goto L_0x0072
            java.util.Iterator r4 = r0.iterator()     // Catch:{ RuntimeException -> 0x0242 }
        L_0x004c:
            boolean r5 = r4.hasNext()     // Catch:{ RuntimeException -> 0x0242 }
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r4.next()     // Catch:{ RuntimeException -> 0x0242 }
            imz r5 = (defpackage.imz) r5     // Catch:{ RuntimeException -> 0x0242 }
            r6 = r20
            boolean r5 = r5.a(r6)     // Catch:{ RuntimeException -> 0x0240 }
            if (r5 == 0) goto L_0x004c
            ilw r4 = a()     // Catch:{ RuntimeException -> 0x0240 }
            r5 = r6
            goto L_0x008e
        L_0x0066:
            r6 = r20
            inf r0 = new inf     // Catch:{ RuntimeException -> 0x0240 }
            aorr r3 = defpackage.aorl.a((java.lang.Object) r1)     // Catch:{ RuntimeException -> 0x0240 }
            r0.<init>(r2, r3)     // Catch:{ RuntimeException -> 0x0240 }
            return r0
        L_0x0072:
            r6 = r20
            ilw r4 = a()     // Catch:{ RuntimeException -> 0x0240 }
            java.util.List r5 = r4.a()     // Catch:{ RuntimeException -> 0x023e }
            ina r7 = r20.d()     // Catch:{ RuntimeException -> 0x023e }
            if (r5 == 0) goto L_0x0087
            amzy r5 = defpackage.amzy.a((java.util.Collection) r5)     // Catch:{ RuntimeException -> 0x023e }
            goto L_0x0088
        L_0x0087:
            r5 = r1
        L_0x0088:
            r7.d = r5     // Catch:{ RuntimeException -> 0x023e }
            inb r5 = r7.a()     // Catch:{ RuntimeException -> 0x023e }
        L_0x008e:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ RuntimeException -> 0x023b }
            r7 = 0
            r8 = 0
        L_0x0094:
            boolean r0 = r6.hasNext()     // Catch:{ RuntimeException -> 0x023b }
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r6.next()     // Catch:{ RuntimeException -> 0x023b }
            r9 = r0
            imz r9 = (defpackage.imz) r9     // Catch:{ RuntimeException -> 0x023b }
            ina r0 = r5.d()     // Catch:{ RuntimeException -> 0x023b }
            r0.h = r9     // Catch:{ RuntimeException -> 0x023b }
            inb r10 = r0.a()     // Catch:{ RuntimeException -> 0x023b }
            boolean r0 = r9.a(r10)     // Catch:{ RuntimeException -> 0x023b }
            if (r0 == 0) goto L_0x01b6
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x023b }
            amzy r0 = r9.c     // Catch:{ RuntimeException -> 0x023b }
            int r0 = r0.size()     // Catch:{ RuntimeException -> 0x023b }
            r12.<init>(r0)     // Catch:{ RuntimeException -> 0x023b }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x023b }
            r13.<init>()     // Catch:{ RuntimeException -> 0x023b }
            java.lang.String r0 = r9.a     // Catch:{ RuntimeException -> 0x023b }
            amzt r14 = defpackage.amzy.j()     // Catch:{ RuntimeException -> 0x023b }
            r15 = 0
        L_0x00c8:
            amzy r16 = r10.b()     // Catch:{ RuntimeException -> 0x023b }
            int r1 = r16.size()     // Catch:{ RuntimeException -> 0x023b }
            if (r15 >= r1) goto L_0x00ec
            amzy r1 = r10.b()     // Catch:{ RuntimeException -> 0x023b }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ RuntimeException -> 0x023b }
            imb r1 = (defpackage.imb) r1     // Catch:{ RuntimeException -> 0x023b }
            java.lang.String r11 = r1.a     // Catch:{ RuntimeException -> 0x023b }
            boolean r11 = r11.equals(r0)     // Catch:{ RuntimeException -> 0x023b }
            if (r11 != 0) goto L_0x00e5
            goto L_0x00e8
        L_0x00e5:
            r14.c(r1)     // Catch:{ RuntimeException -> 0x023b }
        L_0x00e8:
            int r15 = r15 + 1
            r1 = 0
            goto L_0x00c8
        L_0x00ec:
            amzy r0 = r14.a()     // Catch:{ RuntimeException -> 0x023b }
            r1 = 0
        L_0x00f1:
            int r11 = r0.size()     // Catch:{ RuntimeException -> 0x023b }
            if (r1 >= r11) goto L_0x0110
            java.lang.Object r11 = r0.get(r1)     // Catch:{ RuntimeException -> 0x023b }
            imb r11 = (defpackage.imb) r11     // Catch:{ RuntimeException -> 0x023b }
            java.lang.String r14 = r11.c     // Catch:{ RuntimeException -> 0x023b }
            r16 = r3
            long r2 = r11.e     // Catch:{ RuntimeException -> 0x023b }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ RuntimeException -> 0x023b }
            r13.put(r14, r2)     // Catch:{ RuntimeException -> 0x023b }
            int r1 = r1 + 1
            r3 = r16
            r2 = 0
            goto L_0x00f1
        L_0x0110:
            r16 = r3
            amzy r0 = r9.c     // Catch:{ RuntimeException -> 0x023b }
            anhk r1 = r0.listIterator()     // Catch:{ RuntimeException -> 0x023b }
        L_0x0118:
            boolean r0 = r1.hasNext()     // Catch:{ RuntimeException -> 0x023b }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r1.next()     // Catch:{ RuntimeException -> 0x023b }
            r2 = r0
            imt r2 = (defpackage.imt) r2     // Catch:{ RuntimeException -> 0x023b }
            boolean r0 = r2.a(r10)     // Catch:{ RuntimeException -> 0x0153 }
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = r2.a     // Catch:{ RuntimeException -> 0x023b }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ RuntimeException -> 0x023b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RuntimeException -> 0x023b }
            if (r0 == 0) goto L_0x014b
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException -> 0x023b }
            r11 = r13
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x023b }
            long r13 = r3.toSeconds(r13)     // Catch:{ RuntimeException -> 0x023b }
            long r17 = r0.longValue()     // Catch:{ RuntimeException -> 0x023b }
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0149
            goto L_0x014c
        L_0x0149:
            r13 = r11
            goto L_0x0118
        L_0x014b:
            r11 = r13
        L_0x014c:
            r12.add(r2)     // Catch:{ RuntimeException -> 0x023b }
            r13 = r11
            goto L_0x0118
        L_0x0151:
            r11 = r13
            goto L_0x0118
        L_0x0153:
            r0 = move-exception
            r11 = r13
            r3 = r0
            java.lang.String r0 = r2.a     // Catch:{ RuntimeException -> 0x023b }
            defpackage.ims.a(r3, r10, r0)     // Catch:{ RuntimeException -> 0x023b }
            r13 = r11
            goto L_0x0118
        L_0x015d:
            boolean r0 = r12.isEmpty()     // Catch:{ RuntimeException -> 0x023b }
            if (r0 == 0) goto L_0x0171
            imy r0 = new imy     // Catch:{ RuntimeException -> 0x023b }
            imx r1 = defpackage.imx.a     // Catch:{ RuntimeException -> 0x023b }
            aorr r1 = defpackage.aorl.a((java.lang.Object) r1)     // Catch:{ RuntimeException -> 0x023b }
            r2 = 0
            r0.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x023b }
            r2 = 1
            goto L_0x01c5
        L_0x0171:
            java.util.Iterator r0 = r12.iterator()     // Catch:{ RuntimeException -> 0x023b }
        L_0x0175:
            boolean r1 = r0.hasNext()     // Catch:{ RuntimeException -> 0x023b }
            if (r1 == 0) goto L_0x0198
            java.lang.Object r1 = r0.next()     // Catch:{ RuntimeException -> 0x023b }
            imt r1 = (defpackage.imt) r1     // Catch:{ RuntimeException -> 0x023b }
            ina r2 = r10.d()     // Catch:{ RuntimeException -> 0x023b }
            imu r3 = new imu     // Catch:{ RuntimeException -> 0x023b }
            java.lang.String r10 = r1.a     // Catch:{ RuntimeException -> 0x023b }
            r11 = 2
            r3.<init>(r10, r11)     // Catch:{ RuntimeException -> 0x023b }
            r2.a(r3)     // Catch:{ RuntimeException -> 0x023b }
            inb r10 = r2.a()     // Catch:{ RuntimeException -> 0x023b }
            r9.a((defpackage.inb) r10, (defpackage.imt) r1, (defpackage.ilw) r4)     // Catch:{ RuntimeException -> 0x023b }
            goto L_0x0175
        L_0x0198:
            boolean r0 = r9.d     // Catch:{ RuntimeException -> 0x023b }
            if (r0 == 0) goto L_0x01a6
            imv r0 = new imv     // Catch:{ RuntimeException -> 0x023b }
            r0.<init>(r9, r10, r4, r12)     // Catch:{ RuntimeException -> 0x023b }
            aorr r0 = defpackage.imf.a((java.util.concurrent.Callable) r0)     // Catch:{ RuntimeException -> 0x023b }
            goto L_0x01ae
        L_0x01a6:
            imx r0 = r9.a((defpackage.inb) r10, (defpackage.ilw) r4, (java.util.Set) r12)     // Catch:{ RuntimeException -> 0x023b }
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)     // Catch:{ RuntimeException -> 0x023b }
        L_0x01ae:
            imy r1 = new imy     // Catch:{ RuntimeException -> 0x023b }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x023b }
            r0 = r1
            goto L_0x01c5
        L_0x01b6:
            r16 = r3
            r2 = 1
            imy r0 = new imy     // Catch:{ RuntimeException -> 0x023b }
            imx r1 = defpackage.imx.a     // Catch:{ RuntimeException -> 0x023b }
            aorr r1 = defpackage.aorl.a((java.lang.Object) r1)     // Catch:{ RuntimeException -> 0x023b }
            r3 = 0
            r0.<init>(r3, r1)     // Catch:{ RuntimeException -> 0x023b }
        L_0x01c5:
            boolean r1 = r0.a     // Catch:{ RuntimeException -> 0x023b }
            if (r1 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r8 = 1
        L_0x01cb:
            aorr r1 = r0.b     // Catch:{ RuntimeException -> 0x023b }
            boolean r1 = r1.isDone()     // Catch:{ RuntimeException -> 0x023b }
            if (r1 == 0) goto L_0x01d4
            goto L_0x01d5
        L_0x01d4:
            r7 = 1
        L_0x01d5:
            aorr r0 = r0.b     // Catch:{ RuntimeException -> 0x023b }
            r1 = r16
            r1.add(r0)     // Catch:{ RuntimeException -> 0x023b }
            r3 = r1
            r1 = 0
            r2 = 0
            goto L_0x0094
        L_0x01e1:
            r1 = r3
            if (r7 == 0) goto L_0x01f5
            ind r0 = new ind     // Catch:{ all -> 0x01f0 }
            r0.<init>(r1, r5, r4)     // Catch:{ all -> 0x01f0 }
            aorr r0 = defpackage.imf.a((java.lang.Runnable) r0)     // Catch:{ all -> 0x01f0 }
            r1 = 0
            r2 = 0
            goto L_0x0210
        L_0x01f0:
            r0 = move-exception
            r1 = 0
            r2 = 0
            goto L_0x0278
        L_0x01f5:
            r2 = 0
            aorr r0 = defpackage.aorl.a((java.lang.Object) r2)     // Catch:{ all -> 0x0237 }
            awyw r2 = defpackage.awyw.a     // Catch:{ all -> 0x0237 }
            awyx r2 = r2.a()     // Catch:{ all -> 0x0237 }
            boolean r2 = r2.w()     // Catch:{ all -> 0x0237 }
            if (r2 != 0) goto L_0x020a
            r1 = r4
            r2 = 0
            goto L_0x0210
        L_0x020a:
            boolean r1 = a(r1, r5)     // Catch:{ all -> 0x0237 }
            r2 = r1
            r1 = r4
        L_0x0210:
            inf r3 = new inf     // Catch:{ all -> 0x0235 }
            r3.<init>(r8, r0)     // Catch:{ all -> 0x0235 }
            if (r1 == 0) goto L_0x0229
            r1.close()     // Catch:{ all -> 0x021b }
            goto L_0x0229
        L_0x021b:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x0228
            boolean r0 = defpackage.awyw.i()
            if (r0 == 0) goto L_0x0228
            defpackage.inm.a(r5)
        L_0x0228:
            throw r1
        L_0x0229:
            if (r2 == 0) goto L_0x0234
            boolean r0 = defpackage.awyw.i()
            if (r0 == 0) goto L_0x0234
            defpackage.inm.a(r5)
        L_0x0234:
            return r3
        L_0x0235:
            r0 = move-exception
            goto L_0x0278
        L_0x0237:
            r0 = move-exception
            r1 = r4
            r2 = 0
            goto L_0x0278
        L_0x023b:
            r0 = move-exception
            r6 = r5
            goto L_0x0246
        L_0x023e:
            r0 = move-exception
            goto L_0x0246
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r6 = r20
        L_0x0245:
            r4 = 0
        L_0x0246:
            android.content.Context r1 = r6.b     // Catch:{ all -> 0x0264 }
            aogr r2 = r6.a     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "FixerFramework"
            defpackage.ims.a(r0, r1, r2, r3)     // Catch:{ all -> 0x0264 }
            inf r0 = new inf     // Catch:{ all -> 0x0264 }
            r1 = 0
            aorr r1 = defpackage.aorl.a((java.lang.Object) r1)     // Catch:{ all -> 0x0264 }
            r2 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0264 }
            if (r4 == 0) goto L_0x0263
            r4.close()     // Catch:{ all -> 0x0260 }
            goto L_0x0263
        L_0x0260:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0263:
            return r0
        L_0x0264:
            r0 = move-exception
            r1 = r4
            r5 = r6
            r2 = 0
            goto L_0x0278
        L_0x0269:
            r0 = move-exception
            r6 = r20
        L_0x026c:
            monitor-exit(r3)     // Catch:{ all -> 0x0270 }
            throw r0     // Catch:{ all -> 0x026e }
        L_0x026e:
            r0 = move-exception
            goto L_0x0275
        L_0x0270:
            r0 = move-exception
            goto L_0x026c
        L_0x0272:
            r0 = move-exception
            r6 = r20
        L_0x0275:
            r5 = r6
            r1 = 0
            r2 = 0
        L_0x0278:
            if (r1 == 0) goto L_0x028c
            r1.close()     // Catch:{ all -> 0x027e }
            goto L_0x028c
        L_0x027e:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x028b
            boolean r0 = defpackage.awyw.i()
            if (r0 == 0) goto L_0x028b
            defpackage.inm.a(r5)
        L_0x028b:
            throw r1
        L_0x028c:
            if (r2 == 0) goto L_0x0297
            boolean r1 = defpackage.awyw.i()
            if (r1 == 0) goto L_0x0297
            defpackage.inm.a(r5)
        L_0x0297:
            throw r0
        L_0x0298:
            inf r0 = new inf
            r1 = 0
            aorr r1 = defpackage.aorl.a((java.lang.Object) r1)
            r2 = 0
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ing.a(inb):inf");
    }
}
