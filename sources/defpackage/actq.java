package defpackage;

import android.content.Context;
import java.io.InputStream;

/* renamed from: actq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actq extends actp {
    public actq() {
        super("SurfaceFlinger", "SurfaceFlinger", "SURFACE_FLINGER", false);
    }

    public final String[] a(long j, long j2) {
        return new String[]{"--timestats", "-enable", "-dump", "-maxlayers", Integer.toString((int) aznn.a.a().l()), "-clear", "--proto"};
    }

    /* access modifiers changed from: protected */
    public final avwc b(Context context, InputStream inputStream, long j, long j2, hph hph) {
        return a(context, inputStream, j, j2, hph, true);
    }

    public final long c() {
        return aznn.a.a().m();
    }

    public final boolean b() {
        return jkr.g() && azms.a.a().l();
    }
}
