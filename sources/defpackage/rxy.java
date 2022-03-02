package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: rxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rxy extends iby {
    public rxy(Context context) {
        super(context, rxu.a, (ibm) null, ibx.a);
    }

    public final acwa a(String str, String str2) {
        return a((ihb) new rxw(new FileGroupRequest(str, str2, (Account) null)));
    }
}
