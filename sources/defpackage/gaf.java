package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: gaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gaf extends gae {
    final gat a = new gat(this);
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ Account e;

    /* access modifiers changed from: protected */
    public final void a(gar gar) {
        gat gat = this.a;
        int i = this.b;
        List list = this.c;
        String str = this.d;
        Account account = this.e;
        Parcel aQ = gar.aQ();
        bhx.a(aQ, (IInterface) gat);
        aQ.writeInt(i);
        aQ.writeStringList(list);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeList((List) null);
        aQ.writeByteArray((byte[]) null);
        gar.b(2, aQ);
    }

    public gaf() {
    }

    public gaf(int i, List list, String str, Account account) {
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = account;
    }
}
