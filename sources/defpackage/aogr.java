package defpackage;

/* renamed from: aogr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aogr implements auco {
    UNKNOWN(0),
    STARTUP(1),
    UNCAUGHT_EXCEPTION_HANDLER(2),
    PHENOTYPE_UPDATE(3),
    SAFEBOOT_STARTUP(4),
    TIMED_OUT_BACKGROUND_TASK_HANDLER(5),
    PERIODIC_CHECKUP(6),
    SCHEDULED_IDLE(7),
    SCHEDULED_NOT_IDLE_DURING_WINDOW(8);
    
    public final int j;

    private aogr(int i) {
        this.j = i;
    }

    public static aogr a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return STARTUP;
            case 2:
                return UNCAUGHT_EXCEPTION_HANDLER;
            case 3:
                return PHENOTYPE_UPDATE;
            case 4:
                return SAFEBOOT_STARTUP;
            case 5:
                return TIMED_OUT_BACKGROUND_TASK_HANDLER;
            case 6:
                return PERIODIC_CHECKUP;
            case 7:
                return SCHEDULED_IDLE;
            case 8:
                return SCHEDULED_NOT_IDLE_DURING_WINDOW;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aogq.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
