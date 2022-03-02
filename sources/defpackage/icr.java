package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: icr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class icr extends UnsupportedOperationException {
    private final Feature a;

    public icr(Feature feature) {
        this.a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
