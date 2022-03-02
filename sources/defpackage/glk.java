package defpackage;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: glk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glk {
    public static String a(Context context, boolean z, String str, ijn ijn, boolean z2) {
        new jlm(context);
        if (!"cn.google".equals(str)) {
            if (ijn.c) {
                return (String) ent.p.c();
            }
            if (!ekh.a.b(context)) {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 7) {
                    jix.g(context);
                    if (jlm.b()) {
                        jix.g(context);
                        return (String) ent.y.c();
                    } else if (!ijm.a(ijn.a)) {
                        if (z) {
                            return ent.d(false);
                        }
                        if (!z2 && awng.b()) {
                            return ent.d(true);
                        }
                        return (String) ent.x.c();
                    } else if (z) {
                        return ent.b(false);
                    } else {
                        if (!z2 && awng.b()) {
                            return ent.b(true);
                        }
                        return (String) ent.w.c();
                    }
                } else if (z) {
                    return ent.c(false);
                } else {
                    if (!z2 && awng.b()) {
                        return ent.c(true);
                    }
                    return (String) ent.l.c();
                }
            } else if (z) {
                return ent.a(false);
            } else {
                if (!z2 && awng.b()) {
                    return ent.a(true);
                }
                return (String) ent.v.c();
            }
        } else if (!z) {
            return (String) ent.t.c();
        } else {
            return (String) ent.q.c();
        }
    }
}
