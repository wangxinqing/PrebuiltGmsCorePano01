package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: apld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apld implements igu {
    public final Exception a(Status status) {
        if (status.i == 8) {
            return new aplc(status.d());
        }
        return new apkz(status.d());
    }
}
