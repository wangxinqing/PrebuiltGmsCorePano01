package defpackage;

import android.content.SharedPreferences;

/* renamed from: nfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfi extends nfp {
    private final nev a;

    public nfi(nev nev) {
        this.a = nev;
    }

    public final ikz a() {
        nev nev = this.a;
        return ikz.a(nev.a, ((Boolean) nev.b).booleanValue());
    }

    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.a.a, ((Boolean) obj).booleanValue());
    }
}
