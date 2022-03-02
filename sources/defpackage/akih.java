package defpackage;

import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* renamed from: akih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akih {
    public final LatLngBounds a;
    public final int b;
    public final String c;
    public final String d;
    public final AutocompleteFilter e;

    public akih(LatLngBounds latLngBounds, int i, String str, String str2, AutocompleteFilter autocompleteFilter) {
        this.a = latLngBounds;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = autocompleteFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akih) {
            akih akih = (akih) obj;
            return ius.a(this.a, akih.a) && this.c.equals(akih.c) && ius.a(this.d, akih.d) && ius.a(this.e, akih.e) && this.b == akih.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }
}
