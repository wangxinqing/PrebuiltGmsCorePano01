package defpackage;

import android.content.Intent;

/* renamed from: isk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class isk extends isl {
    final /* synthetic */ Intent a;
    final /* synthetic */ ify b;

    public isk(Intent intent, ify ify) {
        this.a = intent;
        this.b = ify;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
