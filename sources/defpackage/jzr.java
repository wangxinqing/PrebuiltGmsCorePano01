package defpackage;

import com.google.android.gms.drive.DriveId;

/* renamed from: jzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jzr implements ilq {
    public final DriveId a() {
        return (DriveId) a(lce.a);
    }

    public abstract Object a(kyq kyq);

    public final String b() {
        return (String) a(lce.g);
    }

    public final String c() {
        return (String) a(lce.N);
    }

    public final String d() {
        return (String) a(lce.Q);
    }

    public final boolean e() {
        return "application/vnd.google-apps.folder".equals(c());
    }

    public final boolean f() {
        Boolean bool = (Boolean) a(lce.q);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean g() {
        Boolean bool = (Boolean) a(lce.P);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
