package defpackage;

import android.view.View;

/* renamed from: abfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abfx implements View.OnClickListener {
    private final abkl a;
    private final jtf b;

    public abfx(abkl abkl, jtf jtf) {
        this.a = abkl;
        this.b = jtf;
    }

    public void onClick(View view) {
        abkl abkl = this.a;
        jtf jtf = this.b;
        abkl.a();
        jtf.a(jth.FAB_ADD_TO_CONTACTS_BUTTON, jth.SMART_PROFILE_HEADER);
    }
}
