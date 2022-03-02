package defpackage;

import java.util.List;

/* renamed from: arps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arps {
    final double a;
    final double b;

    public arps(List list) {
        List subList = list.subList(0, Math.min(list.size(), 10));
        this.a = arpt.a(subList, arpq.a);
        this.b = arpt.a(subList, arpr.a);
    }
}
