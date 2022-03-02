package defpackage;

/* renamed from: yeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class yeu implements igp {
    private final String a;
    private final String b;
    private final int[] c;

    public yeu(String str, String str2, int[] iArr) {
        this.a = str;
        this.b = str2;
        this.c = iArr;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        int[] iArr = this.c;
        ygi ygi = new ygi((acwd) obj2);
        ygm ygm = (ygm) ((ygn) obj).x();
        String valueOf = String.valueOf(str);
        ygm.a(ygi, valueOf.length() == 0 ? new String("__internal.external_ids#") : "__internal.external_ids#".concat(valueOf), 0, new String[]{str2}, iArr, (byte[]) null);
    }
}
