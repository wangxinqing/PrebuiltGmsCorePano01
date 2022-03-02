package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: wnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class wnk implements wnv {
    final /* synthetic */ wnw a;

    public wnk(wnw wnw) {
        this.a = wnw;
    }

    public abstract void a(Bundle bundle, wtx wtx, String str);

    public final boolean a(Context context, xpk xpk, Bundle bundle) {
        wtx c = wtz.a(context).c();
        if (c == null) {
            return false;
        }
        wtw a2 = wtw.a(context);
        wnw wnw = this.a;
        String b = a2.b(wnw.l, wnw.c);
        c.a();
        int i = 0;
        while (i < this.a.d.size()) {
            try {
                String str = (String) this.a.d.get(i);
                c.a("INSERT INTO temp_gaia_ordinal(ordinal, gaia_id, qualified_id) VALUES (?, ?, ?)", (Object[]) new String[]{String.valueOf(i), ycm.e(str), str});
                i++;
            } finally {
                c.c();
            }
        }
        a(bundle, c, b);
        return true;
    }
}
