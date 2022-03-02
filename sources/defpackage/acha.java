package defpackage;

/* renamed from: acha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acha extends bhw implements achb {
    public acha() {
        super("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupService");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v7, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r2, android.os.Parcel r3, android.os.Parcel r4) {
        /*
            r1 = this;
            java.lang.String r4 = "com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x009e;
                case 3: goto L_0x0079;
                case 4: goto L_0x0054;
                case 5: goto L_0x002e;
                case 6: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0020
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x001a
            r0 = r4
            acgz r0 = (defpackage.acgz) r0
            goto L_0x0021
        L_0x001a:
            acgz r0 = new acgz
            r0.<init>(r2)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r2 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r2
            r1.d(r0, r2)
            goto L_0x00d7
        L_0x002e:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0046
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x0040
            r0 = r4
            acgz r0 = (defpackage.acgz) r0
            goto L_0x0047
        L_0x0040:
            acgz r0 = new acgz
            r0.<init>(r2)
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r2 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r2
            r1.c(r0, r2)
            goto L_0x00d7
        L_0x0054:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x006c
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x0066
            r0 = r4
            acgz r0 = (defpackage.acgz) r0
            goto L_0x006d
        L_0x0066:
            acgz r0 = new acgz
            r0.<init>(r2)
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r2 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r2
            r1.b(r0, r2)
            goto L_0x00d7
        L_0x0079:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0091
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x008b
            r0 = r4
            acgz r0 = (defpackage.acgz) r0
            goto L_0x0092
        L_0x008b:
            acgz r0 = new acgz
            r0.<init>(r2)
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r2 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r2
            r1.a(r0, r2)
            goto L_0x00d7
        L_0x009e:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00b6
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.acgz
            if (r4 == 0) goto L_0x00b0
            r0 = r3
            acgz r0 = (defpackage.acgz) r0
            goto L_0x00b7
        L_0x00b0:
            acgz r0 = new acgz
            r0.<init>(r2)
            goto L_0x00b7
        L_0x00b6:
        L_0x00b7:
            r1.b(r0)
            goto L_0x00d7
        L_0x00bb:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00d3
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.acgz
            if (r4 == 0) goto L_0x00cd
            r0 = r3
            acgz r0 = (defpackage.acgz) r0
            goto L_0x00d4
        L_0x00cd:
            acgz r0 = new acgz
            r0.<init>(r2)
            goto L_0x00d4
        L_0x00d3:
        L_0x00d4:
            r1.a(r0)
        L_0x00d7:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acha.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
