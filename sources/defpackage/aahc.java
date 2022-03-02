package defpackage;

/* renamed from: aahc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aahc extends bhw implements aahd {
    public aahc() {
        super("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks"
            r1 = 0
            switch(r3) {
                case 2: goto L_0x00e1;
                case 3: goto L_0x00bc;
                case 4: goto L_0x009f;
                case 5: goto L_0x007a;
                case 6: goto L_0x0054;
                case 7: goto L_0x002e;
                case 8: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request r3 = (com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0028
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaha
            if (r1 == 0) goto L_0x0022
            r1 = r0
            aaha r1 = (defpackage.aaha) r1
            goto L_0x0029
        L_0x0022:
            aagy r1 = new aagy
            r1.<init>(r4)
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            r2.a((com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request) r3, (defpackage.aaha) r1)
            goto L_0x0105
        L_0x002e:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request r3 = (com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x004e
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaha
            if (r1 == 0) goto L_0x0048
            r1 = r0
            aaha r1 = (defpackage.aaha) r1
            goto L_0x004f
        L_0x0048:
            aagy r1 = new aagy
            r1.<init>(r4)
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            r2.a((com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request) r3, (defpackage.aaha) r1)
            goto L_0x0105
        L_0x0054:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request r3 = (com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0074
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaha
            if (r1 == 0) goto L_0x006e
            r1 = r0
            aaha r1 = (defpackage.aaha) r1
            goto L_0x0075
        L_0x006e:
            aagy r1 = new aagy
            r1.<init>(r4)
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            r2.a((com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request) r3, (defpackage.aaha) r1)
            goto L_0x0105
        L_0x007a:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request r3 = (com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x009a
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaha
            if (r1 == 0) goto L_0x0094
            r1 = r0
            aaha r1 = (defpackage.aaha) r1
            goto L_0x009b
        L_0x0094:
            aagy r1 = new aagy
            r1.<init>(r4)
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            r2.a((com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request) r3, (defpackage.aaha) r1)
            goto L_0x0105
        L_0x009f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00b7
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.aaha
            if (r0 == 0) goto L_0x00b1
            r1 = r4
            aaha r1 = (defpackage.aaha) r1
            goto L_0x00b8
        L_0x00b1:
            aagy r1 = new aagy
            r1.<init>(r3)
            goto L_0x00b8
        L_0x00b7:
        L_0x00b8:
            r2.a(r1)
            goto L_0x0105
        L_0x00bc:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x00dc
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaha
            if (r1 == 0) goto L_0x00d6
            r1 = r0
            aaha r1 = (defpackage.aaha) r1
            goto L_0x00dd
        L_0x00d6:
            aagy r1 = new aagy
            r1.<init>(r4)
            goto L_0x00dd
        L_0x00dc:
        L_0x00dd:
            r2.a((android.os.Bundle) r3, (defpackage.aaha) r1)
            goto L_0x0105
        L_0x00e1:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.administration.GetStorageStatsCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.administration.GetStorageStatsCall$Request r3 = (com.google.android.gms.search.administration.GetStorageStatsCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0101
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaha
            if (r1 == 0) goto L_0x00fb
            r1 = r0
            aaha r1 = (defpackage.aaha) r1
            goto L_0x0102
        L_0x00fb:
            aagy r1 = new aagy
            r1.<init>(r4)
            goto L_0x0102
        L_0x0101:
        L_0x0102:
            r2.a((com.google.android.gms.search.administration.GetStorageStatsCall$Request) r3, (defpackage.aaha) r1)
        L_0x0105:
            r5.writeNoException()
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aahc.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
