package defpackage;

/* renamed from: epg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class epg extends bhw implements eph {
    public epg() {
        super("com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: eom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: eom} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [epe] */
    /* JADX WARNING: type inference failed for: r1v6, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v16, types: [eoq] */
    /* JADX WARNING: type inference failed for: r1v21, types: [eov] */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IBundleCallback"
            r1 = 0
            switch(r4) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x009f;
                case 3: goto L_0x007e;
                case 4: goto L_0x0056;
                case 5: goto L_0x002e;
                case 6: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r4 = 0
            return r4
        L_0x0008:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0020
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.eom
            if (r1 == 0) goto L_0x001a
            r1 = r0
            eom r1 = (defpackage.eom) r1
            goto L_0x0021
        L_0x001a:
            eom r1 = new eom
            r1.<init>(r4)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            r3.a((defpackage.eom) r1, (android.accounts.Account) r4)
            goto L_0x00f8
        L_0x002e:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0048
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGetAccountsCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.eov
            if (r1 == 0) goto L_0x0042
            r1 = r0
            eov r1 = (defpackage.eov) r1
            goto L_0x0049
        L_0x0042:
            eot r1 = new eot
            r1.<init>(r4)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.GetAccountsRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.GetAccountsRequest r4 = (com.google.android.gms.auth.GetAccountsRequest) r4
            r3.a((defpackage.eov) r1, (com.google.android.gms.auth.GetAccountsRequest) r4)
            goto L_0x00f8
        L_0x0056:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0070
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.eoq
            if (r1 == 0) goto L_0x006a
            r1 = r0
            eoq r1 = (defpackage.eoq) r1
            goto L_0x0071
        L_0x006a:
            eoo r1 = new eoo
            r1.<init>(r4)
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.AccountChangeEventsRequest r4 = (com.google.android.gms.auth.AccountChangeEventsRequest) r4
            r3.a((defpackage.eoq) r1, (com.google.android.gms.auth.AccountChangeEventsRequest) r4)
            goto L_0x00f8
        L_0x007e:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0096
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.eom
            if (r1 == 0) goto L_0x0090
            r1 = r0
            eom r1 = (defpackage.eom) r1
            goto L_0x0097
        L_0x0090:
            eom r1 = new eom
            r1.<init>(r4)
            goto L_0x0097
        L_0x0096:
        L_0x0097:
            java.lang.String r4 = r5.readString()
            r3.a((defpackage.eom) r1, (java.lang.String) r4)
            goto L_0x00f8
        L_0x009f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00b9
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x00b3
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x00ba
        L_0x00b3:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest r4 = (com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest) r4
            r3.a((defpackage.ifu) r1, (com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest) r4)
            goto L_0x00f8
        L_0x00c6:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00e0
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.epe
            if (r1 == 0) goto L_0x00da
            r1 = r0
            epe r1 = (defpackage.epe) r1
            goto L_0x00e1
        L_0x00da:
            epc r1 = new epc
            r1.<init>(r4)
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            java.lang.String r0 = r5.readString()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r2)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.a(r1, r4, r0, r5)
        L_0x00f8:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epg.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
