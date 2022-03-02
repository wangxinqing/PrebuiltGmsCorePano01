package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: blb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class blb {
    public static Context a(Context context) {
        amrl.a(context.isDeviceProtectedStorage());
        return context.createCredentialProtectedStorageContext();
    }

    public static void a(Context context, String str, String str2) {
        amrl.a(context.isCredentialProtectedStorage());
        File a = bkq.a(context);
        File file = new File(a, str);
        File file2 = new File(a, str2);
        file.delete();
        bma.a(file2);
    }
}
