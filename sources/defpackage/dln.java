package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: dln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dln extends dkp {
    public int a;

    public final /* bridge */ /* synthetic */ void a(dkp dkp) {
        dln dln = (dln) dkp;
        TextUtils.isEmpty((CharSequence) null);
        int i = this.a;
        if (i != 0) {
            dln.a = i;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            TextUtils.isEmpty((CharSequence) null);
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", (Object) null);
        hashMap.put("interstitial", false);
        hashMap.put("automatic", false);
        hashMap.put("screenId", Integer.valueOf(this.a));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", (Object) null);
        hashMap.put("referrerUri", (Object) null);
        return dkp.a((Object) hashMap);
    }

    public dln() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        iva.a(leastSignificantBits);
        this.a = leastSignificantBits;
    }
}
