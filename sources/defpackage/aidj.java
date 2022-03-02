package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.location.LocationResult;

/* renamed from: aidj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aidj extends reh {
    final /* synthetic */ aidm a;

    public aidj(aidm aidm) {
        this.a = aidm;
    }

    public final void a(LocationResult locationResult) {
        this.a.d.a();
        Location a2 = locationResult.a();
        if (a2 != null) {
            a2.setExtras((Bundle) null);
            this.a.reportLocation(a2);
        }
    }
}
