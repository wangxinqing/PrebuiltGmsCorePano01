package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: amhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amhu {
    public static final amhu a = new amhu();
    private List b = Collections.emptyList();

    private amhu() {
    }

    public static amht b() {
        return new amht();
    }

    public final List a() {
        return Collections.unmodifiableList(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof amhu) && alyr.a(this.b, ((amhu) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public amhu(amht amht) {
        this.b = Collections.unmodifiableList(amht.a);
    }
}
