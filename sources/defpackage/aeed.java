package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: aeed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeed extends aeec {
    public static final Uri b = Uri.parse("content://com.google.settings/partner");

    public static int a(ContentResolver contentResolver, String str, int i) {
        String a = a(contentResolver, str);
        if (a == null) {
            return i;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return i;
        }
    }

    public static void b(ContentResolver contentResolver, String str, int i) {
        aeec.a(contentResolver, b, str, String.valueOf(i));
    }

    public static String a(ContentResolver contentResolver, String str) {
        return aeec.a(contentResolver, b, str);
    }
}
