package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: jhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jhu extends jhs {
    public jhu(Context context) {
        super(context);
    }

    public final String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
