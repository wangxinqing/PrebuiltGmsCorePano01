package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: vas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vas implements IBinder.DeathRecipient {
    public final IInterface a;
    final /* synthetic */ vat b;
    private final Object c;

    public vas(vat vat, Object obj, IInterface iInterface) {
        this.b = vat;
        this.c = obj;
        this.a = iInterface;
    }

    public final void binderDied() {
        this.b.b(this.c);
    }
}
