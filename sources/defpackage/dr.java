package defpackage;

/* renamed from: dr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dr extends eg {
    public dr(eb ebVar) {
        super(ebVar);
    }

    public abstract void a(C0000do doVar, Object obj);

    public final void a(Object[] objArr) {
        C0000do b = b();
        try {
            a(b, objArr[0]);
            b.a();
        } finally {
            a(b);
        }
    }
}
