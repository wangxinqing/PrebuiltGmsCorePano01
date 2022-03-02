package defpackage;

import android.app.ActivityManager;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: ntw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntw {
    private Set a = Collections.emptySet();
    private Set b = Collections.emptySet();
    private int c;

    private static final String a(Collection collection) {
        return TextUtils.join(",", collection);
    }

    public final boolean a(ou ouVar, int i) {
        int i2;
        List<Object> b2 = nqw.b();
        ob obVar = new ob();
        ob obVar2 = new ob();
        boolean z = false;
        if (!nqw.a() || !nqw.a) {
            i2 = 0;
        } else {
            try {
                i2 = ((Integer) nqw.b.invoke(ActivityManager.class, new Object[0])).intValue();
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error in getCurrentUser: ");
                } else {
                    "Error in getCurrentUser: ".concat(valueOf);
                }
                i2 = 0;
            }
        }
        int b3 = nqw.b(i2);
        for (Object a2 : b2) {
            int a3 = nqw.a(a2);
            if (!nqw.d(a3)) {
                obVar.add(Integer.valueOf(a3));
            } else if (a3 != b3) {
                obVar2.add(Integer.valueOf(a3));
            }
        }
        if (i != -1) {
            obVar.add(Integer.valueOf(nqw.b(i)));
        }
        if (!obVar.equals(this.a) || !obVar2.equals(this.b) || this.c != b3) {
            z = true;
        }
        this.a = obVar;
        this.b = obVar2;
        this.c = b3;
        ouVar.put("u:f", Integer.toString(b3));
        if (!this.b.isEmpty()) {
            ouVar.put("u:b", a(this.b));
        }
        if (!this.a.isEmpty()) {
            ouVar.put("u:s", a(this.a));
        }
        return z;
    }
}
