package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ylx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ylx implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ yly b;

    public ylx(yly yly, Status status) {
        this.b = yly;
        this.a = status;
    }

    public final void run() {
        if (this.a.c()) {
            this.b.a.c();
        }
    }
}
