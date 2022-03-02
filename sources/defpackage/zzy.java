package defpackage;

/* renamed from: zzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class zzy extends bhw implements zzz {
    public zzy() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v14, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v15, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v16, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 14 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r9, android.os.Parcel r10, android.os.Parcel r11) {
        /*
            r8 = this;
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks"
            r1 = 0
            switch(r9) {
                case 1: goto L_0x01e1;
                case 2: goto L_0x01c4;
                case 3: goto L_0x0194;
                case 4: goto L_0x0176;
                case 5: goto L_0x0158;
                case 6: goto L_0x0136;
                case 7: goto L_0x0110;
                case 8: goto L_0x0006;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00c8;
                case 11: goto L_0x00b7;
                case 12: goto L_0x0099;
                case 13: goto L_0x0094;
                case 14: goto L_0x0076;
                case 15: goto L_0x0006;
                case 16: goto L_0x0006;
                case 17: goto L_0x0006;
                case 18: goto L_0x0050;
                case 19: goto L_0x002e;
                case 20: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r9 = 0
            return r9
        L_0x0008:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0020
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x001a
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x0021
        L_0x001a:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            java.lang.String r9 = r10.readString()
            byte[] r10 = r10.createByteArray()
            r8.a((defpackage.zzw) r1, (java.lang.String) r9, (byte[]) r10)
            goto L_0x0201
        L_0x002e:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0046
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x0040
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x0047
        L_0x0040:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            int r9 = r10.readInt()
            r8.a((defpackage.zzw) r1, (int) r9)
            goto L_0x0201
        L_0x0050:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0068
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x0062
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x0069
        L_0x0062:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            int r9 = r10.readInt()
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.zzw) r1, (int) r9, (java.lang.String) r10)
            goto L_0x0201
        L_0x0076:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x008e
            android.os.IInterface r10 = r9.queryLocalInterface(r0)
            boolean r0 = r10 instanceof defpackage.zzw
            if (r0 == 0) goto L_0x0088
            r1 = r10
            zzw r1 = (defpackage.zzw) r1
            goto L_0x008f
        L_0x0088:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            r8.d(r1)
            goto L_0x0201
        L_0x0094:
            r8.b()
            goto L_0x0201
        L_0x0099:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x00b1
            android.os.IInterface r10 = r9.queryLocalInterface(r0)
            boolean r0 = r10 instanceof defpackage.zzw
            if (r0 == 0) goto L_0x00ab
            r1 = r10
            zzw r1 = (defpackage.zzw) r1
            goto L_0x00b2
        L_0x00ab:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            r8.b(r1)
            goto L_0x0201
        L_0x00b7:
            int r9 = r10.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r0)
            android.os.Bundle r10 = (android.os.Bundle) r10
            r8.a((int) r9, (android.os.Bundle) r10)
            goto L_0x0201
        L_0x00c8:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x00e0
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x00da
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x00e1
        L_0x00da:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            java.lang.String r9 = r10.readString()
            int r0 = r10.readInt()
            byte[] r10 = r10.createByteArray()
            r8.a(r1, r9, r0, r10)
            goto L_0x0201
        L_0x00f2:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x010a
            android.os.IInterface r10 = r9.queryLocalInterface(r0)
            boolean r0 = r10 instanceof defpackage.zzw
            if (r0 == 0) goto L_0x0104
            r1 = r10
            zzw r1 = (defpackage.zzw) r1
            goto L_0x010b
        L_0x0104:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x010b
        L_0x010a:
        L_0x010b:
            r8.c(r1)
            goto L_0x0201
        L_0x0110:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0128
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x0122
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x0129
        L_0x0122:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x0129
        L_0x0128:
        L_0x0129:
            byte[] r9 = r10.createByteArray()
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.zzw) r1, (byte[]) r9, (java.lang.String) r10)
            goto L_0x0201
        L_0x0136:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x014e
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x0148
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x014f
        L_0x0148:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x014f
        L_0x014e:
        L_0x014f:
            java.lang.String r9 = r10.readString()
            r8.a((defpackage.zzw) r1, (java.lang.String) r9)
            goto L_0x0201
        L_0x0158:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0170
            android.os.IInterface r10 = r9.queryLocalInterface(r0)
            boolean r0 = r10 instanceof defpackage.zzw
            if (r0 == 0) goto L_0x016a
            r1 = r10
            zzw r1 = (defpackage.zzw) r1
            goto L_0x0171
        L_0x016a:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x0171
        L_0x0170:
        L_0x0171:
            r8.f(r1)
            goto L_0x0201
        L_0x0176:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x018e
            android.os.IInterface r10 = r9.queryLocalInterface(r0)
            boolean r0 = r10 instanceof defpackage.zzw
            if (r0 == 0) goto L_0x0188
            r1 = r10
            zzw r1 = (defpackage.zzw) r1
            goto L_0x018f
        L_0x0188:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x018f
        L_0x018e:
        L_0x018f:
            r8.e(r1)
            goto L_0x0201
        L_0x0194:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x01ad
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x01a7
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            r3 = r1
            goto L_0x01af
        L_0x01a7:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x01ae
        L_0x01ad:
        L_0x01ae:
            r3 = r1
        L_0x01af:
            java.lang.String r4 = r10.readString()
            int[] r5 = r10.createIntArray()
            int r6 = r10.readInt()
            java.lang.String r7 = r10.readString()
            r2 = r8
            r2.a(r3, r4, r5, r6, r7)
            goto L_0x0201
        L_0x01c4:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x01dc
            android.os.IInterface r10 = r9.queryLocalInterface(r0)
            boolean r0 = r10 instanceof defpackage.zzw
            if (r0 == 0) goto L_0x01d6
            r1 = r10
            zzw r1 = (defpackage.zzw) r1
            goto L_0x01dd
        L_0x01d6:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x01dd
        L_0x01dc:
        L_0x01dd:
            r8.a(r1)
            goto L_0x0201
        L_0x01e1:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x01f9
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zzw
            if (r1 == 0) goto L_0x01f3
            r1 = r0
            zzw r1 = (defpackage.zzw) r1
            goto L_0x01fa
        L_0x01f3:
            zzu r1 = new zzu
            r1.<init>(r9)
            goto L_0x01fa
        L_0x01f9:
        L_0x01fa:
            byte[] r9 = r10.createByteArray()
            r8.a((defpackage.zzw) r1, (byte[]) r9)
        L_0x0201:
            r11.writeNoException()
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzy.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
