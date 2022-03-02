package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: aeaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeaa extends ilj implements adyk {
    private final int c;

    public aeaa(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    public final adyl a() {
        return new aeag(this.a, this.b, this.c);
    }

    public final int b() {
        return b("event_type");
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return new adzz(this);
    }

    public final String toString() {
        String str = b() == 1 ? "changed" : b() != 2 ? "unknown" : "deleted";
        String valueOf = String.valueOf(a());
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(valueOf).length());
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
