package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: st  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class st extends gl implements su, kb {
    private sv k;

    public final Intent aG() {
        return iz.b(this);
    }

    public final vr aV() {
        return null;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(f().a(context));
    }

    public final void c() {
        f().f();
    }

    public final void closeOptionsMenu() {
        sg e = e();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (e == null || !e.i()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        sg e = e();
        if (keyCode == 82 && e != null && e.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final sg e() {
        return f().a();
    }

    public final sv f() {
        if (this.k == null) {
            this.k = sv.a((Activity) this, (su) this);
        }
        return this.k;
    }

    public final View findViewById(int i) {
        return f().b(i);
    }

    public final MenuInflater getMenuInflater() {
        return f().b();
    }

    public final Resources getResources() {
        afl.a();
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        f().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f().p();
    }

    public final void onContentChanged() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        sv f = f();
        f.h();
        f.k();
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        f().g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent b;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        sg e = e();
        if (menuItem.getItemId() != 16908332 || e == null || (e.c() & 4) == 0 || (b = iz.b(this)) == null) {
            return false;
        }
        if (!iz.a((Activity) this, b)) {
            iz.b((Activity) this, b);
            return true;
        }
        kc a = kc.a((Context) this);
        a.a((Activity) this);
        a.a();
        try {
            kf.a((Activity) this);
            return true;
        } catch (IllegalStateException e2) {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        f().l();
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        f().e();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f().m();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        f().c();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        f().d();
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        f().a(charSequence);
    }

    public final void openOptionsMenu() {
        sg e = e();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (e == null || !e.h()) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i) {
        f().c(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        f().a(i);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void setContentView(View view) {
        f().a(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().a(view, layoutParams);
    }
}
