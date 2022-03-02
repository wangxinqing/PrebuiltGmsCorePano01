package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvd implements ahtp {
    private final ajrh a;
    private final Context b;
    private final CountDownLatch c;
    private boolean d = false;
    private final ahvc e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r3.b != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if (new java.io.File(r0).getCanonicalPath().toLowerCase(java.util.Locale.ENGLISH).startsWith(android.os.Environment.getExternalStorageDirectory().getCanonicalPath().toLowerCase(java.util.Locale.ENGLISH)) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahvd(defpackage.ajbg r17, android.content.Context r18, defpackage.ahsg r19, defpackage.ahyk r20, defpackage.ajbl r21, java.lang.Integer r22, defpackage.aqek r23, defpackage.ahss r24, defpackage.ajrh r25) {
        /*
            r16 = this;
            r1 = r16
            r16.<init>()
            r0 = 0
            r1.d = r0
            defpackage.amrl.a((java.lang.Object) r18)
            defpackage.amrl.a((java.lang.Object) r19)
            java.lang.String r2 = r18.getPackageName()
            java.util.regex.Pattern r3 = defpackage.ahre.a
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            java.lang.String r2 = "com.google.android.apps.maps"
        L_0x0021:
            java.util.Map r3 = defpackage.ahre.b
            java.lang.Object r3 = r3.get(r2)
            ahrd r3 = (defpackage.ahrd) r3
            r4 = 1
            if (r3 == 0) goto L_0x00b2
            r2 = r19
            com.google.android.location.collectionlib.RealCollectorConfig r2 = (com.google.android.location.collectionlib.RealCollectorConfig) r2
            int r5 = r2.i
            java.lang.String r0 = r2.d
            if (r0 == 0) goto L_0x005f
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x005a }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x005a }
            r7.<init>(r0)     // Catch:{ IOException -> 0x005a }
            java.lang.String r0 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x005a }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x005a }
            java.lang.String r0 = r0.toLowerCase(r7)     // Catch:{ IOException -> 0x005a }
            java.lang.String r6 = r6.getCanonicalPath()     // Catch:{ IOException -> 0x005a }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x005a }
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch:{ IOException -> 0x005a }
            boolean r0 = r0.startsWith(r6)     // Catch:{ IOException -> 0x005a }
            if (r0 == 0) goto L_0x005f
            goto L_0x005b
        L_0x005a:
            r0 = move-exception
        L_0x005b:
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x00aa
        L_0x005f:
            r0 = 3
            if (r5 == r0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            boolean r0 = r3.c
            if (r0 == 0) goto L_0x00aa
        L_0x0067:
            boolean r0 = r2.g
            if (r0 != 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            boolean r0 = r3.e
            if (r0 == 0) goto L_0x00aa
        L_0x0070:
            java.util.Set r0 = r3.d
            java.util.Set r2 = r2.c
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x00aa
            ajrh r0 = defpackage.ahvx.a((defpackage.ajrh) r25)
            r1.a = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r4)
            r1.c = r0
            android.content.Context r0 = r18.getApplicationContext()
            r1.b = r0
            ahvc r0 = new ahvc
            android.content.Context r7 = r1.b
            java.util.concurrent.CountDownLatch r9 = r1.c
            ajrh r15 = r1.a
            r5 = r0
            r6 = r17
            r8 = r19
            r10 = r20
            r11 = r21
            r12 = r23
            r13 = r22
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.e = r0
            return
        L_0x00aa:
            ahrf r0 = new ahrf
            java.lang.String r2 = "Some features are prohibited from use by this application. Please contact lbs-team@google.com"
            r0.<init>(r2)
            throw r0
        L_0x00b2:
            ahrf r3 = new ahrf
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r2
            java.lang.String r0 = "%s cannot access to this library. Please contact lbs-team@google.com."
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvd.<init>(ajbg, android.content.Context, ahsg, ahyk, ajbl, java.lang.Integer, aqek, ahss, ajrh):void");
    }

    public final synchronized void a() {
        amrl.a(!this.d, (Object) "Start should be called only once!");
        this.d = true;
        this.e.start();
        try {
            this.c.await();
        } catch (InterruptedException e2) {
        }
    }

    public final void b() {
        ahvc ahvc = this.e;
        synchronized (ahvc.f) {
            ahvc.g = true;
            if (ahvc.d != null && ahvc.isAlive()) {
                ahvc.d.a();
            }
        }
    }

    public final void c() {
        ahsg ahsg;
        ahvc ahvc = this.e;
        synchronized (ahvc.f) {
            ahvc.g = true;
            if (ahvc.d != null && ahvc.isAlive()) {
                ahuc ahuc = ahvc.d;
                ahuc.a();
                ahsr ahsr = ahuc.d;
                if (ahsr != null) {
                    ahsr.a();
                }
                if (!(ahuc.g == null || (ahsg = ahuc.i) == null)) {
                    for (ahup a2 : ahsg.c()) {
                        ahuc.g.a(ahuc.f, a2);
                    }
                }
            }
        }
    }
}
