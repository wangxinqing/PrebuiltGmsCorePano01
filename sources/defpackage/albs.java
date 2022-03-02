package defpackage;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: albs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class albs implements Runnable {
    final /* synthetic */ albv a;

    public albs(albv albv) {
        this.a = albv;
    }

    public final void run() {
        LatLng c = this.a.c.c();
        if (c != null) {
            this.a.b.a(c);
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Alias Editor is skipping reverse geocode because the map was not ready.");
        }
    }
}
