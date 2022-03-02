package defpackage;

import java.util.List;

/* renamed from: altq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class altq extends altj {
    public final int d;
    public final List e;
    public final alsi f;
    public final Integer g;

    public altq(alsi alsi, alss alss, List list, int i, List list2, alsi alsi2, Integer num) {
        super(alsi, alss, list);
        this.d = i;
        this.e = list2;
        this.f = alsi2;
        this.g = num;
    }

    public final altj a(alsk alsk) {
        return new altq((alsi) alsk, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
