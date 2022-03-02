package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.CheckInResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: akwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwy implements akwg {
    public static final long a = TimeUnit.SECONDS.toMillis(2);
    public final CheckInReport b;
    private final advf c;

    public akwy(CheckInReport checkInReport, advf advf) {
        iva.a((Object) checkInReport);
        iva.a((Object) advf);
        this.b = checkInReport;
        this.c = advf;
    }

    private final void a(Status status, CheckInResponse checkInResponse) {
        try {
            this.c.a(status, checkInResponse);
        } catch (RemoteException e) {
        }
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 3;
    }

    public final String c() {
        return "";
    }

    public final boolean d() {
        return false;
    }

    public final aoei a(PlacesParams placesParams) {
        boolean z;
        CheckInReport checkInReport = this.b;
        if (checkInReport.c != null) {
            z = true;
        } else {
            z = false;
        }
        int i = checkInReport.d;
        aoei a2 = akig.a(placesParams, 7);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        aucd o = aofl.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofl aofl = (aofl) o.b;
        int i2 = 1 | aofl.a;
        aofl.a = i2;
        aofl.b = z;
        aofl.a = i2 | 2;
        aofl.c = i;
        aofl aofl2 = (aofl) o.i();
        aofu aofu = ((aoei) aucd.b).u;
        if (aofu == null) {
            aofu = aofu.d;
        }
        aucd aucd2 = (aucd) aofu.c(5);
        aucd2.a((aucj) aofu);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofu aofu2 = (aofu) aucd2.b;
        aofl2.getClass();
        aofu2.c = aofl2;
        aofu2.a |= 2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofu aofu3 = (aofu) aucd2.i();
        aoei aoei2 = aoei.w;
        aofu3.getClass();
        aoei.u = aofu3;
        aoei.a |= 1048576;
        return (aoei) aucd.i();
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        CheckInResponse checkInResponse;
        Future a2 = akvf.a(this.b, placesParams);
        aoru a3 = jfm.a(10);
        try {
            if (azbz.a.a().p()) {
                if (placesParams.d != null) {
                    akhj akhj = new akhj(context, new hol(context.getApplicationContext(), "LE", (String) null), 1, a3);
                    checkInResponse = (CheckInResponse) acws.a(acyr.a(context, new acyq(placesParams.d)).a(new UdcCacheRequest(new int[]{1})).a((Executor) a3, (acvf) new akwx(this, context, placesParams, akhj)));
                    a((Status) a2.get(), checkInResponse);
                    a3.shutdown();
                }
            }
            checkInResponse = new adtv().a();
            a((Status) a2.get(), checkInResponse);
            a3.shutdown();
        } catch (InterruptedException e) {
            throw new akwc(14);
        } catch (ExecutionException e2) {
            throw new nja(13, e2.getMessage(), (PendingIntent) null, e2);
        } catch (Throwable th) {
            a3.shutdown();
            throw th;
        }
    }

    public final void a(Status status) {
        a(status, (CheckInResponse) null);
    }
}
