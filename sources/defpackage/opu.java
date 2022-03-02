package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: opu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class opu implements OnAccountsUpdateListener {
    public final Context a;
    public final orf b;
    public final NativeIndex c;
    public final ozs d;
    public final pas e;
    public final oyq f;
    public final qub g;
    private final ppp h;

    public opu(Context context, ppp ppp, orf orf, NativeIndex nativeIndex, ozs ozs, pas pas, oyq oyq) {
        this.a = context;
        this.h = ppp;
        this.b = orf;
        this.c = nativeIndex;
        this.d = ozs;
        this.e = pas;
        this.f = oyq;
        this.g = qub.a(context);
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        this.h.d(new ops(this, aonk.READ_UPDATED_ACCOUNTS, accountArr));
        if (axsp.e()) {
            this.h.d(new opt(this, aonk.USER_ACTIONS_UPLOAD_ACCOUNT_CHANGE));
        }
    }
}
