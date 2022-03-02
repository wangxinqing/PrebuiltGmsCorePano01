package defpackage;

/* renamed from: cje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cje {
    public final StringBuilder a;

    public cje(String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        sb.append("DROP INDEX ");
        this.a.append("IF EXISTS ");
        this.a.append(str);
    }
}
