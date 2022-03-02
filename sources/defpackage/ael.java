package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: ael  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ael extends acy {
    boolean a = false;
    final /* synthetic */ acw b;

    public ael(acw acw) {
        this.b = acw;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.a();
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
