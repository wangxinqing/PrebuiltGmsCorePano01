package defpackage;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;

/* renamed from: hwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwa extends HttpPost {
    private final hwc a;
    private HttpEntity b;
    private final jiq c;

    public hwa(String str, hwc hwc, jiq jiq) {
        super(str);
        this.a = hwc;
        this.c = jiq;
    }

    public final HttpEntity getEntity() {
        if (this.b == null) {
            this.b = new hvz(this.a);
        }
        return this.b;
    }
}
