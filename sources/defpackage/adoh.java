package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: adoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adoh extends adog {
    public static final iwd f = adnt.g("NormalNetworkRequester");
    private final long g;

    private adoh(Context context, long j) {
        super(context);
        this.g = j;
    }

    public static adoh a(Context context, long j) {
        return new adoh(context, j);
    }

    public final void c() {
        try {
            b(this.g);
        } catch (IOException e) {
            f.e("Failed to acquire the non-metered network.", e, new Object[0]);
            a(this.g);
        }
    }
}
