package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: vw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vw extends ActionMode {
    final Context a;
    final vr b;

    public vw(Context context, vr vrVar) {
        this.a = context;
        this.b = vrVar;
    }

    public final void finish() {
        this.b.c();
    }

    public final View getCustomView() {
        return this.b.h();
    }

    public final Menu getMenu() {
        return new xk(this.a, (mh) this.b.b());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.a();
    }

    public final CharSequence getSubtitle() {
        return this.b.f();
    }

    public final Object getTag() {
        return this.b.d;
    }

    public final CharSequence getTitle() {
        return this.b.e();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    public final void invalidate() {
        this.b.d();
    }

    public final boolean isTitleOptional() {
        return this.b.g();
    }

    public final void setCustomView(View view) {
        this.b.a(view);
    }

    public final void setSubtitle(int i) {
        this.b.b(i);
    }

    public final void setTag(Object obj) {
        this.b.d = obj;
    }

    public final void setTitle(int i) {
        this.b.a(i);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }
}
