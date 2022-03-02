package defpackage;

import android.nfc.Tag;

/* renamed from: uln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uln implements Runnable {
    private final uls a;
    private final Tag b;

    public uln(uls uls, Tag tag) {
        this.a = uls;
        this.b = tag;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
