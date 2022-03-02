package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.stats.AlarmEvent;
import java.util.List;

/* renamed from: jbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbv {
    public static jbv a;
    private static Integer b;

    public static final void a(Context context, int i, String str, long j, long j2, long j3, List list, int i2) {
        int i3;
        if (b == null) {
            jdb jdb = jdc.a;
            if (jdb != null) {
                i3 = jdb.a(3);
            } else {
                ComponentName componentName = jcl.a;
                i3 = 0;
            }
            b = Integer.valueOf(i3);
        }
        int intValue = b.intValue();
        ComponentName componentName2 = jcl.a;
        if (intValue != 0) {
            jda.a().a(new AlarmEvent(1, System.currentTimeMillis(), i, str, j, j2, j3, jdl.a(list), i2, jiy.a(context), jdl.a(context.getPackageName()), jiy.e(context)));
        }
    }
}
