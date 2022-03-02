package defpackage;

/* renamed from: rxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rxd extends bhw implements rxe {
    public rxd() {
        super("com.google.android.gms.mdd.IMobileDataDownloadService");
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [rwy] */
    /* JADX WARNING: type inference failed for: r2v5, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v9, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v13, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v17, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v21, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v25, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v29, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v33, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v37, types: [rxb] */
    /* JADX WARNING: type inference failed for: r2v41, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v45, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: type inference failed for: r2v53 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r2v55 */
    /* JADX WARNING: type inference failed for: r2v56 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: type inference failed for: r2v62 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: type inference failed for: r2v70 */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v72 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            java.lang.String r0 = "com.google.android.gms.mdd.IMddFileGroupCallback"
            java.lang.String r1 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r2 = 0
            switch(r4) {
                case 1: goto L_0x018f;
                case 2: goto L_0x0172;
                case 3: goto L_0x0151;
                case 4: goto L_0x0134;
                case 5: goto L_0x0116;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00d2;
                case 8: goto L_0x00b4;
                case 9: goto L_0x0096;
                case 10: goto L_0x0076;
                case 11: goto L_0x0056;
                case 12: goto L_0x0030;
                case 13: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r4 = 0
            return r4
        L_0x000a:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0022
            android.os.IInterface r0 = r4.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x001c
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0023
        L_0x001c:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdd.FileGroupRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdd.FileGroupRequest r4 = (com.google.android.gms.mdd.FileGroupRequest) r4
            r3.b(r2, r4)
            goto L_0x01b3
        L_0x0030:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0048
            android.os.IInterface r0 = r4.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0042
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0049
        L_0x0042:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdd.FileGroupRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdd.FileGroupRequest r4 = (com.google.android.gms.mdd.FileGroupRequest) r4
            r3.a((defpackage.ifu) r2, (com.google.android.gms.mdd.FileGroupRequest) r4)
            goto L_0x01b3
        L_0x0056:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x006c
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.rwy
            if (r1 == 0) goto L_0x0067
            rwy r0 = (defpackage.rwy) r0
            goto L_0x006c
        L_0x0067:
            rww r0 = new rww
            r0.<init>(r4)
        L_0x006c:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdd.FileGroupRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdd.FileGroupRequest r4 = (com.google.android.gms.mdd.FileGroupRequest) r4
            goto L_0x01b3
        L_0x0076:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0090
            java.lang.String r5 = "com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.rxb
            if (r0 == 0) goto L_0x008a
            r2 = r5
            rxb r2 = (defpackage.rxb) r2
            goto L_0x0091
        L_0x008a:
            rwz r2 = new rwz
            r2.<init>(r4)
            goto L_0x0091
        L_0x0090:
        L_0x0091:
            r3.a((defpackage.rxb) r2)
            goto L_0x01b3
        L_0x0096:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00ae
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x00a8
            r2 = r5
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00af
        L_0x00a8:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x00af
        L_0x00ae:
        L_0x00af:
            r3.b(r2)
            goto L_0x01b3
        L_0x00b4:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00cc
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x00c6
            r2 = r5
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00cd
        L_0x00c6:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            r3.e(r2)
            goto L_0x01b3
        L_0x00d2:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00ea
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x00e4
            r2 = r5
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00eb
        L_0x00e4:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x00eb
        L_0x00ea:
        L_0x00eb:
            r3.d(r2)
            goto L_0x01b3
        L_0x00f0:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0108
            android.os.IInterface r0 = r4.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0102
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0109
        L_0x0102:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x0109
        L_0x0108:
        L_0x0109:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdd.OverrideFileGroupRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdd.OverrideFileGroupRequest r4 = (com.google.android.gms.mdd.OverrideFileGroupRequest) r4
            r3.a((defpackage.ifu) r2, (com.google.android.gms.mdd.OverrideFileGroupRequest) r4)
            goto L_0x01b3
        L_0x0116:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x012e
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x0128
            r2 = r5
            ifu r2 = (defpackage.ifu) r2
            goto L_0x012f
        L_0x0128:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x012f
        L_0x012e:
        L_0x012f:
            r3.f(r2)
            goto L_0x01b3
        L_0x0134:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x014c
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x0146
            r2 = r5
            ifu r2 = (defpackage.ifu) r2
            goto L_0x014d
        L_0x0146:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x014d
        L_0x014c:
        L_0x014d:
            r3.c(r2)
            goto L_0x01b3
        L_0x0151:
            boolean r4 = defpackage.bhx.a(r5)
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x016d
            android.os.IInterface r0 = r5.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0167
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            goto L_0x016e
        L_0x0167:
            ifs r2 = new ifs
            r2.<init>(r5)
            goto L_0x016e
        L_0x016d:
        L_0x016e:
            r3.a((boolean) r4, (defpackage.ifu) r2)
            goto L_0x01b3
        L_0x0172:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x018a
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x0184
            r2 = r5
            ifu r2 = (defpackage.ifu) r2
            goto L_0x018b
        L_0x0184:
            ifs r2 = new ifs
            r2.<init>(r4)
            goto L_0x018b
        L_0x018a:
        L_0x018b:
            r3.a((defpackage.ifu) r2)
            goto L_0x01b3
        L_0x018f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x01a7
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.rwy
            if (r1 == 0) goto L_0x01a1
            r2 = r0
            rwy r2 = (defpackage.rwy) r2
            goto L_0x01a8
        L_0x01a1:
            rww r2 = new rww
            r2.<init>(r4)
            goto L_0x01a8
        L_0x01a7:
        L_0x01a8:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdd.FileGroupRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdd.FileGroupRequest r4 = (com.google.android.gms.mdd.FileGroupRequest) r4
            r3.a((defpackage.rwy) r2, (com.google.android.gms.mdd.FileGroupRequest) r4)
        L_0x01b3:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
