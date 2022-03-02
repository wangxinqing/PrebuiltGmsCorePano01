package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.internal.OptInInfo;

/* renamed from: qgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgg extends qgi {
    public qgg(icc icc) {
        super(icc);
    }

    /* access modifiers changed from: protected */
    public final void a(qgb qgb) {
        qgb.a((qfy) new qgf(this));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new qgl(status, OptInInfo.a(-1, (String) null, (Account[]) null));
    }
}
