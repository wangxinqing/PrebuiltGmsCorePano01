package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: qlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlv {
    public static final Pattern a = Pattern.compile("https://instant\\.app/(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(?:\\.\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*)/(\\d+)/(\\d+)/(\\w+|[-])/(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(?:\\.\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*)");

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a.matcher(str).matches();
    }
}
