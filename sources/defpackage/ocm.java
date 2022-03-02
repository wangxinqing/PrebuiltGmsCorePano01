package defpackage;

import android.view.View;

/* renamed from: ocm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ocm implements View.OnClickListener {
    private final ss a;

    public ocm(ss ssVar) {
        this.a = ssVar;
    }

    public void onClick(View view) {
        this.a.cancel();
    }
}
