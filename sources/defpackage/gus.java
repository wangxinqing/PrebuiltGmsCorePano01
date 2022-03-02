package defpackage;

import android.os.IBinder;

/* renamed from: gus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gus implements IBinder.DeathRecipient {
    final /* synthetic */ gut a;

    public gus(gut gut) {
        this.a = gut;
    }

    public final void binderDied() {
        this.a.a();
    }
}
