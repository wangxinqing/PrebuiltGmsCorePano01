package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: nfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nfq implements Callable {
    final /* synthetic */ Context a;

    public nfq(Context context) {
        this.a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
