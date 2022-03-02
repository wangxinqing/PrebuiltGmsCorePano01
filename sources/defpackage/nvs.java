package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: nvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvs {
    public final nvr a;
    public final apwx b;

    public nvs(amnc amnc) {
        this.a = nvr.a(amnc);
        this.b = new apwx(a(amnc));
    }

    public static Bundle a(amnc amnc) {
        Bundle bundle = new Bundle();
        bundle.putString("from", amnc.c);
        if (!amnc.o.j()) {
            bundle.putByteArray("rawData", amnc.o.k());
        }
        String str = amnc.f;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("collapse_key", str);
        }
        long j = amnc.m;
        if (j != 0) {
            bundle.putLong("google.sent_time", j);
        }
        String str2 = amnc.h;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("google.message_id", str2);
        }
        int i = amnc.l;
        if (i != 0) {
            bundle.putInt("google.ttl", i);
        }
        if (amnc.q >= 10) {
            bundle.putString("google.original_priority", "high");
        } else {
            bundle.putString("google.original_priority", "normal");
        }
        int i2 = amnc.q;
        if (i2 >= 10 && i2 != 17) {
            bundle.putString("google.delivered_priority", "high");
        } else {
            bundle.putString("google.delivered_priority", "normal");
        }
        aucx aucx = amnc.g;
        int size = aucx.size();
        for (int i3 = 0; i3 < size; i3++) {
            ammv ammv = (ammv) aucx.get(i3);
            String str3 = ammv.b;
            String str4 = ammv.c;
            if (!"from".equals(str3) && (!str3.toLowerCase(Locale.US).startsWith("google.") || str3.toLowerCase(Locale.US).startsWith("google.c."))) {
                bundle.putString(str3, str4);
            }
        }
        return bundle;
    }
}
