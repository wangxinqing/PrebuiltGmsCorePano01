package defpackage;

import android.text.TextUtils;

/* renamed from: wdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class wdr {
    private final wbo a;

    public wdr(wbo wbo) {
        this.a = wbo;
    }

    public final void a(asqf asqf) {
        wbo wbo = this.a;
        if (!TextUtils.isEmpty(asqf.a)) {
            wbo.a(asqf.a);
        }
        if (!TextUtils.isEmpty(asqf.b)) {
            wbo.b(asqf.b);
        }
    }
}
