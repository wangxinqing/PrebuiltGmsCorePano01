package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: alqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqb {
    private final Map a;

    public alqb(alqa alqa) {
        this.a = Collections.unmodifiableMap(alqa.a);
    }

    public final String a(alqc alqc) {
        return (String) this.a.get(alqc);
    }
}
