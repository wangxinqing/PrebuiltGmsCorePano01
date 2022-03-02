package defpackage;

import android.app.PendingIntent;

/* renamed from: aipt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipt extends aipz {
    final boolean a;
    final /* synthetic */ aipv b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aipt(aipv aipv, PendingIntent pendingIntent, long j, long j2, ajbg ajbg, boolean z, ajrb ajrb, boolean z2, String str) {
        super(pendingIntent, j, j2, ajbg, ajrb, false, z2, str);
        boolean z3 = z;
        this.b = aipv;
        this.a = z3;
        String str2 = this.m;
        this.b.b.a(new aipu(this.n, str2 == null ? "" : str2, z3, this.l), this.q);
    }

    public final void a() {
        String str = this.m;
        if (str == null) {
            str = "";
        }
        this.b.b.b(new aipu(this.n, str, this.a, this.l), this.q);
    }
}
