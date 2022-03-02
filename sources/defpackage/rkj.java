package defpackage;

import android.net.Uri;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: rkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkj {
    public String a;
    public String b;
    public LatLng c;
    public float d;
    public LatLngBounds e;
    public String f;
    public Uri g;
    public boolean h;
    public float i = -1.0f;
    public int j = -1;
    public List k;
    public String l;
    public String m;
    public List n;
    public PlaceOpeningHoursEntity o;
    public PlaceExtendedDetailsEntity p;
    public String q;

    public final PlaceEntity a() {
        return new PlaceEntity(this.a, this.k, this.b, this.l, this.m, this.n, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.o, this.p, this.q);
    }
}
