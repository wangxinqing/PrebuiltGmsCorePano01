package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* renamed from: ljx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljx implements alow {
    private final ljw a;

    public ljx(ljw ljw) {
        this.a = ljw;
    }

    private final void a(Status status) {
        ljy.a.b("RealtimeLoader", "%s", status);
        this.a.a(status);
    }

    public final void b(String str) {
        a(new Status(1502, str, (PendingIntent) null));
    }

    public final void c(String str) {
        a(new Status(1503, str, (PendingIntent) null));
    }

    public final void d(String str) {
        a(new Status(7, str, (PendingIntent) null));
    }

    public final void e(String str) {
        a(new Status(3004, str, (PendingIntent) null));
    }

    public final void a(String str) {
        a(new Status(1504, str, (PendingIntent) null));
    }
}
