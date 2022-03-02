package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ahed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahed implements aoqb {
    public final List a;
    public final Executor b;

    public ahed(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    public final /* bridge */ /* synthetic */ aorr a(Object obj) {
        ahfu ahfu = (ahfu) obj;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        List list = this.a;
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            ahgk ahgk = (ahgk) list.get(i);
            arrayList.add(aorl.a((Object) true));
        }
        aoqb a2 = amll.a((aoqb) new ahdz(this, arrayList, size));
        aoqm aoqm = aoqm.a;
        amlv.a();
        return aopr.a(aopr.a(aorl.a(ahfu.a.c.a()), amll.a((aoqb) new ahft(ahfu, a2, aoqm)), (Executor) aoqm.a), amll.a((aoqb) new ahea(this, size, arrayList)), (Executor) aoqm.a);
    }
}
