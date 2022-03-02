package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: qyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qyd {
    private final Random a = new Random();

    public final aorr a(Context context, Class cls, String str, StackTraceElement[] stackTraceElementArr) {
        if (this.a.nextDouble() >= axbn.a.a().K()) {
            return aorl.a((Object) null);
        }
        qyc qyc = new qyc(String.format("Task timed out: %s:%s", new Object[]{cls.getName(), str}));
        qyc.setStackTrace(stackTraceElementArr);
        ing.a((ine) new qya(qyc));
        ina c = inb.c();
        c.b = context;
        c.a = aogr.TIMED_OUT_BACKGROUND_TASK_HANDLER;
        return new ing().a(c.a()).b;
    }
}
