package defpackage;

import android.os.Parcel;

/* renamed from: adsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsr extends bhw implements adss {
    private final ige a;

    public adsr() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        b();
        return true;
    }

    public final void b() {
        this.a.a(new adtg());
    }

    public adsr(ige ige) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = ige;
    }
}
