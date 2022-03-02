package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ij implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;

    public ij(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        String str;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String p = qb.p(view);
            if (p != null) {
                Iterator it = this.b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (p.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                qb.a(view, str);
            }
        }
    }
}
