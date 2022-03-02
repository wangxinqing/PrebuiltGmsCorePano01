package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: ty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ty extends sg {
    final zx a;
    boolean b;
    final Window.Callback c;
    private boolean d;
    private boolean e;
    private final ArrayList f = new ArrayList();
    private final Runnable g = new tt(this);
    private final afb h = new tu(this);

    public ty(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.a = new aff(toolbar, false);
        tx txVar = new tx(this, callback);
        this.c = txVar;
        zx zxVar = this.a;
        ((aff) zxVar).e = txVar;
        toolbar.s = this.h;
        zxVar.a(charSequence);
    }

    public final View a() {
        return ((aff) this.a).c;
    }

    public final CharSequence b() {
        return this.a.e();
    }

    public final int c() {
        return ((aff) this.a).b;
    }

    public final void d() {
        this.a.d(0);
    }

    public final void d(boolean z) {
    }

    public final void e() {
        this.a.d(8);
    }

    public final void e(boolean z) {
    }

    public final void f(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ((sf) this.f.get(i)).a();
            }
        }
    }

    public final Context g() {
        return this.a.b();
    }

    public final boolean h() {
        return this.a.k();
    }

    public final boolean i() {
        return this.a.l();
    }

    public final boolean j() {
        ((aff) this.a).a.removeCallbacks(this.g);
        qb.a((View) ((aff) this.a).a, this.g);
        return true;
    }

    public final boolean k() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    public final void l() {
        ((aff) this.a).a.removeCallbacks(this.g);
    }

    public final void m() {
    }

    public final void n() {
        a(16, 16);
    }

    public final void o() {
        this.a.t();
    }

    public final void p() {
    }

    public final Menu q() {
        if (!this.d) {
            zx zxVar = this.a;
            tv tvVar = new tv(this);
            tw twVar = new tw(this);
            Toolbar toolbar = ((aff) zxVar).a;
            toolbar.v = tvVar;
            toolbar.w = twVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.a(tvVar, twVar);
            }
            this.d = true;
        }
        return ((aff) this.a).a.h();
    }

    public final void a(int i) {
        View inflate = LayoutInflater.from(this.a.b()).inflate(i, ((aff) this.a).a, false);
        se seVar = new se();
        if (inflate != null) {
            inflate.setLayoutParams(seVar);
        }
        this.a.a(inflate);
    }

    public final void b(int i) {
        this.a.a(i);
    }

    public final void c(int i) {
        zx zxVar = this.a;
        zxVar.b(zxVar.b().getText(i));
    }

    public final void d(int i) {
        a(i, -1);
    }

    public final void e(int i) {
        this.a.c(i);
    }

    public final void b(Drawable drawable) {
        qb.a((View) ((aff) this.a).a, drawable);
    }

    public final void c(Drawable drawable) {
        this.a.b(drawable);
    }

    public final boolean f() {
        return ((aff) this.a).a.getVisibility() == 0;
    }

    public final void c(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.a.c(charSequence);
    }

    public final void c(boolean z) {
        a(!z ? 0 : 8, 8);
    }

    public final void a(int i, int i2) {
        zx zxVar = this.a;
        zxVar.b((i & i2) | ((i2 ^ -1) & ((aff) zxVar).b));
    }

    public final void b(boolean z) {
        a(!z ? 0 : 4, 4);
    }

    public final void a(Drawable drawable) {
        this.a.a(drawable);
    }

    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void a(boolean z) {
        a(!z ? 0 : 2, 2);
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        int i2;
        Menu q = q();
        if (q == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        q.setQwertyMode(z);
        return q.performShortcut(i, keyEvent, 0);
    }

    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            h();
        }
        return true;
    }
}
