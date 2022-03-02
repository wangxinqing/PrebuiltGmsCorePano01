package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: afmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afmr {
    private Boolean a;
    private anax b;

    public final afmt a() {
        if (this.b == null) {
            this.b = anfv.a;
        }
        String str = this.a == null ? " requireUnmeteredNetwork" : "";
        if (str.isEmpty()) {
            return new afmp(this.a.booleanValue(), this.b);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    public final void a(Set set) {
        this.b = anax.a((Collection) set);
    }

    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
