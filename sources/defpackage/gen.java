package defpackage;

import java.util.Arrays;

/* renamed from: gen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gen implements ibj {
    public final String a;

    public gen(gem gem) {
        this.a = gem.a;
    }

    public static gem a() {
        return new gem();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gen) {
            return ius.a(this.a, ((gen) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
