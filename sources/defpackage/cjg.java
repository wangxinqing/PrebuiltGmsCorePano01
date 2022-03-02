package defpackage;

/* renamed from: cjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjg {
    public final StringBuilder a;
    public boolean b = false;

    public cjg(String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        sb.append("CREATE TABLE ");
        sb.append(str);
        sb.append(" (");
    }
}
