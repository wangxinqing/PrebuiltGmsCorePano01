package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: alto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alto extends altj {
    public final String d;
    public final amjf e;
    public final amjf f;

    public alto(alsj alsj, alss alss, List list, String str, amjf amjf, amjf amjf2) {
        super(alsj, alss, list);
        this.d = str;
        this.f = amjf;
        this.e = amjf2;
    }

    public final altj a(alsk alsk) {
        return new alto((alsj) alsk, this.b, this.c, this.d, this.f, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        alto alto = (alto) obj;
        return alyr.a(this.d, alto.d, this.f, alto.f, this.e, alto.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.d, this.e, this.f});
    }

    public final String toString() {
        String str = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ValueChangedEvent [property=");
        sb.append(str);
        sb.append(", oldValue=");
        sb.append(valueOf);
        sb.append(", newValue=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
