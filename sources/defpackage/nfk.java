package defpackage;

import android.content.SharedPreferences;

/* renamed from: nfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfk extends nfp {
    private final Cnew a;

    public nfk(Cnew newR) {
        this.a = newR;
    }

    public final ikz a() {
        Cnew newR = this.a;
        return ikz.a(newR.a, (Integer) newR.b);
    }

    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.a.a, ((Integer) obj).intValue());
    }
}
