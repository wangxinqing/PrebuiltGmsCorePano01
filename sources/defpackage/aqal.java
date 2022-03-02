package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aqal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqal extends apyb {
    public final apxy a;
    private final Object b = new Object();
    private final ConcurrentHashMap c = new ConcurrentHashMap();

    public aqal(apxy apxy) {
        super(apyh.a);
        this.a = apxy;
    }

    public final azxi a(apyi apyi) {
        azxi azxi;
        azxi azxi2 = (azxi) this.c.get(apyi);
        if (azxi2 != null) {
            return azxi2;
        }
        synchronized (this.b) {
            if (!this.c.containsKey(apyi)) {
                aqar aqar = new aqar(apyi, this.a);
                amzt j = amzy.j();
                j.c(aqbb.a(new aqai(this, apyi)));
                if (this.a.i() != null) {
                    j.c(new aqao(this.a.i(), this.a.e()));
                }
                if (this.a.h() != null) {
                    j.c(new apzu());
                    j.c(aqbb.a(new aqaj(this)));
                } else {
                    j.c(new aqap());
                }
                j.c(aqbb.a(new aqak(this)));
                ArrayList arrayList = new ArrayList(j.a());
                Collections.reverse(arrayList);
                this.c.put(apyi, azxq.a((azxi) aqar, (List) arrayList));
            }
            azxi = (azxi) this.c.get(apyi);
        }
        return azxi;
    }
}
