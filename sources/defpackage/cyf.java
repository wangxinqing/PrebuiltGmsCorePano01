package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.Arrays;

/* renamed from: cyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cyf {
    public final String a;
    public final String b;
    public final String c;
    public final aqrl d;
    public final boolean e;
    public final Intent f;

    public cyf(String str, String str2, String str3, aqrl aqrl, boolean z, Intent intent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aqrl;
        this.e = z;
        this.f = intent;
    }

    private static cyf a(Context context) {
        aucd o = aqrl.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqrl aqrl = (aqrl) o.b;
        aqrl.a |= 1;
        aqrl.b = 19;
        return new cyf(context.getString(R.string.common_something_went_wrong), context.getString(R.string.accountsettings_outdated_data_message_other_error), (String) null, (aqrl) o.i(), false, (Intent) null);
    }

    public final boolean a() {
        return this.d != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cyf) {
            cyf cyf = (cyf) obj;
            return this.e == cyf.e && amqx.a(this.a, cyf.a) && amqx.a(this.b, cyf.b) && amqx.a(this.c, cyf.c) && amqx.a(this.d, cyf.d) && amqx.a(this.f, cyf.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f});
    }

    public static cyf a(Throwable th, Context context) {
        if (th instanceof babk) {
            babj babj = ((babk) th).a;
            if (babj.r != babg.DEADLINE_EXCEEDED && babj.r != babg.UNAVAILABLE) {
                return a(context);
            }
            aucd o = aqrl.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqrl aqrl = (aqrl) o.b;
            aqrl.a |= 1;
            aqrl.b = 18;
            return new cyf(context.getString(R.string.accountsettings_snackbar_error_no_connection), context.getString(R.string.as_network_error_description), context.getString(R.string.common_try_again), (aqrl) o.i(), true, (Intent) null);
        } else if (th instanceof UserRecoverableAuthException) {
            Intent a2 = ((UserRecoverableAuthException) th).a();
            aucd o2 = aqrl.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqrl aqrl2 = (aqrl) o2.b;
            aqrl2.a |= 1;
            aqrl2.b = 13;
            return new cyf(context.getString(R.string.accountsettings_autherror_message), context.getString(R.string.as_authentication_error_description), context.getString(R.string.common_sign_in), (aqrl) o2.i(), false, a2);
        } else if (th != null) {
            return a(context);
        } else {
            return null;
        }
    }
}
