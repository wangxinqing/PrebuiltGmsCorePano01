package defpackage;

/* renamed from: agvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agvd implements agvb {
    private final agvf a;
    private final String b;

    public agvd(agvf agvf, String str) {
        this.a = agvf;
        this.b = str;
    }

    public final Object a() {
        agvf agvf = this.a;
        return aeeg.a(agvf.a.getContentResolver(), this.b, (String) null);
    }
}
