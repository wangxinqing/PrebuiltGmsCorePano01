package defpackage;

import java.util.HashMap;

/* renamed from: bgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bgu extends bfq {
    public long a = -1;
    public long b = -1;

    public bgu() {
    }

    /* access modifiers changed from: protected */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.a));
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    public bgu(String str) {
        HashMap a2 = bfq.a(str);
        if (a2 != null) {
            this.a = ((Long) a2.get(0)).longValue();
            this.b = ((Long) a2.get(1)).longValue();
        }
    }
}
