package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: akpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpw {
    final /* synthetic */ akpy a;
    private final PlacesParams b;
    private final akpv c;

    public akpw(akpy akpy, PlacesParams placesParams, akpv akpv) {
        this.a = akpy;
        this.b = placesParams;
        this.c = akpv;
    }

    public final void a(Map map, Collection collection) {
        HashSet hashSet = new HashSet();
        for (List addAll : map.values()) {
            hashSet.addAll(addAll);
        }
        akpy akpy = this.a;
        akql akql = akpy.a;
        PlacesParams placesParams = this.b;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!list.isEmpty()) {
                hashMap.put((akqm) entry.getKey(), list);
            }
        }
        akql.a((Collection) hashSet, (akqk) new akpx(akpy, placesParams, hashMap, new HashSet(collection), this.c));
    }
}
