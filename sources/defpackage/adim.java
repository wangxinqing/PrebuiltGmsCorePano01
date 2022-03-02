package defpackage;

/* renamed from: adim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adim extends bhw implements adin {
    public adim() {
        super("com.google.android.gms.update.ISystemUpdateTvApiService");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.update.ISystemUpdateStatusCallback"
            r1 = 0
            switch(r3) {
                case 2: goto L_0x006c;
                case 3: goto L_0x0048;
                case 4: goto L_0x003d;
                case 5: goto L_0x002e;
                case 6: goto L_0x0027;
                case 7: goto L_0x0018;
                case 8: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.InstallationOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.InstallationOptions r3 = (com.google.android.gms.update.InstallationOptions) r3
            r2.a((com.google.android.gms.update.InstallationOptions) r3)
            r5.writeNoException()
            goto L_0x008b
        L_0x0018:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.DownloadOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.DownloadOptions r3 = (com.google.android.gms.update.DownloadOptions) r3
            r2.b((com.google.android.gms.update.DownloadOptions) r3)
            r5.writeNoException()
            goto L_0x008b
        L_0x0027:
            r2.b()
            r5.writeNoException()
            goto L_0x008b
        L_0x002e:
            android.os.Parcelable$Creator r3 = com.google.android.gms.update.DownloadOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.update.DownloadOptions r3 = (com.google.android.gms.update.DownloadOptions) r3
            r2.a((com.google.android.gms.update.DownloadOptions) r3)
            r5.writeNoException()
            goto L_0x008b
        L_0x003d:
            com.google.android.gms.update.SystemUpdateStatus r3 = r2.a()
            r5.writeNoException()
            defpackage.bhx.b(r5, r3)
            goto L_0x008b
        L_0x0048:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0060
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adil
            if (r0 == 0) goto L_0x005a
            r1 = r4
            adil r1 = (defpackage.adil) r1
            goto L_0x0061
        L_0x005a:
            adij r1 = new adij
            r1.<init>(r3)
            goto L_0x0061
        L_0x0060:
        L_0x0061:
            boolean r3 = r2.b((defpackage.adil) r1)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x008b
        L_0x006c:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0084
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adil
            if (r0 == 0) goto L_0x007e
            r1 = r4
            adil r1 = (defpackage.adil) r1
            goto L_0x0085
        L_0x007e:
            adij r1 = new adij
            r1.<init>(r3)
            goto L_0x0085
        L_0x0084:
        L_0x0085:
            r2.a((defpackage.adil) r1)
            r5.writeNoException()
        L_0x008b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adim.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
