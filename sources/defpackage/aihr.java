package defpackage;

import android.util.Log;

/* renamed from: aihr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihr {
    private static ajrg a;

    public static synchronized void a(ajrg ajrg) {
        synchronized (aihr.class) {
            a = ajrg;
        }
    }

    public static void a(String str, Object... objArr) {
        ajrg ajrg = a;
        if (ajrg != null) {
            String format = String.format(str, objArr);
            Log.println(3, "GCoreFlp", format);
            aiuf aiuf = (aiuf) ajrg;
            if (aiuf.b != null) {
                String num = aiuf.a.length > 3 ? aiuf.a[3] : Integer.toString(3);
                aicn aicn = aiuf.b;
                aicn.a((aicl) new aite(aico.LOG, aicn.b(), num, "GCoreFlp", format));
            }
        }
    }
}
