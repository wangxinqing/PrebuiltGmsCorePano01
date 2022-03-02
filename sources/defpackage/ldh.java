package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ldh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ldh {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public ldh(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void a(boolean z) {
        Account a2 = lrg.a(this.a, this.b);
        if (a2 != null) {
            if (z) {
                ldy.a(a2, this.a);
            }
            ldy.a(this.a, a2, z);
        }
    }
}
