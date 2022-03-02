package defpackage;

import android.view.View;

/* renamed from: alae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alae implements View.OnClickListener {
    final /* synthetic */ Runnable a;

    public alae(Runnable runnable) {
        this.a = runnable;
    }

    public void onClick(View view) {
        this.a.run();
    }
}
