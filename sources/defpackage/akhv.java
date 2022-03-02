package defpackage;

import android.util.Log;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhv implements acvp {
    final /* synthetic */ akpr a;

    public akhv(akpr akpr) {
        this.a = akpr;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            rhs rhs = (rhs) acwa.d();
            int a2 = rhs.a();
            ArrayList arrayList = new ArrayList(a2);
            for (int i = 0; i < a2; i++) {
                arrayList.add(((rkr) rhs.a(i)).r());
            }
            rhs.c();
            akpr akpr = this.a;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PlaceEntity placeEntity = (PlaceEntity) arrayList.get(i2);
                String str = placeEntity.a;
                LatLng latLng = placeEntity.b;
                arrayList2.add(new akri(str, latLng.a, latLng.b, 80.0f));
            }
            akpr.a.a(0, (List) arrayList2);
            return;
        }
        if (Log.isLoggable("Places", 5)) {
            alfy.b("Places", "Failed to retrieve places from GeoDataApi", acwa.e());
        }
        this.a.a.a(13, Collections.emptyList());
    }
}
