package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: qo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qo extends ClickableSpan {
    private final int a;
    private final qs b;
    private final int c;

    public qo(int i, qs qsVar, int i2) {
        this.a = i;
        this.b = qsVar;
        this.c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        qs qsVar = this.b;
        int i = this.c;
        int i2 = Build.VERSION.SDK_INT;
        qsVar.a.performAction(i, bundle);
    }
}
