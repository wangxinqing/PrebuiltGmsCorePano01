package defpackage;

/* renamed from: azgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azgm implements azgl {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.signin"));
        a = agvx.a(agvw, "CommonAccountAccountPickerRefactoring__phone_enabled", false);
        b = agvx.a(agvw, "CommonAccountAccountPickerRefactoring__simple_picker_enabled", false);
        agvx.a(agvw, "CommonAccountAccountPickerRefactoring__wearable_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
