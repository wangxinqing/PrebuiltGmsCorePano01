package defpackage;

import android.os.Bundle;
import com.google.android.gms.location.LocationResult;

/* renamed from: aidk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aidk extends reh {
    final /* synthetic */ aidm a;

    public aidk(aidm aidm) {
        this.a = aidm;
    }

    public final void a(LocationResult locationResult) {
        this.a.d.a();
        locationResult.a().setExtras((Bundle) null);
        this.a.reportLocation(locationResult.a());
    }
}
