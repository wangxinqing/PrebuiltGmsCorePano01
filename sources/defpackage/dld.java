package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: dld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dld extends dkp {
    public String a;
    public String b;
    public String c;
    public String d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.a);
        hashMap.put("appVersion", this.b);
        hashMap.put("appId", this.c);
        hashMap.put("appInstallerId", this.d);
        return dkp.a((Object) hashMap);
    }

    public final void a(dld dld) {
        if (!TextUtils.isEmpty(this.a)) {
            dld.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            dld.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            dld.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            dld.d = this.d;
        }
    }
}
