package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ngc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ngc implements Runnable {
    private final ngb a;

    public ngc(ngb ngb) {
        amrl.a((Object) ngb, (Object) "extractor");
        this.a = ngb;
    }

    public final void run() {
        this.a.a(Status.d);
    }
}
