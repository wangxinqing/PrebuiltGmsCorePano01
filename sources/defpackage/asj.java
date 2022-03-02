package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: asj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asj extends aro {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ asm d;

    public asj(asm asm, ViewGroup viewGroup, View view, View view2) {
        this.d = asm;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void a(arn arn) {
        this.c.setTag(R.id.save_overlay_view, (Object) null);
        arz.a(this.a).b(this.b);
        arn.b((arm) this);
    }

    public final void b() {
        arz.a(this.a).b(this.b);
    }

    public final void c() {
        if (this.b.getParent() == null) {
            arz.a(this.a).a(this.b);
        } else {
            this.d.f();
        }
    }
}
