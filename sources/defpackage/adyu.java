package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: adyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adyu implements Runnable {
    final /* synthetic */ DataHolder a;

    public adyu(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public final void run() {
        new ilp(this.a).c();
    }
}
