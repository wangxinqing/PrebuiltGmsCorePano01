package defpackage;

import android.content.Context;

/* renamed from: gwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gwx implements gxl {
    final /* synthetic */ int a;
    private long b = 0;

    public gwx(int i) {
        this.a = i;
    }

    public final void a(Object obj) {
        this.b += gxn.a(gxn.a(obj, this.a));
    }

    public final void a(StringBuilder sb, Context context) {
        sb.append(this.b);
    }
}
