package com.google.android.places;

import android.content.Context;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacesLoggingChimeraService extends IntentOperation {
    private final akie a = new akie(this);

    public static void a(Context context, aoei aoei) {
        iva.a((Object) context);
        iva.a((Object) aoei);
        context.startService(IntentOperation.getStartIntent(context, PlacesLoggingChimeraService.class, "com.google.android.places.LOG_PLACES_EVENT").putExtra("extra_places_event", aoei.k()));
    }

    public final void onCreate() {
        akie akie = this.a;
        if (akie.b == null) {
            akie.c = akif.a(akie.a.getApplicationContext()).a();
            akie.b = new hol(akie.a, "LE", (String) null);
        }
        if (akie.d == null) {
            akie.d = new rom(akie.a);
            akie.d.a();
        }
    }

    public final void onDestroy() {
        akie akie = this.a;
        reh reh = akie.e;
        if (reh != null) {
            akie.d.a(reh);
        }
        akie.d.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r12 != 4) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r12) {
        /*
            r11 = this;
            akie r0 = r11.a
            azbe r1 = defpackage.azbe.a
            azbf r1 = r1.a()
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0148
            if (r12 == 0) goto L_0x0148
            java.lang.String r1 = "extra_places_event"
            byte[] r12 = r12.getByteArrayExtra(r1)
            r1 = 5
            java.lang.String r2 = "Places"
            if (r12 == 0) goto L_0x013c
            aoei r3 = defpackage.aoei.w     // Catch:{ auda -> 0x012f }
            aucd r3 = r3.o()     // Catch:{ auda -> 0x012f }
            aubs r4 = defpackage.aubs.c()     // Catch:{ auda -> 0x012f }
            r3.b(r12, r4)     // Catch:{ auda -> 0x012f }
            android.content.Context r12 = r0.a
            java.lang.String r4 = "network"
            boolean r12 = defpackage.rns.a((android.content.Context) r12, (java.lang.String) r4)
            if (r12 == 0) goto L_0x0125
            aucj r12 = r3.b
            aoei r12 = (defpackage.aoei) r12
            int r12 = r12.c
            int r12 = defpackage.aoeh.a(r12)
            r4 = 1
            if (r12 != 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            r5 = 3
            if (r12 != r5) goto L_0x0044
            goto L_0x0084
        L_0x0044:
            aucj r12 = r3.b
            aoei r12 = (defpackage.aoei) r12
            int r12 = r12.c
            int r12 = defpackage.aoeh.a(r12)
            r5 = 4
            if (r12 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            if (r12 == r5) goto L_0x0084
        L_0x0054:
            aucj r12 = r3.b
            aoei r12 = (defpackage.aoei) r12
            int r12 = r12.c
            int r12 = defpackage.aoeh.a(r12)
            if (r12 != 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            if (r12 != r4) goto L_0x007a
        L_0x0063:
            aucj r12 = r3.b
            aoei r12 = (defpackage.aoei) r12
            aofe r12 = r12.i
            if (r12 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            aofe r12 = defpackage.aofe.s
        L_0x006e:
            int r12 = r12.b
            int r12 = defpackage.aofd.a(r12)
            if (r12 != 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            if (r12 != r5) goto L_0x007a
            goto L_0x0084
        L_0x007a:
            aucj r12 = r3.i()
            aoei r12 = (defpackage.aoei) r12
            r0.a(r12)
            return
        L_0x0084:
            azbe r12 = defpackage.azbe.a
            azbf r12 = r12.a()
            boolean r12 = r12.e()
            if (r12 == 0) goto L_0x011b
            azbe r12 = defpackage.azbe.a
            azbf r12 = r12.a()
            long r5 = r12.k()
            com.google.android.gms.location.LocationRequest r12 = com.google.android.gms.location.LocationRequest.a()
            r7 = 102(0x66, float:1.43E-43)
            r12.c((int) r7)
            r12.b((int) r4)
            r12.a((long) r5)
            azbe r7 = defpackage.azbe.a
            azbf r7 = r7.a()
            long r7 = r7.l()
            r12.c((long) r7)
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r7.<init>(r4)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            akid r8 = new akid
            r8.<init>(r4, r7)
            r0.e = r8
            java.lang.String r8 = "places_logging_service"
            com.google.android.gms.location.internal.LocationRequestInternal r12 = com.google.android.gms.location.internal.LocationRequestInternal.a(r8, r12)
            rom r8 = r0.d
            reh r9 = r0.e
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r8.a(r12, r9, r10)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00de }
            r7.await(r5, r12)     // Catch:{ InterruptedException -> 0x00de }
            goto L_0x00f1
        L_0x00de:
            r12 = move-exception
            boolean r12 = android.util.Log.isLoggable(r2, r1)
            if (r12 == 0) goto L_0x00ea
            java.lang.String r12 = "Thread interrupted waiting for location"
            defpackage.alfy.c(r2, r12)
        L_0x00ea:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L_0x00f1:
            r12 = 0
            r0.e = r12
            java.lang.Object r1 = r4.get()
            android.location.Location r1 = (android.location.Location) r1
            if (r1 == 0) goto L_0x0111
            azbe r2 = defpackage.azbe.a
            azbf r2 = r2.a()
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x010d
            com.google.android.gms.location.WifiScan r12 = com.google.android.gms.location.WifiScan.a((android.location.Location) r1)
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            defpackage.akig.a((defpackage.aucd) r3, (android.location.Location) r1, (com.google.android.gms.location.WifiScan) r12)
        L_0x0111:
            aucj r12 = r3.i()
            aoei r12 = (defpackage.aoei) r12
            r0.a(r12)
            return
        L_0x011b:
            aucj r12 = r3.i()
            aoei r12 = (defpackage.aoei) r12
            r0.a(r12)
            return
        L_0x0125:
            aucj r12 = r3.i()
            aoei r12 = (defpackage.aoei) r12
            r0.a(r12)
            return
        L_0x012f:
            r12 = move-exception
            boolean r12 = android.util.Log.isLoggable(r2, r1)
            if (r12 == 0) goto L_0x0148
            java.lang.String r12 = "Invalid contents of extra extra_places_event"
            defpackage.alfy.c(r2, r12)
            return
        L_0x013c:
            boolean r12 = android.util.Log.isLoggable(r2, r1)
            if (r12 == 0) goto L_0x0148
            java.lang.String r12 = "Missing intent extra extra_places_event"
            defpackage.alfy.c(r2, r12)
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.places.PlacesLoggingChimeraService.onHandleIntent(android.content.Intent):void");
    }
}
