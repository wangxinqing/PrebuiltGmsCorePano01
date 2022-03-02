package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: ajwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwp {
    final /* synthetic */ FloatingActionButton a;

    public ajwp(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            ajwp.super.setBackgroundDrawable(drawable);
        }
    }

    public final boolean a() {
        return this.a.b;
    }
}
