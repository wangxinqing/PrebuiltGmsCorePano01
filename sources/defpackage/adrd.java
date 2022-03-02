package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: adrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrd {
    private final Map a;

    public adrd() {
        this.a = new HashMap();
    }

    public final adre a() {
        return new adre(anbd.b(this.a));
    }

    public adrd(Map map) {
        this.a = new HashMap(map);
    }

    public final void a(adri adri, Object obj) {
        a(new adrc(adri, obj));
    }

    public final void a(adrc... adrcArr) {
        for (adrc adrc : adrcArr) {
            String a2 = adrc.a();
            if (a2 != null) {
                this.a.put(adrc.a.a, a2);
            }
        }
    }

    public final boolean a(adri adri) {
        return this.a.containsKey(adri.a);
    }
}
