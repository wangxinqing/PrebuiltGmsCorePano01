package defpackage;

/* renamed from: abdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abdt extends bhw implements abdu {
    public abdt() {
        super("com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [abdr] */
    /* JADX WARNING: type inference failed for: r1v6, types: [iue] */
    /* JADX WARNING: type inference failed for: r1v11, types: [abdr] */
    /* JADX WARNING: type inference failed for: r1v16, types: [itm] */
    /* JADX WARNING: type inference failed for: r1v21, types: [abdr] */
    /* JADX WARNING: type inference failed for: r1v26, types: [abdr] */
    /* JADX WARNING: type inference failed for: r1v30, types: [abdr] */
    /* JADX WARNING: type inference failed for: r1v35, types: [abdr] */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r1v54 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInCallbacks"
            r1 = 0
            switch(r4) {
                case 2: goto L_0x0134;
                case 3: goto L_0x0128;
                case 4: goto L_0x0121;
                case 5: goto L_0x00fa;
                case 6: goto L_0x0006;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00c9;
                case 9: goto L_0x00a1;
                case 10: goto L_0x007b;
                case 11: goto L_0x005d;
                case 12: goto L_0x0037;
                case 13: goto L_0x002e;
                case 14: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r4 = 0
            return r4
        L_0x0008:
            android.os.Parcelable$Creator r4 = com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest r4 = (com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x0028
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.abdr
            if (r1 == 0) goto L_0x0022
            r1 = r0
            abdr r1 = (defpackage.abdr) r1
            goto L_0x0029
        L_0x0022:
            abdp r1 = new abdp
            r1.<init>(r5)
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            r3.a((com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest) r4, (defpackage.abdr) r1)
            goto L_0x0158
        L_0x002e:
            boolean r4 = defpackage.bhx.a(r5)
            r3.a((boolean) r4)
            goto L_0x0158
        L_0x0037:
            android.os.Parcelable$Creator r4 = com.google.android.gms.signin.internal.SignInRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.signin.internal.SignInRequest r4 = (com.google.android.gms.signin.internal.SignInRequest) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x0057
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.abdr
            if (r1 == 0) goto L_0x0051
            r1 = r0
            abdr r1 = (defpackage.abdr) r1
            goto L_0x0058
        L_0x0051:
            abdp r1 = new abdp
            r1.<init>(r5)
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            r3.a((com.google.android.gms.signin.internal.SignInRequest) r4, (defpackage.abdr) r1)
            goto L_0x0158
        L_0x005d:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0075
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r0 = r5 instanceof defpackage.abdr
            if (r0 == 0) goto L_0x006f
            r1 = r5
            abdr r1 = (defpackage.abdr) r1
            goto L_0x0076
        L_0x006f:
            abdp r1 = new abdp
            r1.<init>(r4)
            goto L_0x0076
        L_0x0075:
        L_0x0076:
            r3.a((defpackage.abdr) r1)
            goto L_0x0158
        L_0x007b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.signin.internal.RecordConsentRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.signin.internal.RecordConsentRequest r4 = (com.google.android.gms.signin.internal.RecordConsentRequest) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x009b
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.abdr
            if (r1 == 0) goto L_0x0095
            r1 = r0
            abdr r1 = (defpackage.abdr) r1
            goto L_0x009c
        L_0x0095:
            abdp r1 = new abdp
            r1.<init>(r5)
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            r3.a((com.google.android.gms.signin.internal.RecordConsentRequest) r4, (defpackage.abdr) r1)
            goto L_0x0158
        L_0x00a1:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00bb
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.itm
            if (r1 == 0) goto L_0x00b5
            r1 = r0
            itm r1 = (defpackage.itm) r1
            goto L_0x00bc
        L_0x00b5:
            itk r1 = new itk
            r1.<init>(r4)
            goto L_0x00bc
        L_0x00bb:
        L_0x00bc:
            int r4 = r5.readInt()
            boolean r5 = defpackage.bhx.a(r5)
            r3.a((defpackage.itm) r1, (int) r4, (boolean) r5)
            goto L_0x0158
        L_0x00c9:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x00ed
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.abdr
            if (r1 == 0) goto L_0x00e7
            r1 = r0
            abdr r1 = (defpackage.abdr) r1
            goto L_0x00ee
        L_0x00e7:
            abdp r1 = new abdp
            r1.<init>(r5)
            goto L_0x00ee
        L_0x00ed:
        L_0x00ee:
            r3.a((int) r4, (android.accounts.Account) r2, (defpackage.abdr) r1)
            goto L_0x0158
        L_0x00f2:
            int r4 = r5.readInt()
            r3.a((int) r4)
            goto L_0x0158
        L_0x00fa:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.internal.ResolveAccountRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.common.internal.ResolveAccountRequest r4 = (com.google.android.gms.common.internal.ResolveAccountRequest) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x011c
            java.lang.String r0 = "com.google.android.gms.common.internal.IResolveAccountCallbacks"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.iue
            if (r1 == 0) goto L_0x0116
            r1 = r0
            iue r1 = (defpackage.iue) r1
            goto L_0x011d
        L_0x0116:
            iuc r1 = new iuc
            r1.<init>(r5)
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            r3.a((com.google.android.gms.common.internal.ResolveAccountRequest) r4, (defpackage.iue) r1)
            goto L_0x0158
        L_0x0121:
            defpackage.bhx.a(r5)
            r3.c()
            goto L_0x0158
        L_0x0128:
            android.os.Parcelable$Creator r4 = com.google.android.gms.signin.internal.CheckServerAuthResult.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.signin.internal.CheckServerAuthResult r4 = (com.google.android.gms.signin.internal.CheckServerAuthResult) r4
            r3.b()
            goto L_0x0158
        L_0x0134:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.internal.AuthAccountRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.common.internal.AuthAccountRequest r4 = (com.google.android.gms.common.internal.AuthAccountRequest) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x0154
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.abdr
            if (r1 == 0) goto L_0x014e
            r1 = r0
            abdr r1 = (defpackage.abdr) r1
            goto L_0x0155
        L_0x014e:
            abdp r1 = new abdp
            r1.<init>(r5)
            goto L_0x0155
        L_0x0154:
        L_0x0155:
            r3.a((com.google.android.gms.common.internal.AuthAccountRequest) r4, (defpackage.abdr) r1)
        L_0x0158:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdt.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
