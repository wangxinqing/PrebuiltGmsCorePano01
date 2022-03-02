package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: abjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjv implements View.OnLongClickListener {
    private final Context a;
    private final avid b;

    public abjv(Context context, avid avid) {
        this.a = context;
        this.b = avid;
    }

    public final boolean onLongClick(View view) {
        jpr.a(this.a, this.b.f).show();
        return true;
    }
}
