package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: iwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwt implements iwu {
    private iwt() {
    }

    public static iwu a() {
        return new iwt();
    }

    public static final hol b(Context context, String str) {
        iva.c(str);
        return new hol(context, str, (String) null);
    }

    public final boolean b() {
        return true;
    }

    public final List a(Context context) {
        return a(context, "GMS_CORE");
    }

    public final List a(Context context, String str) {
        iva.c(str);
        return amzy.a((Object) b(context, str));
    }

    public final hol b(Context context) {
        return b(context, "GMS_CORE");
    }
}
