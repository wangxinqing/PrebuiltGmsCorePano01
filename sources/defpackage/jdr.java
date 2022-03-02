package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.io.FilenameFilter;
import java.util.List;

/* renamed from: jdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdr extends jdd {
    private static final FilenameFilter a = new jdq();

    public final String a() {
        return "wakelocks";
    }

    public final boolean b() {
        ComponentName componentName = jcl.a;
        return ((Integer) jcf.a.c()).intValue() != 0;
    }

    public final long c() {
        return ((Long) jcg.b.c()).longValue() / 1000;
    }

    public final int d() {
        return 4;
    }

    public final List a(Context context) {
        return jdd.a(context, a, "stats.wakelocks");
    }

    public final boolean a(aucd aucd) {
        return ((aohl) aucd.b).f.size() > 0;
    }
}
