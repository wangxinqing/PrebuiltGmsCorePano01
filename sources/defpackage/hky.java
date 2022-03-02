package defpackage;

import android.util.Pair;

/* renamed from: hky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hky implements hlu {
    static final hky a = new hky();

    private hky() {
    }

    public final String a() {
        return "account_data";
    }

    public final Pair[] b() {
        return new Pair[]{Pair.create("account", "TEXT NOT NULL"), Pair.create("key", "TEXT NOT NULL"), Pair.create("value", "BLOB")};
    }

    public final String[] c() {
        return new String[]{"PRIMARY KEY (account, key)"};
    }

    public final String[][] d() {
        return new String[][]{new String[]{"key"}};
    }
}
