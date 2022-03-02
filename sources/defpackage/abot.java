package defpackage;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RetryPolicy;

/* renamed from: abot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abot extends aboo {
    public static final iwd b = acqa.a("D2D", "D2DClientImpl");
    public final RetryPolicy c;
    public final int d;
    public final int e;
    public final float f;

    /* access modifiers changed from: package-private */
    public final acca a() {
        RetryPolicy retryPolicy = this.c;
        ihs b2 = ihs.b();
        return new acce(b2, b2.getRequestQueue(), retryPolicy);
    }

    public abot() {
        int intValue = Integer.valueOf((int) azlf.a.a().m()).intValue();
        int intValue2 = Integer.valueOf((int) azlf.a.a().l()).intValue();
        float floatValue = Float.valueOf((float) azlf.a.a().k()).floatValue();
        this.d = intValue;
        this.e = intValue2;
        this.f = floatValue;
        this.c = new DefaultRetryPolicy(intValue, intValue2, floatValue);
    }
}
