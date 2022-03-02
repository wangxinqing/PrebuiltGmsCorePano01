package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.lang.ref.WeakReference;

/* renamed from: yfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfd {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private static WeakReference b;

    public static final aucd a(Context context) {
        aucd o = avtk.k.o();
        try {
            int i = ModuleManager.get(context).getCurrentModule().moduleVersion;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avtk avtk = (avtk) o.b;
            avtk.a |= 1;
            avtk.b = i;
        } catch (RuntimeException e) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avtk avtk2 = (avtk) o.b;
            avtk2.a |= 1;
            avtk2.b = -1000;
            anih anih = (anih) a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("yfd", "a", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Problem to get module version");
        }
        return o;
    }

    public static hol a() {
        hol hol;
        WeakReference weakReference = b;
        if (weakReference != null) {
            hol = (hol) weakReference.get();
        } else {
            hol = null;
        }
        if (hol != null) {
            return hol;
        }
        hol hol2 = new hol(ihs.b(), "PHENOTYPE", (String) null);
        hol2.a(avsd.UNMETERED_OR_DAILY);
        b = new WeakReference(hol2);
        return hol2;
    }
}
