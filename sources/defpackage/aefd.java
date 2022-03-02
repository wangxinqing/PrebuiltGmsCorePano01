package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aefd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aefd extends aeif {
    final /* synthetic */ AtomicBoolean a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aefd(Context context, aeia aeia, Handler handler, String[] strArr, AtomicBoolean atomicBoolean) {
        super(context, aeia, handler, strArr);
        this.a = atomicBoolean;
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        this.a.set(true);
        close();
    }
}
