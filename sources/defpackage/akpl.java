package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: akpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akpl implements akpv {
    final /* synthetic */ akpm a;

    public akpl(akpm akpm) {
        this.a = akpm;
    }

    public final void a(int i, Map map) {
        akpm akpm = this.a;
        if (!akpm.e && akpm.f.h) {
            if (i == 0 || i == -1) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str = ((akqm) entry.getKey()).b;
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, new HashSet());
                    }
                    ((Set) hashMap.get(str)).addAll((Collection) entry.getValue());
                }
                for (akpd akpd : this.a.b) {
                    List a2 = akrw.a(akpd.b.c);
                    HashSet hashSet = new HashSet();
                    int size = a2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) a2.get(i2);
                        if (hashMap.containsKey(str2)) {
                            hashSet.addAll((Collection) hashMap.get(str2));
                        }
                    }
                    akpm akpm2 = this.a;
                    if (akpm2.f.a.contains(akpd)) {
                        akpm2.f.a(new ArrayList(hashSet), akpd, true);
                    }
                }
            } else if (akpm.d > azbk.j()) {
                this.a.a();
                akpm akpm3 = this.a;
                akpm3.f.a.removeAll(akpm3.b);
                if (Log.isLoggable("Places", 6)) {
                    StringBuilder sb = new StringBuilder(93);
                    sb.append("Exceeded maximum network backoff time, fetching nearby places failed with status: ");
                    sb.append(i);
                    alfy.a("Places", sb.toString());
                }
            } else {
                this.a.f.b.postDelayed(new akpk(this, this.a.d * azbk.k()), this.a.d);
            }
        }
    }
}
