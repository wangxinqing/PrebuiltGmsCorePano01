package defpackage;

/* renamed from: aklv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklv {
    public static final String a = a("otg-l", "signal_source_");
    public static final String b = a("otg-l", "gps_speed");
    public static final String c = a("otg-l", "gps_speed_zero");
    public static final String d = a("otg-l", "previous_absent");
    public static final String e = a("otg-l", "position_delta");
    public static final String f = a("otg-l", "time_delta");
    public static final String g = a("otg-l", "speed");
    public static final String h = a("otg-w", "num_ssid");
    public static final String i = a("otg-w", "strength");
    public static final String j = a("otg-w", "mean_strength");
    public static final String k = a("otg-w", "is_connected");
    public static final String l = a("otg-w", "strength_std");
    public static final String m = a("otg-a", "type_");
    public static final String n = a("otg-a", "weighted_speed");
    public static final String o = a("otg-a", "weighted_speed_zero");
    public static final String p = a("otg-a", "absent");
    public static final String q = a("otg-a", "walking_with_high_probability");

    static {
        a("otg-l", "absent");
        a("otg-w", "absent");
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
