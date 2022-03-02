package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: amiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amiy {
    public static final amiy a = new amiy();
    public String b = "";
    private String c = "";
    private Map d = Collections.emptyMap();

    private amiy() {
    }

    public static amix a() {
        return new amix();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amiy) {
            amiy amiy = (amiy) obj;
            return alyr.a(this.c, amiy.c) && alyr.a(this.d, amiy.d) && alyr.a(this.b, amiy.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.c, this.b});
    }

    public amiy(amix amix) {
        this.c = amix.a;
        this.d = Collections.unmodifiableMap(amix.b);
        this.b = amix.c;
    }
}
