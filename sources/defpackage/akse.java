package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akse implements aksb {
    private final rka a;
    private final int b;

    public akse(rka rka, int i) {
        this.a = rka;
        this.b = i;
    }

    public final void a(Throwable th) {
        int i;
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("onFailure: ");
            sb.append(valueOf);
            alfy.c("Places", sb.toString());
        }
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            jad.a(volleyError, "Places");
            i = aksc.a(volleyError);
        } else {
            i = 13;
        }
        alfs.a(i, Collections.emptyList(), 106, this.a);
    }

    public final void a(List list) {
        float q = (float) azcf.a.a().q();
        int min = Math.min(list.size(), this.b);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            float f = ((PlaceLikelihoodEntity) list.get(i)).b;
            PlaceEntity placeEntity = ((PlaceLikelihoodEntity) list.get(i)).a;
            if (q > 0.0f) {
                f -= f % q;
            }
            arrayList.add(PlaceLikelihoodEntity.a(placeEntity, f));
        }
        alfs.a(0, arrayList, 106, this.a);
    }
}
