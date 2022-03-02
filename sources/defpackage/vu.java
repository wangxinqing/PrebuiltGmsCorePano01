package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: vu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vu extends vr implements wr {
    public final wt a;
    private final Context b;
    private final ActionBarContextView c;
    private final vq f;
    private WeakReference g;
    private boolean h;

    public vu(Context context, ActionBarContextView actionBarContextView, vq vqVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = vqVar;
        wt wtVar = new wt(actionBarContextView.getContext());
        wtVar.m();
        this.a = wtVar;
        wtVar.b = this;
    }

    public final MenuInflater a() {
        return new vz(this.c.getContext());
    }

    public final Menu b() {
        return this.a;
    }

    public final void c() {
        if (!this.h) {
            this.h = true;
            this.c.sendAccessibilityEvent(32);
            this.f.a(this);
        }
    }

    public final void d() {
        this.f.b(this, this.a);
    }

    public final CharSequence e() {
        return this.c.g;
    }

    public final CharSequence f() {
        return this.c.h;
    }

    public final boolean g() {
        return this.c.j;
    }

    public final View h() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void a(int i) {
        b((CharSequence) this.b.getString(i));
    }

    public final void b(int i) {
        a((CharSequence) this.b.getString(i));
    }

    public final void a(View view) {
        this.c.a(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    public final void b(CharSequence charSequence) {
        this.c.a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        this.c.b(charSequence);
    }

    public final void a(wt wtVar) {
        d();
        this.c.b();
    }

    public final void a(boolean z) {
        this.e = z;
        this.c.a(z);
    }

    public final boolean a(wt wtVar, MenuItem menuItem) {
        return this.f.a((vr) this, menuItem);
    }
}
