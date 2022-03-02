package defpackage;

import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtn {
    public String a;
    public boolean b;
    public int c = 1;
    public boolean d;
    public String e;
    public String f;
    public ScoringConfig g;
    private final String h;
    private final List i = new ArrayList();

    public dtn(String str) {
        this.h = str;
    }

    public final RegisterSectionInfo a() {
        String str = this.h;
        String str2 = this.a;
        boolean z = this.b;
        int i2 = this.c;
        boolean z2 = this.d;
        String str3 = this.e;
        List list = this.i;
        return new RegisterSectionInfo(str, str2, z, i2, z2, str3, (Feature[]) list.toArray(new Feature[list.size()]), this.f, this.g);
    }

    public final void a(Feature feature) {
        Feature.a(this.i, feature);
    }
}
