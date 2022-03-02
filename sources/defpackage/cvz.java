package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: cvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cvz {
    public final Object a;
    public final LinearLayout b;
    public final View c;
    public final cyg d;
    public final Context e;
    public final djk f;

    public cvz(Object obj, LinearLayout linearLayout, cyg cyg, djk djk) {
        this.a = obj;
        this.b = linearLayout;
        this.d = cyg;
        Context context = linearLayout.getContext();
        this.e = context;
        this.c = LayoutInflater.from(context).inflate(a(), this.b, false);
        this.f = djk;
    }

    /* access modifiers changed from: protected */
    public abstract int a();
}
