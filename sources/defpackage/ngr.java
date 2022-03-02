package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ngr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ngr implements Runnable {
    private final ngq a;

    public ngr(ngq ngq) {
        amrl.a((Object) ngq, (Object) "download");
        this.a = ngq;
    }

    public final void run() {
        this.a.a(Status.d);
    }
}
