package defpackage;

import android.util.Log;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: alcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcy implements icm {
    final /* synthetic */ alda a;

    public alcy(alda alda) {
        this.a = alda;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        PlacePhotoResult placePhotoResult = (PlacePhotoResult) icl;
        this.a.k = null;
        if (placePhotoResult.a.c()) {
            alda alda = this.a;
            alda.j = placePhotoResult.c;
            alcx alcx = alda.f;
            if (alcx != null) {
                alcx.a(alda.j);
            }
        } else if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(placePhotoResult.a.toString());
            Log.e("Places", valueOf.length() == 0 ? new String("Failed to retrieve place photo: ") : "Failed to retrieve place photo: ".concat(valueOf));
        }
    }
}
