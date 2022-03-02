package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: apwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwb {
    private final Set a;
    private final Set b;
    private final int c;
    private final int d;

    public apwb(Set set, Set set2, int i, int i2, Set set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        Collections.unmodifiableSet(set3);
    }

    public static apwa a(Class cls) {
        return new apwa(cls, new Class[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
