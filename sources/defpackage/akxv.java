package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: akxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxv implements Runnable {
    final /* synthetic */ akxy a;

    public akxv(akxy akxy) {
        this.a = akxy;
    }

    public final void run() {
        akxo akxo = this.a.g;
        long j = akxy.a;
        ArrayList arrayList = new ArrayList(akxo.a.size());
        Iterator it = akxo.a.entrySet().iterator();
        while (it.hasNext()) {
            akll akll = (akll) ((Map.Entry) it.next()).getValue();
            if (akll.d + j >= System.currentTimeMillis()) {
                arrayList.add(akll);
            } else {
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            this.a.a((List) arrayList);
        }
        this.a.l = false;
    }
}
