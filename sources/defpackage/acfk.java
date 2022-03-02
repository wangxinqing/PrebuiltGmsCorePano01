package defpackage;

/* renamed from: acfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acfk extends bhw implements acfl {
    public acfk() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.ITargetDirectTransferService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: abwu} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v6, types: [acfg] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r7 = "com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback"
            r0 = 1
            r1 = 0
            if (r5 == r0) goto L_0x0028
            r2 = 2
            if (r5 == r2) goto L_0x000b
            r5 = 0
            return r5
        L_0x000b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0023
            android.os.IInterface r6 = r5.queryLocalInterface(r7)
            boolean r7 = r6 instanceof defpackage.acfg
            if (r7 == 0) goto L_0x001d
            r1 = r6
            acfg r1 = (defpackage.acfg) r1
            goto L_0x0024
        L_0x001d:
            acfe r1 = new acfe
            r1.<init>(r5)
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            r4.a(r1)
            goto L_0x006d
        L_0x0028:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x003f
            android.os.IInterface r7 = r5.queryLocalInterface(r7)
            boolean r2 = r7 instanceof defpackage.acfg
            if (r2 == 0) goto L_0x0039
            acfg r7 = (defpackage.acfg) r7
            goto L_0x0040
        L_0x0039:
            acfe r7 = new acfe
            r7.<init>(r5)
            goto L_0x0040
        L_0x003f:
            r7 = r1
        L_0x0040:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions r5 = (com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions) r5
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            java.lang.Object[] r2 = r6.createTypedArray(r2)
            android.os.ParcelFileDescriptor[] r2 = (android.os.ParcelFileDescriptor[]) r2
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0069
            java.lang.String r1 = "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r3 = r1 instanceof defpackage.abwu
            if (r3 == 0) goto L_0x0063
            abwu r1 = (defpackage.abwu) r1
            goto L_0x006a
        L_0x0063:
            abwu r1 = new abwu
            r1.<init>(r6)
            goto L_0x006a
        L_0x0069:
        L_0x006a:
            r4.a(r7, r5, r2, r1)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfk.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
