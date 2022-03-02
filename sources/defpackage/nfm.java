package defpackage;

import android.content.SharedPreferences;

/* renamed from: nfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfm extends nfp {
    private final nex a;

    public nfm(nex nex) {
        this.a = nex;
    }

    public final ikz a() {
        nex nex = this.a;
        return ikz.a(nex.a, (Long) nex.b);
    }

    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.a.a, ((Long) obj).longValue());
    }
}
