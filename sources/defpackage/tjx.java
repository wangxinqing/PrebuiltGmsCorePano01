package defpackage;

import android.os.IBinder;

/* renamed from: tjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tjx implements IBinder.DeathRecipient {
    private final tka a;

    public tjx(tka tka) {
        this.a = tka;
    }

    public final void binderDied() {
        this.a.a(true);
    }
}
