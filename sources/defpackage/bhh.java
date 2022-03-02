package defpackage;

import java.util.HashMap;

/* renamed from: bhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bhh extends bfq {
    public Long a;
    public Long b;

    public bhh() {
    }

    /* access modifiers changed from: protected */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }

    public bhh(String str) {
        HashMap a2 = bfq.a(str);
        if (a2 != null) {
            this.a = (Long) a2.get(0);
            this.b = (Long) a2.get(1);
        }
    }
}
