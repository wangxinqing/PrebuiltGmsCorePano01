package defpackage;

import com.google.android.gms.location.places.PlaceFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Deprecated
/* renamed from: rhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhw {
    public Collection a = null;

    public final PlaceFilter a() {
        ArrayList arrayList;
        Collection collection = this.a;
        if (collection != null) {
            arrayList = new ArrayList(collection);
        } else {
            arrayList = null;
        }
        return new PlaceFilter((List) arrayList, false, (List) null, (List) null);
    }
}
