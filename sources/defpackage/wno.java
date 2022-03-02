package defpackage;

import android.os.Bundle;

/* renamed from: wno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wno extends wnu {
    final /* synthetic */ wnw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wno(wnw wnw) {
        super(wnw);
        this.a = wnw;
    }

    /* access modifiers changed from: protected */
    public final wsr a() {
        if (this.a.e.c == null) {
            return wsr.b("list_by_email");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, Bundle bundle) {
        if (!ycm.i(str)) {
            return false;
        }
        bundle.putString("on_behalf_of", this.a.c);
        bundle.putString("qualified_id", str);
        bundle.putString("email", ycm.g(str));
        return true;
    }
}
