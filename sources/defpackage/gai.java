package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.cryptauth.Payload;

/* renamed from: gai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gai extends gae {
    final gav a = new gav(this);
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ Account d;
    final /* synthetic */ Payload e;

    /* access modifiers changed from: protected */
    public final void a(gar gar) {
        gav gav = this.a;
        String str = this.b;
        String str2 = this.c;
        Account account = this.d;
        Payload payload = this.e;
        Parcel aQ = gar.aQ();
        bhx.a(aQ, (IInterface) gav);
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) account);
        bhx.a(aQ, (Parcelable) payload);
        gar.b(5, aQ);
    }

    public gai() {
    }

    public gai(String str, String str2, Account account, Payload payload) {
        this.b = str;
        this.c = str2;
        this.d = account;
        this.e = payload;
    }
}
