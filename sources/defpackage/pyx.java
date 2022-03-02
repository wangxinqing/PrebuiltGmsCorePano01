package defpackage;

import java.util.ArrayList;

/* renamed from: pyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pyx implements Runnable {
    private final pze a;

    public pyx(pze pze) {
        this.a = pze;
    }

    public final void run() {
        pze pze = this.a;
        pze.f.d.c(new ArrayList(pze.c.values()));
    }
}
