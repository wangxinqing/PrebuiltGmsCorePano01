package defpackage;

import java.util.Random;

/* renamed from: amrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amrv extends Random {
    private static final long serialVersionUID = 898001275432099254L;
    private final boolean a = true;

    public final void setSeed(long j) {
        if (!this.a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
    }
}
