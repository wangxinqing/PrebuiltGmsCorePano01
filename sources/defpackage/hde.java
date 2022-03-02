package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;

/* renamed from: hde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hde extends bjs {
    public jma f;
    public boolean g;
    public boolean h;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public static boolean a(Context context, String str, String str2) {
        Account[] accountArr;
        qub a = qub.a(context);
        if (str == null || str.equals(context.getPackageName())) {
            accountArr = a.a(str2);
        } else {
            accountArr = a.a(str2, str);
        }
        return accountArr.length > 0;
    }

    public static final jmc b(Context context) {
        return new jnb(context);
    }

    /* access modifiers changed from: protected */
    public abstract void a(jma jma, Bundle bundle);

    public abstract void i();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.common_settings_screen);
        i();
        jmz jmz = new jmz(this);
        this.f = jmz;
        a(jmz, bundle);
        this.f.a(getWindow());
    }

    public final boolean b(Intent intent) {
        return getPackageManager().resolveActivity(intent, 65536) != null;
    }
}
