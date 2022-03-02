package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: ahea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahea implements aoqb {
    private final ahed a;
    private final int b;
    private final List c;

    public ahea(ahed ahed, int i, List list) {
        this.a = ahed;
        this.b = i;
        this.c = list;
    }

    public final aorr a(Object obj) {
        ahed ahed = this.a;
        int i = this.b;
        List list = this.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) aorl.a((Future) list.get(i2))).booleanValue()) {
                ahgk ahgk = (ahgk) ahed.a.get(i2);
                arrayList.add(aorl.a((Object) null));
            }
        }
        return aorl.c((Iterable) arrayList).a(aoqf.a(), (Executor) aoqm.a);
    }
}
