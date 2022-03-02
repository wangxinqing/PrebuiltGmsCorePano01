package defpackage;

/* renamed from: fgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class fgh extends bhw implements fgi {
    public fgh() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks"
            r2 = 0
            if (r5 == r0) goto L_0x0079
            r3 = 2
            if (r5 == r3) goto L_0x0054
            r3 = 3
            if (r5 == r3) goto L_0x002f
            r3 = 4
            if (r5 == r3) goto L_0x0011
            r5 = 0
            return r5
        L_0x0011:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0029
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.fgc
            if (r1 == 0) goto L_0x0023
            r2 = r6
            fgc r2 = (defpackage.fgc) r2
            goto L_0x002a
        L_0x0023:
            fgc r2 = new fgc
            r2.<init>(r5)
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            r4.a(r2)
            goto L_0x009d
        L_0x002f:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0047
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.fgc
            if (r2 == 0) goto L_0x0041
            r2 = r1
            fgc r2 = (defpackage.fgc) r2
            goto L_0x0048
        L_0x0041:
            fgc r2 = new fgc
            r2.<init>(r5)
            goto L_0x0048
        L_0x0047:
        L_0x0048:
            android.os.Parcelable$Creator r5 = com.google.android.gms.auth.api.credentials.internal.DeleteRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.auth.api.credentials.internal.DeleteRequest r5 = (com.google.android.gms.auth.api.credentials.internal.DeleteRequest) r5
            r4.a((defpackage.fgc) r2, (com.google.android.gms.auth.api.credentials.internal.DeleteRequest) r5)
            goto L_0x009d
        L_0x0054:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x006c
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.fgc
            if (r2 == 0) goto L_0x0066
            r2 = r1
            fgc r2 = (defpackage.fgc) r2
            goto L_0x006d
        L_0x0066:
            fgc r2 = new fgc
            r2.<init>(r5)
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.auth.api.credentials.internal.SaveRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.auth.api.credentials.internal.SaveRequest r5 = (com.google.android.gms.auth.api.credentials.internal.SaveRequest) r5
            r4.a((defpackage.fgc) r2, (com.google.android.gms.auth.api.credentials.internal.SaveRequest) r5)
            goto L_0x009d
        L_0x0079:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0091
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.fgc
            if (r2 == 0) goto L_0x008b
            r2 = r1
            fgc r2 = (defpackage.fgc) r2
            goto L_0x0092
        L_0x008b:
            fgc r2 = new fgc
            r2.<init>(r5)
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            android.os.Parcelable$Creator r5 = com.google.android.gms.auth.api.credentials.CredentialRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.auth.api.credentials.CredentialRequest r5 = (com.google.android.gms.auth.api.credentials.CredentialRequest) r5
            r4.a((defpackage.fgc) r2, (com.google.android.gms.auth.api.credentials.CredentialRequest) r5)
        L_0x009d:
            r7.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
