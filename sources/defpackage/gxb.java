package defpackage;

import android.content.Context;

/* renamed from: gxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gxb implements gxl {
    final /* synthetic */ int a;
    private long b = Long.MAX_VALUE;

    public gxb(int i) {
        this.a = i;
    }

    public final void a(Object obj) {
        this.b = Math.min(this.b, gxn.a(gxn.a(obj, this.a)));
    }

    public final void a(StringBuilder sb, Context context) {
        sb.append(this.b);
    }
}
