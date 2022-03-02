package defpackage;

/* renamed from: aonq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonq {
    public static aucd a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        aucd o = aois.d.o();
        String name = th.getClass().getName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aois aois = (aois) o.b;
        name.getClass();
        aois.a |= 1;
        aois.b = name;
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException e) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                aucd o2 = aoir.f.o();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aoir aoir = (aoir) o2.b;
                    className.getClass();
                    aoir.a |= 1;
                    aoir.b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aoir aoir2 = (aoir) o2.b;
                    methodName.getClass();
                    aoir2.a |= 2;
                    aoir2.c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aoir aoir3 = (aoir) o2.b;
                    aoir3.a |= 8;
                    aoir3.e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aoir aoir4 = (aoir) o2.b;
                        fileName.getClass();
                        aoir4.a |= 4;
                        aoir4.d = fileName;
                    }
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aois aois2 = (aois) o.b;
                aoir aoir5 = (aoir) o2.i();
                aoir5.getClass();
                if (!aois2.c.a()) {
                    aois2.c = aucj.a(aois2.c);
                }
                aois2.c.add(aoir5);
            }
        }
        return o;
    }
}
