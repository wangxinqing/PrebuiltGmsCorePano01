package defpackage;

/* renamed from: acrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acrd extends bhw implements acre {
    public acrd() {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0030
            r3 = 2
            if (r5 == r3) goto L_0x000b
            r5 = 0
            return r5
        L_0x000b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0023
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.acrb
            if (r1 == 0) goto L_0x001d
            r1 = r0
            acrb r1 = (defpackage.acrb) r1
            goto L_0x0024
        L_0x001d:
            acqz r1 = new acqz
            r1.<init>(r5)
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest r5 = (com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest) r5
            r4.a((defpackage.acrb) r1, (com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest) r5)
            goto L_0x0054
        L_0x0030:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0048
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.acrb
            if (r1 == 0) goto L_0x0042
            r1 = r0
            acrb r1 = (defpackage.acrb) r1
            goto L_0x0049
        L_0x0042:
            acqz r1 = new acqz
            r1.<init>(r5)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest r5 = (com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest) r5
            r4.a((defpackage.acrb) r1, (com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest) r5)
        L_0x0054:
            r7.writeNoException()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrd.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
