package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import java.util.concurrent.Callable;

/* renamed from: akvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvk implements Callable {
    final /* synthetic */ akvl a;
    private final PlacesParams b;
    private final CheckInReport c;

    public akvk(akvl akvl, CheckInReport checkInReport, PlacesParams placesParams) {
        this.a = akvl;
        this.b = placesParams;
        this.c = checkInReport;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        akio akio = this.a.k;
        String str = this.b.d;
        CheckInReport checkInReport = this.c;
        long j = checkInReport.a;
        String str2 = checkInReport.b;
        aklr a2 = alll.a(checkInReport.c);
        if (str != null) {
            akje akje = (akje) ((akjy) akio).c.get(str);
            if (akje == null) {
                aklz.a();
            } else {
                akje.a(j, str2, a2);
            }
        } else {
            aklz.a().c("Tried to report check-in with null accountName.");
        }
        return Status.a;
    }
}
