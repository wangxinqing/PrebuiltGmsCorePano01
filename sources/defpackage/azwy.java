package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: azwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azwy {
    private azxa a;
    private Map b;

    public azwy(azxa azxa) {
        this.a = azxa;
    }

    public final azxa a() {
        if (this.b != null) {
            azxa azxa = this.a;
            azxa azxa2 = azxa.b;
            for (Map.Entry entry : azxa.a.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((azwz) entry.getKey(), entry.getValue());
                }
            }
            this.a = new azxa(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void a(azwz azwz, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(azwz, obj);
    }
}
