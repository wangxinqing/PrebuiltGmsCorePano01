package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;

/* renamed from: swi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swi implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ suf b;

    public swi(suf suf, AppMetadata appMetadata) {
        this.b = suf;
        this.a = appMetadata;
    }

    public final void run() {
        this.b.a.y();
        this.b.a.a(this.a);
    }
}
