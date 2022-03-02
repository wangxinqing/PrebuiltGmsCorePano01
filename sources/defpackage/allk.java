package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.CheckInResponse;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;
import java.util.Locale;

/* renamed from: allk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class allk extends advi implements niz {
    private final nix a;
    private final akuy b;
    private final akvn c;
    private final akhj d;

    public allk(akvn akvn, akuy akuy, nix nix, akhj akhj) {
        this.c = akvn;
        this.b = akuy;
        this.a = nix;
        this.d = akhj;
    }

    static PlacesParams a(UserLocationParameters userLocationParameters) {
        String str = userLocationParameters.b.a;
        if ("com.google.android.gms".equals(str)) {
            return new PlacesParams(str, Locale.getDefault(), userLocationParameters.a, userLocationParameters.b.b, 0);
        }
        return new PlacesParams(str, Locale.getDefault(), userLocationParameters.a);
    }

    public final void b(UserLocationParameters userLocationParameters, advg advg) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akwh(advg), "EstimateCurrentSemanticLocation", this.d), advg);
    }

    public final void c(UserLocationParameters userLocationParameters, ifu ifu, String str) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxl(str, ifu), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.d), ifu);
    }

    public final void b(UserLocationParameters userLocationParameters, ifu ifu, PendingIntent pendingIntent) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxm(pendingIntent, ifu), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.d), ifu);
    }

    private final void a(akwm akwm, advg advg) {
        if (azcr.c()) {
            advg.a(Status.f, (SemanticLocation) null);
        } else {
            this.a.a(akwm);
        }
    }

    public final void b(UserLocationParameters userLocationParameters, ifu ifu, String str) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxh(str, ifu), "UnregisterSemanticLocationUpdates", this.d), ifu);
    }

    private final void a(akwm akwm, ifu ifu) {
        if (azcr.c()) {
            ifu.a(Status.a);
        } else {
            this.a.a(akwm);
        }
    }

    private static void a(ifu ifu) {
        try {
            ifu.a(ibt.a(26000, "The supplied PendingIntent was not created by your application."));
        } catch (RemoteException e) {
        }
    }

    private final boolean a(PendingIntent pendingIntent, PlacesParams placesParams) {
        return this.b.b.equals("com.google.android.gms") || placesParams.b.equals(pendingIntent.getTargetPackage());
    }

    public final void a(UserLocationParameters userLocationParameters, advf advf, CheckInReport checkInReport) {
        akwm akwm = new akwm(a(userLocationParameters), this.b, this.c, new akwy(checkInReport, advf), "ReportCheckIn", this.d);
        if (azcr.c()) {
            advf.a(Status.f, (CheckInResponse) null);
        } else {
            this.a.a(akwm);
        }
    }

    public final void a(UserLocationParameters userLocationParameters, advg advg) {
        PlacesParams a2 = a(userLocationParameters);
        a(new akwm(a2, this.b, this.c, new akwj(a2.d, advg), "GetLastKnownSemanticLocation", this.d), advg);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, advg advg, SemanticLocationUpdateRequest semanticLocationUpdateRequest) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akws(semanticLocationUpdateRequest, ifu, advg), "RegisterForSemanticLocationUpdates", this.d), ifu);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, PendingIntent pendingIntent) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxn(pendingIntent, ifu), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.d), ifu);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent) {
        PlacesParams a2 = a(userLocationParameters);
        if (a(pendingIntent, a2)) {
            a(new akwm(a2, this.b, this.c, new akxi(placefencingRequest, pendingIntent, ifu), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.d), ifu);
            return;
        }
        a(ifu);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, CheckInReport checkInReport) {
        a(userLocationParameters, (advf) new adve(ifu), checkInReport);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent) {
        PlacesParams a2 = a(userLocationParameters);
        if (a(pendingIntent, a2)) {
            a(new akwm(a2, this.b, this.c, new akwr(semanticLocationEventRequest, ifu, pendingIntent), "RegisterForSemanticLocationEvents", this.d), ifu);
            return;
        }
        a(ifu);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxk(semanticLocationEventRequest, ifu, pendingIntent, pendingIntent2), "RegisterSemanticLocationEventsByPendingIntentOperation", this.d), ifu);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxj(userLocationNearbyAlertRequest, pendingIntent, pendingIntent2, ifu), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.d), ifu);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, String str) {
        a(new akwm(a(userLocationParameters), this.b, this.c, new akxg(str, ifu), "UnregisterSemanticLocationEvents", this.d), ifu);
    }
}
