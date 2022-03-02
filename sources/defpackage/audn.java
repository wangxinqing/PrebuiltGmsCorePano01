package defpackage;

/* renamed from: audn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audn implements audv {
    private final audv[] a;

    public audn(audv... audvArr) {
        this.a = audvArr;
    }

    public final boolean a(Class cls) {
        audv[] audvArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (audvArr[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final audu b(Class cls) {
        audv[] audvArr = this.a;
        for (int i = 0; i < 2; i++) {
            audv audv = audvArr[i];
            if (audv.a(cls)) {
                return audv.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String("No factory is available for message type: ") : "No factory is available for message type: ".concat(valueOf));
    }
}
