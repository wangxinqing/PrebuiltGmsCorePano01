package defpackage;

import java.util.List;

/* renamed from: advb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advb {
    public final int a;
    public final List b;
    public final int c;

    private advb(int i, List list, int i2) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public static advb a(int i, List list, int i2) {
        return new advb(i, list, i2);
    }
}
