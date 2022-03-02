package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.io.UnsupportedEncodingException;

/* renamed from: acbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbr {
    public static acbs a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes[0] != 1) {
                return new acbu(str);
            }
            return new acbw(bytes);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static anxm a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return anxm.a((int) azlf.a.a().aa());
        }
        if (!azlf.a.a().W()) {
            return anxm.DEFAULT;
        }
        return anxm.HEX_PIN;
    }
}
