package defpackage;

/* renamed from: cjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjf {
    public final StringBuilder a;
    public boolean b = false;

    public cjf(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        sb.append("CREATE INDEX ");
        this.a.append("IF NOT EXISTS ");
        this.a.append(str2);
        this.a.append(" ON ");
        this.a.append(str);
        this.a.append(" (");
    }
}
