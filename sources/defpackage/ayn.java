package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ayn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayn implements ayc {
    public final String a;
    public final List b;
    public final boolean c;

    public ayn(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final avu a(avc avc, ayu ayu) {
        return new avv(avc, ayu, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
