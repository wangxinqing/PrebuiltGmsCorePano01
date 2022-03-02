package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: dmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmb {
    public static final String a;
    public static final String b;

    static {
        String replaceAll = String.valueOf(hxk.c / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        a = replaceAll;
        String valueOf = String.valueOf(replaceAll);
        b = valueOf.length() == 0 ? new String("ma") : "ma".concat(valueOf);
    }
}
