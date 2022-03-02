package defpackage;

import android.content.ServiceConnection;

/* renamed from: itf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itf {
    public static njv a = null;

    public static ServiceConnection a(ServiceConnection serviceConnection) {
        if (a == null) {
            return serviceConnection;
        }
        if (serviceConnection instanceof nkm) {
            return (nkm) serviceConnection;
        }
        return new nkm(serviceConnection, jff.a(), new jff(jez.a("onServiceDisconnected")));
    }
}
