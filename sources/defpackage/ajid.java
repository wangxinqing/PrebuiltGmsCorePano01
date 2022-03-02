package defpackage;

import android.content.Context;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: ajid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajid {
    private final gte a;

    public ajid(gte gte) {
        this.a = gte;
    }

    public static ajid a(Context context) {
        return new ajid(gtd.a(context));
    }

    public final void a(gth gth) {
        if (gth != null) {
            this.a.a(gth);
        }
    }

    public final void a(gth gth, BleSettings bleSettings) {
        this.a.a(gth, bleSettings);
    }
}
