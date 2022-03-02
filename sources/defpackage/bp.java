package defpackage;

/* renamed from: bp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bp implements bn {
    public bl a(Class cls) {
        try {
            return (bl) cls.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        }
    }
}
