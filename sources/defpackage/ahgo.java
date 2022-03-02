package defpackage;

import java.util.Arrays;

/* renamed from: ahgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahgo {
    static final Object[] a = new Object[0];
    public static final ahgo b = new ahgo(a);
    public final Object[] c;
    private final int d;

    public ahgo(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahgo)) {
            return false;
        }
        ahgo ahgo = (ahgo) obj;
        return this.d == ahgo.d && Arrays.equals(this.c, ahgo.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
