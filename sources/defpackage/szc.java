package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* renamed from: szc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class szc implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ sze b;

    public szc(sze sze, AppMetadata appMetadata) {
        this.b = sze;
        this.a = appMetadata;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.b.b(this.a).b();
    }
}
