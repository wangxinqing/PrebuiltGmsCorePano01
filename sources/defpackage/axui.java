package defpackage;

/* renamed from: axui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axui implements axuh {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        a = agvx.a(a2, "Api__aiaEnabledReadWriteApiKillSwitch", false);
        agvx.a(a2, "Api__instantAppInstallUninstallChromeOsKillSwitch", false);
        agvx.a(a2, "Api__instantAppRemovedApiKillSwitch", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
