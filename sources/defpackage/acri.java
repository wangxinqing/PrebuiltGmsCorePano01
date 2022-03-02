package defpackage;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;
import java.util.concurrent.ExecutionException;

/* renamed from: acri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acri extends nis {
    public static final iwd a = acqa.a("Wifi", "GetWifiCredentialsOperation");
    private final acrb b;
    private final GetWifiCredentialsRequest c;

    public acri(acrb acrb, GetWifiCredentialsRequest getWifiCredentialsRequest) {
        super(159, "GetWifiCredentialsOperation");
        this.b = acrb;
        this.c = getWifiCredentialsRequest;
    }

    public static final GetWifiCredentialsResponse a() {
        return new GetWifiCredentialsResponse(0, (String) null);
    }

    public final void a(Context context) {
        Object obj;
        WifiConfiguration a2 = new acqk(context).a(this.c.a);
        if (a2 == null) {
            this.b.a(new Status(10602), a());
        } else if (a2.allowedKeyManagement.get(0) && ((a2.allowedAuthAlgorithms.get(0) && a2.allowedAuthAlgorithms.cardinality() == 1) || a2.allowedAuthAlgorithms.isEmpty())) {
            this.b.a(Status.a, new GetWifiCredentialsResponse(1, (String) null));
        } else if (!a2.allowedKeyManagement.get(1)) {
            this.b.a(new Status(10601), a());
        } else if (!acqo.a(a2)) {
            this.b.a(Status.a, new GetWifiCredentialsResponse(1, acqc.b(a2.preSharedKey)));
        } else if (acpp.a(context)) {
            this.b.a(new Status(10600), a());
        } else {
            aosh f = aosh.f();
            amrl.a((Object) f);
            new acoy(context).a(this.c.a, (acox) new acrh(f));
            try {
                oq oqVar = (oq) f.get();
                Object obj2 = oqVar.a;
                if (obj2 == null || (obj = oqVar.b) == null) {
                    this.b.a(Status.c, a());
                } else {
                    this.b.a((Status) obj2, (GetWifiCredentialsResponse) obj);
                }
            } catch (InterruptedException | ExecutionException e) {
                a.e("Error while fetching PSK from backup.", e, new Object[0]);
                this.b.a(Status.c, a());
            }
        }
    }

    public final void a(Status status) {
        this.b.a(status, a());
    }
}
