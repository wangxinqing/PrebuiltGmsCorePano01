package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: cti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cti implements ctf {
    public static WeakReference a = new WeakReference((Object) null);
    public final HashMap b = new HashMap();
    private final amsv c;

    public cti(amsv amsv) {
        this.c = amsv;
    }

    public final as a(dih dih) {
        cry cry = (cry) this.b.get(dih);
        if (cry != null) {
            amri amri = (amri) cry.b();
            if (amri.a() && (jlh.d(((dii) amri.b()).b) || ((dii) amri.b()).b.equals(dih.a) || ((dii) amri.b()).c == 0)) {
                a(dih, cry);
            }
            return cry;
        }
        aucd o = dii.d.o();
        String str = dih.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        str.getClass();
        ((dii) o.b).a = str;
        cry cry2 = new cry(amri.b((dii) o.i()));
        this.b.put(dih, cry2);
        a(dih, cry2);
        return cry2;
    }

    public final void a(dih dih, cry cry) {
        if (!jlh.d(dih.a)) {
            ((iby) this.c.a()).a((wkz) null).a((icm) new cth(dih, cry));
        } else {
            cry.b(amri.b(dii.d));
        }
    }
}
