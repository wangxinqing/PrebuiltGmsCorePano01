package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: hvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvy implements alga {
    private final Context a;
    private final htg b;
    private String c;

    public hvy(Context context, htg htg) {
        this.a = context;
        this.b = htg;
    }

    public final String a() {
        return "NID";
    }

    public final String b() {
        String str = zok.b(this.a).a;
        this.c = str;
        return str;
    }

    public final void a(String str) {
        if (awtr.f()) {
            znz c2 = zoa.c();
            c2.b = this.c;
            c2.a = str;
            if (!zol.a(c2.a(), this.a)) {
                Log.e("ApacheHttpTransport", "Error in PseudonymousId compareAndSet() operation");
                this.b.a();
                return;
            }
            return;
        }
        zol.a(new PseudonymousIdToken(str), this.a);
    }
}
