package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: cvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvl {
    public final Context a;
    public final UserManager b;

    static {
        dit.a("UserManagerUtil");
    }

    public cvl(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.a = context;
        this.b = (UserManager) context.getSystemService("user");
    }
}
