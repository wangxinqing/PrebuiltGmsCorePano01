package defpackage;

/* renamed from: axch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axch implements axcg {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        a = agvx.a(agvw, "SchedulerTracing__avoid_begin_span_without_trace", false);
        agvx.a(agvw, "SchedulerTracing__enable_scheduler_tracing", true);
        b = agvx.a(agvw, "SchedulerTracing__explicitly_set_component_name_when_initalizing_tracer", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
