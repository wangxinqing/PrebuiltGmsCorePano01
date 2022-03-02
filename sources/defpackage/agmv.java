package defpackage;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

/* renamed from: agmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agmv {
    public static final amsv a = amta.a((amsv) new agmu());

    static final amri a() {
        int i = Build.VERSION.SDK_INT;
        return amri.b(Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK)));
    }

    public static amri a(String str) {
        try {
            return amri.b(Long.decode((String) anbs.a(amsk.a(' ').a((CharSequence) str), 21)));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return ampu.a;
        }
    }
}
