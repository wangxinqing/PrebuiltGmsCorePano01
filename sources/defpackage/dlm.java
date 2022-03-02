package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: dlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dlm extends dkp {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final /* bridge */ /* synthetic */ void a(dkp dkp) {
        dlm dlm = (dlm) dkp;
        if (!TextUtils.isEmpty(this.a)) {
            dlm.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            dlm.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            dlm.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            dlm.d = this.d;
        }
        if (this.e) {
            dlm.e = true;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (this.f) {
            dlm.f = true;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.a);
        hashMap.put("clientId", this.b);
        hashMap.put("userId", this.c);
        hashMap.put("androidAdId", this.d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.e));
        hashMap.put("sessionControl", (Object) null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f));
        hashMap.put("sampleRate", Double.valueOf(0.0d));
        return dkp.a((Object) hashMap);
    }
}
