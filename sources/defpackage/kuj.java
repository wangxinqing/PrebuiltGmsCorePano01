package defpackage;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kuj extends jzr {
    private final MetadataBundle a;

    public kuj(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
    }

    public final Object a(kyq kyq) {
        return this.a.a(kyq);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return new kuj(this.a.b());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Metadata [mImpl=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
