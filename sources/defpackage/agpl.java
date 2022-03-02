package defpackage;

import java.util.concurrent.Callable;

/* renamed from: agpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpl implements Callable {
    private final agqm a;

    public agpl(agqm agqm) {
        this.a = agqm;
    }

    public final Object call() {
        return Boolean.valueOf(this.a.h.a(true).a.a());
    }
}
