package defpackage;

import android.util.Pair;

/* renamed from: hlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hlt implements hlu {
    static final hlt a = new hlt();

    private hlt() {
    }

    public final String a() {
        return "sync_entities";
    }

    public final Pair[] b() {
        return new Pair[]{Pair.create("account", "TEXT NOT NULL"), Pair.create("type", "INT NOT NULL"), Pair.create("id", "TEXT NOT NULL"), Pair.create("value", "BLOB DEFAULT NULL"), Pair.create("is_dirty", "BOOLEAN DEFAULT FALSE"), Pair.create("version", "BLOB DEFAULT NULL"), Pair.create("is_deleted_locally", "BOOLEAN DEFAULT FALSE")};
    }

    public final String[] c() {
        return new String[]{"PRIMARY KEY (account, type, id)"};
    }

    public final String[][] d() {
        return new String[][]{new String[]{"type", "is_deleted_locally", "account"}};
    }
}
