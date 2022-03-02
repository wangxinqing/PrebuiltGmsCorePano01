package defpackage;

import dalvik.system.VMStack;

/* renamed from: anjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class anjl extends anix {
    public anhy a(Class cls, int i) {
        return anhy.a;
    }

    public String a(Class cls) {
        StackTraceElement a;
        if (anjn.a) {
            try {
                Class l = anjn.l();
                if (cls.equals(l)) {
                    return VMStack.getStackClass2().getName();
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
                sb.append("Unexpected stack depth, expected: ");
                sb.append(valueOf);
                sb.append(" but was ");
                sb.append(valueOf2);
                throw new IllegalStateException(sb.toString());
            } catch (Throwable th) {
            }
        }
        if (!anjn.b || (a = ankp.a(cls, new Throwable(), 1)) == null) {
            return null;
        }
        return a.getClassName();
    }
}
