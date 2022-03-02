package defpackage;

import android.util.Pair;

/* renamed from: hlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlk extends hlj {
    public static final hlk a = new hlk();

    private hlk() {
    }

    public final String a() {
        return "password_index";
    }

    public final Pair[] b() {
        return new Pair[]{Pair.create("account", "TEXT NOT NULL"), Pair.create("idx_origin", "TEXT NOT NULL"), Pair.create("idx_signon_realm", "TEXT NOT NULL"), Pair.create("idx_username", "TEXT NOT NULL"), Pair.create("id", "TEXT NOT NULL")};
    }

    public final String[] c() {
        return new String[]{"PRIMARY KEY (account, id)"};
    }

    public final String[][] d() {
        return new String[][]{new String[]{"idx_origin", "account"}, new String[]{"idx_signon_realm", "account"}, new String[]{"idx_username", "account"}};
    }

    public final long e() {
        return 1;
    }
}
