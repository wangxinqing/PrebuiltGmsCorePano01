package defpackage;

import android.os.Bundle;

/* renamed from: wnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnp extends wnu {
    final /* synthetic */ wnw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnp(wnw wnw) {
        super(wnw);
        this.a = wnw;
    }

    /* access modifiers changed from: protected */
    public final wsr a() {
        if (this.a.e.c == null) {
            return wsr.b("list_by_focus_id");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, Bundle bundle) {
        if (!wxh.d(str)) {
            return false;
        }
        bundle.putString("on_behalf_of", this.a.c);
        bundle.putString("qualified_id", str);
        bundle.putString("contact", wxh.f(str));
        return true;
    }
}
