package defpackage;

/* renamed from: aydq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydq implements aydp {
    public static final agvx nanoappIdList;
    public static final agvx nanoappLoggingEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        nanoappIdList = agvx.a(a, "NanoappLogging__nanoapp_id_list", "0x476f6f676c001004");
        nanoappLoggingEnabled = agvx.a(a, "NanoappLogging__nanoapp_logging_enabled", false);
    }

    public boolean compiled() {
        return true;
    }

    public String nanoappIdList() {
        return (String) nanoappIdList.c();
    }

    public boolean nanoappLoggingEnabled() {
        return ((Boolean) nanoappLoggingEnabled.c()).booleanValue();
    }
}
