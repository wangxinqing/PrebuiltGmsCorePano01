package defpackage;

import android.graphics.Bitmap;
import com.android.volley.NetworkError;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: akhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhz implements Response.Listener, Response.ErrorListener {
    final /* synthetic */ akib a;
    final akjb b;

    public akhz(akib akib, akjb akjb) {
        this.a = akib;
        this.b = akjb;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        PlacePhotoResult placePhotoResult;
        if ((volleyError instanceof NetworkError) || (volleyError instanceof TimeoutError) || (volleyError instanceof ServerError)) {
            placePhotoResult = new PlacePhotoResult(ris.h(7), (BitmapTeleporter) null);
        } else {
            placePhotoResult = new PlacePhotoResult(ris.h(8), (BitmapTeleporter) null);
        }
        this.b.a(placePhotoResult);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap.getConfig() == null && (bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null) {
            this.b.a(new PlacePhotoResult(ris.h(8), (BitmapTeleporter) null));
            return;
        }
        BitmapTeleporter bitmapTeleporter = new BitmapTeleporter(bitmap);
        bitmapTeleporter.a(this.a.a);
        this.b.a(new PlacePhotoResult(Status.a, bitmapTeleporter));
    }
}
