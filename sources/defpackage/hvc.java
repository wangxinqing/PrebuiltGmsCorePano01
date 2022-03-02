package defpackage;

/* renamed from: hvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum hvc implements hvd {
    OVERFLOW("Overflow", hry.DROPS_BY_OVERFLOW),
    OVERSIZE("Oversize", hry.DROPS_BY_OVERSIZE),
    SINGLE_LOG_TOO_BIG("SingleLogTooBig", hry.DROPS_BY_EVENT_SIZE),
    EXCEED_LOG_SOURCE_LOG_CAP("ExceedLogSourceLogCap", hry.DROPS_BY_LOG_CAP),
    EXCEED_LOG_SOURCE_LOG_CAP_DRY_RUN("ExceedLogSourceLogCapDryRun", hry.DROPS_BY_LOG_CAP_DRY_RUN);
    
    private final String f;
    private final hry g;

    private hvc(String str, hry hry) {
        this.f = str;
        this.g = hry;
    }

    public final hry a() {
        return this.g;
    }

    public final String toString() {
        return this.f;
    }
}
