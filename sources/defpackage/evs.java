package defpackage;

import android.content.Context;

/* renamed from: evs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evs implements fcu {
    private final Context a;
    private final String b;

    public evs(Context context, String str, hol hol, String str2) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        this.b = str;
        iva.a((Object) hol);
        iva.c(str2);
    }

    public final aorr a(fde fde) {
        jgu.c(this.a, this.b);
        return aorl.a((Object) null);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_SIGN_OUT;
    }
}
