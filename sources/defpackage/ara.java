package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: ara  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ara implements arm {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public ara(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(arn arn) {
        arn.b((arm) this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    public final void b(arn arn) {
        arn.b((arm) this);
        arn.a((arm) this);
    }
}
