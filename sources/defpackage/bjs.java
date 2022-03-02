package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: bjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bjs extends bsu implements su, kb {
    private sv CV;

    public final void a(Toolbar toolbar) {
        aU().a(toolbar);
    }

    public final sg aE() {
        return aU().a();
    }

    public boolean aF() {
        Intent aG = aG();
        if (aG == null) {
            return false;
        }
        if (a(aG)) {
            kc a = kc.a((Context) this);
            a.a(getContainerActivity());
            a.a();
            try {
                kf.a(getContainerActivity());
                return true;
            } catch (IllegalStateException e) {
                finish();
                return true;
            }
        } else {
            iz.b(getContainerActivity(), aG);
            return true;
        }
    }

    public final Intent aG() {
        return iz.b(getContainerActivity());
    }

    public final sv aU() {
        if (this.CV == null) {
            this.CV = sv.a(this, getContainerActivity(), this);
        }
        return this.CV;
    }

    public final vr aV() {
        return null;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        aU().b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        aU();
    }

    public final void closeOptionsMenu() {
        sg aE = aE();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (aE == null || !aE.i()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        sg aE = aE();
        if (keyCode == 82 && aE != null && aE.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i) {
        return aU().b(i);
    }

    public final MenuInflater getMenuInflater() {
        return aU().b();
    }

    public final Resources getResources() {
        afl.a();
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        aU().f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aU().p();
    }

    public final void onContentChanged() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        sv aU = aU();
        aU.h();
        aU.k();
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        aU().g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        sg aE = aE();
        if (menuItem.getItemId() != 16908332 || aE == null || (aE.c() & 4) == 0) {
            return false;
        }
        return aF();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        aU().l();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        aU().e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        aU().m();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        aU().c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        aU().d();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        aU().a(charSequence);
    }

    public final void openOptionsMenu() {
        sg aE = aE();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (aE == null || !aE.h()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        aU().c(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        aU().a(i);
    }

    public final void supportInvalidateOptionsMenu() {
        aU().f();
    }

    public boolean a(Intent intent) {
        return iz.a(getContainerActivity(), intent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void setContentView(View view) {
        aU().a(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        aU().a(view, layoutParams);
    }
}
