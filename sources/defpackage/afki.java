package defpackage;

/* renamed from: afki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afki {
    public Boolean a;
    private Boolean b;
    private amri c;
    private amri d;

    afki() {
    }

    public final afkj a() {
        String str = this.b == null ? " includeAllGroups" : "";
        if (this.a == null) {
            str = str.concat(" groupWithNoAccountOnly");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        afjt afjt = new afjt(this.b.booleanValue(), this.a.booleanValue(), this.c, this.d);
        if (afjt.a) {
            amrl.a(!afjt.c.a());
            amrl.a(!afjt.d.a());
        } else {
            amrl.a(afjt.c.a());
        }
        if (afjt.b) {
            amrl.a(!afjt.d.a());
        }
        return afjt;
    }

    public afki(byte[] bArr) {
        this.c = ampu.a;
        this.d = ampu.a;
    }

    public final void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }
}
