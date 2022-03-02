package defpackage;

import android.os.Bundle;

/* renamed from: acdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdf {
    public int a = -1;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public boolean f = false;
    public boolean g = false;
    private String h;
    private String i;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private boolean m = false;

    public final acdg a() {
        Bundle bundle = new Bundle();
        bundle.putInt("iconResId", this.a);
        bundle.putString("title", this.b);
        bundle.putString("description", this.c);
        bundle.putBoolean("description_html", this.d);
        bundle.putString("body", (String) null);
        bundle.putString("bodyHtml", this.e);
        bundle.putString("primaryActionText", this.h);
        bundle.putString("secondaryActionText", this.i);
        bundle.putBoolean("magicWand", this.g);
        bundle.putInt("primaryActionId", this.j);
        bundle.putInt("secondaryActionId", this.k);
        bundle.putInt("illustrationResId", this.l);
        bundle.putBoolean("adjustIllustrationBounds", this.m);
        bundle.putBoolean("progressBarEnabled", this.f);
        acdg acdg = new acdg();
        acdg.setArguments(bundle);
        return acdg;
    }

    public final void a(int i2, boolean z) {
        this.l = i2;
        this.m = z;
    }

    public final void a(String str, int i2) {
        this.h = str;
        this.j = i2;
    }

    public final void b(String str, int i2) {
        this.i = str;
        this.k = i2;
    }
}
