package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: hx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hx implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ il b;
    final /* synthetic */ View c;
    final /* synthetic */ gj d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ ArrayList g;
    final /* synthetic */ Object h;

    public hx(Object obj, il ilVar, View view, gj gjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = ilVar;
        this.c = view;
        this.d = gjVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    public final void run() {
        Object obj = this.a;
        if (obj != null) {
            this.b.c(obj, this.c);
            this.f.addAll(ib.a(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                this.b.b(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
