package defpackage;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: nmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmk {
    public IBinder a = null;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", 0);
        bundle.putInt("popupLocationInfo.displayId", this.b);
        bundle.putInt("popupLocationInfo.left", this.c);
        bundle.putInt("popupLocationInfo.top", this.d);
        bundle.putInt("popupLocationInfo.right", this.e);
        bundle.putInt("popupLocationInfo.bottom", this.f);
        return bundle;
    }
}
