package defpackage;

import android.os.Bundle;

/* renamed from: wnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnq extends wnu {
    final /* synthetic */ wnw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnq(wnw wnw) {
        super(wnw);
        this.a = wnw;
    }

    /* access modifiers changed from: protected */
    public final wsr a() {
        if (this.a.e.c == null) {
            return wsr.a((String) null);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, Bundle bundle) {
        if (!ycm.j(str)) {
            return false;
        }
        bundle.putString("on_behalf_of", this.a.c);
        bundle.putString("qualified_id", str);
        bundle.putString("gaia_id", ycm.e(str));
        return true;
    }
}
