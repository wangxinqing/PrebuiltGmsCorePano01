package defpackage;

import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: akpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akpx implements akqk {
    final /* synthetic */ akpy a;
    private final PlacesParams b;
    private final Map c;
    private final Collection d;
    private final akpv e;

    public akpx(akpy akpy, PlacesParams placesParams, Map map, Collection collection, akpv akpv) {
        this.a = akpy;
        this.b = placesParams;
        this.c = map;
        this.d = collection;
        this.e = akpv;
    }

    public final void a(Map map, Collection collection) {
        if (!collection.isEmpty()) {
            if (Log.isLoggable("Places", 5)) {
                int size = collection.size();
                StringBuilder sb = new StringBuilder(80);
                sb.append(size);
                sb.append(" cache miss in L2. It isn't supposed to happen. Need to debug further");
                Log.w("Places", sb.toString());
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                for (Map.Entry entry : this.c.entrySet()) {
                    if (((List) entry.getValue()).contains(str)) {
                        this.d.add((akqm) entry.getKey());
                        this.c.remove((akqm) entry.getKey());
                    }
                }
            }
        }
        if (!this.d.isEmpty()) {
            aksi aksi = new aksi(this.a, this.c, this.d, map, this.e);
            Collection<akqm> collection2 = this.d;
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (akqm akqm : collection2) {
                String str2 = akqm.b;
                long j = akqm.c;
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, new ArrayList());
                }
                ((List) hashMap.get(str2)).add(Long.valueOf(j));
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                aucd o = asrk.d.o();
                String str3 = (String) entry2.getKey();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asrk asrk = (asrk) o.b;
                str3.getClass();
                asrk.a |= 1;
                asrk.c = str3;
                Iterable iterable = (Iterable) entry2.getValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asrk asrk2 = (asrk) o.b;
                if (!asrk2.b.a()) {
                    asrk2.b = aucj.a(asrk2.b);
                }
                auab.a(iterable, (List) asrk2.b);
                arrayList.add((asrk) o.i());
            }
            this.a.c.a(new akso(this.a.b, this.b, arrayList, (int) azbk.h()), aksi);
            return;
        }
        this.e.a(-1, akrw.a(this.c, map));
    }
}
