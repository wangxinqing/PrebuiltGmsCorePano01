package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aldy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aldy implements View.OnClickListener {
    final /* synthetic */ alee a;

    public aldy(alee alee) {
        this.a = alee;
    }

    public void onClick(View view) {
        aleo aleo = this.a.a;
        LatLngBounds latLngBounds = aleo.k;
        if (latLngBounds == null) {
            if (Log.isLoggable("Places", 5)) {
                Log.w("Places", "Tried to select marker location before the map loaded. Falling back to using the current location.");
            }
            LatLng b = aleo.b();
            if (b != null) {
                aleo.a.a(b);
            } else if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Failed to fall back to current location. Giving up.");
            }
        } else {
            aleo.a.a(latLngBounds.a());
        }
    }
}
