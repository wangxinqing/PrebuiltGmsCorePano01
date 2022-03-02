package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: amir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amir {
    public static final amir a = new amir();
    public int b = 0;
    public List c = Collections.emptyList();
    public String d = "";

    private amir() {
    }

    public static amiq d() {
        return new amiq();
    }

    public final int a() {
        return this.c.size();
    }

    public final List b() {
        return Collections.unmodifiableList(this.c);
    }

    public final amiq c() {
        return new amiq(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amir) {
            amir amir = (amir) obj;
            return alyr.a(Integer.valueOf(this.b), Integer.valueOf(amir.b)) && alyr.a(this.c, amir.c) && alyr.a(this.d, amir.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.c, Integer.valueOf(this.b)});
    }

    public amir(amiq amiq) {
        this.b = amiq.a;
        this.c = Collections.unmodifiableList(amiq.b);
        this.d = amiq.c;
    }
}
