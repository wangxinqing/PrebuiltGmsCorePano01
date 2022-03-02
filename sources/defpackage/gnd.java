package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: gnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnd extends gmx {
    private gnc d;

    public static gnd a() {
        return new gnd();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = (gnc) activity;
    }

    /* access modifiers changed from: protected */
    public final void a(CustomWebView customWebView) {
        this.d.a(this);
    }

    /* access modifiers changed from: protected */
    public final void a(gol gol) {
        this.d.a(gol);
    }
}
