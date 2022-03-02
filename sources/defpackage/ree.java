package defpackage;

import android.location.Location;
import android.os.Parcel;

/* renamed from: ree  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ree extends bhw implements ref {
    private final ige a;

    public ree() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public final synchronized void a() {
        this.a.a();
    }

    public final synchronized void a(Location location) {
        this.a.a(new rgq(location));
    }

    public ree(ige ige) {
        super("com.google.android.gms.location.ILocationListener");
        this.a = ige;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Location) bhx.a(parcel, Location.CREATOR));
        return true;
    }
}
