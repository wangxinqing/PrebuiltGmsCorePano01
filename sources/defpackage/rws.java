package defpackage;

import android.net.TrafficStats;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.service.HttpProxyChimeraService;

/* renamed from: rws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rws extends bhw implements IInterface {
    final /* synthetic */ HttpProxyChimeraService a;

    public rws() {
        super("com.google.android.gms.maps.service.IHttpProxyService");
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
        try {
            atgw.a(this.a.getApplicationContext(), 4354);
            Bundle a2 = this.a.a(bundle);
            TrafficStats.clearThreadStatsTag();
            parcel2.writeNoException();
            bhx.b(parcel2, a2);
            return true;
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rws(HttpProxyChimeraService httpProxyChimeraService) {
        super("com.google.android.gms.maps.service.IHttpProxyService");
        this.a = httpProxyChimeraService;
    }
}
