package defpackage;

import com.google.location.nearby.common.fastpair.slice.AutoValue_DeviceDetailsLinks;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;

/* renamed from: arzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzc {
    private byte[] a;
    private Boolean b;
    private String c;
    private String d;
    private Boolean e;
    private String f;
    private String g;

    public final DeviceDetailsLinks a() {
        String str = this.a == null ? " accountKey" : "";
        if (this.b == null) {
            str = str.concat(" assistantSupported");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" actionUrl");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" address");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" firmwareUpdateAvailable");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" authority");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" signature");
        }
        if (str.isEmpty()) {
            return new AutoValue_DeviceDetailsLinks(this.a, this.b.booleanValue(), this.c, this.d, this.e.booleanValue(), this.f, this.g);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null address");
    }

    public final void c(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null authority");
    }

    public final void d(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null signature");
    }

    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void a(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null actionUrl");
    }

    public final void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException("Null accountKey");
    }
}
