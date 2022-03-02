package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* renamed from: svz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svz implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ suf d;

    public svz(suf suf, AppMetadata appMetadata, String str, String str2) {
        this.d = suf;
        this.a = appMetadata;
        this.b = str;
        this.c = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.d.a.y();
        return this.d.a.h().b(this.a.a, this.b, this.c);
    }
}
