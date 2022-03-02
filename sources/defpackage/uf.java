package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: uf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uf extends vr implements wr {
    public final wt a;
    public vq b;
    final /* synthetic */ ug c;
    private final Context f;
    private WeakReference g;

    public uf(ug ugVar, Context context, vq vqVar) {
        this.c = ugVar;
        this.f = context;
        this.b = vqVar;
        wt wtVar = new wt(context);
        wtVar.m();
        this.a = wtVar;
        wtVar.b = this;
    }

    public final MenuInflater a() {
        return new vz(this.f);
    }

    public final Menu b() {
        return this.a;
    }

    public final void c() {
        ug ugVar = this.c;
        if (ugVar.g == this) {
            if (!ug.a(ugVar.l, ugVar.m, false)) {
                ug ugVar2 = this.c;
                ugVar2.h = this;
                ugVar2.i = this.b;
            } else {
                this.b.a(this);
            }
            this.b = null;
            this.c.h(false);
            ActionBarContextView actionBarContextView = this.c.e;
            if (actionBarContextView.i == null) {
                actionBarContextView.a();
            }
            this.c.d.a().sendAccessibilityEvent(32);
            ug ugVar3 = this.c;
            ugVar3.b.a(ugVar3.o);
            this.c.g = null;
        }
    }

    public final void d() {
        if (this.c.g == this) {
            this.a.e();
            try {
                this.b.b(this, this.a);
            } finally {
                this.a.f();
            }
        }
    }

    public final CharSequence e() {
        return this.c.e.g;
    }

    public final CharSequence f() {
        return this.c.e.h;
    }

    public final boolean g() {
        return this.c.e.j;
    }

    public final View h() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void a(int i) {
        b((CharSequence) this.c.a.getResources().getString(i));
    }

    public final void b(int i) {
        a((CharSequence) this.c.a.getResources().getString(i));
    }

    public final void a(View view) {
        this.c.e.a(view);
        this.g = new WeakReference(view);
    }

    public final void b(CharSequence charSequence) {
        this.c.e.a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        this.c.e.b(charSequence);
    }

    public final void a(wt wtVar) {
        if (this.b != null) {
            d();
            this.c.e.b();
        }
    }

    public final void a(boolean z) {
        this.e = z;
        this.c.e.a(z);
    }

    public final boolean a(wt wtVar, MenuItem menuItem) {
        vq vqVar = this.b;
        if (vqVar != null) {
            return vqVar.a((vr) this, menuItem);
        }
        return false;
    }
}
