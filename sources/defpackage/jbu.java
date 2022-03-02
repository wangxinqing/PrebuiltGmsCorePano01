package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.io.FilenameFilter;
import java.util.List;

/* renamed from: jbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbu extends jdd {
    private static final FilenameFilter a = new jbt();

    public final String a() {
        return "alarms";
    }

    public final boolean b() {
        ComponentName componentName = jcl.a;
        return ((Integer) jcb.a.c()).intValue() != 0;
    }

    public final long c() {
        return ((Long) jcg.b.c()).longValue() / 1000;
    }

    public final int d() {
        return 6;
    }

    public final List a(Context context) {
        return jdd.a(context, a, "stats.alarms");
    }

    public final boolean a(aucd aucd) {
        return ((aohl) aucd.b).h.size() > 0;
    }
}
