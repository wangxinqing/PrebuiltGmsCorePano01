package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface zav {
    public static final zav a = new zaw();
    public static final String[] b = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/pos"};

    ConnectionResult a(Context context, ClientContext clientContext, String[] strArr);

    ConnectionResult a(Context context, String str, int i, String str2, String str3, String[] strArr);
}
