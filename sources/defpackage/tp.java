package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: tp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class tp extends Dialog implements su {
    private sv a;
    private final pe b = new to(this);

    public tp(Context context, int i) {
        super(context, a(context, i));
        sv b2 = b();
        b2.a(a(context, i));
        b2.k();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final vr aV() {
        return null;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().b(view, layoutParams);
    }

    public final sv b() {
        if (this.a == null) {
            this.a = sv.a((Dialog) this, (su) this);
        }
        return this.a;
    }

    public final void c() {
        b().d(1);
    }

    public final void dismiss() {
        super.dismiss();
        b().g();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return pf.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    public final View findViewById(int i) {
        return b().b(i);
    }

    public final void invalidateOptionsMenu() {
        b().f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        b().h();
        super.onCreate(bundle);
        b().k();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        b().d();
    }

    public void setContentView(int i) {
        b().c(i);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        b().a((CharSequence) getContext().getString(i));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setContentView(View view) {
        b().a(view);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().a(charSequence);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().a(view, layoutParams);
    }
}
