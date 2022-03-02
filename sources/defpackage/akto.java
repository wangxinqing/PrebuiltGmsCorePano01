package defpackage;

import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: akto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akto implements Callable {
    private final aktg a;
    private final assn[] b;

    public akto(aktg aktg, assn[] assnArr) {
        this.a = aktg;
        this.b = assnArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aktg aktg = this.a;
        assn[] assnArr = this.b;
        aktn aktn = aktg.b;
        int b2 = jlo.b();
        int i = ModuleManager.get(aktg.a).getCurrentModule().moduleVersion;
        aucd o = ataf.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ataf ataf = (ataf) o.b;
        int i2 = ataf.a | 1;
        ataf.a = i2;
        ataf.b = b2;
        ataf.a = i2 | 2;
        ataf.c = i;
        for (assn assn : assnArr) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ataf ataf2 = (ataf) o.b;
            assn.getClass();
            if (!ataf2.d.a()) {
                ataf2.d = aucj.a(ataf2.d);
            }
            ataf2.d.add(assn);
        }
        ataf ataf3 = (ataf) o.i();
        long c = azda.c();
        if (aktn.c == null) {
            aktn.c = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/GetDevicePlaceInferenceModel", baoq.a(ataf.e), baoq.a(atag.d));
        }
        return (atag) aktn.a.a(aktn.c, ataf3, c, TimeUnit.MILLISECONDS);
    }
}
