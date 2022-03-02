package defpackage;

import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.Route;

/* renamed from: qkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkt {
    public final int a;
    public final AppInfo b;
    public final Route c;
    public final int d;
    final boolean e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final byte[] j;

    public qkt(int i2, String str, int i3, int i4, String str2, byte[] bArr, AppInfo appInfo, Route route, int i5, boolean z) {
        this.a = i2;
        this.f = str;
        this.g = i3;
        this.h = i4;
        this.i = str2;
        this.j = bArr;
        this.b = appInfo;
        this.c = route;
        this.d = i5;
        this.e = z;
    }

    public static qkt a(String str, int i2, int i3, String str2, byte[] bArr, AppInfo appInfo, Route route, boolean z) {
        return new qkt(2, str, i2, i3, str2, bArr, appInfo, route, !z ? 0 : 3, false);
    }
}
