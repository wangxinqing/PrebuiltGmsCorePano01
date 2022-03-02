package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: arze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arze {
    public static boolean a(Context context, String str, String str2) {
        ClientContext clientContext = new ClientContext();
        clientContext.e = str;
        clientContext.b = jhg.i(context, str);
        return a(ixk.a(context, clientContext), str2);
    }

    public static boolean a(ixk ixk, String str) {
        return ixk.a(str) == 0;
    }
}
