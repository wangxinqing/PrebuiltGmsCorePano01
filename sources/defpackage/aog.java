package defpackage;

import androidx.slice.Slice;

/* renamed from: aog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aog implements Runnable {
    final /* synthetic */ Slice a;
    final /* synthetic */ aoh b;

    public aog(aoh aoh, Slice slice) {
        this.b = aoh;
        this.a = slice;
    }

    public final void run() {
        this.b.a.c.a(this.a);
    }
}
