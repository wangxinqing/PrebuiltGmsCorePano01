package defpackage;

import android.util.Log;

/* renamed from: acxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxm {
    String a;
    int b;
    String c;

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        if (str != null) {
            boolean c2 = azqq.c();
            String[] split = str.split("\\|");
            if (split.length == 5) {
                try {
                    Integer.parseInt(split[0]);
                    this.a = split[1];
                    this.b = Integer.parseInt(split[2]);
                    this.c = !split[3].equals("null") ? split[3] : "";
                    Integer.parseInt(split[4]);
                    return true;
                } catch (NumberFormatException e) {
                    if (c2) {
                        Log.w("NotificationKey", "could not parse notification key.", e);
                    }
                    return false;
                }
            } else if (c2) {
                Log.w("NotificationKey", str.length() == 0 ? new String("wrong number of parts in notification key: ") : "wrong number of parts in notification key: ".concat(str));
            }
        }
        return false;
    }
}
