package defpackage;

import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.Route;

/* renamed from: qkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qkp {
    public final boolean a;
    public final AppInfo b;
    public final Route c;
    public final byte[] d;

    public qkp(boolean z, AppInfo appInfo, Route route, byte[] bArr) {
        this.a = z;
        this.b = appInfo;
        this.c = route;
        this.d = bArr;
    }

    public static qkp a() {
        return new qkp(false, (AppInfo) null, (Route) null, (byte[]) null);
    }
}
