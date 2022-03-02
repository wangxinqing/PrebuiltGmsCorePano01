package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.io.FilenameFilter;
import java.util.List;

/* renamed from: jby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jby extends jdd {
    private static final FilenameFilter a = new jbx();

    public final String a() {
        return "internal_service_connections";
    }

    public final boolean b() {
        ComponentName componentName = jcl.a;
        return ((Integer) jcc.a.c()).intValue() != 0;
    }

    public final long c() {
        return ((Long) jcg.b.c()).longValue() / 1000;
    }

    public final int d() {
        return 3;
    }

    public final List a(Context context) {
        return jdd.a(context, a, "stats.service_connections");
    }

    public final boolean a(aucd aucd) {
        return ((aohl) aucd.b).e.size() > 0;
    }
}
