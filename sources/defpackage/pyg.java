package defpackage;

import android.content.Context;

/* renamed from: pyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pyg {
    public final Context a;
    public final String b;

    public pyg(Context context, String str) {
        iva.a((Object) context, (Object) "Context must not be null.");
        iva.a(str, (Object) "Alias must not be empty.");
        iva.b(str.matches("[a-zA-Z0-9_]*"), "Alias must match: [a-zA-Z0-9_]*");
        this.a = context;
        this.b = str;
    }
}
