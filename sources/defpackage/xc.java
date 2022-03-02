package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: xc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xc extends wh implements MenuItem {
    public final mi d;
    public Method e;

    public xc(Context context, mi miVar) {
        super(context);
        if (miVar != null) {
            this.d = miVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        pa a = this.d.a();
        if (a instanceof wx) {
            return ((wx) a).b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.d.getActionView();
        return actionView instanceof wz ? (View) ((wz) actionView).a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public final int getGroupId() {
        return this.d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.d.getIntent();
    }

    public final int getItemId() {
        return this.d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return a(this.d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    public final boolean isChecked() {
        return this.d.isChecked();
    }

    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    public final boolean isVisible() {
        return this.d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        int i = Build.VERSION.SDK_INT;
        wy wyVar = new wy(this, actionProvider);
        mi miVar = this.d;
        if (actionProvider == null) {
            wyVar = null;
        }
        miVar.a((pa) wyVar);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.d.setActionView(i);
        View actionView = this.d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.d.setActionView((View) new wz(actionView));
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.d.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.d.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new xa(this, onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new xb(this, onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.d.setShortcut(c, c2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.d.setTitle(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        mi miVar = this.d;
        miVar.setVisible(z);
        return miVar;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.d.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.d.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new wz(view);
        }
        this.d.setActionView(view);
        return this;
    }
}
