package defpackage;

/* renamed from: azlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azlk implements azlj {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "QrCode__target_generate_encryption_key", false);
        b = agvx.a(agvw, "QrCode__use_qr_instruction_flow", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
