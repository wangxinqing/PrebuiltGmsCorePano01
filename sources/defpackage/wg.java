package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: wg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wg implements xh {
    protected final Context a;
    public Context b;
    public wt c;
    public final LayoutInflater d;
    public xg e;
    public xj f;
    public int g;

    public wg(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    public View a(ww wwVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    public void a(Context context, wt wtVar) {
        throw null;
    }

    public void a(wt wtVar, boolean z) {
        throw null;
    }

    public final void a(xg xgVar) {
        throw null;
    }

    public void a(boolean z) {
        throw null;
    }

    public boolean a() {
        throw null;
    }

    public final boolean a(ww wwVar) {
        return false;
    }

    public final int b() {
        return this.g;
    }

    public final boolean b(ww wwVar) {
        return false;
    }

    public boolean a(xp xpVar) {
        xg xgVar = this.e;
        if (xgVar != null) {
            return xgVar.a(xpVar);
        }
        return false;
    }
}
