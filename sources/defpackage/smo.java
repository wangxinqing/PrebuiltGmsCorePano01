package defpackage;

/* renamed from: smo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smo {
    public static final cri a;
    public static final cri b = m.a("sitrepGcmRegistrationId", (String) null);
    public static final cri c = m.a("sitrepIsDeviceAdmin", (Boolean) null);
    public static final cri d = m.a("sitrepLockscreenEnabled", (Boolean) null);
    public static final cri e = m.a("locationEnabled", Boolean.valueOf(azfk.a.a().e()));
    public static final cri f = m.a("lockMessage", "");
    public static final cri g = m.a("lockPhoneNumber", "");
    public static final cri h = m.a("lastSitrepReason", (Integer) 0);
    public static final cri i = new cre(m, "sitrepRetryEpochTimeMs", 0L);
    public static final cri j = m.a("sitrepFailureCount", (Integer) 0);
    public static final cri k = m.a("oneTimeInitializedCount", (Integer) 0);
    public static final cri l = m.a("echoServerToken", "");
    private static final crj m;

    static {
        crj crj = new crj("mdm");
        m = crj;
        a = crj.a("sitrepGmsCoreVersion", (Integer) 0);
    }
}
