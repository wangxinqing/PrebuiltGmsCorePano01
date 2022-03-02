package defpackage;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsConfiguration;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* renamed from: rep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rep {
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final LocationSettingsRequest a() {
        return new LocationSettingsRequest(this.a, this.b, false, (LocationSettingsConfiguration) null);
    }

    public final void a(LocationRequest locationRequest) {
        if (locationRequest != null) {
            this.a.add(locationRequest);
        }
    }
}
