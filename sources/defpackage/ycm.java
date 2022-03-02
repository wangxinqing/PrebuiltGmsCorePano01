package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* renamed from: ycm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycm {
    public static final Map a;
    public static final String[] b = new String[0];
    public static final Pattern c = Pattern.compile("\\,");
    public static final Pattern d = Pattern.compile("[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]+");
    public static final Pattern e = Pattern.compile(Pattern.quote("\u0001"));
    public static final SecureRandom f = new SecureRandom();

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("circle", -1);
        a.put("extendedCircles", 4);
        a.put("myCircles", 3);
        a.put("domain", 2);
        a.put("public", 1);
        a.put((Object) null, -2);
        new qvr(Looper.getMainLooper());
    }

    public static String a(String str) {
        if (str != null) {
            return str.replaceAll("^[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]*", "").replaceAll("[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]*$", "");
        }
        return null;
    }

    public static boolean a(char c2) {
        if (c2 == 160 || c2 == 5760 || c2 == 6158 || c2 == 8239 || c2 == 8287 || c2 == 12288 || c2 == 8232 || c2 == 8233) {
            return true;
        }
        switch (c2) {
            case 9:
            case 10:
            case 11:
            case 12:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return true;
            default:
                switch (c2) {
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                        return true;
                    default:
                        switch (c2) {
                            case FragmentTransaction.TRANSIT_EXIT_MASK:
                            case 8193:
                            case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE:
                            case 8195:
                            case 8196:
                            case 8197:
                            case 8198:
                            case 8199:
                            case 8200:
                            case 8201:
                            case 8202:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    public static boolean a(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static String c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static String[] d(String str) {
        return !TextUtils.isEmpty(str) ? c.split(str, 0) : b;
    }

    public static String e(String str) {
        if (str == null || !str.startsWith("g:")) {
            return null;
        }
        return str.substring(2);
    }

    public static String f(String str) {
        iva.a((Object) str);
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("g:") : "g:".concat(valueOf);
    }

    public static String g(String str) {
        if (str == null || !str.startsWith("e:")) {
            return null;
        }
        return str.substring(2);
    }

    public static String h(String str) {
        iva.c(str);
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("e:") : "e:".concat(valueOf);
    }

    public static boolean i(String str) {
        return str != null && str.startsWith("e:");
    }

    public static boolean j(String str) {
        return str != null && str.startsWith("g:");
    }

    public static boolean k(String str) {
        return i(str) || j(str);
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '%' || charAt == '\\' || charAt == '_') {
                z = true;
            }
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt2 = str.charAt(i2);
            if (charAt2 == '%' || charAt2 == '\\' || charAt2 == '_') {
                sb.append('\\');
            }
            sb.append(charAt2);
        }
        return sb.toString();
    }

    public static String m(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }

    public static List a(List list) {
        return !a((Collection) list) ? list.subList(0, 1) : list;
    }

    public static Random b(Context context) {
        Random random = (Random) context.getSystemService("gms.people.random");
        return random == null ? f : random;
    }

    public static boolean b(String... strArr) {
        for (String isEmpty : strArr) {
            if (!TextUtils.isEmpty(isEmpty)) {
                return false;
            }
        }
        return true;
    }

    @SafeVarargs
    public static List a(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            if (!a((Collection) list)) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public static jiq a(Context context) {
        jiq jiq = (jiq) context.getSystemService("gms.people.clock");
        return jiq == null ? jiu.a : jiq;
    }

    public static void a(String str, String str2) {
        iva.a(str, (Object) str2);
        boolean z = true;
        if (!str.startsWith("g:") && !str.startsWith("e:")) {
            z = false;
        }
        iva.b(z, str2.concat(": Expecting qualified-id, not gaia-id"));
    }

    public static boolean a(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static String[] a(String[] strArr) {
        int i = 0;
        while (true) {
            int length = strArr.length;
            if (i >= length) {
                return strArr;
            }
            if (TextUtils.isEmpty(strArr[i])) {
                ArrayList arrayList = new ArrayList(length);
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(b);
            }
            i++;
        }
    }
}
