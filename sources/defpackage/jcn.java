package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: jcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcn extends jdd {
    public final String a() {
        return "networkusage";
    }

    public final boolean b() {
        ComponentName componentName = jcl.a;
        return ((Integer) jcd.a.c()).intValue() != 0;
    }

    public final long c() {
        return ((Long) jcg.c.c()).longValue();
    }

    public final int d() {
        return 5;
    }

    public final List a(Context context) {
        return Collections.emptyList();
    }

    public final boolean a(aucd aucd) {
        return ((aohl) aucd.b).g.size() > 0;
    }
}
