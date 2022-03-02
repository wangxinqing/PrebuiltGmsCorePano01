package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: aaqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqm extends jnb {
    public aaqg i;
    public Drawable j;
    public Drawable k;
    public final Drawable l;
    public final Drawable m;
    public CharSequence n;
    public CharSequence o;
    public CharSequence p;
    public boolean q;
    public boolean r;
    public aaqp s;

    public aaqm(Context context) {
        this(context, (Drawable) null, (Drawable) null);
    }

    public final void c(CharSequence charSequence) {
        this.o = charSequence;
        h();
    }

    public final int e() {
        return R.layout.verify_apps_setting_item;
    }

    public final jms f() {
        return aaql.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public aaqm(Context context, Drawable drawable, Drawable drawable2) {
        super(context);
        this.l = drawable;
        this.m = drawable2;
    }
}
