package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: abxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxv {
    private static abxv a;
    private final Map b = new nz();
    private final Set c = new ob();

    private abxv() {
    }

    public static synchronized abxv a() {
        abxv abxv;
        synchronized (abxv.class) {
            if (a == null) {
                a = new abxv();
            }
            abxv = a;
        }
        return abxv;
    }

    public final synchronized acwa b(iby iby, String str) {
        igc igc = (igc) this.b.get(str);
        if (igc == null) {
            return acws.a((Object) null);
        } else if (this.c.contains(igc)) {
            this.c.remove(igc);
            this.b.remove(str);
            return iby.a(igc);
        } else {
            return acws.a((Object) null);
        }
    }

    public final synchronized ige a(iby iby, String str) {
        ige ige;
        if (!this.b.containsKey(str)) {
            ige = iby.a(new Object(), str);
            igc igc = ige.b;
            iva.a((Object) igc, (Object) "Key must not be null");
            this.b.put(str, igc);
        } else {
            ige = null;
        }
        return ige;
    }

    public final synchronized void a(iby iby, igc igc) {
        this.c.remove(igc);
        iby.a(igc);
    }

    public final synchronized void a(iby iby, igi igi, ihg ihg) {
        igc a2 = igi.a();
        iva.a((Object) a2, (Object) "Key must not be null");
        this.c.add(a2);
        iby.a(igi, ihg).a((acvs) new abxu(this, iby, a2));
    }

    public final boolean a(String str) {
        return this.b.containsKey(str);
    }
}
