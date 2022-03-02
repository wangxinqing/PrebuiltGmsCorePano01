package defpackage;

import android.os.Bundle;

/* renamed from: abyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abyw extends ihb {
    final /* synthetic */ long a;

    public abyw(long j) {
        this.a = j;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        Bundle bundle = new Bundle();
        bundle.putLong("sessionId", this.a);
        ((abxh) ((abyj) ibf).x()).b((abxe) new abyi(new abyz(acwd)), bundle);
    }
}
