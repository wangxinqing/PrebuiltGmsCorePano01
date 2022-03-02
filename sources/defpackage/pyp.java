package defpackage;

/* renamed from: pyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class pyp extends bhw implements pyq {
    public pyp() {
        super("com.google.android.gms.identity.accounts.service.IAccountDataService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.identity.accounts.service.IAccountDataCallbacks"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x002c
            r3 = 2
            if (r5 == r3) goto L_0x000b
            r5 = 0
            return r5
        L_0x000b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0023
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.pyo
            if (r1 == 0) goto L_0x001d
            r1 = r0
            pyo r1 = (defpackage.pyo) r1
            goto L_0x0024
        L_0x001d:
            pyo r1 = new pyo
            r1.<init>(r5)
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            byte[] r5 = r6.createByteArray()
            r4.a((defpackage.pyo) r1, (byte[]) r5)
            goto L_0x0050
        L_0x002c:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0044
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.pyo
            if (r1 == 0) goto L_0x003e
            r1 = r0
            pyo r1 = (defpackage.pyo) r1
            goto L_0x0045
        L_0x003e:
            pyo r1 = new pyo
            r1.<init>(r5)
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            android.os.Parcelable$Creator r5 = com.google.android.gms.identity.accounts.api.AccountData.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.identity.accounts.api.AccountData r5 = (com.google.android.gms.identity.accounts.api.AccountData) r5
            r4.a((defpackage.pyo) r1, (com.google.android.gms.identity.accounts.api.AccountData) r5)
        L_0x0050:
            r7.writeNoException()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyp.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
