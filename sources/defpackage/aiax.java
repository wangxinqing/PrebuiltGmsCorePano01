package defpackage;

/* renamed from: aiax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiax {
    public final aiav a;
    public final aibo b;
    public final aiah c;
    public final boolean d;

    public aiax(aiav aiav, aibo aibo) {
        this(aiav, aibo, (aiah) null, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(5000);
        sb.append("NetworkLocation [bestResult=");
        aiav aiav = this.a;
        if (aiav == null) {
            sb.append("null");
        } else if (aiav == this.b) {
            sb.append("WIFI");
        } else if (aiav == this.c) {
            sb.append("CELL");
        }
        sb.append(" wifiResult=");
        aibo.a(sb, this.b);
        sb.append(" cellResult=");
        aiah.a(sb, this.c);
        sb.append(" isLowPower=");
        sb.append(this.d);
        sb.append("]");
        return sb.toString();
    }

    public aiax(aiav aiav, aibo aibo, aiah aiah, boolean z) {
        this.a = aiav;
        this.b = aibo;
        this.c = aiah;
        this.d = z;
        if (aiav != null && aiav.d != aiau.OK) {
            throw new RuntimeException("Invalid Args");
        }
    }
}
