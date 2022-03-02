package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: xsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xsu extends jfx {
    final /* synthetic */ Context a;
    final /* synthetic */ String e;
    final /* synthetic */ acwd f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xsu(Context context, String str, acwd acwd) {
        super(9);
        this.a = context;
        this.e = str;
        this.f = acwd;
    }

    public final void run() {
        try {
            this.f.a((Object) eim.f(this.a, this.e));
        } catch (eif | IOException e2) {
            this.f.a((Object) null);
        }
    }
}
