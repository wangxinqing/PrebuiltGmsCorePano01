package defpackage;

/* renamed from: eok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class eok extends bhw implements eol {
    public eok() {
        super("com.google.android.gms.auth.account.data.IAccountDataService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: epa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: eon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: eos} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: eor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: eoz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: epb} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v16, types: [eoy] */
    /* JADX WARNING: type inference failed for: r1v26, types: [eoq] */
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
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r1v63 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0137
            switch(r4) {
                case 4: goto L_0x0111;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00c4;
                case 7: goto L_0x009d;
                case 8: goto L_0x0076;
                case 9: goto L_0x0053;
                case 10: goto L_0x002c;
                case 11: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            r4 = 0
            return r4
        L_0x0009:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0022
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetTokenHandleCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.epb
            if (r2 == 0) goto L_0x001c
            epb r1 = (defpackage.epb) r1
            goto L_0x0023
        L_0x001c:
            epb r1 = new epb
            r1.<init>(r4)
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            java.lang.String r4 = r5.readString()
            r3.a((defpackage.epb) r1, (java.lang.String) r4)
            goto L_0x0160
        L_0x002c:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0045
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.eoz
            if (r2 == 0) goto L_0x003f
            eoz r1 = (defpackage.eoz) r1
            goto L_0x0046
        L_0x003f:
            eoz r1 = new eoz
            r1.<init>(r4)
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            r3.a((defpackage.eoz) r1, (android.accounts.Account) r4)
            goto L_0x0160
        L_0x0053:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x006c
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetAccountExportDataCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.eor
            if (r2 == 0) goto L_0x0066
            eor r1 = (defpackage.eor) r1
            goto L_0x006d
        L_0x0066:
            eor r1 = new eor
            r1.<init>(r4)
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            java.lang.String r4 = r5.readString()
            r3.a((defpackage.eor) r1, (java.lang.String) r4)
            goto L_0x0160
        L_0x0076:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x008f
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.eoq
            if (r2 == 0) goto L_0x0089
            eoq r1 = (defpackage.eoq) r1
            goto L_0x0090
        L_0x0089:
            eoo r1 = new eoo
            r1.<init>(r4)
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.AccountChangeEventsRequest r4 = (com.google.android.gms.auth.AccountChangeEventsRequest) r4
            r3.a((defpackage.eoq) r1, (com.google.android.gms.auth.AccountChangeEventsRequest) r4)
            goto L_0x0160
        L_0x009d:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00b6
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetAccountIdCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.eos
            if (r2 == 0) goto L_0x00b0
            eos r1 = (defpackage.eos) r1
            goto L_0x00b7
        L_0x00b0:
            eos r1 = new eos
            r1.<init>(r4)
            goto L_0x00b7
        L_0x00b6:
        L_0x00b7:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            r3.a((defpackage.eos) r1, (android.accounts.Account) r4)
            goto L_0x0160
        L_0x00c4:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00dd
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.eoy
            if (r2 == 0) goto L_0x00d7
            eoy r1 = (defpackage.eoy) r1
            goto L_0x00de
        L_0x00d7:
            eow r1 = new eow
            r1.<init>(r4)
            goto L_0x00de
        L_0x00dd:
        L_0x00de:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            r3.a((defpackage.eoy) r1, (android.accounts.Account) r4)
            goto L_0x0160
        L_0x00eb:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0104
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IClearTokenCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.eon
            if (r2 == 0) goto L_0x00fe
            eon r1 = (defpackage.eon) r1
            goto L_0x0105
        L_0x00fe:
            eon r1 = new eon
            r1.<init>(r4)
            goto L_0x0105
        L_0x0104:
        L_0x0105:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest r4 = (com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest) r4
            r3.a((defpackage.eon) r1, (com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest) r4)
            goto L_0x0160
        L_0x0111:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x012a
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGetTokenCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.epa
            if (r2 == 0) goto L_0x0124
            epa r1 = (defpackage.epa) r1
            goto L_0x012b
        L_0x0124:
            epa r1 = new epa
            r1.<init>(r4)
            goto L_0x012b
        L_0x012a:
        L_0x012b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.TokenRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r4 = (com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r4
            r3.a((defpackage.epa) r1, (com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r4)
            goto L_0x0160
        L_0x0137:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0150
            java.lang.String r1 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x014a
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0151
        L_0x014a:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x0151
        L_0x0150:
        L_0x0151:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            boolean r5 = defpackage.bhx.a(r5)
            r3.a(r1, r4, r5)
        L_0x0160:
            r6.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eok.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
