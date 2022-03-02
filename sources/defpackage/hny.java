package defpackage;

import android.view.View;

/* renamed from: hny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hny implements acvp {
    private final hoa a;
    private final View b;

    public hny(hoa hoa, View view) {
        this.a = hoa;
        this.b = view;
    }

    public final void a(acwa acwa) {
        hoa hoa = this.a;
        this.b.setEnabled(true);
        if (acwa.b()) {
            hoa.setResult(-1);
            hoa.finish();
            return;
        }
        hoa.e.a(true);
    }
}
