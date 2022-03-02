package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: acrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acrh implements acox {
    final /* synthetic */ aosh a;

    public acrh(aosh aosh) {
        this.a = aosh;
    }

    public final void a(Exception exc) {
        acri.a.e("Error while fetching PSK from backup set.", exc, new Object[0]);
        this.a.b((Object) new oq(Status.c, acri.a()));
    }

    public final void a(String str) {
        if (str == null) {
            aosh aosh = this.a;
            iwd iwd = acri.a;
            aosh.b((Object) new oq(new Status(10600), acri.a()));
            return;
        }
        this.a.b((Object) new oq(Status.a, new GetWifiCredentialsResponse(2, str)));
    }
}
