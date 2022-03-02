package defpackage;

import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

/* renamed from: duo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class duo {
    public DocumentId a;
    public long b = -1;
    public int c = -1;
    public DocumentContents d;
    public boolean e = false;
    public int f = 0;
    public String g;

    public final UsageInfo a() {
        return new UsageInfo(this.a, this.b, this.c, (String) null, this.d, this.e, -1, this.f, this.g);
    }
}
