package defpackage;

/* renamed from: cuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cuf extends eg {
    public cuf(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "DELETE FROM resource_info WHERE lastUpdatedMs < ?";
    }
}
