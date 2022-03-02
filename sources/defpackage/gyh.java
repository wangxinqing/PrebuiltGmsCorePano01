package defpackage;

/* renamed from: gyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gyh extends bhw implements gyi {
    public gyh() {
        super("com.google.android.gms.checkin.internal.ICheckinApiService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v6, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v11, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v15, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v19, types: [gyf] */
    /* JADX WARNING: type inference failed for: r1v23, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r1 = 0
            switch(r3) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x0088;
                case 3: goto L_0x006b;
                case 4: goto L_0x004e;
                case 5: goto L_0x002e;
                case 6: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0020
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x001a
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0021
        L_0x001a:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            r2.a((defpackage.ifu) r1, (android.accounts.Account) r3)
            goto L_0x00d1
        L_0x002e:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0048
            java.lang.String r4 = "com.google.android.gms.checkin.internal.ICheckinApiCallbacks"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.gyf
            if (r0 == 0) goto L_0x0042
            r1 = r4
            gyf r1 = (defpackage.gyf) r1
            goto L_0x0049
        L_0x0042:
            gyd r1 = new gyd
            r1.<init>(r3)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            r2.a((defpackage.gyf) r1)
            goto L_0x00d1
        L_0x004e:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0066
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x0060
            r1 = r4
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0067
        L_0x0060:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x0067
        L_0x0066:
        L_0x0067:
            r2.b(r1)
            goto L_0x00d1
        L_0x006b:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0083
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x007d
            r1 = r4
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0084
        L_0x007d:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            r2.a((defpackage.ifu) r1)
            goto L_0x00d1
        L_0x0088:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00a0
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x009a
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x00a1
        L_0x009a:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.b(r1, r3)
            goto L_0x00d1
        L_0x00ad:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00c5
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x00bf
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x00c6
        L_0x00bf:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x00c6
        L_0x00c5:
        L_0x00c6:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.a((defpackage.ifu) r1, (android.os.Bundle) r3)
        L_0x00d1:
            r5.writeNoException()
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyh.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
