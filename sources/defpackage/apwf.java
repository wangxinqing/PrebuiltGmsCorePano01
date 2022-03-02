package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: apwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwf {
    static {
        nez.a("crash:enabled", (Boolean) true);
        new ney("crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
        nez.a("crash:log_buffer_capacity", 100);
        nez.a("crash:log_buffer_max_total_size", 32768);
        nez.a("crash:crash_backlog_capacity", 5);
        nez.a("crash:crash_backlog_max_age", 604800000);
        nez.a("crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
        nez.a("crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
        nez.a("crash:retry_num_attempts", 12);
        nez.a("crash:batch_size", 5);
        nez.a("crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
        nez.a("crash:frame_depth", 60);
        nez.a("crash:receiver_delay", 100);
        nez.a("crash:thread_idle_timeout", 10);
    }

    public static final void a(Context context) {
        nfg.b();
        nfa.a(context);
    }
}
