package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aiii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aiii {
    protected final Set f = new HashSet();
    protected final iby g;

    public aiii(Context context) {
        this.g = ren.c(context);
    }

    public abstract float a();

    public abstract void a(Location location);

    public final void a(DeviceOrientationRequestInternal deviceOrientationRequestInternal) {
        this.f.add(deviceOrientationRequestInternal);
        c();
    }

    /* access modifiers changed from: protected */
    public abstract void a(PrintWriter printWriter);

    public final void b(DeviceOrientationRequestInternal deviceOrientationRequestInternal) {
        this.f.remove(deviceOrientationRequestInternal);
        c();
    }

    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract void c();
}
