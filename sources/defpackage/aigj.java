package defpackage;

import android.location.Location;
import java.util.concurrent.Callable;

/* renamed from: aigj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigj implements Callable {
    final /* synthetic */ boolean a;
    final /* synthetic */ aigl b;

    public aigj(aigl aigl, boolean z) {
        this.b = aigl;
        this.a = z;
    }

    /* renamed from: a */
    public final Location call() {
        return this.b.e.a(this.a);
    }
}
