package defpackage;

import android.util.Pair;

/* renamed from: hlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlc implements hlu {
    public static final hlc a = new hlc();

    private hlc() {
    }

    public final String a() {
        return "affiliation_data";
    }

    public final Pair[] b() {
        return new Pair[]{Pair.create("id", "TEXT NOT NULL"), Pair.create("value", "BLOB DEFAULT NULL")};
    }

    public final String[] c() {
        return new String[]{"PRIMARY KEY (id)"};
    }

    public final String[][] d() {
        return new String[][]{new String[]{"id"}};
    }
}
