package defpackage;

import android.os.Bundle;

/* renamed from: ybk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ybk implements ica {
    final /* synthetic */ ybm a;

    public ybk(ybm ybm) {
        this.a = ybm;
    }

    public final void a(int i) {
        if (this.a.isStarted()) {
            this.a.onStartLoading();
        }
    }

    public final void g(Bundle bundle) {
        ybm ybm = this.a;
        ybm.a(ybm.e);
    }
}
