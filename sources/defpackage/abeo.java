package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

/* renamed from: abeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abeo extends nis {
    private final Account a;
    private final int b;
    private final boolean c;
    private final String d;
    private final aber e;

    public abeo(abev abev, Account account, int i, boolean z, aber aber) {
        super(44, "SaveDefaultAccount");
        this.a = account;
        this.b = i;
        this.c = z;
        String str = abev.c;
        iva.c(str);
        this.d = str;
        this.e = aber;
    }

    public final void a(Context context) {
        Object obj;
        aber aber = this.e;
        Account account = this.a;
        String str = this.d;
        int i = this.b;
        jgu.a(context, str, account);
        aber.c.a(str, i);
        if (this.c) {
            String str2 = this.a.name;
            try {
                obj = jni.b(context).b(this.d);
            } catch (PackageManager.NameNotFoundException e2) {
                obj = null;
            }
            if (obj == null) {
                obj = context.getString(R.string.signin_unknown_app_name);
            }
            new qvr(Looper.getMainLooper()).post(new abeq(context, context.getString(R.string.signin_cross_client_auth_toast_text, new Object[]{obj, str2})));
        }
    }

    public final void a(Status status) {
    }
}
