package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;

/* renamed from: xyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyq {
    public final xvw a;
    public final xyr b;
    public final xyn c;
    public final xwn d;

    public xyq(xvw xvw, xyr xyr, Account account, ContentResolver contentResolver, xwn xwn) {
        this.a = xvw;
        this.b = xyr;
        this.d = xwn;
        this.c = new xyn(xvw, account, contentResolver);
    }
}
