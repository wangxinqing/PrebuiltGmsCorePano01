package defpackage;

import android.content.Intent;

/* renamed from: qak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qak implements amsv {
    private final qan a;
    private final int b;
    private final Intent c;

    public qak(qan qan, int i, Intent intent) {
        this.a = qan;
        this.b = i;
        this.c = intent;
    }

    public final Object a() {
        qan qan = this.a;
        int i = this.b;
        Intent intent = this.c;
        aosh f = aosh.f();
        qan.b.put(i, f);
        qan.a.startActivityForResult(intent, i);
        return f;
    }
}
