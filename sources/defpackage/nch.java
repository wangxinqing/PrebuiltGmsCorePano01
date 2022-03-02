package defpackage;

import com.google.android.gms.fido.u2f.api.common.ResponseData;
import org.json.JSONObject;

/* renamed from: nch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nch {
    public String a;
    public Integer b;
    private JSONObject c;

    public final nci a() {
        return new nci(this.a, this.b, this.c);
    }

    public final void a(ResponseData responseData) {
        this.c = responseData != null ? responseData.a() : null;
    }
}
