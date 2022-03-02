package defpackage;

import android.view.View;

/* renamed from: alhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alhn implements alhq {
    final /* synthetic */ int a;

    public alhn(int i) {
        this.a = i;
    }

    public final void a(View view) {
        view.setSystemUiVisibility((this.a ^ -1) & view.getSystemUiVisibility());
    }
}
