package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ik implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;

    public ik(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            qb.a(view, (String) this.b.get(qb.p(view)));
        }
    }
}
