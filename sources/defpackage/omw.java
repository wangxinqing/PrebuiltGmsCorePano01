package defpackage;

import android.view.View;

/* renamed from: omw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class omw implements View.OnClickListener {
    private final onb a;
    private final int b;
    private final String c;
    private final omv d;

    public omw(onb onb, int i, String str, omv omv) {
        this.a = onb;
        this.b = i;
        this.c = str;
        this.d = omv;
    }

    public void onClick(View view) {
        onb onb = this.a;
        int i = this.b;
        String str = this.c;
        omv omv = this.d;
        onb.a.s.i.clearFocus();
        oay.a(view);
        ooe.a(onb.a, oab.a(str, oal.a(), onb.a.x), 32, i);
        onb.a(onb.e, omv);
    }
}
