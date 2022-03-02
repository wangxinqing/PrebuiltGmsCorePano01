package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: azx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azx {
    static final bar a = bar.a("t", "s", "e", "o", "i", "h", "to", "ti");
    private static final Interpolator b = new LinearInterpolator();
    private static ov c;

    azx() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.bbc a(defpackage.auk r16, defpackage.bat r17, float r18, defpackage.bao r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Class<azx> r3 = defpackage.azx.class
            r17.c()
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r14 = r11
            r15 = r14
            r7 = 0
            r13 = 0
        L_0x0017:
            boolean r12 = r17.e()
            if (r12 == 0) goto L_0x0058
            bar r12 = a
            int r12 = r0.a((defpackage.bar) r12)
            switch(r12) {
                case 0: goto L_0x0052;
                case 1: goto L_0x004d;
                case 2: goto L_0x0048;
                case 3: goto L_0x0043;
                case 4: goto L_0x003e;
                case 5: goto L_0x0034;
                case 6: goto L_0x002f;
                case 7: goto L_0x002a;
                default: goto L_0x0026;
            }
        L_0x0026:
            r17.l()
            goto L_0x0017
        L_0x002a:
            android.graphics.PointF r14 = defpackage.azw.b(r17, r18)
            goto L_0x0017
        L_0x002f:
            android.graphics.PointF r15 = defpackage.azw.b(r17, r18)
            goto L_0x0017
        L_0x0034:
            int r7 = r17.k()
            if (r7 != r4) goto L_0x003c
            r7 = 1
            goto L_0x0017
        L_0x003c:
            r7 = 0
            goto L_0x0017
        L_0x003e:
            android.graphics.PointF r9 = defpackage.azw.b(r17, r18)
            goto L_0x0017
        L_0x0043:
            android.graphics.PointF r8 = defpackage.azw.b(r17, r18)
            goto L_0x0017
        L_0x0048:
            java.lang.Object r11 = r2.a(r0, r1)
            goto L_0x0017
        L_0x004d:
            java.lang.Object r10 = r2.a(r0, r1)
            goto L_0x0017
        L_0x0052:
            double r12 = r17.j()
            float r13 = (float) r12
            goto L_0x0017
        L_0x0058:
            r17.d()
            if (r7 == 0) goto L_0x0063
            android.view.animation.Interpolator r0 = b
            r12 = r0
            r11 = r10
            goto L_0x00e9
        L_0x0063:
            if (r8 != 0) goto L_0x0067
        L_0x0065:
            goto L_0x00e6
        L_0x0067:
            if (r9 == 0) goto L_0x0065
            float r0 = -r1
            float r2 = r8.x
            float r2 = defpackage.bba.b(r2, r0, r1)
            r8.x = r2
            float r2 = r8.y
            r4 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            float r2 = defpackage.bba.b(r2, r4, r5)
            r8.y = r2
            float r2 = r9.x
            float r0 = defpackage.bba.b(r2, r0, r1)
            r9.x = r0
            float r0 = r9.y
            float r0 = defpackage.bba.b(r0, r4, r5)
            r9.y = r0
            float r0 = r8.x
            float r2 = r8.y
            float r4 = r9.x
            float r5 = r9.y
            int r0 = defpackage.bbb.a((float) r0, (float) r2, (float) r4, (float) r5)
            monitor-enter(r3)
            ov r2 = c     // Catch:{ all -> 0x00e3 }
            if (r2 != 0) goto L_0x00a6
            ov r2 = new ov     // Catch:{ all -> 0x00e3 }
            r2.<init>()     // Catch:{ all -> 0x00e3 }
            c = r2     // Catch:{ all -> 0x00e3 }
        L_0x00a6:
            ov r2 = c     // Catch:{ all -> 0x00e3 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x00e3 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r4 = r2.get()
            r6 = r4
            android.view.animation.Interpolator r6 = (android.view.animation.Interpolator) r6
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            if (r2 != 0) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            if (r6 == 0) goto L_0x00c0
        L_0x00bf:
            goto L_0x00e1
        L_0x00c0:
            float r2 = r8.x
            float r2 = r2 / r1
            float r4 = r8.y
            float r4 = r4 / r1
            float r5 = r9.x
            float r5 = r5 / r1
            float r6 = r9.y
            float r6 = r6 / r1
            android.view.animation.Interpolator r6 = defpackage.rg.a(r2, r4, r5, r6)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e0 }
            r1.<init>(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e0 }
            monitor-enter(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e0 }
            ov r2 = c     // Catch:{ all -> 0x00dd }
            r2.b(r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r3)     // Catch:{ all -> 0x00dd }
            goto L_0x00bf
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            r12 = r6
            goto L_0x00e9
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            throw r0
        L_0x00e6:
            android.view.animation.Interpolator r0 = b
            r12 = r0
        L_0x00e9:
            bbc r0 = new bbc
            r1 = 0
            r8 = r0
            r9 = r16
            r6 = r14
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.k = r15
            r0.l = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azx.a(auk, bat, float, bao):bbc");
    }

    static bbc a(bat bat, auk auk, float f, bao bao, boolean z) {
        if (!z) {
            return new bbc(bao.a(bat, f));
        }
        return a(auk, bat, f, bao);
    }
}
