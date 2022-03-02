package defpackage;

/* renamed from: aajy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aajy extends bhw implements aajz {
    public aajy() {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 2
            java.lang.String r1 = "com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks"
            r2 = 0
            if (r4 == r0) goto L_0x00ab
            r0 = 3
            if (r4 == r0) goto L_0x0086
            r0 = 4
            if (r4 == r0) goto L_0x0061
            r0 = 5
            if (r4 == r0) goto L_0x003b
            r0 = 8
            if (r4 == r0) goto L_0x0015
            r4 = 0
            return r4
        L_0x0015:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request r4 = (com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x0035
            android.os.IInterface r0 = r5.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.aajw
            if (r1 == 0) goto L_0x002f
            r2 = r0
            aajw r2 = (defpackage.aajw) r2
            goto L_0x0036
        L_0x002f:
            aaju r2 = new aaju
            r2.<init>(r5)
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            r3.a((com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request) r4, (defpackage.aajw) r2)
            goto L_0x00cf
        L_0x003b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request r4 = (com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x005b
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.aajw
            if (r0 == 0) goto L_0x0055
            r2 = r5
            aajw r2 = (defpackage.aajw) r2
            goto L_0x005c
        L_0x0055:
            aaju r2 = new aaju
            r2.<init>(r4)
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            r3.b(r2)
            goto L_0x00cf
        L_0x0061:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request r4 = (com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0081
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.aajw
            if (r0 == 0) goto L_0x007b
            r2 = r5
            aajw r2 = (defpackage.aajw) r2
            goto L_0x0082
        L_0x007b:
            aaju r2 = new aaju
            r2.<init>(r4)
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            r3.a(r2)
            goto L_0x00cf
        L_0x0086:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.global.SetExperimentIdsCall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.global.SetExperimentIdsCall$Request r4 = (com.google.android.gms.search.global.SetExperimentIdsCall$Request) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00a6
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.aajw
            if (r0 == 0) goto L_0x00a0
            r2 = r5
            aajw r2 = (defpackage.aajw) r2
            goto L_0x00a7
        L_0x00a0:
            aaju r2 = new aaju
            r2.<init>(r4)
            goto L_0x00a7
        L_0x00a6:
        L_0x00a7:
            r3.c(r2)
            goto L_0x00cf
        L_0x00ab:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request r4 = (com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x00cb
            android.os.IInterface r0 = r5.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.aajw
            if (r1 == 0) goto L_0x00c5
            r2 = r0
            aajw r2 = (defpackage.aajw) r2
            goto L_0x00cc
        L_0x00c5:
            aaju r2 = new aaju
            r2.<init>(r5)
            goto L_0x00cc
        L_0x00cb:
        L_0x00cc:
            r3.a((com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request) r4, (defpackage.aajw) r2)
        L_0x00cf:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajy.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
