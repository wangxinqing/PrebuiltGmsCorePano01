package defpackage;

import java.io.PrintStream;

/* renamed from: ankt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankt {
    private ankt() {
    }

    public static Object a(String str, Class cls) {
        String str2;
        ankq.a(str, "property name");
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e) {
            a("cannot read property name %s: %s", str, e);
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        int indexOf = str2.indexOf(35);
        if (indexOf <= 0 || indexOf == str2.length() - 1) {
            a("invalid getter (expected <class>#<method>): %s\n", str2);
            return null;
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        try {
            return cls.cast(Class.forName(substring).getMethod(substring2, new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (ClassCastException e3) {
            a("cannot cast result of calling '%s#%s' to '%s': %s\n", substring, substring2, cls.getName(), e3);
            return null;
        } catch (Exception e4) {
            a("cannot call expected no-argument static method '%s#%s': %s\n", substring, substring2, e4);
            return null;
        }
    }

    private static void a(String str, Object... objArr) {
        PrintStream printStream = System.err;
        String valueOf = String.valueOf(ankt.class);
        String format = String.format(str, objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(format).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(format);
        printStream.println(sb.toString());
    }
}
