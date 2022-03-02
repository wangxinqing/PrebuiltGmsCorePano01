package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: dli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dli extends dkp {
    public String a;
    public int b;
    public int c;

    public final /* bridge */ /* synthetic */ void a(dkp dkp) {
        dli dli = (dli) dkp;
        int i = this.b;
        if (i != 0) {
            dli.b = i;
        }
        int i2 = this.c;
        if (i2 != 0) {
            dli.c = i2;
        }
        if (!TextUtils.isEmpty(this.a)) {
            dli.a = this.a;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.a);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.b));
        hashMap.put("screenHeight", Integer.valueOf(this.c));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return dkp.a((Object) hashMap);
    }
}
