package defpackage;

/* renamed from: adie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adie extends bhw implements adif {
    public adie() {
        super("com.google.android.gms.update.ISystemUpdateApiService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [adil] */
    /* JADX WARNING: type inference failed for: r1v5, types: [adil] */
    /* JADX WARNING: type inference failed for: r1v9, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.update.ISystemUpdateStatusCallback"
            r1 = 0
            switch(r3) {
                case 2: goto L_0x00e3;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00a9;
                case 6: goto L_0x009a;
                case 7: goto L_0x0093;
                case 8: goto L_0x0083;
                case 9: goto L_0x007b;
                case 10: goto L_0x006b;
                case 11: goto L_0x0063;
                case 12: goto L_0x0053;
                case 13: goto L_0x004b;
                case 14: goto L_0x003f;
                case 15: goto L_0x0014;
                case 16: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            long r3 = r2.h()
            r5.writeNoException()
            r5.writeLong(r3)
            goto L_0x0102
        L_0x0014:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0028
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x002f
        L_0x0028:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.ConfigUpdateOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.ConfigUpdateOptions r3 = (com.google.android.gms.update.ConfigUpdateOptions) r3
            r2.a(r1, r3)
            r5.writeNoException()
            goto L_0x0102
        L_0x003f:
            boolean r3 = r2.g()
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x0102
        L_0x004b:
            r2.f()
            r5.writeNoException()
            goto L_0x0102
        L_0x0053:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.InstallationOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.InstallationOptions r3 = (com.google.android.gms.update.InstallationOptions) r3
            r2.b((com.google.android.gms.update.InstallationOptions) r3)
            r5.writeNoException()
            goto L_0x0102
        L_0x0063:
            r2.e()
            r5.writeNoException()
            goto L_0x0102
        L_0x006b:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.ActivityStatus.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.ActivityStatus r3 = (com.google.android.gms.update.ActivityStatus) r3
            r2.a((com.google.android.gms.update.ActivityStatus) r3)
            r5.writeNoException()
            goto L_0x0102
        L_0x007b:
            r2.d()
            r5.writeNoException()
            goto L_0x0102
        L_0x0083:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.DownloadOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.DownloadOptions r3 = (com.google.android.gms.update.DownloadOptions) r3
            r2.b((com.google.android.gms.update.DownloadOptions) r3)
            r5.writeNoException()
            goto L_0x0102
        L_0x0093:
            r2.c()
            r5.writeNoException()
            goto L_0x0102
        L_0x009a:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.InstallationOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.InstallationOptions r3 = (com.google.android.gms.update.InstallationOptions) r3
            r2.a((com.google.android.gms.update.InstallationOptions) r3)
            r5.writeNoException()
            goto L_0x0102
        L_0x00a9:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.DownloadOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.DownloadOptions r3 = (com.google.android.gms.update.DownloadOptions) r3
            r2.a((com.google.android.gms.update.DownloadOptions) r3)
            r5.writeNoException()
            goto L_0x0102
        L_0x00b8:
            com.google.android.gms.update.SystemUpdateStatus r3 = r2.b()
            r5.writeNoException()
            defpackage.bhx.b(r5, r3)
            goto L_0x0102
        L_0x00c3:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00db
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adil
            if (r0 == 0) goto L_0x00d5
            r1 = r4
            adil r1 = (defpackage.adil) r1
            goto L_0x00dc
        L_0x00d5:
            adij r1 = new adij
            r1.<init>(r3)
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
            r2.b((defpackage.adil) r1)
            r5.writeNoException()
            goto L_0x0102
        L_0x00e3:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00fb
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adil
            if (r0 == 0) goto L_0x00f5
            r1 = r4
            adil r1 = (defpackage.adil) r1
            goto L_0x00fc
        L_0x00f5:
            adij r1 = new adij
            r1.<init>(r3)
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            r2.a((defpackage.adil) r1)
            r5.writeNoException()
        L_0x0102:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adie.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
