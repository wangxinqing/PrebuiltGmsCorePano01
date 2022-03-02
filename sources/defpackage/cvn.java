package defpackage;

import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: cvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvn {
    public final int a;
    public final SortedSet b = new TreeSet();
    private final String c;
    private final int d;
    private final boolean e;

    public cvn(String str, int i, int i2, boolean z) {
        this.c = str;
        this.d = i;
        this.a = i2;
        this.e = z;
    }

    public final cvp a() {
        return new cvp(this.c, this.d, this.e, anbh.b(this.b));
    }
}
