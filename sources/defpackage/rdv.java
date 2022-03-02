package defpackage;

import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rdv {
    public String a = "";
    private final List b = new ArrayList();
    private int c = 5;

    public static int a(int i) {
        return i & 7;
    }

    public final void b(int i) {
        this.c = a(i);
    }

    public final GeofencingRequest a() {
        iva.b(!this.b.isEmpty(), "No geofence has been added to this request.");
        return new GeofencingRequest(this.b, this.c, this.a);
    }

    public final void a(ParcelableGeofence parcelableGeofence) {
        iva.a((Object) parcelableGeofence, (Object) "geofence can't be null.");
        iva.b(parcelableGeofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
        this.b.add(parcelableGeofence);
    }

    public final void a(List list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list.get(i);
                if (parcelableGeofence != null) {
                    a(parcelableGeofence);
                }
            }
        }
    }
}
