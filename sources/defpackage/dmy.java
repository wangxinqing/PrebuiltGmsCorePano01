package defpackage;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmy {
    private final dmd a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected dmy(dmd dmd) {
        iva.a((Object) dmd);
        this.a = dmd;
    }

    public static final long c() {
        return ((Long) doz.h.a()).longValue();
    }

    public static final long d() {
        return ((Long) doz.g.a()).longValue();
    }

    public static final int e() {
        return ((Integer) doz.k.a()).intValue();
    }

    public static final int f() {
        return ((Integer) doz.j.a()).intValue();
    }

    public static final String g() {
        return (String) doz.m.a();
    }

    public static final String h() {
        return (String) doz.n.a();
    }

    public static final String i() {
        return (String) doz.l.a();
    }

    public final boolean a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    ApplicationInfo applicationInfo = this.a.a.getApplicationInfo();
                    String a2 = jkt.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a2)) {
                            z = true;
                        }
                        this.b = Boolean.valueOf(z);
                    }
                    if ((this.b == null || !this.b.booleanValue()) && "com.google.android.gms.analytics".equals(a2)) {
                        this.b = Boolean.TRUE;
                    }
                    if (this.b == null) {
                        this.b = Boolean.TRUE;
                        this.a.a().e("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.b.booleanValue();
    }

    public final Set b() {
        String str;
        String str2 = (String) doz.v.a();
        if (this.d == null || (str = this.c) == null || !str.equals(str2)) {
            String[] split = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException e) {
                }
            }
            this.c = str2;
            this.d = hashSet;
        }
        return this.d;
    }
}
