package defpackage;

import com.google.android.gms.config.ConfigChimeraService;
import java.util.List;
import java.util.Map;

/* renamed from: job  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class job {
    public final Map a;
    public final byte[] b;
    public final byte[] c;
    public final List d;
    public final List e;

    public job(List list, List list2, Map map, byte[] bArr, byte[] bArr2) {
        this.d = list;
        this.e = list2;
        this.a = map;
        this.b = bArr;
        this.c = bArr2;
    }

    public final long a(int i) {
        List list = this.d;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return ((Long) this.d.get(i > this.d.size() ? this.d.size() - 1 : i - 1)).longValue();
    }

    public final long b(int i) {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return ((Long) this.e.get(i > this.e.size() ? this.e.size() - 1 : i - 1)).longValue();
    }

    public final boolean c() {
        List list = this.d;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List list2 = this.e;
        return list2 != null && !list2.isEmpty();
    }

    public final String a() {
        return ConfigChimeraService.a(this.e);
    }

    public final String b() {
        return ConfigChimeraService.a(this.a);
    }
}
