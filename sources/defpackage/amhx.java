package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: amhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amhx {
    public static final amhx a = new amhx();
    private Map b = Collections.emptyMap();

    private amhx() {
    }

    public static amhw b() {
        return new amhw();
    }

    public final Map a() {
        return Collections.unmodifiableMap(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof amhx) && alyr.a(this.b, ((amhx) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public amhx(amhw amhw) {
        this.b = Collections.unmodifiableMap(amhw.a);
    }
}
