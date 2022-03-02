package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: udo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udo {
    private static final Map a = new nz();
    private final Map b = new nz();
    private final Set c = new ob();
    private final Map d = new nz();

    private udo() {
    }

    public static synchronized udo a(iby iby) {
        udo a2;
        synchronized (udo.class) {
            a2 = a(iby, (ibm) null);
        }
        return a2;
    }

    public final synchronized igc b(iby iby, Object obj, String str) {
        if (obj instanceof String) {
            igc igc = a(iby, (String) obj, str).b;
            iva.a((Object) igc, (Object) "Key must not be null");
            return igc;
        }
        return igf.a(obj, str);
    }

    public static synchronized udo a(iby iby, ibm ibm) {
        udo udo;
        synchronized (udo.class) {
            udn udn = new udn(iby, ibm);
            if (!a.containsKey(udn)) {
                a.put(udn, new udo());
            }
            udo = (udo) a.get(udn);
        }
        return udo;
    }

    private final void a(String str, igc igc) {
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new ob();
            this.b.put(str, set);
        }
        set.add(igc);
    }

    public final synchronized acwa a(iby iby, igc igc) {
        this.c.remove(igc);
        return iby.a(igc);
    }

    public final synchronized acwa a(iby iby, igi igi, ihg ihg) {
        acwa a2;
        igc a3 = igi.a();
        iva.a((Object) a3, (Object) "Key must not be null");
        this.c.add(a3);
        a2 = iby.a(igi, ihg);
        a2.a((acvs) new udm(this, iby, a3));
        return a2;
    }

    public final synchronized acwa a(iby iby, String str) {
        ob obVar = new ob();
        Set<igc> set = (Set) this.b.get(str);
        if (set == null) {
            return acws.a((Collection) obVar);
        }
        for (igc igc : set) {
            if (this.c.contains(igc)) {
                obVar.add(a(iby, igc));
            }
        }
        this.b.remove(str);
        return acws.a((Collection) obVar);
    }

    public final synchronized ige a(iby iby, Object obj, String str) {
        ige a2;
        a2 = iby.a(obj, str);
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        a(str, igc);
        return a2;
    }

    public final synchronized ige a(iby iby, String str, String str2) {
        if (this.d.containsKey(str) && ((ige) this.d.get(str)).a != null) {
            if (((ige) this.d.get(str)).b != null) {
                return (ige) this.d.get(str);
            }
        }
        ige a2 = iby.a((Object) str, str2);
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        a(str2, igc);
        this.d.put(str, a2);
        return a2;
    }
}
