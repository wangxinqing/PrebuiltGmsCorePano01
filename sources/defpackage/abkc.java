package defpackage;

import android.animation.LayoutTransition;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: abkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abkc {
    public ViewGroup c;

    public abkc() {
    }

    public abstract void a();

    public final void a(String str) {
        this.c.setOnLongClickListener(new abkb(this, str));
    }

    public abstract void b();

    public abstract boolean c();

    /* access modifiers changed from: protected */
    public final void f() {
        this.c.setLayoutTransition((LayoutTransition) null);
    }

    public abkc(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        int i = Build.VERSION.SDK_INT;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        this.c.setLayoutTransition(layoutTransition);
    }
}
