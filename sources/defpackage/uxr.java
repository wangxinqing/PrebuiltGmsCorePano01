package defpackage;

import android.text.TextUtils;

/* renamed from: uxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uxr extends arwm {
    final /* synthetic */ asgh a;
    final /* synthetic */ uxl b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uxr(String str, uxl uxl, asgh asgh) {
        super(str);
        this.b = uxl;
        this.a = asgh;
    }

    public final void run() {
        uxl uxl = this.b;
        asgh asgh = this.a;
        uxu uxu = uxl.a;
        uxu.e.b();
        asfz asfz = asgh.b;
        if (asfz == null) {
            asfz = asfz.d;
        }
        if (TextUtils.equals(asfz.b, uxu.h)) {
            uxu.h = null;
        }
    }
}
