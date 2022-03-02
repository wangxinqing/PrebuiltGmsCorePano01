package defpackage;

import java.util.Comparator;

/* renamed from: dqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dqu implements Comparator {
    final /* synthetic */ dqv a;

    public dqu(dqv dqv) {
        this.a = dqv;
    }

    /* renamed from: a */
    public final int compare(Integer num, Integer num2) {
        dqt dqt = (dqt) this.a.a.get(num);
        dqt dqt2 = (dqt) this.a.a.get(num2);
        iva.a((Object) dqt);
        iva.a((Object) dqt2);
        return dqt.compareTo(dqt2);
    }
}
