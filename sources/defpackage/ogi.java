package defpackage;

import java.util.Map;

/* renamed from: ogi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ogi {
    public final int a;
    public final anaf b;
    public final byte[] c;

    public ogi(int i, Map map, byte[] bArr) {
        this.a = i;
        this.b = anaf.a(map);
        this.c = bArr;
    }

    public final boolean a() {
        int i = this.a;
        return i >= 200 && i <= 299;
    }
}
