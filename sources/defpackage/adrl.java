package defpackage;

/* renamed from: adrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrl extends adri {
    private static final iwd c = adnt.h("LongListKey");

    public adrl(String str) {
        super(str, amzy.h());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(String str) {
        amzt j = amzy.j();
        for (String parseLong : amsk.a(',').a().a((CharSequence) str)) {
            try {
                j.c(Long.valueOf(Long.parseLong(parseLong)));
            } catch (NumberFormatException e) {
                c.d("Unable to parse value: %s.", str);
                return (amzy) this.b;
            }
        }
        return j.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return amre.a(',').a((Iterable) (amzy) obj);
    }
}
