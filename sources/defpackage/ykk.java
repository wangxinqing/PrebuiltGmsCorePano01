package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: ykk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykk {
    public static final Object a = new Object();
    public static ykk b = null;
    private final ExecutorService c;
    private final ykl d;

    public ykk(ExecutorService executorService, ykl ykl) {
        this.c = executorService;
        this.d = ykl;
        for (int i = 0; i < 50; i++) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("reset_platform_package");
            sb.append(i);
            String sb2 = sb.toString();
            String a2 = ykg.a("rescue_party_namespace", sb2);
            if (a2 != null) {
                a(sb2, a2);
            }
        }
        ykg.a("rescue_party_namespace", this.c, new ykj(this));
    }

    private final void a(int i, String str) {
        String a2 = this.d.a(i, str, "hash");
        if (a2 != null) {
            this.d.a(i, str, "banned_integrity_hash", a2);
        }
    }

    public final void a(String str, String str2) {
        if (str2.equals("no_package")) {
            str2 = null;
        }
        a(1, str2);
        a(2, str2);
        this.d.a(2, str2, "hash", (String) null);
        this.d.a(1, str2, "hash", (String) null);
        this.d.a(2, str2, "snapshotToken1", (String) null);
        this.d.a(1, str2, "snapshotToken1", (String) null);
        ykg.a("rescue_party_namespace", str, (String) null, true);
    }
}
