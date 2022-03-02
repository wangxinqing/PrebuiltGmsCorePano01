package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: reb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class reb extends bhw implements rec {
    private final ige a;

    public reb() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public final synchronized void a() {
        this.a.a();
    }

    public final void a(LocationAvailability locationAvailability) {
        this.a.a(new rgp(locationAvailability));
    }

    public reb(ige ige) {
        super("com.google.android.gms.location.ILocationCallback");
        this.a = ige;
    }

    public final void a(LocationResult locationResult) {
        this.a.a(new rgo(locationResult));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((LocationResult) bhx.a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((LocationAvailability) bhx.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
