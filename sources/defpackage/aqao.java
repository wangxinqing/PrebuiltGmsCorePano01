package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aqao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqao implements azxm {
    private final Map a = new HashMap();
    private final apyf b;
    private final Executor c;

    public aqao(apyf apyf, Executor executor) {
        this.b = apyf;
        this.c = executor;
    }

    public final azxl a(baaj baaj, azxh azxh, azxi azxi) {
        amri amri;
        int e = ((apyg) azxh.a(apyg.a)).e();
        if (e != 0) {
            if (e == 2) {
                String str = (String) azxh.a(apyj.a);
                if (str == null) {
                    str = ((apyg) azxh.a(apyg.a)).b().a().a;
                }
                apzv apzv = new apzv(str, (apyq) azxh.a(apyq.a), baaj.b);
                synchronized (this.a) {
                    amri = (amri) this.a.get(apzv);
                    if (amri == null) {
                        amri = amri.c(this.b.a());
                        this.a.put(apzv, amri);
                    }
                }
                if (amri.a()) {
                    apzg a2 = apzh.a();
                    a2.a = (apzj) amri.b();
                    a2.b = this.c;
                    amrl.a((Object) a2.a);
                    amrl.a((Object) a2.b);
                    return aqbb.a(new aqam(new apzh(a2))).a(baaj, azxh, azxi);
                }
            }
            return azxi.a(baaj, azxh);
        }
        throw null;
    }
}
