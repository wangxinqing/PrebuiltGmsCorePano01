package defpackage;

/* renamed from: ugt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugt extends bhw implements ugu {
    public ugt() {
        super("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            r9 = this;
            java.lang.String r0 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks"
            r1 = 0
            switch(r10) {
                case 1001: goto L_0x0220;
                case 1002: goto L_0x0215;
                case 1003: goto L_0x01e6;
                case 1004: goto L_0x01d7;
                default: goto L_0x0006;
            }
        L_0x0006:
            switch(r10) {
                case 1007: goto L_0x01a3;
                case 1008: goto L_0x0173;
                case 1009: goto L_0x014a;
                case 1010: goto L_0x0136;
                case 1011: goto L_0x0122;
                case 1012: goto L_0x0112;
                case 1013: goto L_0x0106;
                case 1014: goto L_0x00fa;
                case 1015: goto L_0x00ea;
                case 1016: goto L_0x00de;
                default: goto L_0x0009;
            }
        L_0x0009:
            switch(r10) {
                case 2001: goto L_0x00ce;
                case 2002: goto L_0x00be;
                case 2003: goto L_0x00ae;
                case 2004: goto L_0x009e;
                case 2005: goto L_0x008e;
                case 2006: goto L_0x007e;
                case 2007: goto L_0x006e;
                case 2008: goto L_0x005e;
                case 2009: goto L_0x004e;
                case 2010: goto L_0x003e;
                case 2011: goto L_0x002e;
                case 2012: goto L_0x001e;
                case 2013: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            r10 = 0
            return r10
        L_0x000e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams r10 = (com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x001e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.CancelPayloadParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.CancelPayloadParams r10 = (com.google.android.gms.nearby.internal.connection.CancelPayloadParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.CancelPayloadParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x002e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams r10 = (com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x003e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams r10 = (com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x004e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams r10 = (com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x005e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.SendPayloadParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.SendPayloadParams r10 = (com.google.android.gms.nearby.internal.connection.SendPayloadParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.SendPayloadParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x006e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams r10 = (com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x007e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams r10 = (com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x008e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams r10 = (com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x009e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.StopDiscoveryParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.StopDiscoveryParams r10 = (com.google.android.gms.nearby.internal.connection.StopDiscoveryParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.StopDiscoveryParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x00ae:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.StartDiscoveryParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.StartDiscoveryParams r10 = (com.google.android.gms.nearby.internal.connection.StartDiscoveryParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.StartDiscoveryParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x00be:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.StopAdvertisingParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.StopAdvertisingParams r10 = (com.google.android.gms.nearby.internal.connection.StopAdvertisingParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.StopAdvertisingParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x00ce:
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.internal.connection.StartAdvertisingParams.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.internal.connection.StartAdvertisingParams r10 = (com.google.android.gms.nearby.internal.connection.StartAdvertisingParams) r10
            r9.a((com.google.android.gms.nearby.internal.connection.StartAdvertisingParams) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x00de:
            java.lang.String r10 = r9.a()
            r12.writeNoException()
            r12.writeString(r10)
            goto L_0x0256
        L_0x00ea:
            long r10 = r11.readLong()
            java.lang.String r10 = r9.d(r10)
            r12.writeNoException()
            r12.writeString(r10)
            goto L_0x0256
        L_0x00fa:
            long r10 = r11.readLong()
            r9.c(r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x0106:
            long r10 = r11.readLong()
            r9.b(r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x0112:
            java.lang.String r10 = r11.readString()
            long r0 = r11.readLong()
            r9.a(r10, r0)
            r12.writeNoException()
            goto L_0x0256
        L_0x0122:
            java.lang.String[] r10 = r11.createStringArray()
            byte[] r0 = r11.createByteArray()
            long r1 = r11.readLong()
            r9.b(r10, r0, r1)
            r12.writeNoException()
            goto L_0x0256
        L_0x0136:
            java.lang.String[] r10 = r11.createStringArray()
            byte[] r0 = r11.createByteArray()
            long r1 = r11.readLong()
            r9.a((java.lang.String[]) r10, (byte[]) r0, (long) r1)
            r12.writeNoException()
            goto L_0x0256
        L_0x014a:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0162
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ugr
            if (r1 == 0) goto L_0x015c
            r1 = r0
            ugr r1 = (defpackage.ugr) r1
            goto L_0x0163
        L_0x015c:
            ugr r1 = new ugr
            r1.<init>(r10)
            goto L_0x0163
        L_0x0162:
        L_0x0163:
            java.lang.String r10 = r11.readString()
            long r2 = r11.readLong()
            r9.a((defpackage.ugr) r1, (java.lang.String) r10, (long) r2)
            r12.writeNoException()
            goto L_0x0256
        L_0x0173:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x018c
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ugr
            if (r1 == 0) goto L_0x0186
            r1 = r0
            ugr r1 = (defpackage.ugr) r1
            r3 = r1
            goto L_0x018e
        L_0x0186:
            ugr r1 = new ugr
            r1.<init>(r10)
            goto L_0x018d
        L_0x018c:
        L_0x018d:
            r3 = r1
        L_0x018e:
            java.lang.String r4 = r11.readString()
            byte[] r5 = r11.createByteArray()
            long r6 = r11.readLong()
            r2 = r9
            r2.a((defpackage.ugr) r3, (java.lang.String) r4, (byte[]) r5, (long) r6)
            r12.writeNoException()
            goto L_0x0256
        L_0x01a3:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x01bc
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ugr
            if (r1 == 0) goto L_0x01b6
            r1 = r0
            ugr r1 = (defpackage.ugr) r1
            r3 = r1
            goto L_0x01be
        L_0x01b6:
            ugr r1 = new ugr
            r1.<init>(r10)
            goto L_0x01bd
        L_0x01bc:
        L_0x01bd:
            r3 = r1
        L_0x01be:
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            byte[] r6 = r11.createByteArray()
            long r7 = r11.readLong()
            r2 = r9
            r2.a(r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x0256
        L_0x01d7:
            r11.readString()
            long r10 = r11.readLong()
            r9.g(r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x01e6:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x01ff
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ugr
            if (r1 == 0) goto L_0x01f9
            r1 = r0
            ugr r1 = (defpackage.ugr) r1
            r3 = r1
            goto L_0x0201
        L_0x01f9:
            ugr r1 = new ugr
            r1.<init>(r10)
            goto L_0x0200
        L_0x01ff:
        L_0x0200:
            r3 = r1
        L_0x0201:
            java.lang.String r4 = r11.readString()
            long r5 = r11.readLong()
            long r7 = r11.readLong()
            r2 = r9
            r2.a((defpackage.ugr) r3, (java.lang.String) r4, (long) r5, (long) r7)
            r12.writeNoException()
            goto L_0x0256
        L_0x0215:
            long r10 = r11.readLong()
            r9.a((long) r10)
            r12.writeNoException()
            goto L_0x0256
        L_0x0220:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0239
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ugr
            if (r1 == 0) goto L_0x0233
            r1 = r0
            ugr r1 = (defpackage.ugr) r1
            r3 = r1
            goto L_0x023b
        L_0x0233:
            ugr r1 = new ugr
            r1.<init>(r10)
            goto L_0x023a
        L_0x0239:
        L_0x023a:
            r3 = r1
        L_0x023b:
            java.lang.String r4 = r11.readString()
            android.os.Parcelable$Creator r10 = com.google.android.gms.nearby.connection.AppMetadata.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.nearby.connection.AppMetadata r10 = (com.google.android.gms.nearby.connection.AppMetadata) r10
            long r5 = r11.readLong()
            long r7 = r11.readLong()
            r2 = r9
            r2.b(r3, r4, r5, r7)
            r12.writeNoException()
        L_0x0256:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugt.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
