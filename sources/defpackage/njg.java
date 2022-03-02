package defpackage;

import com.google.android.gms.framework.tracing.AbstractGmsTracer;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: njg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class njg implements amky {
    private final Closeable a;

    public njg(Closeable closeable) {
        this.a = closeable;
    }

    public final void close() {
        Closeable closeable = this.a;
        int i = AbstractGmsTracer.f;
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }
}
