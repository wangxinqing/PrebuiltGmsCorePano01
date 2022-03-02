package defpackage;

import android.content.Intent;

/* renamed from: isj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class isj extends isl {
    final /* synthetic */ Intent a;
    final /* synthetic */ gj b;

    public isj(Intent intent, gj gjVar) {
        this.a = intent;
        this.b = gjVar;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 1);
        }
    }
}
