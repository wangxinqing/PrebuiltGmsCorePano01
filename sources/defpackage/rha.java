package defpackage;

import com.google.android.gms.location.persistent.LocationPersistentChimeraService;

/* renamed from: rha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rha implements Runnable {
    private final LocationPersistentChimeraService a;
    private final String b;
    private final rhb c;

    public rha(LocationPersistentChimeraService locationPersistentChimeraService, String str, rhb rhb) {
        this.a = locationPersistentChimeraService;
        this.b = str;
        this.c = rhb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = (defpackage.rhb) r0.b.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2.a((android.content.Context) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.location.persistent.LocationPersistentChimeraService r0 = r5.a
            java.lang.String r1 = r5.b
            rhb r2 = r5.c
            java.lang.Class<com.google.android.gms.location.persistent.LocationPersistentChimeraService> r3 = com.google.android.gms.location.persistent.LocationPersistentChimeraService.class
            monitor-enter(r3)
            java.lang.ref.WeakReference r4 = com.google.android.gms.location.persistent.LocationPersistentChimeraService.a     // Catch:{ all -> 0x0025 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0025 }
            if (r4 != r0) goto L_0x0023
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            nz r3 = r0.b
            java.lang.Object r1 = r3.put(r1, r2)
            rhb r1 = (defpackage.rhb) r1
            if (r1 == 0) goto L_0x001f
            r1.a()
        L_0x001f:
            r2.a((android.content.Context) r0)
            return
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rha.run():void");
    }
}
