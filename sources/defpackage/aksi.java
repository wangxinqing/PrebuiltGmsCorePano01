package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aksi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksi implements aksb {
    final /* synthetic */ akpy a;
    private final Map b;
    private final Collection c;
    private final Map d;
    private final akpv e;

    public aksi() {
    }

    public final void a(int i, Map map, Map map2) {
        if (i == 0) {
            Collection<akqm> collection = this.c;
            HashMap hashMap = new HashMap();
            for (akqm put : collection) {
                hashMap.put(put, new ArrayList());
            }
            for (Map.Entry entry : map.entrySet()) {
                akqm akqm = (akqm) entry.getKey();
                if (akqm.c != 0) {
                    hashMap.put(akqm, (List) entry.getValue());
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                akrb akrb = (akrb) entry2.getValue();
                if (akrb.a != 0.0d || akrb.b != 0.0d) {
                    hashMap2.put((String) entry2.getKey(), (akrb) entry2.getValue());
                }
            }
            this.a.a.a(hashMap);
            this.a.a.b(hashMap2);
            this.b.putAll(map);
            this.d.putAll(map2);
            this.e.a(0, akrw.a(this.b, this.d));
            return;
        }
        this.e.a(i, Collections.emptyMap());
    }

    public aksi(akpy akpy, Map map, Collection collection, Map map2, akpv akpv) {
        this.a = akpy;
        this.b = map;
        this.c = collection;
        this.d = map2;
        this.e = akpv;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aksr aksr = (aksr) obj;
        a(0, aksr.a, aksr.b);
    }

    public final void a(Throwable th) {
        int i;
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            jad.a(volleyError, "Places");
            i = aksc.a(volleyError);
        } else {
            i = 13;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: ");
            sb.append(i);
            sb.append(", Cause: ");
            sb.append(valueOf);
            alfy.c("Places", sb.toString());
        }
        a(i, Collections.emptyMap(), Collections.emptyMap());
    }
}
