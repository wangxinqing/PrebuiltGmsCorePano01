package defpackage;

/* renamed from: alfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alfv implements acvp {
    final /* synthetic */ rei a;
    final /* synthetic */ long b;
    final /* synthetic */ iby c;

    public alfv(rei rei, iby iby, long j) {
        this.a = rei;
        this.c = iby;
        this.b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if ((android.os.SystemClock.elapsedRealtimeNanos() - r9.getElapsedRealtimeNanos()) <= defpackage.azci.a.a().f()) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.acwa r9) {
        /*
            r8 = this;
            boolean r0 = r9.b()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.Object r9 = r9.d()
            android.location.Location r9 = (android.location.Location) r9
            goto L_0x000f
        L_0x000e:
            r9 = r1
        L_0x000f:
            if (r9 == 0) goto L_0x002c
            int r0 = android.os.Build.VERSION.SDK_INT
            azci r0 = defpackage.azci.a
            azcj r0 = r0.a()
            long r2 = r0.f()
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            long r6 = r9.getElapsedRealtimeNanos()
            long r4 = r4 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            goto L_0x002d
        L_0x002c:
            r1 = r9
        L_0x002d:
            if (r1 != 0) goto L_0x005d
            iby r9 = r8.c
            rei r0 = r8.a
            long r1 = r8.b
            com.google.android.gms.location.LocationRequest r3 = com.google.android.gms.location.LocationRequest.a()
            r4 = 102(0x66, float:1.43E-43)
            r3.c((int) r4)
            r3.a((long) r1)
            long r1 = defpackage.alfx.a
            r3.c((long) r1)
            r1 = 10
            r3.b((long) r1)
            r1 = 1
            r3.b((int) r1)
            java.lang.String r1 = "places_get_current_place"
            com.google.android.gms.location.internal.LocationRequestInternal r1 = com.google.android.gms.location.internal.LocationRequestInternal.a(r1, r3)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r9.a((com.google.android.gms.location.internal.LocationRequestInternal) r1, (defpackage.rei) r0, (android.os.Looper) r2)
            return
        L_0x005d:
            rei r9 = r8.a
            r9.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alfv.a(acwa):void");
    }
}
