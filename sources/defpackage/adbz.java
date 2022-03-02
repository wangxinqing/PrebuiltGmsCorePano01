package defpackage;

/* renamed from: adbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adbz extends bhw implements adca {
    public adbz() {
        super("com.google.android.gms.udc.internal.IUdcService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.udc.internal.IUdcCallbacks"
            r1 = 0
            switch(r3) {
                case 1: goto L_0x017b;
                case 2: goto L_0x015a;
                case 3: goto L_0x0139;
                case 4: goto L_0x0118;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00b6;
                case 8: goto L_0x0090;
                case 9: goto L_0x006a;
                case 10: goto L_0x0044;
                case 11: goto L_0x0026;
                case 12: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0020
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adbx
            if (r0 == 0) goto L_0x001a
            r1 = r4
            adbx r1 = (defpackage.adbx) r1
            goto L_0x0021
        L_0x001a:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            r2.c(r1)
            goto L_0x019b
        L_0x0026:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x003e
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adbx
            if (r0 == 0) goto L_0x0038
            r1 = r4
            adbx r1 = (defpackage.adbx) r1
            goto L_0x003f
        L_0x0038:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            r2.b(r1)
            goto L_0x019b
        L_0x0044:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x005c
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x0056
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x005d
        L_0x0056:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            android.os.Parcelable$Creator r3 = com.google.android.gms.udc.UdcWriteLocalSettingsRequest.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.udc.UdcWriteLocalSettingsRequest r3 = (com.google.android.gms.udc.UdcWriteLocalSettingsRequest) r3
            r2.a((defpackage.adbx) r1, (com.google.android.gms.udc.UdcWriteLocalSettingsRequest) r3)
            goto L_0x019b
        L_0x006a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0082
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x007c
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x0083
        L_0x007c:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x0083
        L_0x0082:
        L_0x0083:
            android.os.Parcelable$Creator r3 = com.google.android.gms.udc.UdcSettingsListActivityRequest.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.udc.UdcSettingsListActivityRequest r3 = (com.google.android.gms.udc.UdcSettingsListActivityRequest) r3
            r2.a((defpackage.adbx) r1, (com.google.android.gms.udc.UdcSettingsListActivityRequest) r3)
            goto L_0x019b
        L_0x0090:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00a8
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x00a2
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x00a9
        L_0x00a2:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            android.os.Parcelable$Creator r3 = com.google.android.gms.udc.UdcCacheRequest.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.udc.UdcCacheRequest r3 = (com.google.android.gms.udc.UdcCacheRequest) r3
            r2.a((defpackage.adbx) r1, (com.google.android.gms.udc.UdcCacheRequest) r3)
            goto L_0x019b
        L_0x00b6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00ce
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x00c8
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x00cf
        L_0x00c8:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x00cf
        L_0x00ce:
        L_0x00cf:
            byte[] r3 = r4.createByteArray()
            r2.f(r1, r3)
            goto L_0x019b
        L_0x00d8:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00f0
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.adbx
            if (r0 == 0) goto L_0x00ea
            r1 = r4
            adbx r1 = (defpackage.adbx) r1
            goto L_0x00f1
        L_0x00ea:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            r2.a(r1)
            goto L_0x019b
        L_0x00f6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x010e
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x0108
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x010f
        L_0x0108:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x010f
        L_0x010e:
        L_0x010f:
            byte[] r3 = r4.createByteArray()
            r2.e(r1, r3)
            goto L_0x019b
        L_0x0118:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0130
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x012a
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x0131
        L_0x012a:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x0131
        L_0x0130:
        L_0x0131:
            byte[] r3 = r4.createByteArray()
            r2.d(r1, r3)
            goto L_0x019b
        L_0x0139:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0151
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x014b
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x0152
        L_0x014b:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x0152
        L_0x0151:
        L_0x0152:
            byte[] r3 = r4.createByteArray()
            r2.c(r1, r3)
            goto L_0x019b
        L_0x015a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0172
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x016c
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x0173
        L_0x016c:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x0173
        L_0x0172:
        L_0x0173:
            byte[] r3 = r4.createByteArray()
            r2.b(r1, r3)
            goto L_0x019b
        L_0x017b:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0193
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.adbx
            if (r1 == 0) goto L_0x018d
            r1 = r0
            adbx r1 = (defpackage.adbx) r1
            goto L_0x0194
        L_0x018d:
            adbv r1 = new adbv
            r1.<init>(r3)
            goto L_0x0194
        L_0x0193:
        L_0x0194:
            byte[] r3 = r4.createByteArray()
            r2.a((defpackage.adbx) r1, (byte[]) r3)
        L_0x019b:
            r5.writeNoException()
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbz.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
