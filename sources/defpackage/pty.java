package defpackage;

import android.view.View;

/* renamed from: pty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pty extends jna {
    private final View y;

    public pty(View view) {
        super(view);
        this.y = view;
    }

    public final void a(jmt jmt) {
        super.a(jmt);
        this.y.setClickable(false);
    }
}
