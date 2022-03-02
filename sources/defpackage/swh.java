package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* renamed from: swh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swh implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ suf b;

    public swh(suf suf, AppMetadata appMetadata) {
        this.b = suf;
        this.a = appMetadata;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.b.a.y();
        return this.b.a.h().a(this.a.a);
    }
}
