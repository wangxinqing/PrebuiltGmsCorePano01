package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: iud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iud extends bhw implements iue {
    final /* synthetic */ Context a;
    public final /* synthetic */ abet b;

    public iud() {
        super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
    }

    public final void a(ResolveAccountResponse resolveAccountResponse) {
        if (resolveAccountResponse.c.b()) {
            this.b.a.a(resolveAccountResponse.a().a(), this.b.a.a());
            try {
                new abed(this.b.a, (AuthAccountRequest) null, new abes(this, resolveAccountResponse)).a(this.a);
            } catch (nja e) {
                this.b.b.a(new SignInResponse());
            }
        } else {
            this.b.b.a(new SignInResponse(resolveAccountResponse.c, (ResolveAccountResponse) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iud(abet abet, Context context) {
        super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        this.b = abet;
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((ResolveAccountResponse) bhx.a(parcel, ResolveAccountResponse.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
