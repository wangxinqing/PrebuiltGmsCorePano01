package defpackage;

/* renamed from: abxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abxg extends bhw implements abxh {
    public abxg() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: abwu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: acgz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: acgz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: acgz} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v5, types: [abxk] */
    /* JADX WARNING: type inference failed for: r1v9, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v13, types: [abxb] */
    /* JADX WARNING: type inference failed for: r1v18, types: [abwy] */
    /* JADX WARNING: type inference failed for: r1v23, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v27, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v31, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v35, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v39, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v48, types: [abxe] */
    /* JADX WARNING: type inference failed for: r1v64 */
    /* JADX WARNING: type inference failed for: r1v65 */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: type inference failed for: r1v68 */
    /* JADX WARNING: type inference failed for: r1v69 */
    /* JADX WARNING: type inference failed for: r1v70 */
    /* JADX WARNING: type inference failed for: r1v71 */
    /* JADX WARNING: type inference failed for: r1v72 */
    /* JADX WARNING: type inference failed for: r1v73 */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: type inference failed for: r1v76 */
    /* JADX WARNING: type inference failed for: r1v77 */
    /* JADX WARNING: type inference failed for: r1v78 */
    /* JADX WARNING: type inference failed for: r1v79 */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* JADX WARNING: type inference failed for: r1v81 */
    /* JADX WARNING: type inference failed for: r1v82 */
    /* JADX WARNING: type inference failed for: r1v83 */
    /* JADX WARNING: type inference failed for: r1v84 */
    /* JADX WARNING: type inference failed for: r1v85 */
    /* JADX WARNING: type inference failed for: r1v86 */
    /* JADX WARNING: type inference failed for: r1v87 */
    /* JADX WARNING: type inference failed for: r1v88 */
    /* JADX WARNING: type inference failed for: r1v89 */
    /* JADX WARNING: type inference failed for: r1v90 */
    /* JADX WARNING: type inference failed for: r1v91 */
    /* JADX WARNING: type inference failed for: r1v92 */
    /* JADX WARNING: type inference failed for: r1v93 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r6 = 16
            java.lang.String r0 = "com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks"
            r1 = 0
            if (r4 == r6) goto L_0x02b6
            switch(r4) {
                case 1: goto L_0x027f;
                case 2: goto L_0x0262;
                case 3: goto L_0x021f;
                case 4: goto L_0x01d8;
                case 5: goto L_0x01b6;
                case 6: goto L_0x0198;
                case 7: goto L_0x0172;
                case 8: goto L_0x014c;
                case 9: goto L_0x012e;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00c9;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r6 = "com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks"
            switch(r4) {
                case 19: goto L_0x00ab;
                case 20: goto L_0x0085;
                case 21: goto L_0x005f;
                case 22: goto L_0x0052;
                case 23: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r4 = 0
            return r4
        L_0x0011:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0027
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x0022
            abxe r6 = (defpackage.abxe) r6
            goto L_0x0027
        L_0x0022:
            abxc r6 = new abxc
            r6.<init>(r4)
        L_0x0027:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.d2d.BootstrapConfigurations.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.d2d.BootstrapConfigurations r4 = (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r4
            android.os.Parcelable$Creator r4 = android.os.ParcelFileDescriptor.CREATOR
            java.lang.Object[] r4 = r5.createTypedArray(r4)
            android.os.ParcelFileDescriptor[] r4 = (android.os.ParcelFileDescriptor[]) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x02da
            java.lang.String r5 = "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r6 = r5 instanceof defpackage.abwv
            if (r6 == 0) goto L_0x004b
            abwv r5 = (defpackage.abwv) r5
            goto L_0x02da
        L_0x004b:
            abwv r5 = new abwv
            r5.<init>(r4)
            goto L_0x02da
        L_0x0052:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.d2d.internal.ConnectParams.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.d2d.internal.ConnectParams r4 = (com.google.android.gms.smartdevice.d2d.internal.ConnectParams) r4
            r3.a((com.google.android.gms.smartdevice.d2d.internal.ConnectParams) r4)
            goto L_0x02da
        L_0x005f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0077
            android.os.IInterface r6 = r4.queryLocalInterface(r6)
            boolean r0 = r6 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x0071
            r1 = r6
            acgz r1 = (defpackage.acgz) r1
            goto L_0x0078
        L_0x0071:
            acgz r1 = new acgz
            r1.<init>(r4)
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r4 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r4
            r3.b((defpackage.acgz) r1, (com.google.android.gms.smartdevice.postsetup.HandshakeData) r4)
            goto L_0x02da
        L_0x0085:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x009d
            android.os.IInterface r6 = r4.queryLocalInterface(r6)
            boolean r0 = r6 instanceof defpackage.acgz
            if (r0 == 0) goto L_0x0097
            r1 = r6
            acgz r1 = (defpackage.acgz) r1
            goto L_0x009e
        L_0x0097:
            acgz r1 = new acgz
            r1.<init>(r4)
            goto L_0x009e
        L_0x009d:
        L_0x009e:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.postsetup.HandshakeData.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.postsetup.HandshakeData r4 = (com.google.android.gms.smartdevice.postsetup.HandshakeData) r4
            r3.a((defpackage.acgz) r1, (com.google.android.gms.smartdevice.postsetup.HandshakeData) r4)
            goto L_0x02da
        L_0x00ab:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00c3
            android.os.IInterface r5 = r4.queryLocalInterface(r6)
            boolean r6 = r5 instanceof defpackage.acgz
            if (r6 == 0) goto L_0x00bd
            r1 = r5
            acgz r1 = (defpackage.acgz) r1
            goto L_0x00c4
        L_0x00bd:
            acgz r1 = new acgz
            r1.<init>(r4)
            goto L_0x00c4
        L_0x00c3:
        L_0x00c4:
            r3.a((defpackage.acgz) r1)
            goto L_0x02da
        L_0x00c9:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00e1
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r6 = r5 instanceof defpackage.abxe
            if (r6 == 0) goto L_0x00db
            r1 = r5
            abxe r1 = (defpackage.abxe) r1
            goto L_0x00e2
        L_0x00db:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x00e2
        L_0x00e1:
        L_0x00e2:
            r3.d(r1)
            goto L_0x02da
        L_0x00e7:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00fe
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x00f8
            abxe r6 = (defpackage.abxe) r6
            goto L_0x00ff
        L_0x00f8:
            abxc r6 = new abxc
            r6.<init>(r4)
            goto L_0x00ff
        L_0x00fe:
            r6 = r1
        L_0x00ff:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.d2d.BootstrapConfigurations.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.d2d.BootstrapConfigurations r4 = (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r4
            android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
            java.lang.Object[] r0 = r5.createTypedArray(r0)
            android.os.ParcelFileDescriptor[] r0 = (android.os.ParcelFileDescriptor[]) r0
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x0128
            java.lang.String r1 = "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.abwu
            if (r2 == 0) goto L_0x0122
            abwu r1 = (defpackage.abwu) r1
            goto L_0x0129
        L_0x0122:
            abwu r1 = new abwu
            r1.<init>(r5)
            goto L_0x0129
        L_0x0128:
        L_0x0129:
            r3.a((defpackage.abxe) r6, (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r4, (android.os.ParcelFileDescriptor[]) r0, (defpackage.abwu) r1)
            goto L_0x02da
        L_0x012e:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0146
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r6 = r5 instanceof defpackage.abxe
            if (r6 == 0) goto L_0x0140
            r1 = r5
            abxe r1 = (defpackage.abxe) r1
            goto L_0x0147
        L_0x0140:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x0147
        L_0x0146:
        L_0x0147:
            r3.c(r1)
            goto L_0x02da
        L_0x014c:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0164
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x015e
            r1 = r6
            abxe r1 = (defpackage.abxe) r1
            goto L_0x0165
        L_0x015e:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x0165
        L_0x0164:
        L_0x0165:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.d2d.BootstrapConfigurations.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.d2d.BootstrapConfigurations r4 = (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r4
            r3.a((defpackage.abxe) r1, (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r4)
            goto L_0x02da
        L_0x0172:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x018a
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x0184
            r1 = r6
            abxe r1 = (defpackage.abxe) r1
            goto L_0x018b
        L_0x0184:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x018b
        L_0x018a:
        L_0x018b:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r3.a((defpackage.abxe) r1, (android.os.Bundle) r4)
            goto L_0x02da
        L_0x0198:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x01b0
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r6 = r5 instanceof defpackage.abxe
            if (r6 == 0) goto L_0x01aa
            r1 = r5
            abxe r1 = (defpackage.abxe) r1
            goto L_0x01b1
        L_0x01aa:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x01b1
        L_0x01b0:
        L_0x01b1:
            r3.b(r1)
            goto L_0x02da
        L_0x01b6:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x01ce
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x01c8
            r1 = r6
            abxe r1 = (defpackage.abxe) r1
            goto L_0x01cf
        L_0x01c8:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x01cf
        L_0x01ce:
        L_0x01cf:
            java.lang.String r4 = r5.readString()
            r3.a((defpackage.abxe) r1, (java.lang.String) r4)
            goto L_0x02da
        L_0x01d8:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x01ef
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x01e9
            abxe r6 = (defpackage.abxe) r6
            goto L_0x01f0
        L_0x01e9:
            abxc r6 = new abxc
            r6.<init>(r4)
            goto L_0x01f0
        L_0x01ef:
            r6 = r1
        L_0x01f0:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.d2d.D2DDevice.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.d2d.D2DDevice r4 = (com.google.android.gms.smartdevice.d2d.D2DDevice) r4
            android.os.Parcelable$Creator r0 = com.google.android.gms.smartdevice.d2d.BootstrapConfigurations.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.smartdevice.d2d.BootstrapConfigurations r0 = (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r0
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x0219
            java.lang.String r1 = "com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.abwy
            if (r2 == 0) goto L_0x0213
            abwy r1 = (defpackage.abwy) r1
            goto L_0x021a
        L_0x0213:
            abww r1 = new abww
            r1.<init>(r5)
            goto L_0x021a
        L_0x0219:
        L_0x021a:
            r3.a((defpackage.abxe) r6, (com.google.android.gms.smartdevice.d2d.D2DDevice) r4, (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r0, (defpackage.abwy) r1)
            goto L_0x02da
        L_0x021f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0236
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x0230
            abxe r6 = (defpackage.abxe) r6
            goto L_0x0237
        L_0x0230:
            abxc r6 = new abxc
            r6.<init>(r4)
            goto L_0x0237
        L_0x0236:
            r6 = r1
        L_0x0237:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.d2d.D2DDevice.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.smartdevice.d2d.D2DDevice r4 = (com.google.android.gms.smartdevice.d2d.D2DDevice) r4
            java.lang.String r0 = r5.readString()
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x025c
            java.lang.String r1 = "com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.abxb
            if (r2 == 0) goto L_0x0256
            abxb r1 = (defpackage.abxb) r1
            goto L_0x025d
        L_0x0256:
            abwz r1 = new abwz
            r1.<init>(r5)
            goto L_0x025d
        L_0x025c:
        L_0x025d:
            r3.a((defpackage.abxe) r6, (com.google.android.gms.smartdevice.d2d.D2DDevice) r4, (java.lang.String) r0, (defpackage.abxb) r1)
            goto L_0x02da
        L_0x0262:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x027a
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r6 = r5 instanceof defpackage.abxe
            if (r6 == 0) goto L_0x0274
            r1 = r5
            abxe r1 = (defpackage.abxe) r1
            goto L_0x027b
        L_0x0274:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x027b
        L_0x027a:
        L_0x027b:
            r3.a((defpackage.abxe) r1)
            goto L_0x02da
        L_0x027f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0296
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x0290
            abxe r6 = (defpackage.abxe) r6
            goto L_0x0297
        L_0x0290:
            abxc r6 = new abxc
            r6.<init>(r4)
            goto L_0x0297
        L_0x0296:
            r6 = r1
        L_0x0297:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x02b1
            java.lang.String r5 = "com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.abxk
            if (r0 == 0) goto L_0x02ab
            r1 = r5
            abxk r1 = (defpackage.abxk) r1
            goto L_0x02b2
        L_0x02ab:
            abxi r1 = new abxi
            r1.<init>(r4)
            goto L_0x02b2
        L_0x02b1:
        L_0x02b2:
            r3.a((defpackage.abxe) r6, (defpackage.abxk) r1)
            goto L_0x02da
        L_0x02b6:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x02ce
            android.os.IInterface r6 = r4.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.abxe
            if (r0 == 0) goto L_0x02c8
            r1 = r6
            abxe r1 = (defpackage.abxe) r1
            goto L_0x02cf
        L_0x02c8:
            abxc r1 = new abxc
            r1.<init>(r4)
            goto L_0x02cf
        L_0x02ce:
        L_0x02cf:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r3.b((defpackage.abxe) r1, (android.os.Bundle) r4)
        L_0x02da:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abxg.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
