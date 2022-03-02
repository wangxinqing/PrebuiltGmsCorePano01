package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: ii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ii implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ ArrayList e;

    public ii(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.a; i++) {
            qb.a((View) this.b.get(i), (String) this.c.get(i));
            qb.a((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
