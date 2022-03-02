package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: pbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pbv implements afgs {
    private final Context a;

    public pbv(Context context) {
        this.a = context;
    }

    public final Object a() {
        try {
            return (Integer) acws.a(hob.a(this.a).a());
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("Failed to get BootCount", e);
        }
    }
}
