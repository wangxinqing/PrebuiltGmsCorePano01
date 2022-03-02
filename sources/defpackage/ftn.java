package defpackage;

/* renamed from: ftn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ftn extends bhw implements fto {
    public ftn() {
        super("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [ftr] */
    /* JADX WARNING: type inference failed for: r1v6, types: [ftc] */
    /* JADX WARNING: type inference failed for: r1v11, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v16, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v21, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v26, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v31, types: [ftu] */
    /* JADX WARNING: type inference failed for: r1v36, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v41, types: [ftk] */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r0v22, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v51, types: [fth] */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r1v63 */
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r9, android.os.Parcel r10, android.os.Parcel r11) {
        /*
            r8 = this;
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r1 = 0
            switch(r9) {
                case 1: goto L_0x01c9;
                case 2: goto L_0x0196;
                case 3: goto L_0x0169;
                case 4: goto L_0x013b;
                case 5: goto L_0x0115;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00c3;
                case 8: goto L_0x0093;
                case 9: goto L_0x006b;
                case 10: goto L_0x0030;
                case 11: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r9 = 0
            return r9
        L_0x0008:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0022
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback"
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fth
            if (r1 == 0) goto L_0x001c
            r1 = r0
            fth r1 = (defpackage.fth) r1
            goto L_0x0023
        L_0x001c:
            ftf r1 = new ftf
            r1.<init>(r9)
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            java.lang.String r9 = r10.readString()
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.fth) r1, (java.lang.String) r9, (java.lang.String) r10)
            goto L_0x01f3
        L_0x0030:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0049
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0043
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            r3 = r1
            goto L_0x004b
        L_0x0043:
            ifs r1 = new ifs
            r1.<init>(r9)
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            r3 = r1
        L_0x004b:
            android.os.Parcelable$Creator r9 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.CREATOR
            android.os.Parcelable r9 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r9)
            r4 = r9
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r4 = (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) r4
            java.lang.String r5 = r10.readString()
            android.os.Parcelable$Creator r9 = android.accounts.Account.CREATOR
            android.os.Parcelable r9 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r9)
            r6 = r9
            android.accounts.Account r6 = (android.accounts.Account) r6
            java.lang.String r7 = r10.readString()
            r2 = r8
            r2.a(r3, r4, r5, r6, r7)
            goto L_0x01f3
        L_0x006b:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0085
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback"
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ftk
            if (r1 == 0) goto L_0x007f
            r1 = r0
            ftk r1 = (defpackage.ftk) r1
            goto L_0x0086
        L_0x007f:
            fti r1 = new fti
            r1.<init>(r9)
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            java.lang.String r9 = r10.readString()
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.ftk) r1, (java.lang.String) r9, (java.lang.String) r10)
            goto L_0x01f3
        L_0x0093:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x00ab
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x00a5
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x00ac
        L_0x00a5:
            ifs r1 = new ifs
            r1.<init>(r9)
            goto L_0x00ac
        L_0x00ab:
        L_0x00ac:
            android.os.Parcelable$Creator r9 = com.google.android.gms.auth.api.identity.SavePasswordRequest.CREATOR
            android.os.Parcelable r9 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r9)
            com.google.android.gms.auth.api.identity.SavePasswordRequest r9 = (com.google.android.gms.auth.api.identity.SavePasswordRequest) r9
            android.os.Parcelable$Creator r0 = android.accounts.Account.CREATOR
            java.util.ArrayList r0 = r10.createTypedArrayList(r0)
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.ifu) r1, (com.google.android.gms.auth.api.identity.SavePasswordRequest) r9, (java.util.List) r0, (java.lang.String) r10)
            goto L_0x01f3
        L_0x00c3:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x00dd
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback"
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ftu
            if (r1 == 0) goto L_0x00d7
            r1 = r0
            ftu r1 = (defpackage.ftu) r1
            goto L_0x00de
        L_0x00d7:
            fts r1 = new fts
            r1.<init>(r9)
            goto L_0x00de
        L_0x00dd:
        L_0x00de:
            android.os.Parcelable$Creator r9 = com.google.android.gms.auth.api.identity.SavePasswordRequest.CREATOR
            android.os.Parcelable r9 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r9)
            com.google.android.gms.auth.api.identity.SavePasswordRequest r9 = (com.google.android.gms.auth.api.identity.SavePasswordRequest) r9
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.ftu) r1, (com.google.android.gms.auth.api.identity.SavePasswordRequest) r9, (java.lang.String) r10)
            goto L_0x01f3
        L_0x00ef:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0107
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0101
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0108
        L_0x0101:
            ifs r1 = new ifs
            r1.<init>(r9)
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            java.lang.String r9 = r10.readString()
            java.lang.String r10 = r10.readString()
            r8.b(r1, r9, r10)
            goto L_0x01f3
        L_0x0115:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x012d
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0127
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x012e
        L_0x0127:
            ifs r1 = new ifs
            r1.<init>(r9)
            goto L_0x012e
        L_0x012d:
        L_0x012e:
            java.lang.String r9 = r10.readString()
            java.lang.String r10 = r10.readString()
            r8.a((defpackage.ifu) r1, (java.lang.String) r9, (java.lang.String) r10)
            goto L_0x01f3
        L_0x013b:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0153
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x014d
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0154
        L_0x014d:
            ifs r1 = new ifs
            r1.<init>(r9)
            goto L_0x0154
        L_0x0153:
        L_0x0154:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r2)
            android.accounts.Account r10 = (android.accounts.Account) r10
            r8.b(r1, r9, r0, r10)
            goto L_0x01f3
        L_0x0169:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x0181
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x017b
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0182
        L_0x017b:
            ifs r1 = new ifs
            r1.<init>(r9)
            goto L_0x0182
        L_0x0181:
        L_0x0182:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r2)
            android.accounts.Account r10 = (android.accounts.Account) r10
            r8.a((defpackage.ifu) r1, (java.lang.String) r9, (java.lang.String) r0, (android.accounts.Account) r10)
            goto L_0x01f3
        L_0x0196:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x01b0
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback"
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ftc
            if (r1 == 0) goto L_0x01aa
            r1 = r0
            ftc r1 = (defpackage.ftc) r1
            goto L_0x01b1
        L_0x01aa:
            fta r1 = new fta
            r1.<init>(r9)
            goto L_0x01b1
        L_0x01b0:
        L_0x01b1:
            java.lang.String r9 = r10.readString()
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r0 = (com.google.android.gms.auth.api.identity.BeginSignInRequest) r0
            android.os.Parcelable$Creator r2 = com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r10 = (com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper) r10
            r8.a((defpackage.ftc) r1, (java.lang.String) r9, (com.google.android.gms.auth.api.identity.BeginSignInRequest) r0, (com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper) r10)
            goto L_0x01f3
        L_0x01c9:
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 == 0) goto L_0x01e3
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback"
            android.os.IInterface r0 = r9.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ftr
            if (r1 == 0) goto L_0x01dd
            r1 = r0
            ftr r1 = (defpackage.ftr) r1
            goto L_0x01e4
        L_0x01dd:
            ftp r1 = new ftp
            r1.<init>(r9)
            goto L_0x01e4
        L_0x01e3:
        L_0x01e4:
            java.lang.String r9 = r10.readString()
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r10, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r10 = (com.google.android.gms.auth.api.identity.BeginSignInRequest) r10
            r8.a((defpackage.ftr) r1, (java.lang.String) r9, (com.google.android.gms.auth.api.identity.BeginSignInRequest) r10)
        L_0x01f3:
            r11.writeNoException()
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftn.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
