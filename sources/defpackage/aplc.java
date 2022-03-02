package defpackage;

/* renamed from: aplc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aplc extends Exception {
    @Deprecated
    protected aplc() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aplc(String str) {
        super(str);
        iva.a(str, (Object) "Detail message must not be empty");
    }
}
