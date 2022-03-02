package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: akbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbk {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public int d = -1;
    public View e;
    public final int f = 1;
    public TabLayout g;
    public akbn h;

    public final void a() {
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            tabLayout.a(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void b() {
        akbn akbn = this.h;
        if (akbn != null) {
            akbn.a();
        }
    }

    public final void a(Drawable drawable) {
        this.a = drawable;
        TabLayout tabLayout = this.g;
        if (tabLayout.s == 1 || tabLayout.v == 2) {
            tabLayout.a(true);
        }
        b();
        int i = ajst.a;
    }

    public final void a(CharSequence charSequence) {
        this.c = charSequence;
        b();
    }
}
