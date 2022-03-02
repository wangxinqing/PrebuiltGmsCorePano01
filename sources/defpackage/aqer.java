package defpackage;

/* renamed from: aqer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqer {
    public static void a(Object obj) {
        try {
            obj.notify();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("monitor on [");
            sb.append(valueOf);
            sb.append("] is held by current thread");
            a((String) null, sb.toString());
        } catch (IllegalMonitorStateException e) {
        }
    }

    public static void b(boolean z) {
        if (z) {
            a((String) null, "condition was true");
        }
    }

    public static void a(String str, String str2) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 4 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(" :: ");
            sb.append(str2);
            str2 = sb.toString();
        }
        throw new aqes(str2);
    }

    public static void a(String str, boolean z) {
        if (!z) {
            a(str, "condition was false");
        }
    }

    public static void a(boolean z) {
        a((String) null, z);
    }
}
