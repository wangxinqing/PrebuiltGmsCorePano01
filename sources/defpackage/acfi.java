package defpackage;

/* renamed from: acfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acfi extends bhw implements acfj {
    public acfi() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: abwu} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v6, types: [acfg] */
    /* JADX WARNING: type inference failed for: r1v10, types: [acfg] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r7 = 1
            java.lang.String r0 = "com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback"
            r1 = 0
            if (r5 == r7) goto L_0x0050
            r2 = 2
            if (r5 == r2) goto L_0x0033
            r2 = 3
            if (r5 == r2) goto L_0x000e
            r5 = 0
            return r5
        L_0x000e:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0026
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.acfg
            if (r1 == 0) goto L_0x0020
            r1 = r0
            acfg r1 = (defpackage.acfg) r1
            goto L_0x0027
        L_0x0020:
            acfe r1 = new acfe
            r1.<init>(r5)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r4.a(r1, r5)
            goto L_0x0095
        L_0x0033:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x004b
            android.os.IInterface r6 = r5.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.acfg
            if (r0 == 0) goto L_0x0045
            r1 = r6
            acfg r1 = (defpackage.acfg) r1
            goto L_0x004c
        L_0x0045:
            acfe r1 = new acfe
            r1.<init>(r5)
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            r4.a(r1)
            goto L_0x0095
        L_0x0050:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0067
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.acfg
            if (r2 == 0) goto L_0x0061
            acfg r0 = (defpackage.acfg) r0
            goto L_0x0068
        L_0x0061:
            acfe r0 = new acfe
            r0.<init>(r5)
            goto L_0x0068
        L_0x0067:
            r0 = r1
        L_0x0068:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations r5 = (com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations) r5
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            java.lang.Object[] r2 = r6.createTypedArray(r2)
            android.os.ParcelFileDescriptor[] r2 = (android.os.ParcelFileDescriptor[]) r2
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0091
            java.lang.String r1 = "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r3 = r1 instanceof defpackage.abwu
            if (r3 == 0) goto L_0x008b
            abwu r1 = (defpackage.abwu) r1
            goto L_0x0092
        L_0x008b:
            abwu r1 = new abwu
            r1.<init>(r6)
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            r4.a(r0, r5, r2, r1)
        L_0x0095:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfi.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
