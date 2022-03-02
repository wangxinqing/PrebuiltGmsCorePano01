package defpackage;

import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aijl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aijl implements Runnable {
    public aquf a = aquf.d;
    public Throwable b;
    final /* synthetic */ aijm c;
    private final aqui d;
    private final ClientContext e;

    public aijl(aijm aijm, aqui aqui, ClientContext clientContext) {
        this.c = aijm;
        this.d = aqui;
        this.e = clientContext;
    }

    public final void run() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            aijm aijm = this.c;
            aijm.e++;
            aijj aijj = aijm.a;
            ClientContext clientContext = this.e;
            aqui aqui = this.d;
            if (aijj.c == null) {
                aijj.c = baaj.a(baai.UNARY, "google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/ReverseGeocode", baoq.a(aqui.f), baoq.a(aquf.d));
            }
            aquf aquf = (aquf) aijj.a.a(aijj.c, clientContext, aqui, 10000, TimeUnit.MILLISECONDS);
            this.a = aquf;
            String valueOf = String.valueOf(aquf);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("grpc response = ");
            sb.append(valueOf);
            sb.toString();
        } catch (Exception e2) {
            this.c.d++;
            this.b = e2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            this.c.a(System.currentTimeMillis());
            this.c.a();
            throw th;
        }
        Binder.restoreCallingIdentity(clearCallingIdentity);
        this.c.a(System.currentTimeMillis());
        this.c.a();
    }
}
