package defpackage;

/* renamed from: ahca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahca implements agzr {
    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        if (!agzq.a()) {
            return new ahbz(agzq.a, agzq.e);
        }
        String valueOf = String.valueOf(agzq.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Transforms are not supported by this Opener: ");
        sb.append(valueOf);
        throw new ahbp(sb.toString());
    }
}
