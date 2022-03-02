package defpackage;

import android.widget.ImageView;

/* renamed from: agaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agaq extends agax {
    public final amri a;
    public final ImageView b;
    private final int c;
    private final amri d;

    public agaq(amri amri, int i, amri amri2, ImageView imageView) {
        this.a = amri;
        this.c = i;
        this.d = amri2;
        this.b = imageView;
    }

    public final amri a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final amri c() {
        return this.d;
    }

    public final ImageView d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agax) {
            agax agax = (agax) obj;
            return this.a.equals(agax.a()) && this.c == agax.b() && this.d.equals(agax.c()) && this.b.equals(agax.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("LoadAvatarRequest{account=");
        sb.append(valueOf);
        sb.append(", avatarSize=");
        sb.append(i);
        sb.append(", borderColor=");
        sb.append(valueOf2);
        sb.append(", imageView=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
