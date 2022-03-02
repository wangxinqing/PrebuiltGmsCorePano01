package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: amin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amin {
    public List a = Collections.emptyList();
    private amjf b = amjf.a;

    static {
        new amin();
    }

    private amin() {
    }

    public static amim a() {
        return new amim();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amin) {
            amin amin = (amin) obj;
            return alyr.a(this.a, amin.a) && alyr.a(this.b, amin.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public amin(amim amim) {
        this.a = Collections.unmodifiableList(amim.a);
        this.b = amim.b;
    }
}
