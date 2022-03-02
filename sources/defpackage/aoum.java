package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aoum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoum {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            aowx aowx = (aowx) it.next();
            if (str.toLowerCase().startsWith("android-keystore://")) {
                return;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() == 0 ? new String("No KMS client does support: ") : "No KMS client does support: ".concat(valueOf));
    }
}
