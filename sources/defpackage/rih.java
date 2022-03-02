package defpackage;

import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;

/* renamed from: rih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rih {
    public PlaceFilter a = null;
    public long b = -1;
    public int c = -1;

    public final PlaceRequest a() {
        PlaceFilter placeFilter = this.a;
        if (placeFilter == null) {
            placeFilter = new PlaceFilter();
        }
        this.a = placeFilter;
        int i = this.c;
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            return new PlaceRequest(this.a, this.b, i, Long.MAX_VALUE, false, true);
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("invalid priority: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
