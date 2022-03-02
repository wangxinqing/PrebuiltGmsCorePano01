package defpackage;

/* renamed from: abxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abxs extends bhw implements abxt {
    public abxs() {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: abwu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: acgz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: acgz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: acgz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: acgz} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [abxn] */
    /* JADX WARNING: type inference failed for: r3v5, types: [abxn] */
    /* JADX WARNING: type inference failed for: r3v9, types: [abxq] */
    /* JADX WARNING: type inference failed for: r3v13, types: [abxq] */
    /* JADX WARNING: type inference failed for: r3v21, types: [abxq] */
    /* JADX WARNING: type inference failed for: r3v37, types: [abxq] */
    /* JADX WARNING: type inference failed for: r3v45, types: [abxq] */
    /* JADX WARNING: type inference failed for: r3v49, types: [abxq] */
    /* JADX WARNING: type inference failed for: r3v53 */
    /* JADX WARNING: type inference failed for: r3v54 */
    /* JADX WARNING: type inference failed for: r3v55 */
    /* JADX WARNING: type inference failed for: r3v56 */
    /* JADX WARNING: type inference failed for: r3v57 */
    /* JADX WARNING: type inference failed for: r3v58 */
    /* JADX WARNING: type inference failed for: r3v59 */
    /* JADX WARNING: type inference failed for: r3v60 */
    /* JADX WARNING: type inference failed for: r3v61 */
    /* JADX WARNING: type inference failed for: r3v62 */
    /* JADX WARNING: type inference failed for: r3v63 */
    /* JADX WARNING: type inference failed for: r3v64 */
    /* JADX WARNING: type inference failed for: r3v65 */
    /* JADX WARNING: type inference failed for: r3v66 */
    /* JADX WARNING: type inference failed for: r3v67 */
    /* JADX WARNING: type inference failed for: r3v68 */
    /* JADX WARNING: type inference failed for: r3v69 */
    /* JADX WARNING: type inference failed for: r3v70 */
    /* JADX WARNING: type inference failed for: r3v71 */
    /* JADX WARNING: type inference failed for: r3v72 */
    /* JADX WARNING: type inference failed for: r3v73 */
    /* JADX WARNING: type inference failed for: r3v74 */
    /* JADX WARNING: type inference failed for: r3v75 */
    /* JADX WARNING: type inference failed for: r3v76 */
    /* JADX WARNING: type inference failed for: r3v77 */
    /* JADX WARNING: type inference failed for: r3v78 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener"
            java.lang.String r1 = "com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks"
            java.lang.String r2 = "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks"
            r3 = 0
            switch(r5) {
                case 1: goto L_0x0222;
                case 2: goto L_0x01e5;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01b3;
                case 5: goto L_0x0195;
                case 6: goto L_0x000a;
                case 7: goto L_0x000a;
                case 8: goto L_0x000a;
                case 9: goto L_0x000a;
                case 10: goto L_0x014d;
                case 11: goto L_0x012f;
                case 12: goto L_0x000a;
                case 13: goto L_0x0111;
                case 14: goto L_0x00f3;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00af;
                case 17: goto L_0x0089;
                case 18: goto L_0x006b;
                case 19: goto L_0x004d;
                case 20: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            r5 = 0
            return r5
        L_0x000c:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0022
            android.os.IInterface r7 = r5.queryLocalInterface(r2)
            boolean r0 = r7 instanceof defpackage.abxq
            if (r0 == 0) goto L_0x001d
            abxq r7 = (defpackage.abxq) r7
            goto L_0x0022
        L_0x001d:
            abxo r7 = new abxo
            r7.<init>(r5)
        L_0x0022:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.d2d.BootstrapOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r5 = (com.google.android.gms.smartdevice.d2d.BootstrapOptions) r5
            android.os.Parcelable$Creator r5 = android.os.ParcelFileDescriptor.CREATOR
            java.lang.Object[] r5 = r6.createTypedArray(r5)
            android.os.ParcelFileDescriptor[] r5 = (android.os.ParcelFileDescriptor[]) r5
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x025e
            java.lang.String r6 = "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2"
            android.os.IInterface r6 = r5.queryLocalInterface(r6)
            boolean r7 = r6 instanceof defpackage.abwv
            if (r7 == 0) goto L_0x0046
            abwv r6 = (defpackage.abwv) r6
            goto L_0x025e
        L_0x0046:
            abwv r6 = new abwv
            r6.<init>(r5)
            goto L_0x025e
        L_0x004d:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0065
            android.os.IInterface r6 = r5.queryLocalInterface(r2)
            boolean r7 = r6 instanceof defpackage.abxq
            if (r7 == 0) goto L_0x005f
            r3 = r6
            abxq r3 = (defpackage.abxq) r3
            goto L_0x0066
        L_0x005f:
            abxo r3 = new abxo
            r3.<init>(r5)
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            r4.c(r3)
            goto L_0x025e
        L_0x006b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0083
            android.os.IInterface r6 = r5.queryLocalInterface(r2)
            boolean r7 = r6 instanceof defpackage.abxq
            if (r7 == 0) goto L_0x007d
            r3 = r6
            abxq r3 = (defpackage.abxq) r3
            goto L_0x0084
        L_0x007d:
            abxo r3 = new abxo
            r3.<init>(r5)
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            r4.f(r3)
            goto L_0x025e
        L_0x0089:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00a1
            android.os.IInterface r7 = r5.queryLocalInterface(r1)
            boolean r0 = r7 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x009b
            r3 = r7
            acgz r3 = (defpackage.acgz) r3
            goto L_0x00a2
        L_0x009b:
            acgz r3 = new acgz
            r3.<init>(r5)
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r5 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r5
            r4.b(r3, r5)
            goto L_0x025e
        L_0x00af:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00c7
            android.os.IInterface r6 = r5.queryLocalInterface(r2)
            boolean r7 = r6 instanceof defpackage.abxq
            if (r7 == 0) goto L_0x00c1
            r3 = r6
            abxq r3 = (defpackage.abxq) r3
            goto L_0x00c8
        L_0x00c1:
            abxo r3 = new abxo
            r3.<init>(r5)
            goto L_0x00c8
        L_0x00c7:
        L_0x00c8:
            r4.e(r3)
            goto L_0x025e
        L_0x00cd:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00e5
            android.os.IInterface r7 = r5.queryLocalInterface(r1)
            boolean r0 = r7 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x00df
            r3 = r7
            acgz r3 = (defpackage.acgz) r3
            goto L_0x00e6
        L_0x00df:
            acgz r3 = new acgz
            r3.<init>(r5)
            goto L_0x00e6
        L_0x00e5:
        L_0x00e6:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r5 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r5
            r4.a((defpackage.acgz) r3, (com.google.android.gms.smartdevice.postsetup.HandshakeData) r5)
            goto L_0x025e
        L_0x00f3:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x010b
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r7 = r6 instanceof defpackage.acgz
            if (r7 == 0) goto L_0x0105
            r3 = r6
            acgz r3 = (defpackage.acgz) r3
            goto L_0x010c
        L_0x0105:
            acgz r3 = new acgz
            r3.<init>(r5)
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            r4.b((defpackage.acgz) r3)
            goto L_0x025e
        L_0x0111:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0129
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r7 = r6 instanceof defpackage.acgz
            if (r7 == 0) goto L_0x0123
            r3 = r6
            acgz r3 = (defpackage.acgz) r3
            goto L_0x012a
        L_0x0123:
            acgz r3 = new acgz
            r3.<init>(r5)
            goto L_0x012a
        L_0x0129:
        L_0x012a:
            r4.a((defpackage.acgz) r3)
            goto L_0x025e
        L_0x012f:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0147
            android.os.IInterface r6 = r5.queryLocalInterface(r2)
            boolean r7 = r6 instanceof defpackage.abxq
            if (r7 == 0) goto L_0x0141
            r3 = r6
            abxq r3 = (defpackage.abxq) r3
            goto L_0x0148
        L_0x0141:
            abxo r3 = new abxo
            r3.<init>(r5)
            goto L_0x0148
        L_0x0147:
        L_0x0148:
            r4.d(r3)
            goto L_0x025e
        L_0x014d:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0164
            android.os.IInterface r7 = r5.queryLocalInterface(r2)
            boolean r0 = r7 instanceof defpackage.abxq
            if (r0 == 0) goto L_0x015e
            abxq r7 = (defpackage.abxq) r7
            goto L_0x0165
        L_0x015e:
            abxo r7 = new abxo
            r7.<init>(r5)
            goto L_0x0165
        L_0x0164:
            r7 = r3
        L_0x0165:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.d2d.BootstrapOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r5 = (com.google.android.gms.smartdevice.d2d.BootstrapOptions) r5
            android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
            java.lang.Object[] r0 = r6.createTypedArray(r0)
            android.os.ParcelFileDescriptor[] r0 = (android.os.ParcelFileDescriptor[]) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x018f
            java.lang.String r1 = "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.abwu
            if (r2 == 0) goto L_0x0189
            r3 = r1
            abwu r3 = (defpackage.abwu) r3
            goto L_0x0190
        L_0x0189:
            abwu r3 = new abwu
            r3.<init>(r6)
            goto L_0x0190
        L_0x018f:
        L_0x0190:
            r4.a(r7, r5, r0, r3)
            goto L_0x025e
        L_0x0195:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x01ad
            android.os.IInterface r6 = r5.queryLocalInterface(r2)
            boolean r7 = r6 instanceof defpackage.abxq
            if (r7 == 0) goto L_0x01a7
            r3 = r6
            abxq r3 = (defpackage.abxq) r3
            goto L_0x01ae
        L_0x01a7:
            abxo r3 = new abxo
            r3.<init>(r5)
            goto L_0x01ae
        L_0x01ad:
        L_0x01ae:
            r4.b((defpackage.abxq) r3)
            goto L_0x025e
        L_0x01b3:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.d2d.BootstrapOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r5 = (com.google.android.gms.smartdevice.d2d.BootstrapOptions) r5
            java.lang.String r5 = r4.a((com.google.android.gms.smartdevice.d2d.BootstrapOptions) r5)
            r7.writeNoException()
            r7.writeString(r5)
            goto L_0x025e
        L_0x01c7:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x01df
            android.os.IInterface r6 = r5.queryLocalInterface(r2)
            boolean r7 = r6 instanceof defpackage.abxq
            if (r7 == 0) goto L_0x01d9
            r3 = r6
            abxq r3 = (defpackage.abxq) r3
            goto L_0x01e0
        L_0x01d9:
            abxo r3 = new abxo
            r3.<init>(r5)
            goto L_0x01e0
        L_0x01df:
        L_0x01e0:
            r4.a((defpackage.abxq) r3)
            goto L_0x025e
        L_0x01e5:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x01fc
            android.os.IInterface r7 = r5.queryLocalInterface(r2)
            boolean r1 = r7 instanceof defpackage.abxq
            if (r1 == 0) goto L_0x01f6
            abxq r7 = (defpackage.abxq) r7
            goto L_0x01fd
        L_0x01f6:
            abxo r7 = new abxo
            r7.<init>(r5)
            goto L_0x01fd
        L_0x01fc:
            r7 = r3
        L_0x01fd:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.d2d.BootstrapOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r5 = (com.google.android.gms.smartdevice.d2d.BootstrapOptions) r5
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x021d
            android.os.IInterface r6 = r5.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxn
            if (r0 == 0) goto L_0x0217
            r3 = r6
            abxn r3 = (defpackage.abxn) r3
            goto L_0x021e
        L_0x0217:
            abxl r3 = new abxl
            r3.<init>(r5)
            goto L_0x021e
        L_0x021d:
        L_0x021e:
            r4.a((defpackage.abxq) r7, (defpackage.abxn) r3)
            goto L_0x025e
        L_0x0222:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0239
            android.os.IInterface r7 = r5.queryLocalInterface(r2)
            boolean r1 = r7 instanceof defpackage.abxq
            if (r1 == 0) goto L_0x0233
            abxq r7 = (defpackage.abxq) r7
            goto L_0x023a
        L_0x0233:
            abxo r7 = new abxo
            r7.<init>(r5)
            goto L_0x023a
        L_0x0239:
            r7 = r3
        L_0x023a:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.d2d.BootstrapOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r5 = (com.google.android.gms.smartdevice.d2d.BootstrapOptions) r5
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x025a
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.abxn
            if (r1 == 0) goto L_0x0254
            r3 = r0
            abxn r3 = (defpackage.abxn) r3
            goto L_0x025b
        L_0x0254:
            abxl r3 = new abxl
            r3.<init>(r6)
            goto L_0x025b
        L_0x025a:
        L_0x025b:
            r4.a(r7, r5, r3)
        L_0x025e:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abxs.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
