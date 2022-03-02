package defpackage;

import java.util.Formatter;

/* renamed from: zdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdm extends iyv {
    public final izb a;

    public zdm(izb izb) {
        this.a = izb;
        izb.g = 6400;
    }

    public static String a(iyu iyu, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("people/%1$s", new Object[]{iyv.a(str)});
        if (iyu != null) {
            iyu.a(sb);
        }
        if (str2 != null) {
            iyv.a(sb, "onBehalfOf", iyv.a(str2));
        }
        return sb.toString();
    }
}
