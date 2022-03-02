package defpackage;

import android.content.Context;
import java.util.Collections;

/* renamed from: akxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxf {
    public static final akxe a(Context context, String str, String str2) {
        aduu aduu = new aduu();
        aduu.b = "LEGACY_PLACES_MODULE";
        aduu.c = Collections.singletonList(str);
        if (!jlh.d(str2)) {
            if (jlh.d(str2)) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid account name used : ") : "Invalid account name used : ".concat(valueOf));
            }
            aduu.a = str2;
        }
        if (!jlh.d(aduu.b)) {
            return new akxe(new adut(context, new aduv(aduu.a, aduu.b, aduu.c)));
        }
        throw new IllegalArgumentException("Missing a client identifier");
    }
}
