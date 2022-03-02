package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* renamed from: hz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hz implements Runnable {
    final /* synthetic */ il a;
    final /* synthetic */ nz b;
    final /* synthetic */ Object c;
    final /* synthetic */ ia d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ View f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ArrayList h;
    final /* synthetic */ Object i;
    final /* synthetic */ Rect j;

    public hz(il ilVar, nz nzVar, Object obj, ia iaVar, ArrayList arrayList, View view, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = ilVar;
        this.b = nzVar;
        this.c = obj;
        this.d = iaVar;
        this.e = arrayList;
        this.f = view;
        this.g = z;
        this.h = arrayList2;
        this.i = obj2;
        this.j = rect;
    }

    public final void run() {
        nz a2 = ib.a(this.a, this.b, this.c, this.d);
        if (a2 != null) {
            this.e.addAll(a2.values());
            this.e.add(this.f);
        }
        Object obj = this.c;
        if (obj != null) {
            this.a.a(obj, this.h, this.e);
            View a3 = ib.a(a2, this.d, this.i, this.g);
            if (a3 != null) {
                il.a(a3, this.j);
            }
        }
    }
}
