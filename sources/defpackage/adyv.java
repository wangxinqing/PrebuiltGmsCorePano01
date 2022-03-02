package defpackage;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: adyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adyv implements Runnable {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ adzd b;

    public adyv(adzd adzd, MessageEventParcelable messageEventParcelable) {
        this.b = adzd;
        this.a = messageEventParcelable;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
