package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abec {
    public static final iwd a = abeb.b("AccountSessionStore");
    public static final abec b = new abec();
    public final Map c = Collections.synchronizedMap(new HashMap());

    private abec() {
    }

    public final void a(String str, int i) {
        a.a("clearAccount(package_name=%s, session_id=%d)", str, Integer.valueOf(i));
        this.c.remove(str);
    }
}
