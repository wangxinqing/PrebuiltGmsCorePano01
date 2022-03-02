package defpackage;

import java.nio.charset.Charset;

/* renamed from: amqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amqn {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName("UTF-8");
    public static final Charset d = Charset.forName("UTF-16LE");

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16");
    }
}
