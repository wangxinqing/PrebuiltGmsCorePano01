package defpackage;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: btz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btz {
    public final HashMap a = new HashMap();

    public final void a() {
        this.a.clear();
    }

    public final Collection b() {
        return this.a.values();
    }

    public final boolean a(bua bua, bty bty) {
        HashMap hashMap = (HashMap) this.a.get(bua);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.a.put(bua, hashMap);
        } else if (hashMap.containsKey(bty.a)) {
            ((anih) ((anih) bxk.a.b()).a("btz", "a", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AppIntervalMap] insertRecord: map already contains identical record");
            return false;
        }
        hashMap.put(bty.a, bty);
        return true;
    }

    public final boolean a(bua bua, cas cas) {
        if (this.a.containsKey(bua)) {
            return ((HashMap) this.a.get(bua)).containsKey(cas);
        }
        return false;
    }
}
