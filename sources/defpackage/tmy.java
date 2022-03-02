package defpackage;

import android.net.nsd.NsdServiceInfo;

/* renamed from: tmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tmy extends tms {
    public final NsdServiceInfo a;

    protected tmy(NsdServiceInfo nsdServiceInfo, String str, byte[] bArr, String str2) {
        super(str, bArr, str2, asoe.WIFI_LAN);
        this.a = nsdServiceInfo;
    }
}
