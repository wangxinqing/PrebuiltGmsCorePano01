package defpackage;

import android.view.View;

/* renamed from: abkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abkb implements View.OnLongClickListener {
    private final abkc a;
    private final String b;

    public abkb(abkc abkc, String str) {
        this.a = abkc;
        this.b = str;
    }

    public final boolean onLongClick(View view) {
        abkc abkc = this.a;
        jpr.a(abkc.c.getContext(), this.b).show();
        return true;
    }
}
