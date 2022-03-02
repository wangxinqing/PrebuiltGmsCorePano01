package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.List;

/* renamed from: yjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjc {
    private final jnh a;

    public yjc(jnh jnh) {
        this.a = jnh;
    }

    public final boolean a(String str) {
        try {
            PackageInfo b = this.a.b("com.android.vending", 0);
            long a2 = kt.a(b);
            if (str != null && !TextUtils.isEmpty(str.trim())) {
                for (String c : amsk.b(",").b().a((CharSequence) str)) {
                    List c2 = amsk.b(":").b().c(c);
                    try {
                        if (c2.isEmpty()) {
                            continue;
                        } else {
                            if (c2.size() != 1) {
                                if (a2 >= Long.parseLong((String) c2.get(0)) && a2 < Long.parseLong((String) c2.get(1))) {
                                }
                            } else if (a2 != Long.parseLong((String) c2.get(0))) {
                            }
                            return (b.applicationInfo.flags & 128) != 0;
                        }
                    } catch (NumberFormatException e) {
                        yja.b("NumberFormatException while parsing version list %s", e.getMessage());
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            yja.b("Invalid package name %s", e2.getMessage());
            return false;
        }
    }
}
