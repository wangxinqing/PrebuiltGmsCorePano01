package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: amjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjl {
    public static final amjl a = new amjl();
    public int b = 0;
    private List c = Collections.emptyList();

    private amjl() {
    }

    public static amjk c() {
        return new amjk();
    }

    public final int a() {
        return this.c.size();
    }

    public final List b() {
        return Collections.unmodifiableList(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjl) {
            amjl amjl = (amjl) obj;
            return alyr.a(Integer.valueOf(this.b), Integer.valueOf(amjl.b)) && alyr.a(this.c, amjl.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.b)});
    }

    public amjl(amjk amjk) {
        this.b = amjk.a;
        this.c = Collections.unmodifiableList(amjk.b);
    }
}
