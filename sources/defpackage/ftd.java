package defpackage;

/* renamed from: ftd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ftd extends bhw implements fte {
    public ftd() {
        super("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ftv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ftw} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L_0x002f
            r2 = 2
            if (r4 == r2) goto L_0x0009
            r4 = 0
            return r4
        L_0x0009:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.ftw
            if (r2 == 0) goto L_0x001c
            ftw r0 = (defpackage.ftw) r0
            goto L_0x0023
        L_0x001c:
            ftw r0 = new ftw
            r0.<init>(r4)
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.api.identity.SavePasswordRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.api.identity.SavePasswordRequest r4 = (com.google.android.gms.auth.api.identity.SavePasswordRequest) r4
            r3.a((defpackage.ftw) r0, (com.google.android.gms.auth.api.identity.SavePasswordRequest) r4)
            goto L_0x0054
        L_0x002f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0048
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.ftv
            if (r2 == 0) goto L_0x0042
            ftv r0 = (defpackage.ftv) r0
            goto L_0x0049
        L_0x0042:
            ftv r0 = new ftv
            r0.<init>(r4)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r4 = (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) r4
            r3.a((defpackage.ftv) r0, (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) r4)
        L_0x0054:
            r6.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftd.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
