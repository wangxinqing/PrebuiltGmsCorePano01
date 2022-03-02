package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dlj extends dkp {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();

    public final /* bridge */ /* synthetic */ void a(dkp dkp) {
        String str;
        dlj dlj = (dlj) dkp;
        dlj.a.addAll(this.a);
        dlj.b.addAll(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str2 = (String) entry.getKey();
            for (dlq dlq : (List) entry.getValue()) {
                if (dlq != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!dlj.c.containsKey(str)) {
                        dlj.c.put(str, new ArrayList());
                    }
                    ((List) dlj.c.get(str)).add(dlq);
                }
            }
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.a.isEmpty()) {
            hashMap.put("products", this.a);
        }
        if (!this.b.isEmpty()) {
            hashMap.put("promotions", this.b);
        }
        if (!this.c.isEmpty()) {
            hashMap.put("impressions", this.c);
        }
        hashMap.put("productAction", (Object) null);
        return dkp.a((Object) hashMap);
    }
}
