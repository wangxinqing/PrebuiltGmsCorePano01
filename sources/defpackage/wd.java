package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: wd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wd implements mi {
    private CharSequence a;
    private CharSequence b;
    private Intent c;
    private char d;
    private int e = FragmentTransaction.TRANSIT_ENTER_MASK;
    private char f;
    private int g = FragmentTransaction.TRANSIT_ENTER_MASK;
    private Drawable h;
    private final Context i;
    private CharSequence j;
    private CharSequence k;
    private ColorStateList l = null;
    private PorterDuff.Mode m = null;
    private boolean n = false;
    private boolean o = false;
    private int p = 16;

    public wd(Context context, CharSequence charSequence) {
        this.i = context;
        this.a = charSequence;
    }

    private final void b() {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        if (this.n || this.o) {
            Drawable f2 = ma.f(drawable);
            this.h = f2;
            Drawable mutate = f2.mutate();
            this.h = mutate;
            if (this.n) {
                ma.a(mutate, this.l);
            }
            if (this.o) {
                ma.a(this.h, this.m);
            }
        }
    }

    public final pa a() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        this.j = charSequence;
    }

    public final void b(CharSequence charSequence) {
        this.k = charSequence;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.g;
    }

    public final char getAlphabeticShortcut() {
        return this.f;
    }

    public final CharSequence getContentDescription() {
        return this.j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.h;
    }

    public final ColorStateList getIconTintList() {
        return this.l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence == null ? this.a : charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.p = z | (this.p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.p = (!z ? 0 : 2) | (this.p & -3);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.p = (!z ? 0 : 16) | (this.p & -17);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.h = kf.a(this.i, i2);
        b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        b();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f = Character.toLowerCase(c3);
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.a = this.i.getResources().getString(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.p & 8;
        if (z) {
            i2 = 0;
        }
        this.p = i3 | i2;
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        this.f = Character.toLowerCase(c3);
        this.g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public final void a(pa paVar) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        b();
        return this;
    }
}
