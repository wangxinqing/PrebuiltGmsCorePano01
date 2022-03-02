package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: amjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjb {
    public static final amjb a = new amjb();
    private final String b = "";
    private final Map c = Collections.emptyMap();

    private amjb() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjb) {
            amjb amjb = (amjb) obj;
            return alyr.a(this.b, amjb.b) && alyr.a(this.c, amjb.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }
}
