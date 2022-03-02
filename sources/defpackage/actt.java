package defpackage;

import android.content.Context;
import java.io.InputStream;

/* renamed from: actt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actt extends actp {
    public actt() {
        super("Wifistats", "wifi", "WIFI_PLATFORM_STATS_GMSCORE", false);
    }

    public final String[] a(long j, long j2) {
        return new String[]{"wifiMetricsProto", "clean"};
    }

    /* access modifiers changed from: protected */
    public final avwc b(Context context, InputStream inputStream, long j, long j2, hph hph) {
        return a(context, inputStream, j, j2, hph, true);
    }

    public final long c() {
        return aznn.a.a().p();
    }

    public final boolean b() {
        return jkr.d() && azms.a.a().o();
    }
}
