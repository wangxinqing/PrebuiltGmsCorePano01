package defpackage;

import android.util.Pair;

/* renamed from: hlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlf implements hlu {
    public static final hlf a = new hlf();

    private hlf() {
    }

    public final String a() {
        return "facet_group_index";
    }

    public final Pair[] b() {
        return new Pair[]{Pair.create("facet_id", "TEXT NOT NULL"), Pair.create("id", "TEXT NOT NULL")};
    }

    public final String[] c() {
        return new String[]{"PRIMARY KEY (facet_id)"};
    }

    public final String[][] d() {
        return new String[][]{new String[]{"facet_id"}};
    }
}
