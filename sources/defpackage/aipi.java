package defpackage;

/* renamed from: aipi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aipi {
    private final ajrb a;
    private final String b;

    public aipi(ajrb ajrb, String str) {
        this.a = ajrb == null ? new ajrc() : ajrb;
        this.b = str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof aipi) {
            aipi aipi = (aipi) obj;
            return this.a.equals(aipi.a) && this.b.equals(aipi.b);
        }
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + str.length());
        sb.append("Client: ");
        sb.append(valueOf);
        sb.append(" Tag: ");
        sb.append(str);
        return sb.toString();
    }
}
