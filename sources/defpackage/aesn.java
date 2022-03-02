package defpackage;

/* renamed from: aesn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aesn {
    private Boolean a;
    private Integer b;

    public final aeso a() {
        String str = this.a == null ? " enabled" : "";
        if (this.b == null) {
            str = str.concat(" throttleDelaySeconds");
        }
        if (str.isEmpty()) {
            return new aesj(this.a.booleanValue(), this.b.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
