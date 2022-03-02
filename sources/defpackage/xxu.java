package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;

/* renamed from: xxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xxu {
    public final ContentResolver h;
    public final Account i;
    public final yaz j;
    public final xvp k;
    protected final yav l;

    public xxu(ContentResolver contentResolver, Account account, yaz yaz, yav yav, xvp xvp) {
        this.h = contentResolver;
        this.i = account;
        this.j = yaz;
        this.l = yav;
        this.k = xvp;
    }

    public void a(xkj xkj) {
    }

    public abstract void b();
}
