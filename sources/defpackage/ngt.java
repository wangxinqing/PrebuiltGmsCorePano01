package defpackage;

import java.util.Locale;

/* renamed from: ngt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngt {
    public static String a(nfw nfw) {
        iva.a((Object) nfw, (Object) "spec");
        iva.a(!nfw.b.isEmpty(), (Object) "spec.filename");
        Locale locale = Locale.ENGLISH;
        String valueOf = String.valueOf(nfw.b);
        return String.format(locale, valueOf.length() == 0 ? new String("https://fonts.gstatic.com/s/a/") : "https://fonts.gstatic.com/s/a/".concat(valueOf), new Object[0]);
    }

    public static String a(nfy nfy) {
        iva.a((Object) nfy, (Object) "font");
        nfw nfw = nfy.a;
        if (nfw == null) {
            nfw = nfw.e;
        }
        iva.a((Object) nfw, (Object) "font.file");
        nfw nfw2 = nfy.a;
        if (nfw2 == null) {
            nfw2 = nfw.e;
        }
        iva.a((Object) nfw2.d, (Object) "font.file.hash");
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        nfw nfw3 = nfy.a;
        if (nfw3 == null) {
            nfw3 = nfw.e;
        }
        objArr[0] = ngg.a(nfw3.d.k());
        return String.format(locale, "https://fonts.gstatic.com/s/a/%s.ttf", objArr);
    }
}
