package defpackage;

import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.ArrayList;

/* renamed from: zyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyh {
    public final String a;
    public Long b;
    public final String c;
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public gsj k;

    public zyh(String str, String str2) {
        this.a = str;
        this.c = str2;
    }

    public final zyi a() {
        return new zyi(this);
    }

    /* access modifiers changed from: package-private */
    public final void a(SourceStats sourceStats) {
        if ("com.google".equals(sourceStats.a())) {
            this.f += sourceStats.b().intValue();
            return;
        }
        String a2 = sourceStats.a();
        if (a2 == null || !a2.matches(".*sim.*|.*SIM.*")) {
            this.i.add(sourceStats.a());
            this.g += sourceStats.b().intValue();
            return;
        }
        this.j.add(sourceStats.a());
        this.h += sourceStats.b().intValue();
    }
}
