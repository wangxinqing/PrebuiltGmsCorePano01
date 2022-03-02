package defpackage;

/* renamed from: twu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class twu {
    private avuv a;
    private Boolean b;

    /* access modifiers changed from: package-private */
    public final twv a() {
        String str = this.a == null ? " response" : "";
        if (this.b == null) {
            str = str.concat(" isRetriable");
        }
        if (str.isEmpty()) {
            return new ttx(this.a, this.b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    public final void a(avuv avuv) {
        if (avuv != null) {
            this.a = avuv;
            return;
        }
        throw new NullPointerException("Null response");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }
}
