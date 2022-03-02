package defpackage;

/* renamed from: avwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwy {
    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static void b(String str) {
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
            }
        }
    }
}
