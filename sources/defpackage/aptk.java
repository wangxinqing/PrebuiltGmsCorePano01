package defpackage;

import com.google.android.gms.common.api.Status;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: aptk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aptk {
    public static String a(String str) {
        try {
            return ampw.a(new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            aptl.a.e("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void a(aptl aptl, String str) {
        aptl.a(str, (Status) null);
    }
}
