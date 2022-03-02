package defpackage;

/* renamed from: mfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mfc extends bhw implements mfd {
    public mfc() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks"
            r2 = 0
            if (r5 == r0) goto L_0x00a2
            r3 = 2
            if (r5 == r3) goto L_0x0079
            r3 = 3
            if (r5 == r3) goto L_0x0054
            r3 = 4
            if (r5 == r3) goto L_0x0036
            r3 = 5
            if (r5 == r3) goto L_0x0014
            r5 = 0
            return r5
        L_0x0014:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x002c
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mfa
            if (r2 == 0) goto L_0x0026
            r2 = r1
            mfa r2 = (defpackage.mfa) r2
            goto L_0x002d
        L_0x0026:
            mey r2 = new mey
            r2.<init>(r5)
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            byte[] r5 = r6.createByteArray()
            r4.a((defpackage.mfa) r2, (byte[]) r5)
            goto L_0x00c6
        L_0x0036:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x004e
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.mfa
            if (r1 == 0) goto L_0x0048
            r2 = r6
            mfa r2 = (defpackage.mfa) r2
            goto L_0x004f
        L_0x0048:
            mey r2 = new mey
            r2.<init>(r5)
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            r4.a(r2)
            goto L_0x00c6
        L_0x0054:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x006c
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mfa
            if (r2 == 0) goto L_0x0066
            r2 = r1
            mfa r2 = (defpackage.mfa) r2
            goto L_0x006d
        L_0x0066:
            mey r2 = new mey
            r2.<init>(r5)
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.facs.cache.FacsCacheCallOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.facs.cache.FacsCacheCallOptions r5 = (com.google.android.gms.facs.cache.FacsCacheCallOptions) r5
            r4.b(r2, r5)
            goto L_0x00c6
        L_0x0079:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0091
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mfa
            if (r2 == 0) goto L_0x008b
            r2 = r1
            mfa r2 = (defpackage.mfa) r2
            goto L_0x0092
        L_0x008b:
            mey r2 = new mey
            r2.<init>(r5)
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            byte[] r5 = r6.createByteArray()
            android.os.Parcelable$Creator r1 = com.google.android.gms.facs.cache.FacsCacheCallOptions.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.facs.cache.FacsCacheCallOptions r6 = (com.google.android.gms.facs.cache.FacsCacheCallOptions) r6
            r4.a(r2, r5, r6)
            goto L_0x00c6
        L_0x00a2:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00ba
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mfa
            if (r2 == 0) goto L_0x00b4
            r2 = r1
            mfa r2 = (defpackage.mfa) r2
            goto L_0x00bb
        L_0x00b4:
            mey r2 = new mey
            r2.<init>(r5)
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            android.os.Parcelable$Creator r5 = com.google.android.gms.facs.cache.FacsCacheCallOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.facs.cache.FacsCacheCallOptions r5 = (com.google.android.gms.facs.cache.FacsCacheCallOptions) r5
            r4.a((defpackage.mfa) r2, (com.google.android.gms.facs.cache.FacsCacheCallOptions) r5)
        L_0x00c6:
            r7.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfc.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
