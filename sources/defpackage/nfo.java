package defpackage;

import android.content.SharedPreferences;

/* renamed from: nfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfo extends nfp {
    private final ney a;

    public nfo(ney ney) {
        this.a = ney;
    }

    public final ikz a() {
        ney ney = this.a;
        return ikz.a(ney.a, (String) ney.b);
    }

    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.a.a, (String) obj);
    }
}
