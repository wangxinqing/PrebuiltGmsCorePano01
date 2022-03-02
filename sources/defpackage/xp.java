package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: xp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xp extends wt implements SubMenu {
    public final wt k;
    public final ww l;

    public xp(Context context, wt wtVar, ww wwVar) {
        super(context);
        this.k = wtVar;
        this.l = wwVar;
    }

    public final String a() {
        ww wwVar = this.l;
        int i = wwVar != null ? wwVar.a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    public final boolean b() {
        return this.k.b();
    }

    public final boolean c() {
        return this.k.c();
    }

    public final boolean d() {
        return this.k.d();
    }

    public final MenuItem getItem() {
        return this.l;
    }

    public final wt j() {
        return this.k.j();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    public final void a(wr wrVar) {
        this.k.a(wrVar);
    }

    public final boolean b(ww wwVar) {
        return this.k.b(wwVar);
    }

    public final SubMenu setHeaderIcon(int i) {
        super.a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    public final boolean a(wt wtVar, MenuItem menuItem) {
        return super.a(wtVar, menuItem) || this.k.a(wtVar, menuItem);
    }

    public final boolean a(ww wwVar) {
        return this.k.a(wwVar);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }
}
