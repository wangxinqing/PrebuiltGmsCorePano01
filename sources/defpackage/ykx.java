package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;
import java.util.Set;

/* renamed from: ykx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykx extends yld {
    final /* synthetic */ AccountSignUpChimeraActivity a;

    public ykx(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.a = accountSignUpChimeraActivity;
    }

    public final boolean c() {
        return this.a.a != null;
    }

    public final void d() {
        Set a2 = jkx.a(this.a.e.substring(7).split(" "));
        Intent a3 = itg.a(this.a.h, (Scope[]) a2.toArray(new Scope[a2.size()]), false);
        a3.putExtra("overrideTheme", 1);
        this.a.startActivityForResult(a3, 1);
    }
}
