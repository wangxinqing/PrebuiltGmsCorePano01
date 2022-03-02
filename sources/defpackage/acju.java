package defpackage;

/* renamed from: acju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acju extends bhw implements acjv {
    public acju() {
        super("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r2, android.os.Parcel r3, android.os.Parcel r4) {
        /*
            r1 = this;
            java.lang.String r4 = "com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x0187;
                case 2: goto L_0x0162;
                case 3: goto L_0x0139;
                case 4: goto L_0x0113;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00a1;
                case 8: goto L_0x007f;
                case 9: goto L_0x007a;
                case 10: goto L_0x0054;
                case 11: goto L_0x0026;
                case 12: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0020
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.acjs
            if (r4 == 0) goto L_0x001a
            r0 = r3
            acjs r0 = (defpackage.acjs) r0
            goto L_0x0021
        L_0x001a:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            r1.a(r0)
            goto L_0x01ab
        L_0x0026:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x003e
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x0038
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x003f
        L_0x0038:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.Challenge.CREATOR
            java.lang.Object[] r2 = r3.createTypedArray(r2)
            com.google.android.gms.smartdevice.setup.accounts.Challenge[] r2 = (com.google.android.gms.smartdevice.setup.accounts.Challenge[]) r2
            boolean r4 = defpackage.bhx.a(r3)
            boolean r3 = defpackage.bhx.a(r3)
            r1.a(r0, r2, r4, r3)
            goto L_0x01ab
        L_0x0054:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x006c
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x0066
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x006d
        L_0x0066:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest r2 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest) r2
            r1.a((defpackage.acjs) r0, (com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest) r2)
            goto L_0x01ab
        L_0x007a:
            r1.a()
            goto L_0x01ab
        L_0x007f:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0097
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x0091
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x0098
        L_0x0091:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x0098
        L_0x0097:
        L_0x0098:
            boolean r2 = defpackage.bhx.a(r3)
            r1.a((defpackage.acjs) r0, (boolean) r2)
            goto L_0x01ab
        L_0x00a1:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00b9
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x00b3
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x00ba
        L_0x00b3:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r2 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r2
            r1.c(r0, r2)
            goto L_0x01ab
        L_0x00c7:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00df
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x00d9
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x00e0
        L_0x00d9:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x00e0
        L_0x00df:
        L_0x00e0:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r2 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r2
            r1.b(r0, r2)
            goto L_0x01ab
        L_0x00ed:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0105
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x00ff
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x0106
        L_0x00ff:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x0106
        L_0x0105:
        L_0x0106:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r2 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r2
            r1.a((defpackage.acjs) r0, (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r2)
            goto L_0x01ab
        L_0x0113:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x012b
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x0125
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x012c
        L_0x0125:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x012c
        L_0x012b:
        L_0x012c:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.Assertion.CREATOR
            java.lang.Object[] r2 = r3.createTypedArray(r2)
            com.google.android.gms.smartdevice.setup.accounts.Assertion[] r2 = (com.google.android.gms.smartdevice.setup.accounts.Assertion[]) r2
            r1.a((defpackage.acjs) r0, (com.google.android.gms.smartdevice.setup.accounts.Assertion[]) r2)
            goto L_0x01ab
        L_0x0139:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0151
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x014b
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x0152
        L_0x014b:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x0152
        L_0x0151:
        L_0x0152:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.Challenge.CREATOR
            java.lang.Object[] r2 = r3.createTypedArray(r2)
            com.google.android.gms.smartdevice.setup.accounts.Challenge[] r2 = (com.google.android.gms.smartdevice.setup.accounts.Challenge[]) r2
            boolean r3 = defpackage.bhx.a(r3)
            r1.a(r0, r2, r3)
            goto L_0x01ab
        L_0x0162:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x017a
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x0174
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x017b
        L_0x0174:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x017b
        L_0x017a:
        L_0x017b:
            android.os.Parcelable$Creator r2 = com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo.CREATOR
            java.lang.Object[] r2 = r3.createTypedArray(r2)
            com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[] r2 = (com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[]) r2
            r1.a((defpackage.acjs) r0, (com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[]) r2)
            goto L_0x01ab
        L_0x0187:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x019f
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.acjs
            if (r0 == 0) goto L_0x0199
            r0 = r4
            acjs r0 = (defpackage.acjs) r0
            goto L_0x01a0
        L_0x0199:
            acjq r0 = new acjq
            r0.<init>(r2)
            goto L_0x01a0
        L_0x019f:
        L_0x01a0:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            java.lang.Object[] r2 = r3.createTypedArray(r2)
            android.accounts.Account[] r2 = (android.accounts.Account[]) r2
            r1.a((defpackage.acjs) r0, (android.accounts.Account[]) r2)
        L_0x01ab:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acju.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
