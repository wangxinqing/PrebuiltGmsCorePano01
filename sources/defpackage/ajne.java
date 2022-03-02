package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: ajne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajne {
    private static ajne b;
    private final ajmp a;
    private final List c;

    public ajne(List list, ajmp ajmp) {
        this.a = ajmp;
        this.c = Collections.unmodifiableList(list);
    }

    public static synchronized ajne a(Context context) {
        synchronized (ajne.class) {
            if (b == null) {
                ajnw.a(context);
                List a2 = ajnw.a(azth.a.a().a());
                hya.a(context);
                ajne ajne = new ajne(a2, ajmp.a(context));
                b = ajne;
                return ajne;
            }
            ajne ajne2 = b;
            return ajne2;
        }
    }

    public final synchronized int a(Context context, String str, UlrPrivateModeRequest ulrPrivateModeRequest) {
        if (!azth.b()) {
            ajix.c("GCoreUlr", "Ulr private Mode feature is not enabled");
            return 3515;
        } else if (this.c.contains(str)) {
            boolean z = ulrPrivateModeRequest.b;
            boolean b2 = this.a.b();
            if (b2 == z) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Private mode is already ");
                sb.append(z);
                sb.append(". Ignored!");
                sb.toString();
            } else {
                if (!b2) {
                    ajix.a("GCoreUlr", "Enter Private mode!");
                } else {
                    ajix.a("GCoreUlr", "Exit Private mode!");
                }
                SharedPreferences.Editor edit = this.a.a.edit();
                edit.putBoolean("privateModeKey", z);
                edit.apply();
                ajme.b(context, "PrivateUpdate");
            }
            return 0;
        } else {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf).length());
            sb2.append(str);
            sb2.append(" is not in:");
            sb2.append(valueOf);
            ajix.c("GCoreUlr", sb2.toString());
            return 3500;
        }
    }
}
