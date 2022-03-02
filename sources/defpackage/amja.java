package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: amja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amja {
    public static final amja a = new amja();
    private final String b = "";
    private final List c = Collections.emptyList();

    private amja() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amja) {
            amja amja = (amja) obj;
            return alyr.a(this.b, amja.b) && alyr.a(this.c, amja.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }
}
