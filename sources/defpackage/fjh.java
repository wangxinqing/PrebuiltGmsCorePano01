package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: fjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fjh {
    public final fjw a;

    private fjh(Context context) {
        this.a = fjw.a(context);
    }

    public static fjh a(Context context) {
        int i = jhg.a;
        return new fjh(context);
    }

    public final aorr b(pyv pyv) {
        return b(pyv, "credentials_need_first_time_welcome");
    }

    public final aorr a(pyv pyv) {
        return b(pyv, "credentials_enable_service");
    }

    public final aorr b(pyv pyv, String str) {
        return aopr.a(this.a.a(pyv, (Set) anax.a((Object) str)), (amqy) new fjf(), (Executor) aoqm.a);
    }

    public final aorr a(pyv pyv, String str) {
        return aopr.a(this.a.a(pyv, str), fja.a, (Executor) aoqm.a);
    }
}
