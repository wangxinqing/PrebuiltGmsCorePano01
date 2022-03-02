package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: aenp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aenp implements pq {
    private final ViewGroup.MarginLayoutParams a;
    private final int b;
    private final int c;

    public aenp(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        this.a = marginLayoutParams;
        this.b = i;
        this.c = i2;
    }

    public final qn a(View view, qn qnVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.a;
        int i = this.b;
        int i2 = this.c;
        marginLayoutParams.leftMargin = i + qnVar.a();
        marginLayoutParams.rightMargin = i2 + qnVar.c();
        return qnVar;
    }
}
