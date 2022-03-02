package defpackage;

import android.accounts.Account;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adet {
    final /* synthetic */ adev a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final adeu c;

    public adet(adev adev, adeu adeu) {
        this.a = adev;
        this.c = adeu;
    }

    public final aorr a() {
        return aorl.a((Object) amzy.a((Collection) this.a.a()));
    }

    public final aorr b() {
        adev.a(this.b);
        return aorl.a((Object) null);
    }

    public final aorr a(Account account) {
        adev adev = this.a;
        adev.a(adev.a(account), this.c, this.b);
        return aorl.a((Object) null);
    }
}
