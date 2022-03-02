package defpackage;

/* renamed from: ahht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahht implements amqy {
    private final int a;
    private final String b;
    private final String c;

    public ahht(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final Object a(Object obj) {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        ahhz ahhz = (ahhz) obj;
        if ((ahhz.a() & i) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : ahhz.b()) {
            if (stackTraceElement.getClassName().equals(str) && stackTraceElement.getMethodName().equals(str2)) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }
}
