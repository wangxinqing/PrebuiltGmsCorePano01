package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gah extends gae {
    final gau a = new gau(this);
    final /* synthetic */ String b;
    final /* synthetic */ Account c;

    /* access modifiers changed from: protected */
    public final void a(gar gar) {
        gau gau = this.a;
        String str = this.b;
        Account account = this.c;
        Parcel aQ = gar.aQ();
        bhx.a(aQ, (IInterface) gau);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) account);
        gar.b(9, aQ);
    }

    public gah() {
    }

    public gah(String str, Account account) {
        this.b = str;
        this.c = account;
    }
}
