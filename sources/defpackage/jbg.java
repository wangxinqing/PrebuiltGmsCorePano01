package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.account.AccountBoundService;

/* renamed from: jbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbg extends bhw implements IInterface {
    final /* synthetic */ AccountBoundService a;

    public jbg() {
        super("com.google.android.gms.common.service.IAccountService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String b = jgu.b((Context) this.a, parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i != 2) {
            return false;
        } else {
            jgu.c(this.a, parcel.readString());
            parcel2.writeNoException();
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jbg(AccountBoundService accountBoundService) {
        super("com.google.android.gms.common.service.IAccountService");
        this.a = accountBoundService;
    }
}
