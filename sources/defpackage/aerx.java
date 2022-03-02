package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aerx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aerx implements amsv {
    private final String a;
    private final Integer b;
    private final Executor c;

    public aerx(String str, Integer num, Executor executor) {
        this.a = str;
        this.b = num;
        this.c = executor;
    }

    public final Object a() {
        String str = this.a;
        Integer num = this.b;
        Executor executor = this.c;
        bami a2 = bami.a(str, num.intValue());
        a2.transportExecutor(executor);
        return aorl.a((Object) a2.b());
    }
}
