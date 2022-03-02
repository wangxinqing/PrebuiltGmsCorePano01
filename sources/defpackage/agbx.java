package defpackage;

import android.graphics.Bitmap;

/* renamed from: agbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agbx implements agcl {
    private final agcd a;
    private final String b;
    private final Object c;
    private final int d;

    public agbx(agcd agcd, String str, Object obj, int i) {
        this.a = agcd;
        this.b = str;
        this.c = obj;
        this.d = i;
    }

    public final void a(Bitmap bitmap) {
        agcd agcd = this.a;
        String str = this.b;
        Object obj = this.c;
        int i = this.d;
        if (agcd.d) {
            return;
        }
        if (bitmap == null) {
            agcd.a((Runnable) new agca(agcd, obj, i));
        } else {
            agcd.a((Runnable) new agbz(agcd, str, bitmap));
        }
    }
}
