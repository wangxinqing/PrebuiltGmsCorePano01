package defpackage;

import com.google.android.gms.beacon.BleSighting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxs implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ akxu b;

    public akxs(akxu akxu, List list) {
        this.b = akxu;
        this.a = list;
    }

    public final void run() {
        akxy akxy = this.b.a;
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            akll a2 = akxy.a((BleSighting) list.get(i));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (!arrayList.isEmpty()) {
            akxy.a((List) arrayList);
        }
    }
}
