package defpackage;

/* renamed from: awnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awnf implements awnd {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.auth_account")).a();
        agvx.a(a2, "auth_work_account_managers_apiv2_enabled", false);
        agvx.a(a2, "auth_work_account_managers_whitelist_enabled", true);
        try {
            a = agvx.a(a2, "auth_work_account_managers_whitelist_param", (gqv) aucj.a((aucj) gqv.b, new byte[]{10, 88, 10, 41, 99, 111, 109, 46, 109, 105, 99, 114, 111, 115, 111, 102, 116, 46, 119, 105, 110, 100, 111, 119, 115, 105, 110, 116, 117, 110, 101, 46, 99, 111, 109, 112, 97, 110, 121, 112, 111, 114, 116, 97, 108, 18, 43, 53, 66, 85, 101, 79, 67, 116, 82, 66, 52, 121, 113, 76, 106, 52, 77, 99, 90, 113, 86, 51, 120, 100, 121, 53, 77, 114, 120, 108, 74, 89, 109, 83, 68, 79, 114, 90, 104, 50, 71, 69, 109, 85, 10, 84, 10, 37, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 119, 111, 114, 107, 46, 99, 108, 111, 117, 100, 100, 112, 99, 18, 43, 73, 53, 89, 118, 83, 48, 79, 53, 104, 88, 89, 52, 54, 109, 98, 48, 49, 66, 108, 82, 106, 113, 52, 111, 74, 74, 71, 115, 50, 107, 117, 85, 99, 72, 118, 86, 107, 65, 80, 69, 88, 108, 103, 10, 84, 10, 37, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 119, 111, 114, 107, 46, 99, 108, 111, 117, 100, 100, 112, 99, 18, 43, 53, 52, 45, 70, 104, 69, 54, 56, 118, 69, 102, 116, 101, 76, 81, 104, 80, 99, 57, 101, 90, 103, 77, 84, 101, 52, 55, 70, 70, 103, 75, 85, 50, 106, 78, 106, 76, 68, 72, 45, 48, 85, 99}), awne.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"auth_work_account_managers_whitelist_param\"");
        }
    }

    public final gqv a() {
        return (gqv) a.c();
    }
}
