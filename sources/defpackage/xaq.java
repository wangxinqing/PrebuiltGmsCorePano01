package defpackage;

import android.os.Bundle;
import android.util.Log;

/* renamed from: xaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xaq extends wzu {
    private final ige a;

    public final void a() {
        this.a.a();
    }

    public xaq(ige ige) {
        this.a = ige;
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        if (i == 0) {
            ige ige = this.a;
            bundle2.getString("account");
            bundle2.getString("pagegaiaid");
            bundle2.getInt("scope");
            ige.a(new xae());
            return;
        }
        Log.w("PeopleClient", "Non-success data changed callback received.");
    }
}
