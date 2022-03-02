package defpackage;

import android.os.Bundle;

/* renamed from: wnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnn extends wnu {
    final /* synthetic */ wnw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnn(wnw wnw) {
        super(wnw);
        this.a = wnw;
    }

    /* access modifiers changed from: protected */
    public final wsr a() {
        String str = this.a.e.c;
        if (str != null) {
            return wsr.a(str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, Bundle bundle) {
        bundle.putString("on_behalf_of", this.a.c);
        bundle.putString("qualified_id", str);
        bundle.putString("gaia_id", ycm.e(str));
        return true;
    }
}
