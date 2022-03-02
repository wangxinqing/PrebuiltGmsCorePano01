package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: ajvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvb extends acy {
    final /* synthetic */ ajvt a;
    final /* synthetic */ MaterialButton b;
    final /* synthetic */ ajvf c;

    public ajvb(ajvf ajvf, ajvt ajvt, MaterialButton materialButton) {
        this.c = ajvf;
        this.a = ajvt;
        this.b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.b.getText();
            int i2 = Build.VERSION.SDK_INT;
            recyclerView.announceForAccessibility(text);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i >= 0) {
            i3 = this.c.j().n();
        } else {
            i3 = this.c.j().m();
        }
        this.c.c = this.a.f(i3);
        this.b.setText(this.a.f(i3).b);
    }
}
