package defpackage;

import java.util.Set;

/* renamed from: adhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhs {
    public static Set a() {
        Set b = jir.b();
        String a = azrk.a.a().a();
        if (!jlh.d(a)) {
            for (String parseInt : amsk.a(',').a((CharSequence) a)) {
                try {
                    b.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException e) {
                }
            }
        }
        return b;
    }
}
