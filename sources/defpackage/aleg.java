package defpackage;

import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: aleg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aleg implements ica {
    final /* synthetic */ aleo a;

    public aleg(aleo aleo) {
        this.a = aleo;
    }

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        LatLng b = this.a.b();
        if (b != null) {
            this.a.e.a(b, false);
        }
        this.a.c.b((ica) this);
    }
}
