package defpackage;

import android.text.TextUtils;

/* renamed from: jyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyo {
    public static final ikz a = ikz.a("deviceconnection.enable_device_feature_tracking", true);
    public static final ikz b = ikz.a("deviceconnection.millis_feature_remains_available", (Long) 7776000000L);
    public static final ikz c = ikz.a("deviceconnection.millis_between_feature_reaping", (Long) 86400000L);
    public static final ikz d = ikz.a("deviceconnection.dpad_required_keys", a(19, 20, 21, 22, 23));
    public static final ikz e = ikz.a("deviceconnection.gamepad_required_keys", a(96, 97, 99, 100, 102, 103, 106, 107, 4, 3));

    private static String a(int... iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    public static int[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = Integer.parseInt(split[i]);
        }
        return iArr;
    }
}
