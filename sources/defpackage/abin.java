package defpackage;

import android.view.View;

/* renamed from: abin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abin implements View.OnLongClickListener {
    private final abiq a;
    private final avhg b;

    public abin(abiq abiq, avhg avhg) {
        this.a = abiq;
        this.b = avhg;
    }

    public final boolean onLongClick(View view) {
        jpr.a(this.a.a, this.b.b).show();
        return true;
    }
}
