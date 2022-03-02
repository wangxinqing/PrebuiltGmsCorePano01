package defpackage;

import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aijk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aijk implements Runnable {
    public aquf a = aquf.d;
    public Throwable b;
    final /* synthetic */ aijm c;
    private final aquh d;
    private final ClientContext e;

    public aijk(aijm aijm, aquh aquh, ClientContext clientContext) {
        this.c = aijm;
        this.d = aquh;
        this.e = clientContext;
    }

    public final void run() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            aijm aijm = this.c;
            aijm.c++;
            aijj aijj = aijm.a;
            ClientContext clientContext = this.e;
            aquh aquh = this.d;
            if (aijj.b == null) {
                aijj.b = baaj.a(baai.UNARY, "google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/Geocode", baoq.a(aquh.h), baoq.a(aquf.d));
            }
            aquf aquf = (aquf) aijj.a.a(aijj.b, clientContext, aquh, 10000, TimeUnit.MILLISECONDS);
            this.a = aquf;
            String valueOf = String.valueOf(aquf);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("grpc response = ");
            sb.append(valueOf);
            sb.toString();
        } catch (Exception e2) {
            this.c.b++;
            this.b = e2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            this.c.a();
            throw th;
        }
        Binder.restoreCallingIdentity(clearCallingIdentity);
        this.c.a();
    }
}
