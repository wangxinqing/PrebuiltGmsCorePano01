package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: ary  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ary {
    private final ViewGroupOverlay a;

    public ary(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public final void a(View view) {
        this.a.add(view);
    }

    public final void b(View view) {
        this.a.remove(view);
    }
}
