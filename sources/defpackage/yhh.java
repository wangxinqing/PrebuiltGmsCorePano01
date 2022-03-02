package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: yhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yhh extends oi {
    public yhh() {
        super((int) ayyr.a.a().a());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int b(Object obj, Object obj2) {
        ExperimentTokens experimentTokens = (ExperimentTokens) obj2;
        int length = ((String) obj).length();
        int i = length + length;
        int length2 = experimentTokens.b.length();
        int i2 = length2 + length2;
        byte[] bArr = experimentTokens.c;
        int i3 = 0;
        int length3 = i2 + (bArr != null ? bArr.length : 0) + ExperimentTokens.a(experimentTokens.d) + ExperimentTokens.a(experimentTokens.e) + ExperimentTokens.a(experimentTokens.f) + ExperimentTokens.a(experimentTokens.g) + ExperimentTokens.a(experimentTokens.i);
        int[] iArr = experimentTokens.h;
        int length4 = length3 + ((iArr != null ? iArr.length : 0) * 4);
        int[] iArr2 = experimentTokens.j;
        if (iArr2 != null) {
            i3 = iArr2.length;
        }
        return i + length4 + (i3 * 4);
    }
}
