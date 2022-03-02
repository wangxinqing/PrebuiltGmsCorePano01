package defpackage;

import android.content.Context;
import com.android.volley.RetryPolicy;

/* renamed from: ven  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ven extends vee {
    public ven(Context context, String str, int i) {
        super(context, str, i);
    }

    public final RetryPolicy b(String str) {
        return new iym(this, str, 10);
    }
}
